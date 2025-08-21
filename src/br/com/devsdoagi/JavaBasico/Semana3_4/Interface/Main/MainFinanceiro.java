/*Crie uma interface chamada IPagamento com o seguinte método:
 *public void processarPagamento(double valor);
 *Em seguida, implemente duas classes:
 *PagamentoBoleto, que imprime:
 *"Pagamento de R$valor realizado via boleto bancário."
 *PagamentoCartao, que imprime:
 *"Pagamento de R$valor realizado via cartão de crédito."
 *Crie uma classe MainPagamento que permita testar ambas as implementações.
 *
 * Dia:21/08/2025
 * AUTHOR:Henrique Gonçalves Mourão
 * */
package br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Main;
import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Filho.PagamentoCartao;
import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Filho.PagamentoBoleto;
import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Implementacao.IPagamento;
public class MainFinanceiro {
    public static void main(String[] args) {
        IPagamento pagamento1 = new PagamentoBoleto(1234);
        IPagamento pagamento2 = new PagamentoCartao(100);
// Processando pagamentos
        pagamento1.processarIPagamento(200.00);
        pagamento2.processarIPagamento(100.00);
    }
}


