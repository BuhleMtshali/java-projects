import java.util.Scanner;
class DogInstance {
    int age;
    String name;

    void barkNoice(int numofbarks){
        if (age > 5){
            System.out.println(name + " is a " + age + " year old dog, and he makes a woof woof!! noice!");
        } else if(age <= 3){
            System.out.println(name + " is a " + age + " year old dog and he makes a Yipi Yipi!! noice");
        } else {
            System.out.println(name + " is a " + age + " year dog and he is quite normal!!");
        }
    }
    
}

public class DogInstances {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DogInstance one = new DogInstance();

        System.out.println("Enter the name of your dog: ");
        String name = input.nextLine();

        System.out.println("Enter the age of your dog: ");
        int age = input.nextInt();

        one.name = name;
        one.age = age;

        one.barkNoice(3);
        
        input.close();
    }
}
