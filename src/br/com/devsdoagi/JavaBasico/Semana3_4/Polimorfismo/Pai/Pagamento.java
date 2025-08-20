package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai;
// Classe pai
public class Pagamento {
    // Método genérico que será sobrescrito pelas subclasses
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento genérico de R$ " + valor);
    }
}

