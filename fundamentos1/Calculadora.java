    import java.util.Scanner;

    public class Calculadora {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double valor1, valor2, resultado = 0;
            char operacao;

            System.out.print("Digite o primeiro valor: ");
            valor1 = sc.nextDouble();

            System.out.print("Digite o segundo valor: ");
            valor2 = sc.nextDouble();

            System.out.print("Escolha a operação (+, -, *, /): ");
            operacao = sc.next().charAt(0); // lê apenas o primeiro caractere

            boolean operacaoValida = true;

            switch (operacao) {
                case '+':
                    resultado = valor1 + valor2;
                    break;
                case '-':
                    resultado = valor1 - valor2;
                    break;
                case '*':
                    resultado = valor1 * valor2;
                    break;
                case '/':
                    if (valor2 != 0) {
                        resultado = valor1 / valor2;
                    } else {
                        System.out.println("Erro: divisão por zero!");
                        operacaoValida = false;
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    operacaoValida = false;
            }

            if (operacaoValida) {
                System.out.println("Resultado: " + resultado);
            }

            sc.close();
        }
    }
