package br.com.devsdoagi.JavaBasico.Semana3_4.OrientadoAoObjeto.Classes;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        this.quantidade -= quantidade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }
}
