package br.com.devsdoagi.JavaBasico.Hackathons.HackthonEncapsulamentoHerança.Main;
import br.com.devsdoagi.JavaBasico.Hackathons.HackthonEncapsulamentoHerança.SubClasse.Analista;
import br.com.devsdoagi.JavaBasico.Hackathons.HackthonEncapsulamentoHerança.SubClasse.Gerente;

public class Main {
    public static void main(String[] args) {

        Analista an = new Analista("Robert", 1000);
        Gerente gn = new Gerente("Laila", 10000);

        System.out.println("O Analista " + an.getNome() + " tem o salário de: " + an.getSalario() + "\n" + "Com o bonus de " + an.BONUS);
        System.out.println("O Gerente " + gn.getNome() + " tem o salário de: " + gn.getSalario() + "\n" + "Com o bonus de " + gn.BONUS);
    }
}