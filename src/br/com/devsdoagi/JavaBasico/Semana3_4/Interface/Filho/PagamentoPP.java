package br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Filho;

import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Implementacao.Pagamento;


    public class PagamentoPP implements Pagamento {

        private String emailUsuario;

        public PagamentoPP(String emailUsuario) {
            this.emailUsuario = emailUsuario;
        }

        @Override
        public void processarPagamento(double valor) {
            System.out.println("Processando pagamento de R$ " + valor + " via PayPal. Conta: " +
                    emailUsuario);
        }
    }
