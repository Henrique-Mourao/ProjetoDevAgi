package br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Filho;

import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Implementacao.IPagamento;

public class PagamentoCartao implements IPagamento {
    private double CartaoCredito;
    public PagamentoCartao(double CartaoCredito) {
        this.CartaoCredito = CartaoCredito;
    }
    @Override
    public void processarIPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " realizado via boleto bancário: " + CartaoCredito);
    }

}

