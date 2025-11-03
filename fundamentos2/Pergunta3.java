import java.util.Scanner;

public class Pergunta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a (base): ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de b (altura do retângulo 1): ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de d (altura do retângulo 2): ");
        double d = sc.nextDouble();

        double A1 = a * b;
        double A2 = a * d;
        double AT = A1 + A2;

        System.out.println("\n--- Áreas calculadas ---");
        System.out.println("Área do retângulo 1 (A1): " + A1);
        System.out.println("Área do retângulo 2 (A2): " + A2);
        System.out.println("Área total (AT): " + AT);

        sc.close();
    }
}
