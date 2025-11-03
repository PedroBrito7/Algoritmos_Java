/* algoritmo Desconto

real valor, desconto, valorFinal



inicio

  escreva("Digite o valor do produto: ")

  leia(valor)



  desconto <- valor * 0.10

  valorFinal <- valor - desconto



  escreva("Valor com desconto: R$ ", valorFinal)

fim

*/ 

import java.util.Scanner;



public class Desconto {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);



    double valor, desconto, valorFinal;



    System.out.print("Digite o valor do produto: R$ ");

    valor = sc.nextDouble();



    desconto = valor * 0.10;

    valorFinal = valor - desconto;



    System.out.println("Valor com desconto: R$ " + valorFinal);



    sc.close();

  }

}