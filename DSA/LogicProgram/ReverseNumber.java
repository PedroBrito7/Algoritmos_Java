package LogicProgram;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            do {
                System.out.println("Enter an integer with 4 digits: ");
                int numero = scan.nextInt();
                String numStr = String.valueOf(numero);
                if (numero >= 1000 && numero <= 9999) {
                    StringBuilder sb = new StringBuilder(numStr);
                    System.out.println(sb.reverse());
                    break;
                } else {
                    System.out.println("The number need count 4 digits !");
                }
            } while (true);
        }
    }

