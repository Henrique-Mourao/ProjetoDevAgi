package br.com.devsdoagi.JavaBasico.Semana1_3.EstruturaCondicional;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {
        //Variaveis
        int idade;

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Código
        System.out.print("Entre com a sua idade: ");
        idade = sc.nextInt();

        if (idade >= 18 ){
            System.out.print("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }
}
