package br.com.devsdoagi.JavaBasico.Semana3_4.Colecoes.Exercicios.Main;

import java.util.HashSet;
import java.util.Set;

public class MainProdutoExclusivo_2 {
    public static void main(String[] args) {
        Set<String> produtos = new HashSet<>();

        adicionarProduto(produtos, "CDB" );
        adicionarProduto(produtos, "Tesouro Direto");
        adicionarProduto(produtos, "LCI");
        adicionarProduto(produtos, "LCI");

        exibirProdutos(produtos);
    }

    public static void adicionarProduto(Set <String> produtos, String nomeProduto) {
        System.out.println(produtos.add(nomeProduto)
            ? "Produto" + nomeProduto + " Adicionado com sucesso!"
            : "Produto" + nomeProduto + " Não foi encontrado.");
    }

    public static void exibirProdutos(Set <String> produtos){
        System.out.println(produtos.isEmpty()
                ? "Nenhum Produto Cadastrado"
                : "Produtos Cadastrados");
        produtos.forEach(produto -> System.out.println("-Produto: " + produto));
    }
}
