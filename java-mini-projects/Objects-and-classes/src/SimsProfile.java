class Sim{
    //instance variables
    String name;
    String hairColor;
    Double height;
    int age;
    String boyfriend;

    //method
    void profile(){
        System.out.println("This is the your Sim Profile: " + name + ", they are currently " + age + " years old. The sim will have " + hairColor + " hair color, they're gonna be " + height + "cm in height and they're currently dating " + boyfriend);
    }
}


public class SimsProfile {
    public static void main(String[] args){
        System.out.println("Sims Tester class");
    }
}
