/*
 algoritmo Operacoes

inteiro num1, num2, soma, sub, mult, div, resto



inicio

  escreva("Digite o primeiro número: ")

  leia(num1)

  escreva("Digite o segundo número: ")

  leia(num2)



  soma <- num1 + num2

  sub <- num1 - num2

  mult <- num1 * num2

  div <- num1 / num2

  resto <- num1 % num2



  escreva("Soma: ", soma)

  escreva("Subtração: ", sub)

  escreva("Multiplicação: ", mult)

  escreva("Divisão: ", div)

  escreva("Resto da divisão: ", resto)

fim
*/
package operacoes;
import java.util.Scanner;



public class Operacoes {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);



    int num1, num2;

    int soma, sub, mult, div, resto;



    System.out.print("Digite o primeiro número: ");

    num1 = sc.nextInt();



    System.out.print("Digite o segundo número: ");

    num2 = sc.nextInt();



    soma = num1 + num2;

    sub = num1 - num2;

    mult = num1 * num2;

    div = num1 / num2;  // divisão inteira

    resto = num1 % num2; // resto da divisão



    System.out.println("Soma: " + soma);

    System.out.println("Subtração: " + sub);

    System.out.println("Multiplicação: " + mult);

    System.out.println("Divisão: " + div);

    System.out.println("Resto da divisão: " + resto);



    sc.close();

  }

}