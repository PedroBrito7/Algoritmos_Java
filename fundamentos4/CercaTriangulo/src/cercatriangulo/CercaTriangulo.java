/*
algoritmo "CercaTriangulo"
var
    a, b, c: real
inicio
    escreva("Digite o comprimento do lado a (m): ")
    leia(a)

    escreva("Digite o comprimento do lado b (m): ")
    leia(b)

    c <- raizq(a * a + b * b)

    escreva("Precisa comprar ", c, " metros de cerca.")
    
fim
*/
package cercatriangulo;
import java.util.Scanner;

public class CercaTriangulo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Digite o comprimento do lado a (m): ");
      double a = sc.nextDouble();
      
      System.out.print("Digite o comprimento do lado b (m): ");
      double b = sc.nextDouble();
      
      double c = Math.sqrt(a * a + b * b);

      System.out.printf("Voce precisa comprar %.2f metros de cerca.%n", c);

      sc.close();
      
    }
    
}
