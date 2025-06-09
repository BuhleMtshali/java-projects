class Buhle {
    String name;
    int age;
    String profession;
    String apartment;
    Double rent;

    void intro(){
        System.out.println("Hello, my name is " + name + " and I'm a " + age + " year old " + profession + ". I currently reside in a " + apartment + " and I currenty pay R" + " in rent.");
    }
}

public class Person {

    public static void main(String[] args){
        Buhle myBuhle = new Buhle();
        myBuhle.name = "Zano";
        myBuhle.age = 23;
        if (myBuhle.profession == null) {
            myBuhle.profession = "Unemployed";
        } else {
            myBuhle.profession = "Software engineer";
        }
        myBuhle.apartment = "Flat";
        myBuhle.rent = 8500.50;

        myBuhle.intro();
    }
}