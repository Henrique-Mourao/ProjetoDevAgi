package br.com.devsdoagi.JavaBasico.Hackathons.HackthonPolimorfismoAbstracao.SubClasse;

import br.com.devsdoagi.JavaBasico.Hackathons.HackthonPolimorfismoAbstracao.Classe.Investimento;

public class RendaFixa extends Investimento {
    public RendaFixa(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public double calcularRendimento() {
        return valorInicial *= 1.05;
    }
}
