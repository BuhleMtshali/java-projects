class Puppy{

    String name;
    int age;

    void bark(){
        System.out.println("My dog's name is " + name + " and his only " + age + " years old🐕‍🦺");
    }
}

public class Dog {

    public static void main(String[] args){
        Puppy myPuppy = new Puppy();
        myPuppy.name = "Snoopy";
        myPuppy.age = 2;

        myPuppy.bark();
    }
}