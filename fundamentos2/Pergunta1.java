
/* 
Início
    Escreva("Digite o nome do funcionário:")
    Leia(nome)
    
    Escreva("Digite a quantidade de dependentes:")
    Leia(dependentes)
    
    Escreva("Digite o cargo ocupado pelo funcionário:")
    Leia(cargo)
    
    Escreva("Dados do funcionário:")
    Escreva("Nome: ", nome)
    Escreva("Quantidade de dependentes: ", dependentes)
    Escreva("Cargo: ", cargo)
Fim

*/
import java.util.Scanner;

public class Pergunta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Digite a quantidade de dependentes: ");
        int dependentes = sc.nextInt();
        sc.nextLine(); // limpar buffer

        System.out.print("Digite o cargo do funcionário: ");
        String cargo = sc.nextLine();

        System.out.println("\n--- Dados do Funcionário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Dependentes: " + dependentes);
        System.out.println("Cargo: " + cargo);

        sc.close();
    }
}
