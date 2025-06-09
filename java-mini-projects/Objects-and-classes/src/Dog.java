class Puppy{ //blueprint class

    String name;
    int age;

    void bark(){ //method returns nothing
        System.out.println("My dog's name is " + name + " and his only " + age + " years old🐕‍🦺");
    }
}

public class Dog { //tester class which runs the show

    public static void main(String[] args){
        Puppy myPuppy = new Puppy();
        myPuppy.name = "Snoopy";
        myPuppy.age = 2;

        myPuppy.bark();

        Puppy myPuppyTwo = new Puppy();
        myPuppyTwo.name = "Danger";
        myPuppyTwo.age = 1;
        myPuppyTwo.bark();
    }
}