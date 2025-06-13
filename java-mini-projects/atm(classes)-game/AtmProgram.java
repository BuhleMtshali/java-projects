import java.util.Scanner;

class User {
    String name;
    String lastName;
    int accountNumber;
    int pin;
    int confirmPin;

    void transaction(){
        System.out.println("\n---- This is a Summary of Your Account🏧 ----");
        System.out.println("Name: " + name);
        System.out.println("Lastname: " + lastName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Secrete Pin: " + pin);
        System.out.println("--- Thank You💁🏼‍♀️ ---");
    }
}


public class AtmProgram {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String continueChoice = "yes";

        double balance = 1000.00;
        int choice;

        //welcome message
        System.out.println("--- Welcome to JavaBank🏧 ---");


        //while loop
        while (continueChoice.equalsIgnoreCase("yes")) {
            User myUser = new User();

            System.out.println("Enter your name: ");
            myUser.name = input.nextLine();


            System.out.println("Enter your last Name: ");
            myUser.lastName = input.nextLine();


            System.out.println("Enter your Account Number(has to 5 digits): ");
            myUser.accountNumber = input.nextInt();
            input.nextLine();


            System.out.println("Enter your Pin: ");
            myUser.pin = input.nextInt();
            input.nextLine();

            System.out.println("Please confirm your pin: ");
            myUser.confirmPin = input.nextInt();
            input.nextLine();

            if(myUser.pin != myUser.confirmPin){
                System.out.print("Your Pins have to match, please try again: ");
                myUser.confirmPin = input.nextInt();
            } 

            myUser.transaction();

           

            //starting a do-while loop
            do {
                System.out.println( myUser.name + " Please choose an option to continue with your transaction: ");
                System.out.println("1. Check Balance💰: ");
                System.out.println("2. Deposit💸: ");
                System.out.println("3. Withdraw➖: ");
                System.out.println("4. Exit❌");

                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        //check balance
                        System.out.println(myUser.name + " Your current balance is: R" + balance);
                        
                        break;
                    case 2:
                        //deposit
                        System.out.print("Enter the Amount you want to deposit: ");
                        double deposit = input.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("✅You have successfully deposited R" + deposit + " and your balance is R" + balance);
                        } else {
                            System.out.println("🚫Invalid Deposit Amount");
                        }

                    default:
                        break;
                }

            } while (choice != 4);




             //ask the user if they want to continue
            System.out.println("Would like to change your Account (yes/no): ");
            continueChoice = input.nextLine();

        }


        System.out.println("\nThank you");

        input.close();
    }
}