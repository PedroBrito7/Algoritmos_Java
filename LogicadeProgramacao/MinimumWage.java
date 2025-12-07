package LogicadeProgramacao;
import java.util.Scanner;
public class MinimumWage {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double wagerMin = 1293.20;
        System.out.println("Write your Wage: ");
        double wagerUser = read.nextDouble();
        double wagerUser1 = read.nextDouble();
        double wagerUser2 = read.nextDouble();


        double quantosSalarios =  wagerMin / wagerUser ;
        System.out.println(" You earn : " + quantosSalarios + " minimum wage.");
    }
}
