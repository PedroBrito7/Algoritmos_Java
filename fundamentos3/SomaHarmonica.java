import java.util.Scanner;

public class SomaHarmonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Número inválido!");
        } else {
            double soma = 0;
            for (int i = 1; i <= n; i++) {
                soma += 1.0 / i; // importante usar 1.0 para divisão real
            }
            System.out.println("Soma: " + soma);
        }

        sc.close();
    }
}
