package br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.SubClasses;

import br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.Classe.ContaB;

public class ContaPoupancaB extends ContaB {
    public ContaPoupancaB(int numero, double saldoInicial) {
        super(numero, saldoInicial);
    }

    @Override
    public void atualizarMensal() {
        setSaldo(getSaldo() * 1.005); // rendimento 0,5%
    }
}

