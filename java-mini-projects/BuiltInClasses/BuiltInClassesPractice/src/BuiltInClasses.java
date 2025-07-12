//importing the array list
import java.util.ArrayList;
import java.util.Scanner;

public class BuiltInClasses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1. the String Built in Class
        String name = "Buhle";
        System.out.println("Hi " + name + "!!");

        //using the Math class
        double squareRoot = Math.sqrt(144);
        System.out.println("The squar root of 144 is: " + squareRoot);

        //using the arraylist
        ArrayList<String> groceries = new ArrayList<>();
        

        input.close();
    }
}
