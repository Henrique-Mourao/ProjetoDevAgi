/*
*Crie uma interface IDescontavel com o método:
*public double calcularPrecoFinal(double precoBase);
*Depois, crie duas classes que implementam essa interface:
*ProdutoComum: aplica 5% de desconto sobre o preço base.
*ProdutoPromocional: aplica 20% de desconto sobre o preço base.
*Por fim, crie uma classe MainProduto que instancie os dois tipos de produto e exiba os preços finais com desconto.
*
*
*
* */
package br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Main;
import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Filho.ProdutoComum;
import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Filho.ProdutoPromocional;
import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Implementacao.IDescontavel;

public class MainProduto {
    public static void main(String[] args) {
        IDescontavel comum = new ProdutoComum();
        IDescontavel promocional = new ProdutoPromocional();

        double precoBase = 100.0;
        System.out.println("Produto comum: R$ " + comum.calcularPrecoFinal(precoBase));
        System.out.println("Produto promocional: R$ " + promocional.calcularPrecoFinal(precoBase));
    }
}

