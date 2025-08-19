/*Exercício 2 – Produto e ProdutoPerecivel (Varejo)
*Crie a classe base Produto com os atributos privados:
*codigo (String)
*nome (String)
*preco (double)
*Crie a subclasse ProdutoPerecivel, com o atributo adicional:
*dataValidade (String)
*Implemente os construtores nas duas classes.
*Na subclasse, adicione um método estaVencido(String dataAtual) que retorna true se a data de validade for anterior à data atual.
*
* Data:19/08/2025
* AUTHOR:Henrique Gonçalves Mourão
* */

        package br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.main;
import br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.Filho.ProdutoPerecivel;
public class Produto {
    public static void main(String[] args) {
        ProdutoPerecivel pp = new ProdutoPerecivel("1000", "Energetico", 1000, "10/10/2000");
        pp.processarProduto();
    }
}
