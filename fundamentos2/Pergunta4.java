import java.util.Scanner;

public class Pergunta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacao = sc.nextDouble();

        System.out.print("Digite o valor em dólares: ");
        double dolares = sc.nextDouble();

        double reais = dolares * cotacao;

        System.out.println("Valor equivalente em Reais: " + reais);

        sc.close();
    }
}
