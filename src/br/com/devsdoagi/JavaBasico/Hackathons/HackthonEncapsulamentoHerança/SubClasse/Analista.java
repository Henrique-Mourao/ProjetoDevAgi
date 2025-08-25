package br.com.devsdoagi.JavaBasico.Hackathons.HackthonEncapsulamentoHerança.SubClasse;

import br.com.devsdoagi.JavaBasico.Hackathons.HackthonEncapsulamentoHerança.Classe.Funcionario;

public class Analista extends Funcionario {
    public static final double BONUS = 1000.0;

    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return super.getSalario() + BONUS;
    }
}

