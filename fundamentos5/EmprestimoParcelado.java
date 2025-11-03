/*

algoritmo EmprestimoParcelado

real salario, valorEmprestimo, juros, valorTotal, valorParcela

inteiro pendencias, nParcelas



inicio

  escreva("Digite seu salário: ")

  leia(salario)



  escreva("Digite a quantidade de pendências: ")

  leia(pendencias)



  se (salario >= 2000) e (pendencias == 0) entao

    escreva("Empréstimo aprovado!")

     

    escreva("Digite o valor do empréstimo: ")

    leia(valorEmprestimo)



    escreva("Digite a quantidade de parcelas: ")

    leia(nParcelas)



    juros <- valorEmprestimo * 0.9 * nParcelas / 100

    valorTotal <- valorEmprestimo + juros

    valorParcela <- valorTotal / nParcelas



    escreva("Valor total a pagar: R$ ", valorTotal)

    escreva("Valor de cada parcela: R$ ", valorParcela)

  senao

    escreva("Empréstimo não aprovado.")

  fimse

fim



*/



import java.util.Scanner;



public class EmprestimoParcelado {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);



    double salario, valorEmprestimo, juros, valorTotal, valorParcela;

    int pendencias, nParcelas;



    System.out.print("Digite seu salário: R$ ");

    salario = sc.nextDouble();



    System.out.print("Digite a quantidade de pendências: ");

    pendencias = sc.nextInt();



    if (salario >= 2000 && pendencias == 0) {

      System.out.println("Empréstimo aprovado!");



      System.out.print("Digite o valor do empréstimo: R$ ");

      valorEmprestimo = sc.nextDouble();



      System.out.print("Digite a quantidade de parcelas: ");

      nParcelas = sc.nextInt();



      juros = valorEmprestimo * 0.9 * nParcelas / 100;

      valorTotal = valorEmprestimo + juros;

      valorParcela = valorTotal / nParcelas;



      System.out.printf("Valor total a pagar: R$ %.2f%n", valorTotal);

      System.out.printf("Valor de cada parcela: R$ %.2f%n", valorParcela);

    } else {

      System.out.println("Empréstimo não aprovado.");

    }



    sc.close();

  }

}

