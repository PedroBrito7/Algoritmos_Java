import java.util.Scanner;
public class RodizioVeiculos{
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int finalPlaca, placa ; 
            System.out.print("Digite os quatro últimos dígitos da placa do veículo: ");
       placa= sc.nextInt();
       finalPlaca = placa % 10; 

       switch (finalPlaca) {
        case 1, 2:
             System.out.print("Rodízio na segunda-feira");
            break;
        case 3, 4:
            System.out.print("Rodízio na terça-feira");
            break;
        case 5, 6:
            System.out.print("Rodízio na Quarta-feira");
            break;
         case 7, 8:
            System.out.print("Rodízio na quinta-feira");
            break;
        case 9, 0:
           System.out.print("Rodízio na sexta-feira");
        default:
        System.out.println("Digito inválido");
            break;

            sc.close();
       }
    }
}


