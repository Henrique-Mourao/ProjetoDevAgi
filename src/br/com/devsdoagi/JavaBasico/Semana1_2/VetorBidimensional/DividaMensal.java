/*
AUTOR: Henrique Gonçalves Mourão
Data: 12/08/2025
Obs:Matriz 3x4 que representa dívidas mensais de 3 clientes em 4 meses, crie um método
para encontrar o maior valor da matriz.
double encontrarMaiorValor(double[][] matriz);
*/

package br.com.devsdoagi.JavaBasico.Semana1_2.VetorBidimensional;

public class DividaMensal {
    public static void main(String[] args) {
        double[][] matriz = {
                {13, 15, 21, 23},
                {20, 15, 23, 55},
                {25, 32, 80, 29}
        };

        System.out.println("Maior Valor: " + encontrarMaiorValor(matriz));
    }

    //Metodo encontrar maior valor
    public static double encontrarMaiorValor(double[][] matriz) {
        double maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }
}
