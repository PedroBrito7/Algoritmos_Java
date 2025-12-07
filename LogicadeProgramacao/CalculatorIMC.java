package LogicadeProgramacao;
import java.util.Scanner;
public class CalculatorIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting your imc Calculate");
        System.out.println("Write your weight in kg : 80");
        double weight = sc.nextDouble();
        System.out.println("Write your height ex: 1.90");
        double height = sc.nextDouble();
        double result = weight / (height * height);
        System.out.println("result"+ result);
        String category = "";
        if ( result <= 18.5){
            category = "Abaixo do peso";
        } else if (result <= 24.9){
            category = "Ideal weight (congratulations)";
        }
        else if (result <= 29.9){
            category = "Overweight";
        }else if (result <= 34.9){
            category = "Grade I obesity";
        }else if (result <= 39.9){
            category = "Grade II obesity (severe)";
        }else if (result <= 49.9){
            category = "Grade III obesity (severe)";
        }else{
            category = "Grade III obesity (morbid) its over";
        }
        System.out.println("Category "+ category);

        sc.close();
    }
}
