package br.com.devsdoagi.JavaBasico.Semana3_4.Colecoes.Exemplos;

import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {
    public static void main(String[] args) {
        // Criando o Map com implementação TreeMap
        Map<Integer, String> pessoas = new TreeMap<>();

        // Adicionando elementos (chave → valor)
        pessoas.put(3, "Bruna");
        pessoas.put(1, "Ana");
        pessoas.put(2, "Carlos");
        System.out.println("Mapa inicial (ordenado por chave): " + pessoas);

        // Adicionando com sobrescrita de valor (mesma chave)
        pessoas.put(2, "Carolina"); // Substitui "Carlos" por "Carolina"
        System.out.println("Após sobrescrita de chave 2: " + pessoas);

        // Acessando elementos pelo valor da chave
        System.out.println("Valor da chave 1: " + pessoas.get(1));
        System.out.println("Valor da chave 3: " + pessoas.get(3));

        // Removendo elementos
        pessoas.remove(1); // Remove a chave 1
        System.out.println("Após remover chave 1: " + pessoas);

        // Verificando se contém uma chave ou valor
        if (pessoas.containsKey(2)) {
            System.out.println("Existe a chave 2 no mapa!");
        }
        if (pessoas.containsValue("Bruna")) {
            System.out.println("Bruna está no mapa!");
        }

        // Tamanho do mapa
        System.out.println("Tamanho do mapa: " + pessoas.size());

        // Iterando sobre chaves (ordem crescente)
        System.out.println("Iterando pelas chaves:");
        for (Integer chave : pessoas.keySet()) {
            System.out.println("Chave: " + chave);
        }

        // Iterando sobre valores
        System.out.println("Iterando pelos valores:");
        for (String valor : pessoas.values()) {
            System.out.println("Valor: " + valor);
        }

        // Iterando pelos pares chave-valor
        System.out.println("Iterando pelos pares chave-valor:");
        for (Map.Entry<Integer, String> entry : pessoas.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + " → Valor: " + entry.getValue());
        }
    }
}




