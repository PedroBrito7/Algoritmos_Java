package LogicProgram;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int gerate = random.nextInt(0, 100);
        System.out.println(gerate);
    }
}
