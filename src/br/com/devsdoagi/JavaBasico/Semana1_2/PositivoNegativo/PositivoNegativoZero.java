package br.com.devsdoagi.JavaBasico.Semana1_2.PositivoNegativo;

import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Código
        System.out.print("Entre com um numero: ");
        int numero = sc.nextInt();

        if (numero == 0 ){
            System.out.print("O numero é igual a Zero");
        }else if (numero >= 0 ){
            System.out.println("\nO numero é positivo");
        }else {
            System.out.println("O numero é negativo");
        }
    }
}
