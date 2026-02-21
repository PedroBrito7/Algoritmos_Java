package dataStructuresAlgorithms.arvores;

import java.util.PriorityQueue;

public class MinHeapAndMaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Adiciona elementos
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(5);
        minHeap.add(30);
        minHeap.add(15);

        System.out.println("Min Heap: " + minHeap);
        System.out.println("Valor mínimo (raiz): " + minHeap.peek());
        System.out.println("Removendo raiz: " + minHeap.poll());
        System.out.println("Heap após remoção: " + minHeap);
    }
}
