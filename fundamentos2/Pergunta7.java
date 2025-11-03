import java.util.Scanner;

public class Pergunta7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número real: ");
        double numero = sc.nextDouble();

        double triplo = numero * 3;

        System.out.println("O triplo do número é: " + triplo);

        sc.close();
    }
}
