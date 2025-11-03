/* algoritmo MediaEMaiorIndefinido
real valor, soma, media, maior
inteiro contador

inicio
    soma <- 0
    contador <- 0
    maior <- -infinito

    escreva("Digite os valores (digite 0 para parar): ")
    leia(valor)

    enquanto valor <> 0 faça
        soma <- soma + valor
        contador <- contador + 1
        se valor > maior então
            maior <- valor
        fimse
        leia(valor)
    fimenquanto

    se contador > 0 então
        media <- soma / contador
        escreva("Média: ", media)
        escreva("Maior valor: ", maior)
    senao
        escreva("Nenhum valor foi digitado.")
    fimse
fim
*/ 
import java.util.Scanner;

public class MediaEMaiorIndefinido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor, soma = 0, maior = Double.NEGATIVE_INFINITY;
        int contador = 0;

        System.out.println("Digite os valores (digite 0 para parar): ");
        valor = sc.nextDouble();

        while (valor != 0) {
            soma += valor;
            contador++;
            if (valor > maior) {
                maior = valor;
            }
            valor = sc.nextDouble();
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Média: " + media);
            System.out.println("Maior valor: " + maior);
        } else {
            System.out.println("Nenhum valor foi digitado.");
        }

        sc.close();
    }
}
