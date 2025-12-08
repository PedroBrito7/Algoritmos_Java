package LogicProgram;

import java.util.Scanner;

public class MinorOrLegal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what's your name ? ");
        String name = sc.next();
        System.out.println(" how old are you ? ");
        int age = sc.nextInt();

        if(age >=18){
            System.out.println(name+ " cool, you're of legal age ( "+age+" )");
        }else {
            System.out.println(name+" you are not of legal age ( "+age+" )");
        }
    }
}
