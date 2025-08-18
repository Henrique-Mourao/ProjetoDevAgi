/*
 * Produto (Setor Varejo)
 *
 * Crie a classe Produto com os atributos privados:
 * - nome (String)
 * - preco (double)
 * - estoque (int)
 *
 * Regras:
 * - O preço não pode ser negativo.
 * - O estoque só pode ser alterado via adicionarEstoque() ou removerEstoque().
 * - Crie um método exibirProduto() para imprimir nome, preço e estoque atual.
 *
 * Author: Henrique Gonçalves Mourão
 * Data: 18/08/2025
 */

package br.com.devsdoagi.OrientadoAoObjeto.Classes;

public class ProdutoVarejo {
    private String nome;
    private double preco;
    private int estoque;

    // Construtor
    public ProdutoVarejo(String nome, double preco, int estoque) {
        this.nome = nome;
        setPreco(preco); // usa o setter para aplicar a regra
        this.estoque = estoque;
    }

    // Getter e Setter Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter Preço (com regra de validação)
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido! O preço não pode ser negativo.");
        }
    }

    // Getter Estoque (sem setter direto)
    public int getEstoque() {
        return estoque;
    }

    // Métodos para alterar estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque!");
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= estoque) {
            estoque -= quantidade;
        } else {
            System.out.println("Quantidade inválida para remover do estoque!");
        }
    }
    /* // Criando um produto
              ProdutoVarejo produto = new ProdutoVarejo("Notebook", 3500.00, 10);

              // Exibindo informações iniciais
              produto.exibirProduto();

              System.out.println("\n--- Alterando estoque ---");
              produto.adicionarEstoque(5); // adiciona 5 unidades
              produto.removerEstoque(3);   // remove 3 unidades
              produto.exibirProduto();

              System.out.println("\n--- Testando preço inválido ---");
              produto.setPreco(-2000); // tentativa inválida
              produto.exibirProduto();

              System.out.println("\n--- Atualizando preço válido ---");
              produto.setPreco(4300.30); // atualização válida
              produto.exibirProduto();
      }*/
    // Método para exibir informações do produto
    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque + " unidades");
    }
}
