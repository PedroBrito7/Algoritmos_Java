package dataStructuresAlgorithms.HashMapHashSet;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeEstoque {
    private HashMap<String,Integer> listaEstoque;
    public GerenciadorDeEstoque(){
        this.listaEstoque = new HashMap<String,Integer>();
    }

    public String AdcOuAtualizar(final String produto, final Integer quantidade) {
        if (quantidade <= 0) {
            return "quantidade invalida, deve adicionar validade postivia";
        }
        if (listaEstoque.containsKey(produto)) { // se tem dentro do hash o produto então ->
            listaEstoque.put(produto, listaEstoque.get(produto) + quantidade); //hashmap ele sobre ppoe a variavel produto e o
            // get pega os valores (String e Integer) e retorna a quantidade atual, mais a atual com a quantidade que recebe do paramentro
            return "Produto" + produto + "Atualizada com sucesso!";
        }else {
            listaEstoque.put(produto,quantidade);
            return "Produto adicionado ao estoque";
        }
    }
    public String removeProduct(final String produto) {
        if (listaEstoque.remove(produto) != null) {  // caso nao encontre ele retorna nulo por conta do remove, por conta disso colocamos dentro de um if (checagem)
           return "Produto " + produto + "Foi removido!";
         }else {
            return "Produto nao foi encontrado no estoque";
        }
    }
    public void exibirTodosProdutos(){
        for(Map.Entry<String, Integer>entry : listaEstoque.entrySet());// Ele retorna um set, ou seja um entry de um valor Integer,String. Acaba entao pegandos os valores do String
    }
    public static void main(String[] args) {

    }
}
