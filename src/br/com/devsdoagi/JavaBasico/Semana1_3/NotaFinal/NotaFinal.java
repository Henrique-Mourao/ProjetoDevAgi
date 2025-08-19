package br.com.devsdoagi.JavaBasico.Semana1_3.NotaFinal;

import java.util.Scanner;

public class NotaFinal {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //
        System.out.println("Digite a nota final: ");
        double nota = sc.nextDouble();
        if (nota >= 6){
            System.out.println("Aprovado!");
        } else if (nota >= 4 ) {
            System.out.println("");
        } else {
            System.out.println("");
        }
    }
}
