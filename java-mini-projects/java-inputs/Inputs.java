import java.util.Scanner;
public class Inputs {
  public static void main(String[] args){

    //open the mic
    Scanner input = new Scanner(System.in);

    //printing out the name
    System.out.print("What's your name? ");
    String name = input.nextLine();

    System.out.print("How old are you? ");
    int age = input.nextInt();

    System.out.print("How much is the bus fare? ");
    double price = input.nextDouble();

    System.out.print("Are you a student? ");
    boolean isStudent = input.nextBoolean();

    if(isStudent){
        System.out.println("You are currently a student");
    } else {
        System.out.println("You are not a student");
    }

    System.out.println("Hello " + " " + name + " " + "you are " + " " + age + "" + "and the price of the bus fare is R" + price + "and currently you are a  " + isStudent);

    input.close();
  }
}
