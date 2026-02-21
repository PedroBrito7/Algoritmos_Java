package dataStructuresAlgorithms.queue;

import java.util.LinkedList;
import java.util.Queue;

public class queueTest {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.offer("Cliente 1");
        fila.offer("Cliente 2");
        System.out.println(fila.poll());

    }
}
