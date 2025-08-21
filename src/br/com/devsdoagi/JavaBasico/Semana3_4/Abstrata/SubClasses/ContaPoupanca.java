package br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.SubClasses;

import br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.Classe.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void calcularRendimento() {
        saldo += saldo * 0.05; // 5% ao ano
        System.out.println("Novo saldo com rendimento: " +
                saldo);
    }
}