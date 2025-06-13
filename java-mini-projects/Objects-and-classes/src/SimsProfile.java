import java.util.Scanner;

class Sim {
    String name;
    String hairColor;
    Double height;
    int age;
    String boyfriend;

    void profile(){
        System.out.println("\n🎮 This is your Sim Profile:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Hair Color: " + hairColor);
        System.out.println("Height: " + height + "cm");
        System.out.println("Dating: " + boyfriend);
        System.out.println("-------------------------------");
    }
}

public class SimsProfile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String continueChoice = "yes";

        System.out.println("---- Welcome to your Sim Creator Profile 💁🏼‍♀️ ----");

        while (continueChoice.equalsIgnoreCase("yes")) {
            Sim mySim = new Sim();

            System.out.print("\nEnter the name for your sim: ");
            mySim.name = input.nextLine();

            System.out.print("Enter the hair color of your sim: ");
            mySim.hairColor = input.nextLine();

            System.out.print("Enter the height of your sim (in cm): ");
            mySim.height = input.nextDouble();
            input.nextLine(); // clear newline

            System.out.print("Enter your Sim's boyfriend's name: ");
            mySim.boyfriend = input.nextLine();

            System.out.print("Enter the age of your sim: ");
            mySim.age = input.nextInt();
            input.nextLine(); // clear newline

            mySim.profile();

            // Ask user if they want to create another Sim
            System.out.print("Do you want to create another Sim? (yes/no): ");
            continueChoice = input.nextLine();
        }

        System.out.println("\nThanks for playing Sim Creator™. Buhle out! 💅🏾💻");
        input.close();
    }
}
