package br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.Filho;
import br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.Pai.ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String numeroConta, double saldo, double limiteChequeEspecial) {
        super(titular, numeroConta, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public boolean sacarComChequeEspecial(double valor) {
        if (valor <= getSaldo() + limiteChequeEspecial) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
}
