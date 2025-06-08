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
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);  //remember the user is returning a single charactor
        
        //3. second value
        System.out.print("Enter yur second number: ");
        double num2 = input.nextDouble();

        //4. results by the user
        double result = 0;


        //5. this is the switch statement which will use to calculate
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                } else {
                    System.out.println("Sorry poonkie😮‍💨, we cannot devide by 0");
                    input.close();
                    return;
                }
            default:
                System.out.println("Invalid operator! ❌");
                input.close();
                return;
        }

        //6. this is where we check if the returned value is an interger or a doubel
        if(result == (int) result){
            System.out.println("Result⏳: " + (int) result);
        } else {
            System.out.println("Result⏳: " + result);
        }

        input.close();
    }
}