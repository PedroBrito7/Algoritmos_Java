/*
algoritmo calcularAreaTriangulo
    real base, altura, area

    escreva("Digite o valor da base do triângulo: ")
    leia(base)

    escreva("Digite o valor da altura do triângulo: ")
    leia(altura)

    area <- (base * altura) / 2

    escreva("A área do triângulo é: ", area)
fim
*/
package calcularareatriangulo;
import java.util.Scanner;

public class CalcularAreaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double base,altura,area;
        
        System.out.print("Digite o valor da base do triangulo: ");
        base = sc.nextDouble();
        
        System.out.print("Digite o valor da altura do triangulo: ");
        altura = sc.nextDouble();
        
        area = base*altura/2;
        
        System.out.print("A area do triangulo é: "+area);
        
        sc.close();
    }
    
}
