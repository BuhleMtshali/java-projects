import java.util.Scanner;

public class HiLo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 100 + 1); //to generate a random number between 1 and 100 and ensures its a whole number

        int userNumber = 0;

        System.out.print("Guess a number between 1 and 100: ");
        userNumber = input.nextInt();

        



    }
}
