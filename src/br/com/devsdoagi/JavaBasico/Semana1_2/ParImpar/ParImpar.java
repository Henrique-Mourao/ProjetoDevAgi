package br.com.devsdoagi.JavaBasico.Semana1_2.ParImpar;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //
        System.out.println("Entre com um numero: ");
        int numero = sc.nextInt();

        //Comparativo
        if (numero % 2 == 0){
            System.out.println("O numero é Par!");
        } else {
            System.out.println("O numero é Impar!");
        }
    }
}
