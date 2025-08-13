package br.com.devsdoagi.Idade;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        int idade;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");       //Saída
        idade = sc.nextInt();                         //Entrada
        System.out.printf("Você tem %d anos", idade); //Saída
    }
}
