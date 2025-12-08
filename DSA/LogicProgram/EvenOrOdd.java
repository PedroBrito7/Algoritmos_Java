package LogicProgram;
import java.util.Random;

public class EvenOrOdd {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int generated = randomNumbers.nextInt();
        if ( generated % 2 == 0 ){
            System.out.println("This number is pair");
        }else{
            System.out.println("This number is odd");
        }
        if (generated <= 0){
            System.out.println("This number is clearly negative");
        }else{
            System.out.println("This number is positive");
        }
        System.out.println("What's number ? ");
        System.out.println(" The number is "+ generated);
}
}
