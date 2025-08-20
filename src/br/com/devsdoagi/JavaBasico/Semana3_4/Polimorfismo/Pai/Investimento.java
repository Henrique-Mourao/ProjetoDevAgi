package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai;

public abstract class Investimento {
    protected double valorAplicado;

    public Investimento(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double calcularRendimento() {
        return 0; // genérico
    }
}



