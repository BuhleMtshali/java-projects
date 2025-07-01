class DogInstance {
    int age;
    String name;

    void barkNoice(){
        if (age > 5){
            System.out.println(name + " is a " + age + " years old dog, and he makes a woof woof!! noice!");
        } else if(age <= 3){
            System.out.println(name + " is a " + age + " years old dog and he makes a Yipi Yipi!! noice");
        }
    }
    
}

public class DogInstances {
    public static void main(String[] args){
        System.out.println("Hello instances");
    }
}
