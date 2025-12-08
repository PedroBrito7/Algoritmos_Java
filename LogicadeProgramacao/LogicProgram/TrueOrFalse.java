package LogicProgram;
import java.util.Scanner;
public class TrueOrFalse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("write your fist value (true/false): ");
        boolean value1 = sc.nextBoolean();

        System.out.print("write your second value (true/false): ");
        boolean value2 = sc.nextBoolean();

        if (value1 == value2) {
            System.out.println("Ambos são " + value1);
        } else {
            System.out.println("Os valores são diferentes.");
        }

        sc.close();
    }
}