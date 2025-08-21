package br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Filho;
import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Implementacao.IPagamento;

public class PagamentoBoleto implements IPagamento {
    private double boleto;
    public PagamentoBoleto(double boleto) {
        this.boleto = boleto;
    }
    @Override
    public void processarIPagamento(double valor) {
        System.out.println("Processando pagamento de R$ " + valor + " realizado via boleto bancário: " + boleto);
    }

}
