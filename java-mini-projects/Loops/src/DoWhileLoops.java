public class DoWhileLoops {
    public static void main(String[] args){
       //this will run atleast once even if the condition is false
       int i = 0;
       do {
        System.out.println("In a Do-while Loop, i is currently: " + i);
        i++;
       } while(i <= 5);
    }
}
