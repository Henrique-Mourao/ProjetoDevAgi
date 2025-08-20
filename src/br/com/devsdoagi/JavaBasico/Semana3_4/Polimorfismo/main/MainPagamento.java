/*Exercício 1 – Processamento de Pagamentos
*Enunciado:
*Crie uma classe Pagamento com:
*Atributo valor (double).
*Método processarPagamento() que exibe "Processando pagamento genérico".
*Depois, crie duas subclasses:
*PagamentoCartaoCredito (contendo numeroCartao e sobrescrevendo processarPagamento() para exibir mensagem de pagamento no cartão).
*PagamentoPix (contendo chavePix e sobrescrevendo processarPagamento() para exibir mensagem de pagamento via Pix).
*No Main, crie um vetor de Pagamento com diferentes objetos e percorra chamando processarPagamento() em cada um.
*
* dia:20/08/2025
* AUTHOR:Henrique Gonçalves Mourão
*/
package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.main;
import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho.PagamentoCartaoCredito;
import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho.PagamentoPayPal;
import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai.Pagamento;

public class MainPagamento {

    public static void main(String[] args) {
// Criando diferentes tipos de pagamento
        Pagamento pagamento1 = new PagamentoCartaoCredito();
        Pagamento pagamento2 = new PagamentoPayPal();
// Processando os pagamentos
        pagamento1.processarPagamento(250.00);
        pagamento2.processarPagamento(100.00);
    }
}

