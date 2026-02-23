package dataStructuresAlgorithms.queue;

import java.util.PriorityQueue;

public class TarefaTest {
    public static void main(String[] args) {
        PriorityQueue<Tarefa> filaTarefa = new PriorityQueue<Tarefa>();
        filaTarefa.add(new Tarefa("Responder emails",3));
        filaTarefa.add(new Tarefa("Corrigir bugs",1));
        filaTarefa.add(new Tarefa("Planejamento Sprint",2));

        System.out.println("Tasks by priority order");
        while (!filaTarefa.isEmpty()){
            System.out.println(filaTarefa.poll());
        }
    }
}
