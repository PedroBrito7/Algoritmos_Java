package dataStructuresAlgorithms.BubbleSort;

public class Bubblesorte {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1 -i; j++){ // loop interno que compara os elementos adjacentes

                if(arr[j]> arr[j+1]){ // se o elemento atual(j) ele menor que o proximo(arr j+1) é pq ta fora de ordem
                    int temp = arr[j]; // cria um var temporaria pra congela o valor do j
                    arr[j] = arr[j+1]; // vai pegar o j+1 que seria o proximo
                    arr[j + 1] = temp; // e vai transformar ele no que a gente estava mexendo, fazendo a troca
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5,3,8,4,2};
        System.out.println("antes da ordenacao");
        for(int num : numeros){
            System.out.println(num + " ");
        }

        bubbleSort(numeros);
        System.out.println("dps da ordenacao");
        for(int num : numeros){
            System.out.println(num + " ");
        }
    }
}
