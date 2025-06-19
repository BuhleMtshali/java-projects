//this is the Blueprint class
class Dog{
    String name;

    void bark(){
        System.out.println(name + " says, woof woof!!");
    }
}

//Tester class

public class arrayObjects {
   public static void main(String[] args){

    //creating an array of Dog objects
    Dog[] myDog = new Dog[3];

    //creating the individual Dog objects
    myDog[0] = new Dog();
    myDog[1] = new Dog();
    myDog[2] = new Dog();


    //assigning name to each dogs
    myDog[0].name = "Snoopy";
    myDog[1].name = "lexi";
    myDog[2].name = "stevey";

    //we gonna use a for loop to make them bark at the same time
    for(int i = 0; i < myDog.length; i++){
        myDog[i].bark();
    }
   } 
}
