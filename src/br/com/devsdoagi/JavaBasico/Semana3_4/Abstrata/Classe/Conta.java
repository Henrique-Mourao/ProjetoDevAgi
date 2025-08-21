package br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.Classe;

public abstract class Conta {
    protected String titular;
    protected double saldo;
    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public abstract void calcularRendimento();
    public void depositar(double valor) {
        saldo += valor;
    }
}
