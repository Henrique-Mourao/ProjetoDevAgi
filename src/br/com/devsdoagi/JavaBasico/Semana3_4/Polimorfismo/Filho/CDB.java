package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho;
import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai.Investimento;

public class CDB extends Investimento {
    public CDB(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento() {
        return valorAplicado * 0.01; // 1% ao mês
    }
}
