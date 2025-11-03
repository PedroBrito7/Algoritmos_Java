package regiao;

import java.util.Scanner;



public class Regiao {

  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

   

  int destino, tipo;

  double valor;

   

  System.out.print("Escolha o destino:");

  System.out.print("\n1 - Região Norte");

  System.out.print("\n2 - Região Nordeste");

  System.out.print("\n3 - Região Centro-Oeste");

  System.out.print("\n4 - Região Sul");

  System.out.print("\nDigite a opção desejada: ");

  destino = sc.nextInt();

   

  System.out.print("\nA viagem inclui retorno?");

  System.out.print("\n1 - Somente ida");

  System.out.print("\n2 - Ida e volta");

  System.out.print("\nDigite a opção desejada: ");

  tipo = sc.nextInt();

   

  switch (destino) {

      case 1: // Região Norte

        if (tipo == 1)

          valor = 500;

        else if (tipo == 2)

          valor = 900;

        else {

          System.out.println("Tipo de viagem inválido!");

          sc.close();

          return;

        }

        break;



      case 2: // Região Nordeste

        if (tipo == 1)

          valor = 350;

        else if (tipo == 2)

          valor = 650;

        else {

          System.out.println("Tipo de viagem inválido!");

          sc.close();

          return;

        }

        break;



      case 3: // Região Centro-Oeste

        if (tipo == 1)

          valor = 350;

        else if (tipo == 2)

          valor = 600;

        else {

          System.out.println("Tipo de viagem inválido!");

          sc.close();

          return;

        }

        break;



      case 4: // Região Sul

        if (tipo == 1)

          valor = 600;

        else if (tipo == 2)

          valor = 550;

        else {

          System.out.println("Tipo de viagem inválido!");

          sc.close();

          return;

        }

        break;



      default:

        System.out.println("Destino inválido!");

        sc.close();

        return;

    }



    System.out.printf("\nO valor da passagem é: R$ %.2f\n", valor);



    sc.close();

  }

}