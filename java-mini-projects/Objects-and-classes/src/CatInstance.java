class Cat{
    String name;

    void meow(int catCry){
        while (catCry > 0) {
            System.out.print(name + " says meow!!!!");
            catCry = catCry - 1;
        }
    }
}

public class CatInstance {
    public static void main(String[] args){
        System.out.println("hello");
    }
}
