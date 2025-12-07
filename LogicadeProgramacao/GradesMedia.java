package LogicadeProgramacao;
import java.util.Scanner;
public class GradesMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // two solutions
//        System.out.println("What is your grade in mathematics ?");
//        int g1 = sc.nextInt();
//        System.out.println("What is your grade in portuguese ?");
//        int g2 = sc.nextInt();
//        System.out.println("What is your grade in science ?");
//        int g3 = sc.nextInt();
//
//        double media = ( g1 + g2 + g3 ) / 3 ;
//
//        System.out.println(" Your media is: " + media );

        int tamanho = 3;
        int[] nomes = new int [tamanho];
        System.out.println("Enter 3 grades for your averages: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("enter the name for position 1-math 2-port 3- scien " + i + ": ");
            nomes[i] = sc.nextInt();
        }
        System.out.println("Content of array");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }
        double resultado = ( nomes[0] + nomes[1] + nomes[2] ) / 3;
        System.out.println(" Your media is: "+ resultado);
    }
}
