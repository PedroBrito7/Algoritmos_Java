/* 

algoritmo FastFood

inteiro opcao

real preco

literal lanche



inicio

  escreva("Menu")

  escreva("[1] - Hambúrguer (R$ 10)")

  escreva("[2] - Cachorro-quente (R$ 7)")

  escreva("[3] - Batata Frita (R$ 5)")

  escreva("Escolha seu lanche: ")

  leia(opcao)



  escolha opcao

    caso 1:

      lanche <- "Hambúrguer"

      preco <- 10

    caso 2:

      lanche <- "Cachorro-quente"

      preco <- 7

    caso 3:

      lanche <- "Batata Frita"

      preco <- 5

    outrocaso:

      lanche <- "Opção inválida"

      preco <- 0

  fimescolha



  escreva("Você escolheu: ", lanche)

  escreva("Valor a pagar: R$ ", preco)

fim

*/

import java.util.Scanner;



public class FastFood {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);



    int opcao;

    double preco = 0;

    String lanche = "";



    System.out.println("Menu");

    System.out.println("[1] - Hambúrguer (R$ 10)");

    System.out.println("[2] - Cachorro-quente (R$ 7)");

    System.out.println("[3] - Batata Frita (R$ 5)");

    System.out.print("Escolha seu lanche: ");

    opcao = sc.nextInt();



    switch (opcao) {

      case 1:

        lanche = "Hambúrguer";

        preco = 10;

        break;

      case 2:

        lanche = "Cachorro-quente";

        preco = 7;

        break;

      case 3:

        lanche = "Batata Frita";

        preco = 5;

        break;

      default:

        lanche = "Opção inválida";

        preco = 0;

    }



    System.out.println("Você escolheu: " + lanche);

    System.out.printf("Valor a pagar: R$ %.2f%n", preco);



    sc.close();

  }

}