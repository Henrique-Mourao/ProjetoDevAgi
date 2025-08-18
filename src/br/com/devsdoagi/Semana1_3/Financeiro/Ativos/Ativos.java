package br.com.devsdoagi.Semana1_3.Financeiro.Ativos;

public class Ativos {

    public static String compararAtivos(double retorno1, double retorno2) {
        if (retorno1 > retorno2) return "Ativo 1";
        else if (retorno2 > retorno1) return "Ativo 2";
        else return "Ambos iguais";
    }

    public static void main(String[] args) {

    }
}
