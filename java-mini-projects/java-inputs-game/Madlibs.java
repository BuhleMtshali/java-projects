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

        Double tripPrice = 800.50;

        System.out.print("How much have you saved so far? ");
        Double savings = input.nextDouble();

        Double finalPrice = tripPrice - savings;

        System.out.println("Thank you for completing the " + schoolName + "'s Year End Trip form " + name + " " + lastName + ". You are currently " + age + " years old. The school trip is R" + tripPrice + "You currently have R" + savings + " in your savings so you're only left with R" + finalPrice + 
        " to have the full amount for the trip. We look forwad to having you " + name + ".");
        System.out.println("------ The END -----");
       input.close(); //close the scanner object
    }
}
