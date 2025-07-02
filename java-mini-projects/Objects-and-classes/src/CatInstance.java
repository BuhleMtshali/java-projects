import java.util.Scanner;

class Cat{
    String name;

    void meow(int catCry){
        while (catCry > 0) {
            System.out.print(name + " says meow!!!!");
            catCry = catCry - 1;
        }
    }
}

public class CatInstance {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Cat myCat = new Cat();

        System.out.print("Whats your cat's name: ");
        String name = input.nextLine();

        myCat.name = name;

        myCat.meow(3);

        


        input.close();
    }
}
