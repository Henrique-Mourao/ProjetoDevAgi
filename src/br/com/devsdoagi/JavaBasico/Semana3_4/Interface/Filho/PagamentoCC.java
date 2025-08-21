package br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Filho;
import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Implementacao.Pagamento;

    public class PagamentoCC implements Pagamento {
        private String numeroCartao;
        public PagamentoCC(String numeroCartao) {
            this.numeroCartao = numeroCartao;
        }
        @Override
        public void processarPagamento(double valor) {
            System.out.println("Processando pagamento de R$ " + valor + " com Cartão de Crédito: " + numeroCartao);
        }
    }

