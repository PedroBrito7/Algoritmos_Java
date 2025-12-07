package LogicadeProgramacao;
import java.util.Scanner;

public class ReadABC {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in) ;
        System.out.println("Enter a number for the sum A:");
        int a = read.nextInt();
        System.out.println("Enter a second number for the sum B:");
        int b = read.nextInt();
        System.out.println("Write a number to compare with the other numbers:");
        int c = read.nextInt();

        int sum = a + b ;
        if(sum > c){
            System.out.println("Your number is greater than " + c + " Congratulations, keep going");
        }else{
            System.out.println("Unfortunately, your number is not greater than "+ c + " Continue again.");
        }

    }
}
