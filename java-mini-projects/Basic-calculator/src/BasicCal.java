import java.util.Scanner;

public class BasicCal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //WELCOME MESSAGE
        System.out.println("---🧮Welcome to the Basic Calculator Applocation👾---");

        //1. asking the user for the first number
        System.out.print("Enter your first number: ");
        double num1 = input.nextDouble();

        //2. asking the use to choose the operator
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);  //remember the user is returning a single charactor

        System.out.println("Enter yur second number: ");
        double num2 = input.nextDouble();



    }
}