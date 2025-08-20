package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.main;
import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho.PagamentoCartaoCreditoF;
import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho.PagamentoPix;
import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai.PagamentoProcessos;

public class MainProcessarPagamento {
    public static void main(String[] args) {
        PagamentoProcessos[] pagamentos = {
                new PagamentoProcessos(1000),
                new PagamentoCartaoCreditoF(203, "2039"),
                new PagamentoPix(200, "Mourão@email.com")
        };
        for (PagamentoProcessos p : pagamentos) {
            p.processarPagamento();
        }
    }
}
