package br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.main;
import br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.Filho.PagamentoCartaoCredito;
import br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.Filho.PagamentoPayPal;

public class Pagamento {
    public static void main(String[] args) {
// Criando um pagamento com Cartão de Crédito
        PagamentoCartaoCredito pagamento1 = new PagamentoCartaoCredito(250.00, "1234-5678-9012-3456");
        pagamento1.processarPagamentoCartao();
// Criando um pagamento via PayPal
        PagamentoPayPal pagamento2 = new PagamentoPayPal(100.00, "usuario@paypal.com");
        pagamento2.processarPagamentoPayPal();
    }
}