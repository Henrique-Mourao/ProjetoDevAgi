package br.com.devsdoagi.Semana1_3.Vetores;

/*
AUTOR:Henrique Gonçalves Mourão
Data: 11/08/2025
Obs: Programa que:
Receba um vetor com os preços diários de uma ação ao longo de 10 dias.
Utiliza os seguintes métodos para:
primeiraTrincaAlta(double[] precos) → retorna os índices da primeira trinca de alta (ou null se não existir).
primeiraTendenciaAlta(double[] precos) → retorna os índices da primeira tendência com pelo menos 3 dias de alta consecutivos.
todasTendenciasAlta(double[] precos) → retorna uma lista com todas as tendências de alta.
*/

public class AltaAcoes {
    //Metodos
    public static int[] primeiraTrincaAlta(double[] precos){
        for (int dias = 1; dias <= 7 ; dias++) {
            if (precos[dias] < precos[dias+1] && precos[dias+1] < precos[dias+2]){
                return new int[]{dias, dias+1, dias+2};
            }
        }
        return null;
    }

    //MAIN
    public static void main(String[] args) {
        double[] valor = {100,120,200,50,30,220,70,125,230,90};
    }
}
