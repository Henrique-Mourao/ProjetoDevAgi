package br.com.devsdoagi.MediaPercentual;

import java.util.Scanner;

public class MediaPercentual {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //
        System.out.println("Digite o valor: ");
        double valor = sc.nextDouble();
        System.out.println("Digite a média: ");
        double media = sc.nextDouble();
        double diferenca = Math.abs(valor - media);
        double percentual = (diferenca/media) * 100;
        System.out.printf("Diferença de %.2f%% em relação à média.\n", percentual);
    }
}
