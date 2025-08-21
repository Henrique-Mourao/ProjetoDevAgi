/*Exercício 2 – Juros de Investimento
*Enunciado:
*Crie uma classe Investimento com:
*Atributo valorAplicado.
*Método calcularRendimento() que retorna sempre 0.
*Crie duas subclasses:
*Poupanca (sobrescreve calcularRendimento() para retornar 0.5% ao mês).
*CDB (sobrescreve calcularRendimento() para retornar 1% ao mês).
*No Main, crie um array de Investimento e exiba o rendimento de cada investimento chamando calcularRendimento().
*
* Dia 20/08/2025
* AUTHOR: Henrique Gonçalves Mourão
*/
package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.main;
import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho.CDB;
import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho.Poupanca;
import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai.Investimento;

public class MainInvestimento {
    public static void main(String[] args) {
        Investimento[] investimentos = {
                new Poupanca(1000), new CDB(2000)
        };

        for (Investimento inv : investimentos) {
            System.out.println("Rendimento: R$" + inv.calcularRendimento());
        }
    }
}


