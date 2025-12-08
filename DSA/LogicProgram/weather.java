package LogicProgram;
import java.util.Scanner;
public class weather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter with weather in F: ");
        double fahrenheit = sc.nextDouble();
        System.out.println(weatherC(fahrenheit));
    }

    public static double weatherC(double f){
        double c = (5 * ( f-32) / 9);
        return c;
    }
}
