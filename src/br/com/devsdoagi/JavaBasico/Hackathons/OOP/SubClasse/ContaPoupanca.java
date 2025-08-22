package br.com.devsdoagi.JavaBasico.Hackathons.OOP.SubClasse;

import br.com.devsdoagi.JavaBasico.Hackathons.OOP.Classe.ContaAbstrada;

public class ContaPoupaca extends ContaAbstrada {

    public ContaPoupaca(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public void aplicarJuros() {
        double novoSaldo = getSaldo() * 1.01; // aplica 1% de juros
        setSaldo(novoSaldo);
        System.out.println("Juros de 1% aplicados. Novo saldo: R$ " + getSaldo());
    }
}