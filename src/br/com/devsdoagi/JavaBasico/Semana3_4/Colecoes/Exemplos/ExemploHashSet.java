package br.com.devsdoagi.JavaBasico.Semana3_4.Colecoes;

import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        // Criando o HashSet
        HashSet<String> nomes = new HashSet<>();

        // Adicionando elementos (ordem não garantida)
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruna");
        System.out.println("Conjunto inicial: " + nomes);

        // Tentando adicionar duplicado (não será inserido)
        boolean adicionou = nomes.add("Ana");
        System.out.println("Tentou adicionar 'Ana' novamente? " + adicionou);
        System.out.println("Após tentativa de duplicado: " + nomes);

        // Removendo um elemento
        nomes.remove("Carlos");
        System.out.println("Após remover 'Carlos': " + nomes);

        // Verificando se contém um elemento
        if (nomes.contains("Bruna")) {
            System.out.println("Bruna está no conjunto!");
        }

        // Tamanho do conjunto
        System.out.println("Tamanho do conjunto: " + nomes.size());

        // Iterando com foreach
        System.out.println("Iterando pelo conjunto:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Limpando o conjunto
        nomes.clear();
        System.out.println("Após clear(): " + nomes);
    }
}




