package dataStructuresAlgorithms.Grafos;

import java.security.InvalidParameterException;
import java.util.*;

public class AlgoritmoDijkstra {
    private int vertices[][];

    public AlgoritmoDijkstra(final int numVertices) {
       vertices = new int[numVertices][numVertices];
    }

    public void criarAresta(final int noOrigem,final int noDestino,final int peso){
        if(peso>=1){
            vertices[noOrigem][noDestino]=peso;
            vertices[noDestino][noOrigem]=peso;
        }else {
            throw new InvalidParameterException("O peso do nó de origem["+noOrigem+"] para o nó destino["+noDestino+"] é inválido");
        }
    }

    private int getMaisProximo(final int listaCustos[], final Set<Integer> naoVisitados){
        int minDistancia = Integer.MAX_VALUE; //não sabemos como chegar nos outros nós entao a gente precisa colocar a distancia como "infinita"
        int noProximo = 0; // so inicializa
        for (Integer i : naoVisitados){ // objetivo no for é de pegar o mais prox
            if(listaCustos[i] < minDistancia){ // se o custo ele for menor que a distancia minima entao
                minDistancia = listaCustos[i]; // minDistancia minima vai receber a linha de custo e o no proximo vai ser a quantidade do I que foi percorrido
                noProximo = i;
            }
        }
            return noProximo;
    }

    private List<Integer> getVizinhos(final int no){ // paso o nó e vai retornar quem é seus vizinhno
        List<Integer> vizinhos = new ArrayList<>(); // cria uma lista interna onde vai add oq encontrar
        for (int i = 0; i < vertices.length; i++) { // percorre uma passada dentro dos vertices
            if(vertices[no][i]>0){ // ele precisa ser maior q 0 para ter uma relação com ele logo sendo vizinho, e esse vertices é um variavel global
                vizinhos.add(i); // aqui ele adiciona na lista que criamos ja com uma "filtragem"
            }
        }
        return vizinhos;
    }

    private int getCusto(final int noOrigem, final int noDestino){
        return vertices[noOrigem][noDestino]; // aqui so inicializa o custo para calcular
    }

    public List<Integer>caminhoMinimo(final int noOrigem, final int noDestino){
        int custo[] = new int[vertices.length]; // criou a variavel custo que vai receber o tamanho do vertice(var global) que estamos trabalhando
        int antecessor[] = new int[vertices.length]; // vai salver o antecessor para ajudar a reconstruir o caminho
        Set<Integer> naoVisitados = new HashSet<Integer>();

        custo[noOrigem] = 0;

        for(int v = 0; v< vertices.length; v++){ // for recebe as mesmas verificacoes da formula do metodo de achar o mais proximo porem com as var de caminhos
            if (v!= noOrigem){
                custo[v] = Integer.MAX_VALUE;
            }
            antecessor[v] = -1;
            naoVisitados.add(v);
        }

        while (!naoVisitados.isEmpty()){

            int noMaisProximo = getMaisProximo(custo,naoVisitados);

            naoVisitados.remove(noMaisProximo);

            for(Integer vizinhos : getVizinhos(noMaisProximo)){
                int custoTotal = custo[noMaisProximo] + getCusto(noMaisProximo, vizinhos);
                if (custoTotal< custo[vizinhos]){
                    custo[vizinhos] = custoTotal;
                    antecessor[vizinhos] = noMaisProximo;
                }
            }
                if(noMaisProximo == noDestino){
                    return caminhoMaisProximo(antecessor, noMaisProximo);
                }
        }
        return null;
    }
    public List<Integer> caminhoMaisProximo(final int antecessor[], int noMaisProximo){
        List<Integer> caminho = new ArrayList<>();
        caminho.add(noMaisProximo);
        while(antecessor[noMaisProximo] != -1){
            caminho.add(antecessor[noMaisProximo]);
            noMaisProximo = antecessor[noMaisProximo];
        }
        Collections.reverse(caminho);
        return caminho;
    }

    public static void main(String[] args) {

    }
}