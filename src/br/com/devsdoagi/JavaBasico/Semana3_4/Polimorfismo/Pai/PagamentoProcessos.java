package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai;

public class PagamentoProcessos {
    protected double valor;

    public PagamentoProcessos(double valor) {
        this.valor = valor;
    }

    public void processarPagamento() {
        System.out.println("Processando pagamento genérico de R$" + valor);
    }
}
