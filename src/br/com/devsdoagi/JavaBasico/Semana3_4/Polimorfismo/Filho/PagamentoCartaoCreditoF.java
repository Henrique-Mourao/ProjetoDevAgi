package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho;

import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai.PagamentoProcessos;

public class PagamentoCartaoCreditoF extends PagamentoProcessos{
    private String numeroCartao;
    public PagamentoCartaoCreditoF(double valor, String numeroCartao) {
    super(valor);
    this.numeroCartao = numeroCartao;
}

    @Override
    public void processarPagamento() {
    System.out.println("Processando pagamento de R$" + valor + " no cartão " + numeroCartao);
}
}