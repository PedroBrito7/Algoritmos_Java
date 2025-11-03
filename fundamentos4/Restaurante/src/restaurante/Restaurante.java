/*
algoritmo Restaurante
    início
        real preco,conta

        escreva("Digite o valor do consumo")
        leia(preco)

        escreva

        preco = conta*0.10+preco

        escreva("Esse e o total da sua conta"+preco)
    fim
*/
package restaurante;
import java.util.Scanner;

 public class Restaurante {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     double preco,conta;
             
     System.out.print("Digite o valor do consumo: ");
     preco = sc.nextDouble();
     
     conta = preco*0.10+preco;
     
     System.out.print("Esse e o total da sua conta: "+conta);
     
     sc.close();
    }
    
}
