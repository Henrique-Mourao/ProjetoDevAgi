package br.com.devsdoagi.Semana1_3.Financeiro.JurosComposto;

import java.lang.Math;
import java.util.Scanner;

public class Composto {

    public static double JurosCompostos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o Valor Inicial em R$: ");
        double valorInicio = sc.nextDouble();
        System.out.println("Entre com a Taxa Mensal: ");
        double t_Mensal = sc.nextDouble();
        t_Mensal = t_Mensal / 100;
        System.out.println("Entre com o tempo em meses: ");
        int meses = sc.nextInt();
        return valorInicio * Math.pow(1 + t_Mensal, meses);
    }

    public static void main(String[] args) {
        System.out.println("Resultado: " + JurosCompostos());
    }
}
