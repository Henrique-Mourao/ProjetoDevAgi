package br.com.devsdoagi.JavaBasico.Semana3_4.Colecoes;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criando o ArrayList
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando elementos no final
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruna");
        System.out.println("Lista inicial: " + nomes);

        // Adicionando em posições específicas
        nomes.add(0, "João");      // Adiciona "João" no índice 0
        nomes.add(nomes.size(), "Lúcia"); // Adiciona "Lúcia" no final
        System.out.println("Após inserções: " + nomes);

        // Acessando elementos
        System.out.println("Primeiro: " + nomes.get(0));
        System.out.println("Último: " + nomes.get(nomes.size() - 1));
        System.out.println("Elemento no índice 2: " + nomes.get(2));

        // Removendo elementos
        nomes.remove(0);          // Remove o primeiro elemento ("João")
        nomes.remove(nomes.size() - 1); // Remove o último elemento ("Lúcia")
        nomes.remove("Carlos");   // Remove "Carlos" pelo valor
        System.out.println("Após remoções: " + nomes);

        // Verificando se contém um elemento
        if (nomes.contains("Bruna")) {
            System.out.println("Bruna está na lista!");
        }

        // Tamanho da lista
        System.out.println("Tamanho da lista: " + nomes.size());

        // Iterando com foreach
        System.out.println("Iterando pela lista:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}




