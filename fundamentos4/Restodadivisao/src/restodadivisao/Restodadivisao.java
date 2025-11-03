/*
algoritmo restodadivisao
    início
        inteiro = a , b

        escreva("Digite um numero inteiro")
        leia(a)

        escreva("Digite um numero inteiro")
        leia(b)

        resto = a/b

        escreva("O resultado dos restos e: "+resto)
    fim
*/
package restodadivisao;
import java.util.Scanner;

public class Restodadivisao {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int a, b, resto;
      
      System.out.print("Digite um numero inteiro :");
      a = sc.nextInt();
      
      System.out.print("Digite um numero inteiro :");
      b = sc.nextInt();
      
      resto = a%b;
      
      System.out.print("O resultado do resto e: "+resto);
     
      
      sc.close();
      }
}