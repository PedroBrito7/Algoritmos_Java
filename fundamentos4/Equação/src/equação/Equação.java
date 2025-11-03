/*
algoritmo Equacaodesegundograu
    início
        algoritmo "EquacaoSegundoGrau"

var
    a, b, c: real
    delta, x1, x2: real

inicio
    escreva("Digite o valor de a: ")
    leia(a)

    escreva("Digite o valor de b: ")
    leia(b)

    escreva("Digite o valor de c: ")
    leia(c)

    delta <- b * b - 4 * a * c

    se delta < 0 entao
        escreval("A equacao nao possui raizes reais.")
    senao
        x1 <- (-b + raizq(delta)) / (2 * a)
        x2 <- (-b - raizq(delta)) / (2 * a)

        escreval("Delta = ", delta)
        escreval("Raiz 1 = ", x1)
        escreval("Raiz 2 = ", x2)
    fim
*/
package equação;
import java.util.Scanner;

public class Equação {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Digite o valor de a: ");
       double a = sc.nextDouble();
       
       System.out.print("Digite o valor de b: ");
       double b = sc.nextDouble();
       
       System.out.print("Digite o valor de c: ");
       double c = sc.nextDouble();
       
       double delta = b * b - 4 * a * c;
       
       if(delta < 0){
       System.out.print("A equacao nao possui raizes reais.");
       }
       
       else {
           double x1 = (-b + Math.sqrt(delta)) / (2 * a);
           double x2 = (-b - Math.sqrt(delta)) / (2 * a);
           
           System.out.println("Delta = " + delta);
           System.out.println("Raiz 1 = " + x1);
           System.out.println("Raiz 2 = " + x2);
       }
       
       
       
    }
    
}
