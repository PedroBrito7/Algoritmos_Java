package Cargos;
import java.util.Scanner;
public class Cargos {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);



    int codigo;

    double salario, aumento = 0, novoSalario = 0;

    String cargo = "";



    System.out.print("Digite o codigo do cargo (1 a 5): ");

    codigo = sc.nextInt();



    System.out.print("Digite o salario atual: ");

    salario = sc.nextDouble();



    switch (codigo) {

      case 1:

        cargo = "Escriturario";

        aumento = salario * 0.50;

        novoSalario = salario + aumento;

        break;

      case 2:

        cargo = "Secretario";

        aumento = salario * 0.35;

        novoSalario = salario + aumento;

        break;

      case 3:

        cargo = "Caixa";

        aumento = salario * 0.20;

        novoSalario = salario + aumento;

        break;

      case 4:

        cargo = "Gerente";

        aumento = salario * 0.10;

        novoSalario = salario + aumento;

        break;

      case 5:

        cargo = "Diretor";

        aumento = 0;

        novoSalario = salario;

        break;

      default:

        System.out.println("Codigo invalido!");

        sc.close();

        return;

    }



    System.out.println("Cargo: " + cargo);

    System.out.println("Valor do aumento: " + aumento);

    System.out.println("Novo salario: " + novoSalario);



    sc.close();

  }

} cargo {
    
}
