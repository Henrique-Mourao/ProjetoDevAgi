package br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.SubClasses;

import br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.Classe.ContaB;

public class ContaCorrenteB extends ContaB {
        public ContaCorrenteB(int numero, double saldoInicial) {
            super(numero, saldoInicial);
        }

        @Override
        public void atualizarMensal() {
            setSaldo(getSaldo() - 15.0); // tarifa fixa
        }
}
