package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho;

import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai.PagamentoProcessos;

public class PagamentoPix extends PagamentoProcessos {
    private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento de R$" + valor + " via Pix (" + chavePix + ")");
    }
}
