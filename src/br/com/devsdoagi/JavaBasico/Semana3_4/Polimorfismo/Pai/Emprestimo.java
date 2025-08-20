package br.com.devsdoagi.JavaBasico.Semana3_4.Polimorfismo.Pai;

public class Emprestimo {
    protected double valorEmprestado;
    protected int meses;

    public Emprestimo(double valorEmprestado, int meses){
        this.valorEmprestado=valorEmprestado;
        this.meses = meses;
    }
    public double calcularParcela(double valorEmprestimo, int meses){
        return valorEmprestado/meses;
    }

}
