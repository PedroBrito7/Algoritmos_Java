package LogicProgram;

import java.util.Scanner;

public class ApprovedOrRepproved {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name ? ");
        String name = sc.next();
        System.out.println(name + " Enter with yours grades in Portuguese");
        int grade1 = sc.nextInt();
        System.out.println(name + " Enter with yours grades in Mathematics");
        int grade2 = sc.nextInt();
        System.out.println(name + " Enter with yours grades in Science");
        int grade3 = sc.nextInt();
        System.out.println(name + " Enter with yours grades in Physical");
        int grade4 = sc.nextInt();

        double media = (grade1 + grade2 + grade3 + grade4) / 4;
        if(media >= 7){
            System.out.println(name + " Congratulations, you passed!");
        } else{
            System.out.println("Sorry "+ name + ", but you Repproved. Your media is "+ media);
        }
    }
}
