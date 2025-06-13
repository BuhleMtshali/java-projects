import java.util.Scanner;
class Sim{
    //instance variables
    String name;
    String hairColor;
    Double height;
    int age;
    String boyfriend;

    //method
    void profile(){
        System.out.println("This is your Sim Profile: " + "Their name is " + name + ", they are currently " + age + " years old. The sim will have " + hairColor + " hair, they're gonna be " + height + "cm in height and they're currently dating " + boyfriend);
    }
}


public class SimsProfile {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
        
       Sim mySim = new Sim();

       //getting the sim name
       System.out.println("---- Welcome to your Sim Creator Profile💁🏼‍♀️ ----");
       System.out.print("Enter the name for your sim: ");
       mySim.name = input.nextLine();

       System.out.print("Enter the hair color of your sim: ");
       mySim.hairColor = input.nextLine();

       System.out.print("Enter the height of your sim: ");
       mySim.height = input.nextDouble();
       input.nextLine();

       System.out.print("Enter the age of your sim: ");
       mySim.age = input.nextInt();

       System.out.print("Enter your Sim's boyfriend's name: ");
       mySim.boyfriend = input.nextLine();
       input.nextLine();

       mySim.profile();


       input.close();
    }
}
