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