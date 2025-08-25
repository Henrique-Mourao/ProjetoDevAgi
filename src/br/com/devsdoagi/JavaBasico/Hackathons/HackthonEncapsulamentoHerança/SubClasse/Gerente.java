package br.com.devsdoagi.JavaBasico.Hackathons.HackthonEncapsulamentoHerança.SubClasse;

import br.com.devsdoagi.JavaBasico.Hackathons.HackthonEncapsulamentoHerança.Classe.Funcionario;

public class Gerente extends Funcionario{
    public static final double BONUS = 2000.0;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return super.getSalario() + BONUS;
    }
}
