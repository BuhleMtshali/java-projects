class Sim{
    //instance variables
    String name;
    String hairColor;
    Double height;
    int age;
    String boyfriend;

    //method
    void profile(){
        System.out.println("This is your Sim Profile: " + "Their name is " + name + ", they are currently " + age + " years old. The sim will have " + hairColor + " hair color, they're gonna be " + height + "cm in height and they're currently dating " + boyfriend);
    }
}


public class SimsProfile {
    public static void main(String[] args){
        Sim mySim = new Sim();
        mySim.name = "Ginger";
        mySim.hairColor = "red";
        mySim.height = 163.41;
        mySim.age = 23;
        mySim.boyfriend = "Jace";

        //calling the method
        mySim.profile();
    }
}
