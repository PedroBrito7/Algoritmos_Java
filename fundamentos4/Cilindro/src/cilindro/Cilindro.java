/*
algoritmo "Cilindro"

var
    r, h: real
    areaBase, volume: real

inicio
    escreva("Digite o raio do cilindro: ")
    leia(r)

    escreva("Digite a altura do cilindro: ")
    leia(h)

    areaBase <- 3.14159 * r * r
    volume <- areaBase * h

    escreval("Área da base = ", areaBase)
    escreval("Volume do cilindro = ", volume)
fimalgoritmo
*/
package cilindro;
import java.util.Scanner;

public class Cilindro {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
       System.out.print("Digite o raio do cilindro: ");
       double r = sc.nextDouble();
       
       System.out.print("Digite o raio do cilindro: ");
       double h = sc.nextDouble();
       
       double areaBase = Math.PI * r * r; 
       double volume = areaBase * h;
        
       System.out.println("Area da base = " + areaBase);
       System.out.println("Volume do cilindro = " + volume);

       sc.close();
        
    }
    
}
