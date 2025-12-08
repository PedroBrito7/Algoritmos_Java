package LogicProgram;
import java.util.Random;
public class Readjust {
    public static void main(String[] args) {
        Random randomNumbers = new Random();
        int generated = randomNumbers.nextInt(100);
        double readjust = generated - generated * 0.05;
        System.out.println("Your number is: " + generated + " with readjust is: " + readjust);

    }
}
