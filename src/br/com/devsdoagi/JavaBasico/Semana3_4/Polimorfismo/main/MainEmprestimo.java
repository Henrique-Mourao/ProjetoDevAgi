/*Exercício 3 – Empréstimos
*Enunciado:
*Crie uma classe Emprestimo com:
*Atributo valorEmprestado.
*Método calcularParcela(int meses) que retorna valorEmprestado / meses.
*Crie duas subclasses:
*EmprestimoPessoal (sobrescreve calcularParcela aplicando juros simples de 2% ao mês).
*EmprestimoEmpresarial (sobrescreve calcularParcela aplicando juros de 1% ao mês + taxa fixa de R$100 por parcela).
*No Main, crie um array de Emprestimo e exiba o valor das parcelas em 12 meses.
*
*Data:20/08/2025
*AUTHOR: Henrique Gonçalves Mourão
*/
        package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.main;
import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho.EmprestimoEmpresarial;
import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai.Emprestimo;

public class MainEmprestimo {
    public static void main(String[] args) {
        Emprestimo[] emprestimos = {
                new EmprestimoEmpresarial(100,20)
        };
        for (Emprestimo emp:emprestimos){
            System.out.println("Seu Emprestimo em 12 meses foi: R$" + emp.calcularParcela(12,23));
        }
    }
}
