package br.com.devsdoagi.Financeiro.Percentual;

import java.util.Scanner;

public class VariacaoPercentual {

    public static double calculoCrescimento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor da ação no dia 1 em R$: ");
        double v_dia1 = sc.nextDouble();
        System.out.println("Entre com o valor da ação no dia 2 em R$: ");
        double v_dia2 = sc.nextDouble();
        return ((v_dia2-v_dia1)/v_dia1) * 100;
    }

    public static void main(String[] args) {
        double resultado;
        resultado = calculoCrescimento();
        System.out.printf("Resultado: %.2f%%\n", resultado);
    }
}
