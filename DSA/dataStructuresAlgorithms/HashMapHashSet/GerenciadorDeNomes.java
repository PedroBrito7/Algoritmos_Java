package dataStructuresAlgorithms.HashMapHashSet;

import javax.swing.*;
import java.util.HashSet;

public class GerenciadorDeNomes {
    private HashSet<String> hashNomes;

    public GerenciadorDeNomes() {
        this.hashNomes = new HashSet<String>();
    }

    public String adicionarNome(final String nome) {
        if (hashNomes.add(nome)) {// o add aqui ele retorna um bolean, ou seja se ele conseguiu adc volta true
            return "Nome adicionado na lista";
        } else {
            return "Nome duplicado! Impossível acha-lo";
        }
    }

    public boolean existeNome(final String nome) {
        return hashNomes.contains(nome);

    }

    public String removeNome(final String nome) {
        if (hashNomes.remove(nome)) {
            return "Nome removido da lista";
        } else {
            return "Nome Não encontrado para remover";
        }
    }

    public void exibirTodosNomes() {
        if (hashNomes.isEmpty()) {
            System.out.println("Lista de nomes vazia!");
        } else {
            for (String s : hashNomes) { // aqui ele ta percorrendo o hash que abriga todos os nomes um por um e escrevendo eles
                System.out.println("Nome: " + s);
            }
        }
    }

    public static void main(String[] args) {
        GerenciadorDeNomes gerenciadorDeNomes = new GerenciadorDeNomes();
        int opt = 5;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog
                    (
                            "1- Adicionar Nome\n"
                                    + "2- Verificar Nome\n"
                                    + "3- Remover nome\n"
                                    + "4- exibir todos os nomes\n"
                                    + "5- sair\n"

                    ));
            switch (opt) {
                case 1: {
                    gerenciadorDeNomes.adicionarNome(JOptionPane.showInputDialog("Digite um nome para adicionar"));
                    break;
                }
                case 2: {
                    gerenciadorDeNomes.existeNome(JOptionPane.showInputDialog("Digite um nome para encontrar"));
                    break;
                }
                case 3: {
                    gerenciadorDeNomes.removeNome(JOptionPane.showInputDialog("digite para remover"));
                    break;
                }
                case 4: {
                    gerenciadorDeNomes.exibirTodosNomes();
                    break;
                }
                default:
                    System.out.println("Opção inválida. tente de 1 a 5!");
                    ;
            }
        }
        while (opt != 5);
    }

}
