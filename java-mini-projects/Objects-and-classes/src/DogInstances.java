import java.util.Scanner;
class DogInstance {
    int age;
    String name;

    void barkNoice(){
        if (age > 5){
            System.out.println(name + " is a " + age + " years old dog, and he makes a woof woof!! noice!");
        } else if(age <= 3){
            System.out.println(name + " is a " + age + " years old dog and he makes a Yipi Yipi!! noice");
        } else {
            System.out.println(name + " is a " + age + " years dog and he is quite normal!!");
        }
    }
    
}

public class DogInstances {
    public static void main(String[] args){
        
    }
}
