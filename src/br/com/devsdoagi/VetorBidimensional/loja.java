package br.com.devsdoagi.VetorBidimensional;
//Henrique Gonçalves Mourão
//13/08/2025
public class loja {
    public static double[] encontrarMenorPrecoPorProduto(double[][] matriz) {
        double[] menorpreco = new double[matriz[0].length];
        for (int p = 0; p < matriz[0].length; p++) {
            menorpreco[p] = matriz[0][p];
            for (int l = 0; l < matriz.length; l++) {
                if (matriz[l][p] < menorpreco[p]) {
                    menorpreco[p] = matriz[l][p];
                }
            }
        }
        return menorpreco;
    }

    public static void main(String[] args) {

    }
}
