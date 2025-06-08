import java.util.Scanner;

public class HiLo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //this is the scanner object

        String playAgain = ""; //this will come back in the end and will ask the user if they wanna play again or not

        //we gonna store our code in the do loop, meaning the code will keep running for as long the user wants to keep playing
        do {

            //1. we gonna generate the random number by the computer
            int randomNumber = (int)(Math.random() * 100 + 1); //whole number between 1 and 10 both inclusive;

            //2. usernumber will be the inputed number by the user 
            int usernumber = 0;
            int attempts = 0;
            int maxAttempts = 5;
            
             System.out.println("---Welcome to HiLo Number Guessing Game👾---");
            //3. we gonna a while which will keep running untill random number = userNumber
            while (usernumber != randomNumber && attempts < maxAttempts) {
                System.out.print("Guess a number between 1 and 100: ");
                usernumber = input.nextInt(); //we're reading the user's inputed number
                input.nextLine(); //flush the leftover newline
                attempts++;

                //4. adding conditionals to check if random </> the usernumber
                if(usernumber < randomNumber)
                    System.out.println("Ouch😩! Your guessed " + usernumber + " try again!!! a lil higher this time!!");
                else if(usernumber > randomNumber)
                    System.out.println("Damn😔 " + usernumber + " let's go lower this time!!");
                else
                System.out.println("Wow!! you just right on the dot!!🍾🥂 you guessed " + usernumber + " and the number was " + randomNumber);
            }

            if(usernumber != randomNumber){
                System.out.println("Oops!!🙊... You ran out of attempts");
                System.out.println("The number was " + randomNumber);
            }

        System.out.print("Would you like to go another round (y/n)");  
        playAgain = input.nextLine(); //reads the reply from the user whether they wannna play again or not

        } while (playAgain.equalsIgnoreCase("y")); //keep looping if the reply is yes from the user

        input.close(); //we need to close the scanner

        System.out.println("---- Thank you playing ---");
     
    } 
}
