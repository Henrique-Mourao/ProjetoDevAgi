/*Exercício 1 – ContaBancaria e ContaCorrente (Finanças)
*Crie a classe base ContaBancaria com os atributos privados:
*titular (String)
*numeroConta (String)
*saldo (double)
*Crie a classe ContaCorrente, que herda de ContaBancaria, e adicione o atributo:
*limiteChequeEspecial (double)
*Implemente os construtores nas duas classes.
*Na subclasse, adicione um método sacarComChequeEspecial(double valor) que permite saque até o limite do cheque especial.
*
* Dia:19/08/2025
* AUTHOR:Henrique Goçalves Mourão
*/
package br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.main;
import br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.Filho.ContaCorrente;

public class Financa {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("Roberto", "12345", 5000,1000);
        System.out.println("Saldo inicial: R$ " + cc.getSaldo());

        boolean saque = cc.sacarComChequeEspecial(9000);
        System.out.println("Saque de R$9000: " + (saque ? "Autorizado" : "Negado"));
        System.out.println("Saldo atual: R$ " + cc.getSaldo());
    }
}

