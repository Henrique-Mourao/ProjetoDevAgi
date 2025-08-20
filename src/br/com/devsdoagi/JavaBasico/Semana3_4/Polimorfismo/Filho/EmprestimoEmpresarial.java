package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Filho;

import br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai.Emprestimo;

public class EmprestimoEmpresarial extends Emprestimo {
    public EmprestimoEmpresarial(double valorEmprestimo, int meses) {
        super(valorEmprestimo, meses);
    }

    @Override
    public double calcularParcela(double valorEmprestimo, int meses){
        double juros = valorEmprestado * 0.01 * meses;
        return (valorEmprestado + juros) / meses + 100;
    }
}