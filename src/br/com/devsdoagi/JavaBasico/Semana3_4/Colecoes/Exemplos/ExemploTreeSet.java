package br.com.devsdoagi.JavaBasico.Semana3_4.Colecoes;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        // Criando um TreeSet de Strings
        TreeSet<String> frutas = new TreeSet<>();

        // Adicionando elementos
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Abacaxi");

        // Tentando adicionar elemento duplicado
        frutas.add("Maçã"); // Ignorado, pois TreeSet não permite duplicados

        // Exibindo elementos (já vem ordenados)
        System.out.println("Frutas no TreeSet: " + frutas);

        // Removendo um elemento
        frutas.remove("Banana");
        System.out.println("Após remover Banana: " + frutas);

        // Verificando se existe um elemento
        System.out.println("Contém Uva? " + frutas.contains("Uva"));
        System.out.println("Contém Laranja? " + frutas.contains("Laranja"));

        // Primeiro e último elemento
        System.out.println("Primeira fruta: " + frutas.first());
        System.out.println("Última fruta: " + frutas.last());

        // Buscando elementos próximos
        System.out.println("Maior ou igual a 'Limão': " + frutas.ceiling("Limão"));
        System.out.println("Menor ou igual a 'Limão': " + frutas.floor("Limão"));

        // Tamanho e limpeza
        System.out.println("Quantidade de frutas: " + frutas.size());
        frutas.clear();
        System.out.println("TreeSet está vazio? " + frutas.isEmpty());
    }
}




