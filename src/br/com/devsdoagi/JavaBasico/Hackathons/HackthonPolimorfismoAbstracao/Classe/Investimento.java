package br.com.devsdoagi.JavaBasico.Hackathons.HackthonPolimorfismoAbstracao.Classe;


public abstract class Investimento {
    protected double valorInicial;

    public Investimento(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public abstract double calcularRendimento();

    public void depositar(double valor) {
        this.valorInicial += valor;
    }
}

