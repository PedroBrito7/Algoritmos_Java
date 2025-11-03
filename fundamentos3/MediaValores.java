/* 
algoritmo MediaValores
inteiro n, i
real valor, soma, media

inicio
    escreva("Digite a quantidade de valores: ")
    leia(n)

    soma <- 0

    para i de 1 até n passo 1 faça
        escreva("Digite o valor ", i, ": ")
        leia(valor)
        soma <- soma + valor
    fimpara

    media <- soma / n
    escreva("A média dos valores é: ", media)
fim

*/ 
package MediaValores;

import java.util.Scanner;

public class MediaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de valores: ");
        int n = sc.nextInt();
        double soma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o valor " + i + ": ");
            double valor = sc.nextDouble();
            soma += valor;
        }
        double media = soma / n;
        System.out.println("A média dos valores é: " + media);

        sc.close();
    }
}
