package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho;

import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai.Pagamento;

// Classe Filha
public class PagamentoCartaoCredito extends Pagamento {
    // Sobrescrita do método processarPagamento()
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " com Cartão de Crédito");
// Lógica específica de pagamento com cartão de crédito
    }
}
