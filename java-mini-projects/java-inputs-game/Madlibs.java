import java.util.Scanner; //we gotta import the scanner object first

public class Madlibs {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in); //create the scanner variable

        System.out.print("What's your name? "); //asking the user the question
        String name = input.nextLine();  //storing the user's input

        System.out.print("What's your last name? ");
        String lastName = input.nextLine();

        System.out.print("How old Are you? ");
        int age = input.nextInt();

        System.out.print("How much have you saved so far? ");
        Double savings = input.nextDouble();

        

       input.close(); //close the scanner object
    }
}
