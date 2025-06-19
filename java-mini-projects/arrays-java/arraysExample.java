import java.util.Arrays;
public class arraysExample {
    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 24;
        numbers[3] = 85;
        numbers[4] = 12;

        System.out.println("\n===Here is how we print an array with a for loop===");
        for (int i = 0; i < numbers.length; i++){
            System.out.println("Here is the value at index: " + i);
        }
        //END OF FOR LOOP EXAMPLE

        System.out.println("\n===Here is how we print with the Array.toString() method");
        System.out.println("Here is the list: " + Arrays.toString(numbers));
        System.out.println("=====This is the best way==========");
    }
}