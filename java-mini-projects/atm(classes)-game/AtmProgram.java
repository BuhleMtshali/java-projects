//import the the java utils
import java.util.Scanner;

//creating the user class
class User {
    String name;
    String lastName;
    int accountNumber;
    int pin;
    int confirmationPin;
    Double balance;

    void transaction(){
        System.out.println("--- This is a Summary of your Account🏦 ---");
        System.out.println("Name💁🏼‍♀️: " + name);
        System.out.println("Lastname🙂: " + lastName);
        System.out.println("Your Account Number🔢: " + accountNumber);
        System.out.println("Your Pin(keep this private)🫆: " + pin);
        System.out.println("Balance💰: R" + balance);
    }

}

//tester class
public class AtmProgram {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String continueChoice = "yes";


        //welcome Message
        System.out.println("--- 🏧Welcome to JavaBank 🏦 ---");

        while (continueChoice.equalsIgnoreCase("yes")) {
            User myUser = new User();

            //Entering the name of the user
            System.out.println("\nEnter your name: ");
            myUser.name = input.nextLine();

            
            
        }
        






        input.close();
    }
}