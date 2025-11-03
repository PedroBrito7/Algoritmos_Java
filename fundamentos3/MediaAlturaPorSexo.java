/*
algoritmo MediaAlturaPorSexo
real altura, somaHomens, somaMulheres
inteiro contadorHomens, contadorMulheres
literal sexo

inicio
    somaHomens = <- 0
    somaMulheres <- 0
    contadorHomens <- 0
    contadorMulheres <- 0

    escreva("Digite a altura (0 para parar): ")
    leia(altura)

    enquanto altura <> 0 faça
        escreva("Digite o sexo (M/F): ")
        leia(sexo)

        se sexo = "M" então
            somaHomens <- somaHomens + altura
            contadorHomens <- contadorHomens + 1
        senao se sexo = "F" então
            somaMulheres <- somaMulheres + altura
            contadorMulheres <- contadorMulheres + 1
        fimse

        escreva("Digite a altura (0 para parar): ")
        leia(altura)
    fimenquanto

    se contadorHomens > 0 então
        escreva("Média de altura dos homens: ", somaHomens / contadorHomens)
    fimse

    se contadorMulheres > 0 então
        escreva("Média de altura das mulheres: ", somaMulheres / contadorMulheres)
    fimse
fim

*/import java.util.Scanner;

public class MediaAlturaPorSexo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, somaHomens = 0, somaMulheres = 0;
        int contadorHomens = 0, contadorMulheres = 0;
        char sexo;

        System.out.print("Digite a altura (0 para parar): ");
        altura = sc.nextDouble();

        while (altura != 0) {
            System.out.print("Digite o sexo (M/F): ");
            sexo = sc.next().toUpperCase().charAt(0);

            if (sexo == 'M') {
                somaHomens += altura;
                contadorHomens++;
            } else if (sexo == 'F') {
                somaMulheres += altura;
                contadorMulheres++;
            }

            System.out.print("Digite a altura (0 para parar): ");
            altura = sc.nextDouble();
        }

        if (contadorHomens > 0) {
            System.out.println("Média de altura dos homens: " + (somaHomens / contadorHomens));
        }
        if (contadorMulheres > 0) {
            System.out.println("Média de altura das mulheres: " + (somaMulheres / contadorMulheres));
        }

        sc.close();
    }
}
