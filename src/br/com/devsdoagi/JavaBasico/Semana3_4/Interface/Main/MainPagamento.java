package br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Main;
import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Filho.PagamentoCC;
import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Filho.PagamentoPP;
import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Implementacao.Pagamento;
public class MainPagamento {

    public static void main(String[] args) {

        Pagamento pagamento1 = new PagamentoCC("1234-5678-9012-3456");
        Pagamento pagamento2 = new PagamentoPP("usuario@paypal.com");
// Processando pagamentos
        pagamento1.processarPagamento(250.00);
        pagamento2.processarPagamento(100.00);
    }
}