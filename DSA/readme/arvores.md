# Árvores - Conceitos básico
Uma árvore é uma estrutura hierarquica onde cada elemento(nó) 
pode ter filho. o nó principal é chamado de raiz(root), 
e os nós sem filho São folhas(leaves)

- Raiz(Root) = o primeiro nó 
- Pai/Filho = relacionamento entre nós
- Altura da árvore = maior caminho até uma folha 
- Subárvore = uma árvore dentro de outra árvore

## pq usar arvores
- Representacao de hierarquias
- Melhor perfomance em busca e inserção comparado a listas (com balanceamento)

### Como construir uma árvore e inverter-las
Todos descendentes do nó tambem são arvores(se nao tiver filhos sao folhas), Todos aqueles valores que forem
maior que o nó root, vão ser pra direita enquanto os menores pra esquerda sempre.

# Árvores binárias de busca

# Heaps
Heap é uma área da memória do computador usada para armazenar objetos 
criados durante a execução do programa.
Ela resolve de forma eficiente problemas de CC 
especial quando você precisar acessar rapidamente o min e max valor de conjunto de dados dinamicos

## Algoritmos famosos
- filas de prioridade como agendamento de tarefas, 
- Algoritmos de redes como dijkstra
- Simulacao de eventos (event driven simulation)
- Sistema de operacionais



## MinHeap / MaxHeap
- Mínimo sempre tem o menor elemento na raiz
- maximo sempre o maior elemento na raiz
- Isso permite fazer operacoes de qual menor valor ou qual maior valor que leva O(1)

```
import java.util.*;

public class MinHeap {
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
```
# Tabelas Hash(HashMap e HashSet)