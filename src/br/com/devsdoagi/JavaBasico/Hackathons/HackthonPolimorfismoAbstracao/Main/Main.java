package br.com.devsdoagi.JavaBasico.Hackathons.HackthonPolimorfismoAbstracao.Main;

import br.com.devsdoagi.JavaBasico.Hackathons.HackthonPolimorfismoAbstracao.Classe.Investimento;
import br.com.devsdoagi.JavaBasico.Hackathons.HackthonPolimorfismoAbstracao.SubClasse.RendaFixa;
import br.com.devsdoagi.JavaBasico.Hackathons.HackthonPolimorfismoAbstracao.SubClasse.RendaVariavel;

public class Main {
    public static void main(String[] args) {
        Investimento[] investimentos = new Investimento[6];
        investimentos[0] = new RendaFixa(200);
        investimentos[1] = new RendaVariavel(1020);
        investimentos[2] = new RendaFixa(403);
        investimentos[3] = new RendaVariavel(504);
        investimentos[4] = new RendaFixa(230);
        investimentos[5] = new RendaVariavel(300);

        for (Investimento investimento : investimentos) {
            double rendimento = investimento.calcularRendimento();
            String tipo = investimento.getClass().getSimpleName();
            System.out.printf("Rendimento da %s: %.2f%n", tipo, rendimento);
        }
    }
}
