package br.com.devsdoagi.JavaBasico.Semana1_2.Financeiro.ConverterMoeda;

import java.util.Scanner;

public class Main {
    public static double ConverteMoeda() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor em R$: ");
        double valor = sc.nextFloat();
        System.out.println("Entre com o valor da Cotação: ");
        double cotacao = sc.nextDouble();
        return valor * cotacao;
    }

    public static void main(String[] args) {
        double resultado;
        resultado = ConverteMoeda();
        System.out.println("Resultado: " + resultado);
    }
}
