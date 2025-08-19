package br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.Pai;

public class Produto {
    protected String codigo;
    protected String nome;
    protected double preco;

    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }

    protected void setPreco(double preco){
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
}
