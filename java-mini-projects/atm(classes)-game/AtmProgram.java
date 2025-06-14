import java.util.Scanner;

class User {
    String name;
    String lastName;
    int accountNumber;
    int pin;
    int confirmPin;

    void transaction(){
        System.out.println("\n=========================================================================");
        System.out.println("\n---- This is a Summary of Your New Account with JavaBank🏧 ----");
        System.out.println("Name: " + name);
        System.out.println("Lastname: " + lastName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Secrete Pin: " + pin);
        System.out.println("--- Please See below options, to continue with your transaction🔢 ---");
        System.out.println("\n===========================================================================");
    }
}


public class AtmProgram {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String continueChoice = "yes";

        double balance = 1000.00;
        int choice;

        //welcome message
        System.out.println("--- 👾Welcome to JavaBank🏧 ---");


        //while loop
        while (continueChoice.equalsIgnoreCase("yes")) {
            User myUser = new User();

            System.out.print("Enter your name💁🏼‍♀️: ");
            myUser.name = input.nextLine();


            System.out.print("Enter your last Name✍🏻: ");
            myUser.lastName = input.nextLine();


           do {
                System.out.print("Enter your 5-digit Account Number🔢: ");
                myUser.accountNumber = input.nextInt();
                input.nextLine();
                if (String.valueOf(myUser.accountNumber).length() != 5) {
                    System.out.println("❌ Account number must be 5 digits.");
                }
            } while (String.valueOf(myUser.accountNumber).length() != 5);

            System.out.print("Enter your Pin🫆: ");
            myUser.pin = input.nextInt();
            input.nextLine();

            do {
                System.out.print("Please confirm your pin🫆: ");
                myUser.confirmPin = input.nextInt();
                input.nextLine(); // consume newline

                if (myUser.pin != myUser.confirmPin) {
                    System.out.println("❌ Pins do not match! Try again.");
                }
            } while (myUser.pin != myUser.confirmPin);

            myUser.transaction();
            System.out.println();
            System.out.println( myUser.name + ", please choose an option to continue with your transaction: ");
            System.out.println();

            //starting a do-while loop
            do {
               
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
                            System.out.println("✅ You have successfully deposited R" + deposit + " and your balance is R" + balance);
                        } else {
                            System.out.println("🚫Invalid Deposit Amount");
                        }
                        break;
                    case 3:
                                //withdraw
                        System.out.print("Enter the amount you want to withdraw R: ");
                        double withdraw = input.nextDouble();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println(myUser.name + " ✅ You have successfully withdrew R" + withdraw + " and your current balance is R" + balance);
                        } else if (withdraw > balance) {
                            System.out.println("Insufficient funds🚫, please try a lower amount");
                        } else {
                            System.out.println("❌ Invalid withdrawal amount");
                        }
                        break;
                    case 4:
                        System.out.println("Thank you for choosing JavaBank🏧 " + myUser.name);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }

            } while (choice != 4);



            input.nextLine();
             //ask the user if they want to continue
            System.out.println("Would like to change your Account (yes/no): ");
            continueChoice = input.nextLine();

        }


        System.out.println("\nThank you");

        input.close();
    }
}