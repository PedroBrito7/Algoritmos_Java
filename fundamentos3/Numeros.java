/*algoritmo Numeros
inteiro i

inicio
    escreva("Números de 1 a 50:")
    para i de 1 até 50 passo 1 faça
        escreva(i)
    fimpara

    escreva("Números de 52 a 100 de 2 em 2:")
    para i de 52 até 100 passo 2 faça
        escreva(i)
    fimpara
fim
 */
package atv7;

public class Numeros {
    public static void main(String[] args) {
        
        System.out.println("Números de 1 a 50:");
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }

        
        System.out.println("Números de 52 a 100 de 2 em 2:");
        for (int i = 52; i <= 100; i += 2) {
            System.out.println(i);
        }
    }
}
