/*
AUTOR: Henrique Gonçalves Mourão
Data: 12/08/2025
Obs: Programa que:
Crie um método para preencher uma matriz 2x2 com receitas e despesas. Depois, crie um método
que calcule a soma total de todos os elementos da matriz.
Utiliza os métodos:
void preencherMatriz(double[][] matriz);
double calcularSomaTotal(double[][] matriz);
*/

package br.com.devsdoagi.JavaBasico.Semana1_2.VetorBidimensional;

import java.util.Scanner;

public class ReceitaDespesa {
    //Método para preencher a matriz
    public static void preencherMatriz(double[][] matriz) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Preencha a receita e as despesas");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite os valores para Receita " + i + " e para Despesa " + j + "\n");
                matriz[i][j] = sc.nextDouble();
            }
        }
    }

    //Método para calcular
    public static double calcularSomaTotal(double[][] matriz) {
        double soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma = soma + matriz[i][j];
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        double[][] matriz = new double[2][2];

        preencherMatriz(matriz);

        double somaTotal = calcularSomaTotal(matriz);
        System.out.println("A soma total de Receitas e Despesas é de: " + somaTotal);
    }
}
