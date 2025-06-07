import java.util.Scanner;

public class HiLo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 100 + 1);

        System.out.println(randomNumber);

    }
}
