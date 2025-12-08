package LogicProgram;

import java.util.Scanner;

public class WageTeacher {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is your hourly wage?");
            int wageHour = sc.nextInt();
            System.out.println("how many classes did you give per month ?");
            int classesGivenMonth = sc.nextInt();

            int wageMonth = wageHour*classesGivenMonth;
            tax(wageMonth);
        }
        public static void tax (int wage){
            System.out.println("Wage: " + wage);
            if( wage < 1518){
                double v = wage * 0.075;
                System.out.println("tax : " + v);
                double wageFinal = wage - v ;
                System.out.println("Wage final: " + wageFinal);
            }else if( wage < 2793){
                double v =  wage * 0.09;
                System.out.println("tax : " + v);
                double wageFinal = wage - v ;
                System.out.println("Wage final: " + wageFinal);
            }else if(wage < 4190){
                double v = wage * 0.12;
                System.out.println("tax : " + v);
                double wageFinal = wage - v ;
                System.out.println("Wage final: " + wageFinal);

            }else{
                double v = wage * 0.14;
                System.out.println("tax : " + v);
                double wageFinal = wage - v ;
                System.out.println("Wage final: " + wageFinal);
            }
        }
    }

