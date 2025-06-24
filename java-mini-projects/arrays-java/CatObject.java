class Cat{
    String name;
    String color;

    void meow(){
        System.out.println(name + " is my  " + color + " colored cat!");
    };
    
}

public class CatObject {
    public static void main(String[] args){
        Cat[] myCat = new Cat[4];

        myCat[0] = new Cat();
        myCat[1] = new Cat();
        myCat[2] = new Cat();
        myCat[3] = new Cat();

        myCat[0].name = "Snoopy";
        myCat[1].name = "Coco";
        myCat[2].name = "Blackie";
        myCat[3].name = "lisa";

        myCat[0].color ="white";
        myCat[1].color = "black";
        myCat[2].color = "red";
        myCat[3].color = "yellow";

        //for each loop
        for (Cat cat : myCat){
            cat.meow();
        }
    }
    
}