package br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.SubClasses;

import br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.Classe.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(String titular, double saldo) {

        super(titular, saldo);

    }

    @Override

    public void calcularRendimento() {

        System.out.println("Conta Corrente não possui rendimento.");

    }

}
