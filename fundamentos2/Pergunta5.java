import java.util.Scanner;

public class Pergunta5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        int horas = sc.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = sc.nextInt();

        int totalMinutos = (horas * 60) + minutos;

        System.out.println("Minutos desde o início do dia: " + totalMinutos);

        sc.close();
    }
}
