/*
AUTOR: Henrique Gonçalves Mourão
Data: 12/08/2025
Obs: Programa que:
Recebe os preços de fechamento de uma ação durante 10 dias.
Utilize os seguintes métodos:
maiorPreco(double[] precos) → retorna o maior preço.
menorPreco(double[] precos) → retorna o menor preço.
 */

package br.com.devsdoagi.JavaBasico.Semana1_3.Vetores;

public class MaiorMenor {
    //Método maior preço
    public static double maiorPreco(double[] precos) {
        double maior = precos[0];

        for (double p : precos) {
            if (p > maior) {
                maior = p;
            }
        }

        /*
        for (int i = 0; i < precos.length; i++) {
            if (precos[i] > maior){
                maior = precos[i];
            }
        }
        return maior;*/
        return maior;
    }

    //Método menor preço
    public static double menorPreco(double[] precos) {
        double menor = precos[0];

        for (double prices : precos) {
            if (prices < menor) {
                menor = prices;
            }
        }

        /*for (int i = 0; i < precos.length; i++) {
            if (precos[i] < menor){
                menor = precos[i];
            }
        }*/
        return menor;
    }

    public static void main(String[] args) {
        double[] precos = {100, 102, 104, 110, 100, 102, 110, 115, 112, 104};

        System.out.println("Maior preço: " + maiorPreco(precos));
        System.out.println("Menor Preço: " + menorPreco(precos));
    }
}
