package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho;

import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai.Emprestimo;

public class EmprestimoPessoal extends Emprestimo {
    public EmprestimoPessoal(double valorEmprestado, int meses){
        super(valorEmprestado, meses);
    }

    @Override
    public double calcularParcela(double valorEmprestado, int meses){
        double juros = valorEmprestado * 0.02 * meses;
        return (valorEmprestado + juros) / meses;

    }
}
