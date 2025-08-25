package br.com.devsdoagi.JavaBasico.Hackathons.HackthonPolimorfismoAbstracao.SubClasse;

import br.com.devsdoagi.JavaBasico.Hackathons.HackthonPolimorfismoAbstracao.Classe.Investimento;

public class RendaVariavel extends Investimento {
    public RendaVariavel(double valorInicial) {
        super(valorInicial);
    }

    @Override
    public double calcularRendimento() {

        return valorInicial * 1.10;

    }
}

