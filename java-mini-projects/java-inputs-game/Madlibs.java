import java.util.Scanner; //we gotta import the scanner object first

public class Madlibs {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in); //create the scanner variable

        System.out.println("---- 👾Welcome to the School Trip Form🛣️ ------");

        System.out.print("What's your name? "); //asking the user the question
        String name = input.nextLine();  //storing the user's input

        System.out.print("What's your last name? ");
        String lastName = input.nextLine();

        System.out.print("What is the name of your School? ");
        String schoolName = input.nextLine();

        System.out.print("How old Are you? ");
        int age = input.nextInt();

        System.out.print("How much have you saved so far? ");
        Double savings = input.nextDouble();

        System.out.println("Thank you for completing the " + schoolName + "'s Year End Trip form " + name + " " + lastName + ". You are currently" + age + " years old. You currently have R" + savings + " in your savings. We look forwad to hhaving you " + name + ".");
        System.out.println("------ The END -----");
       input.close(); //close the scanner object
    }
}
