package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho;

import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai.Investimento;

public class Poupanca extends Investimento {
    public Poupanca(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        return valorAplicado * 0.005; // 0.5% ao mês
    }
}

