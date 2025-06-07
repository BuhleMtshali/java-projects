import java.util.Scanner;

public class HiLo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //this is the scanner object

        String playAgain = ""; //this will come back in the end and will ask the user if they wanna play again or not

        //we gonna store our code in the do loop, meaning the code will keep running for as long the user wants to keep playing
        do {

            //1. we gonna generate the random number by the computer
            int randomNumber = (int)(Math.random() * 10 + 1); //whole number between 1 and 10 both inclusive;

            //2. usernumber will be the inputed number by the user 
            int usernumber = 0;

            //3. we gonna a while which will keep running untill random number = userNumber
            while (usernumber != randomNumber) {
                System.out.println("---Welcome to HiLo Number Guessing Game👾---");
                System.out.print("Guess a number between 1 and 10");
                usernumber = input.nextInt(); //we're reading the user's inputed number

                //4. adding conditionals to check if random </> the usernumber
                if(usernumber < randomNumber)
                    System.out.println("Ouch😩! Your guessed " + usernumber + " and the computer gave " + randomNumber + " try again!!! a lil higher this time!!");
                else if(usernumber > randomNumber)
                    System.out.println("Damn😔 " + usernumber + " is Higher than the computer's " + randomNumber + " let's go lower this time!!");
                else
                System.out.println("Wow!! you just right on the dot!!🍾🥂");
            }

        System.out.print("Would you like to go another round (y/n)");  
        input.nextLine();
        playAgain = input.nextLine(); //reads the reply from the user whether they wannna play again or not

        } while (playAgain.equalsIgnoreCase("y")); //keep looping if the reply is yes from the user

        input.close(); //we need to close the scanner

        System.out.println("---- Thank you playing ---");
     
    } 
}
