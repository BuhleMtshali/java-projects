import java.util.Scanner;

public class Atm {
    public static void main(String[] args){
       //1. defining the scanner class
       Scanner input = new Scanner(System.in);

       //2. defining the balance
       double balance = 1000.00;
       int choice;

       //3. Welcome message
       System.out.println("---- 🏧Welcome to the JavaBank 🏦 ---");
       System.out.print("Enter your name: ");
       String name = input.nextLine();

       //4. we gonna use the do-while loop
       do {
        //5. menu for the user to make a choice
        System.out.println("Please choose an Option: ");
        System.out.println("1. Check Balance💴: ");
        System.out.println("2. Deposit➕: ");
        System.out.println("3. Withdraw➖: ");
        System.out.println("4. Exit❌: ");

        choice = input.nextInt();  //getting the user's choice

        //6. using switch statements 
        switch (choice) {
            case 1:
                //check balance
                System.out.println(name + " Your current balance is: R" + balance);
                break;
            case 2:
                //deposit
                System.out.print("Enter the amount you want to deposit: ");
                double deposit = input.nextDouble();
                if (deposit > 0) {
                    balance += deposit;
                    System.out.println(name + " You have successfully deposited R " + deposit + " and your current balance is R" + balance);
                } else {
                    System.out.println("❌ Invalid deposit amount!");
                }
                break;
            case 3:
                //withdraw
                System.out.print("Enter the amount you want to withdraw R: ");
                double withdraw = input.nextDouble();
                if (withdraw > 0 && withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println(name + " You have successfully withdrew R" + withdraw + " and your current balance is R" + balance);
                } else if (withdraw > balance) {
                    System.out.println("Insufficient funds🚫");
                } else {
                    System.out.println("❌ Invalid withdrawal amount");
                }
                break;

            case 4:
                //Exit
                System.out.println("Thank you for choosing JavaBank🏦");
                break;
            default:
                System.out.println("⛔️Invalid choice. Try Again");
        }

       } while (choice != 4); //loops untill the user chooses to exit
       input.close();
    } 
}
