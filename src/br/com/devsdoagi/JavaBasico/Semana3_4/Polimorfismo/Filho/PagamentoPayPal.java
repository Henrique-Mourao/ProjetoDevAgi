package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho;

import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai.Pagamento;

// Classe Filha
public class PagamentoPayPal extends Pagamento {
// Sobrescrita do metodo processarPagamento()
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " via PayPal");
// Lógica específica de pagamento via PayPal
    }
}
