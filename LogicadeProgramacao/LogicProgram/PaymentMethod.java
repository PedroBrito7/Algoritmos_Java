package LogicProgram;
import java.util.Scanner;
public class PaymentMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int produto = 100;
        System.out.println(" Choose your payment method. 1- Cash, 2- Credit Card, 3- Pay in 2 installments, 4- Pay in more installments (interest applies)");
        int payment = sc.nextInt();
        if(payment == 1){
            double desc = produto * 0.15 + produto;
            System.out.println("You saved money 15%, it comes to a total. " + desc);
        } else if (payment == 2) {
            double desc2 = produto * 0.1 + produto ;
            System.out.println("You saved money 10% , it comes to a total. " + desc2 );
        }else if (payment == 3 ){
            System.out.println("you will buy it at the regular price " + produto);
        } else if ( payment == 4){
            double desc3 = produto * 0.1 + produto;
            System.out.println("You will pay to it at the fees of 10% of 100 "+ desc3 );
        }else{
            System.out.println("Enter one number valid");
        }
    }
}
