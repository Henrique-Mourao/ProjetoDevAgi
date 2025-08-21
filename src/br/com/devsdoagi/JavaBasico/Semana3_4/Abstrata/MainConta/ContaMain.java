package br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.MainConta;
import br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.Classe.Conta;
import br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.SubClasses.ContaPoupanca;
import br.com.devsdoagi.JavaBasico.Semana3_4.Abstrata.SubClasses.ContaCorrente;

public class ContaMain {

    public static void main(String[] args) {

        Conta conta1 = new ContaCorrente("João", 1000);
        Conta conta2 = new ContaPoupanca("Maria", 2000);
        conta1.calcularRendimento(); // Sem rendimento
        conta2.calcularRendimento(); // Aplica 5%
    }
}
