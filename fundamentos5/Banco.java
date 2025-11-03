/*algoritmo Media_km

 primeiro tipo de dado e dps coloca a varivel 

real: salario;

inteiro: pendencias;



 inicio 

escreva ("Qual seu salario");

leia (salario);



escreva ("Quais suas pendencias ");

leia (litros);



se ( salario > 2500 & pendencias <= 2)

escreva ("Aprovado") ;



senao(

  escreva ("Reprovado");

)

fim se 

fim

*/



package banco;

import java.util.Scanner;

public class Banco {

  public static void main(String[] args) {

    

    double salario, pendencias; // os dados

     System.out.println("Digite o seu salario: ");

         Scanner tc = new Scanner(System.in); // chamando o teclado

         

         

        

  salario = tc.nextDouble();

  

  System.out.println("Digite as pendencias: ");

 

  pendencias = tc.nextDouble();

  

  if (salario >= 2500 && 2>= pendencias) {

  System.out.println("Tá aprovado");

} else {

  System.out.println("Tá reprovado");

}

      

      tc.close();

      

  }

  

}

