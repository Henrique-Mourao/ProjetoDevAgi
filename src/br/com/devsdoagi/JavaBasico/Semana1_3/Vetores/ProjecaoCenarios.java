package br.com.devsdoagi.JavaBasico.Semana1_3.Vetores;/*
AUTOR: Henrique Gonçalves Mourão
Data: 11/08/2025
Obs: Programa que:
receba um vetor com os preços diários de uma ação durante 5 dias.
Usa um método variacaoDiaria(double[] precos), que retorne um vetor com as
variações percentuais diárias.
 */

public class ProjecaoCenarios {

    public static double[] calcularRendaMensal(double[][] matrizCenarios, double[] taxasAnuais, int expectativaVida) {
        int numeroCenarios = matrizCenarios.length;
        double[] rendasMensais = new double[numeroCenarios];

        for (int i = 0; i < numeroCenarios; i++) {
            double[] cenarios = matrizCenarios[i];
            double somaTotal = 0;

            int anosDisponiveis = Math.min(expectativaVida, Math.min(cenarios.length, taxasAnuais.length));

            for (int ano = 0; ano < anosDisponiveis; ano++) {
                somaTotal += cenarios[ano] * taxasAnuais[ano];
            }

            rendasMensais[i] = somaTotal / (expectativaVida * 12);
        }

        return rendasMensais;
    }

    public static void main(String[] args) {
        // Exemplo de teste:
        double[][] cenarios = {
                {100000, 95000, 90000},
                {120000, 110000, 100000}
        };
        double[] taxas = {0.04, 0.04, 0.04};
        int expectativaVida = 3;

        double[] resultado = calcularRendaMensal(cenarios, taxas, expectativaVida);
        for (double renda : resultado) {
            System.out.println("Renda mensal: " + renda);
        }
    }
}
