/* algoritmo Media_km

real: km , media , litros
caractere : litros
inicio
escreva ("Digite a km's rodados: ");
leia (km);
escreva ("Digite quantidade de Litros: ");
leia (litros);
media = km / litros;
escreva (" A média de rodagem é" + media + " Km/l ") ;
fim



*/

package media_km;

import java.util.Scanner;

public class Media_km {

  public static void main(String[] args) {

    double km, litros, media; // os dados

    

     System.out.println("Digite os km´s: ");

         Scanner tc = new Scanner(System.in); // chamando o teclado

         

         

         // leia (km)

  km = tc.nextDouble();

  

  System.out.println("Digite a quantidade de litros: ");

  // leia (litros)

  litros= tc.nextDouble();

  

  // media 

  media= km / litros;

      

      System.out.println(" a média é: " + media + "km/l");

     

  

      tc.close();

      

    

  }

  

}

