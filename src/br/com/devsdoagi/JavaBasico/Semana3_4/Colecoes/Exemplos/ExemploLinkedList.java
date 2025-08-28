package br.com.devsdoagi.JavaBasico.Semana3_4.Colecoes.Exemplos;

import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {
        // Criando a LinkedList
        LinkedList<String> nomes = new LinkedList<>();

        // Adicionando elementos no final
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruna");
        System.out.println("Lista inicial: " + nomes);

        // Adicionando no início e no final
        nomes.addFirst("João");
        nomes.addLast("Lúcia");
        System.out.println("Após addFirst e addLast: " + nomes);

        // Acessando elementos
        System.out.println("Primeiro: " + nomes.getFirst());
        System.out.println("Último: " + nomes.getLast());
        System.out.println("Elemento no índice 2: " + nomes.get(2));

        // Removendo elementos
        nomes.removeFirst();  // Remove "João"
        nomes.removeLast();   // Remove "Lúcia"
        nomes.remove("Carlos");  // Remove "Carlos" pelo nome
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


