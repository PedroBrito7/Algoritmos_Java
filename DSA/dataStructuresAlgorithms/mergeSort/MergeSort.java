package dataStructuresAlgorithms.mergeSort;

public class MergeSort {

    public static void mergeSort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;

            mergeSort(arr, inicio, meio);
            mergeSort(arr, meio + 1, fim);
            intercalar(arr, inicio, meio, fim);
        }
    }

    public static void intercalar(int[] arr, int inicio, int meio, int fim) {
        int[] aux = new int[fim - inicio + 1];
        int i = inicio;
        int j = meio + 1;
        int k = 0;

        while (i <= meio && j <= fim) {
            if (arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            } else {
                aux[k++] = arr[j++];
            }
        }

        while (i <= meio) {
            aux[k++] = arr[i++];
        }

        while (j <= fim) {
            aux[k++] = arr[j++];
        }

        for (int m = 0; m < aux.length; m++) {
            arr[inicio + m] = aux[m];
        }
    }

    public static void main(String[] args) {
        int[] numeros = {29, 10, 14, 37, 13};

        System.out.println("Antes da ordenação:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        mergeSort(numeros, 0, numeros.length - 1);

        System.out.println("\nDepois da ordenação:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}


