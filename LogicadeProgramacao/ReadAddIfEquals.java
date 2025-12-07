package LogicadeProgramacao;

import java.util.Scanner;

public class ReadAddIfEquals {
    private static Object c;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("What is the value of the first number a:");
        int a = read.nextInt();
        System.out.println("What is the value of the first number b?");
        int b = read.nextInt();
        if( a == b){
            System.out.println("They are the same");
            int c = a+b;
            System.out.println("Their sum is " + c);

        }else {
            System.out.println("They are not the same");
            System.out.println(" A receive: " + a);
            System.out.println(" b receive: " + b);
            double c = a * b ;
            System.out.println("Its multiplication is: "+ c);
        } 
    }
}
