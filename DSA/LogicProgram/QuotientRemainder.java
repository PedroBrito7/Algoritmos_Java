package LogicProgram;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter with value A: ");
        int a = sc.nextInt();
        System.out.println(" Enter with value B: ");
        int b = sc.nextInt();

        int quotient = a / b;
        int remainder = a % b ;

        System.out.println("The quotient is "+ quotient+ " and remainder is " + remainder );



    }
}
