package br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.Classe;

public abstract class ContaB {
        protected int Numero;
        protected double Saldo;


    public ContaB(int numero, double saldoInicial) {
        this.Numero = numero;
        this.Saldo = saldoInicial;
    }

    public double getNumero() {
        return Saldo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }

    public abstract void atualizarMensal();
}
