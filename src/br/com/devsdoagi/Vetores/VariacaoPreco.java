/*
AUTOR: Henrique Gonçalves Mourão
Data: 11/08/2025
Obs: Programa que:
receba um vetor com os preços diários de uma ação durante 5 dias.
Usa um método variacaoDiaria(double[] precos), que retorne um vetor com as
variações percentuais diárias.
 */

package br.com.devsdoagi.Vetores;

public class VariacaoPreco {
    public static double[] variacaoDiaria(double[] precos){
        double[] variacao = new double[precos.length-1];
        for (int i = 0; i < precos.length-1; i++) {
            variacao[i] =((precos[i + 1] - precos[i])/precos[i])*100;
        }
        return variacao;
    }

    public static void main(String[] args) {
        double [] precos = {100, 102, 104, 110, 100};
        double [] var = variacaoDiaria(precos);

        for (double v : var){
            System.out.println(v);
        }
    }
}
