package br.com.devsdoagi.JavaBasico.Semana1_2.Vetores;

public class RendaMensal {
    public static double[] calcularRendaMensal(double[][] matrizCenarios, double[] taxasAnuais, int expectativaVida) {
        int numeroCenarios = matrizCenarios.length;
        double[] rendasMensais = new double[numeroCenarios];

        for (int i = 0; i < numeroCenarios; i++) {
            double[] cenarios = matrizCenarios[i]; // dados do cenário i
            double somaTotal = 0;

            int anosDisponiveis = Math.min(expectativaVida, Math.min(cenarios.length, taxasAnuais.length));

            for (int ano = 0; ano < anosDisponiveis; ano++) {
                // Aplica taxa anual se aplicável
                somaTotal += cenarios[ano] * taxasAnuais[ano];
            }

            rendasMensais[i] = somaTotal / (expectativaVida * 12); // média mensal
        }

        return rendasMensais;
    }
}