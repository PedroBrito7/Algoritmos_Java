package dataStructuresAlgorithms.selectionsort;


public class SelectionSort{
    public static void selectionSort(int[] arr){

        for(int i = 0; i< arr.length -1; i++){
            // Loop principal que percorre o array.
            // A cada iteração, vamos escolher o menor elemento da parte não ordenada.
            // Usamos arr.length - 1 porque o último elemento já estará automaticamente ordenado.

            int min = i;
            // Assume inicialmente que o menor elemento é o da posição atual (i).

            for(int j = i +1; j<arr.length;j++){
                // Segundo loop que percorre o restante do array (parte não ordenada).
                // Começa em i + 1 porque estamos comparando os próximos elementos
                // com o elemento da posição i.

                if(arr[j] < arr[min]){
                    // Verifica se encontramos um número menor que o mínimo atual.

                    min = j;
                    // Se encontramos um menor, atualizamos o índice do mínimo.
                }
            }

            int temp = arr[i];
            // Guarda o valor da posição i em uma variável temporária
            // para não perder o valor durante a troca.

            arr[i] = arr[min];
            // Coloca o menor valor encontrado na posição correta (posição i).

            arr[min] = temp;
            // Coloca o valor antigo de i na posição onde estava o menor elemento.
            // Isso efetivamente faz a troca (swap).
        }
    }

    public static void main(String[] args) {
        // Método principal que executa o programa.

        int[] numeros = {29, 10, 14, 37, 13};
        // Cria um array de inteiros que será ordenado.

        System.out.println("Antes da ordenação:");
        // Mensagem informando o estado do array antes da ordenação.

        for (int num : numeros){
            // Loop foreach que percorre todos os elementos do array.

            System.out.println(num + " ");
            // Imprime cada número.
        }

        selectionSort(numeros);
        // Chama o método de ordenação passando o array.

        System.out.println("Depois da ordenação:");
        // Mensagem informando o estado do array depois da ordenação.

        for (int num : numeros){
            // Percorre novamente o array.

            System.out.println(num + " ");
            // Imprime os números agora ordenados.
        }
    }
}