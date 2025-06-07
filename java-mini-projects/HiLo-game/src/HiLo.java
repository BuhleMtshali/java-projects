import java.util.Scanner;

public class HiLo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 100 + 1); //to generate a random number between 1 and 100 and ensures its a whole number

        int userNumber = 0;

        while (userNumber != randomNumber) {
            System.out.print("Guess a number between 1 and 100: "); //so baically we asking the user to input their guessed number
            userNumber = input.nextInt();

            //adding the if statemets
            if(userNumber < randomNumber)
                System.out.println(userNumber + " is too low!!! Try again");
            else if(userNumber > randomNumber)
                System.out.println(userNumber + " is too high!! Try again");
            else
            System.out.println("Yaay!!! you guessed Right " + userNumber + " is equal to the Computer generated number " + randomNumber);
        }

       input.close(); 

    }
}
