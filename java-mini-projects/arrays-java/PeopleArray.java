//class blueprint
class Person {
    String name;
    int age;

    void intro(){
        System.out.println("Hi, my name is " + name + " and I'm currently " + age + " years old!");
    }
}


public class PeopleArray {
    public static void main(String[] args){

        //creating the array of people objects
        Person[] myPersons = new Person[3];


        //creating individual person
        myPersons[0] = new Person();
        myPersons[1] = new Person();
        myPersons[2] = new Person();

        //assigning values to the objects
        myPersons[0].name = "Zack";
        myPersons[1].name = "Linda";
        myPersons[2].name = "Billy";

        myPersons[0].age = 18;
        myPersons[1].age = 24;
        myPersons[2].age = 30;

        //creating a loop to invoke the method
        for (int i = 0; i < myPersons.length; i++){
            myPersons[i].intro();
        }

    }
}
