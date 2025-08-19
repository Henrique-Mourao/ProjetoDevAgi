package br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.Filho;
import br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.Pai.Pagamento;

public class PagamentoPayPal extends Pagamento{
    // Atributo específico para pagamento via PayPal
    private String emailUsuario;

    // Construtor
    public PagamentoPayPal(double valor, String emailUsuario) {
        super(valor);
        this.emailUsuario = emailUsuario;
    }

        public void processarPagamentoPayPal() {
        System.out.println("Processando pagamento de R$ " + valor + " via PayPal. Conta: " +
                emailUsuario);
// Lógica específica para processar o pagamento via PayPal
    }
}
