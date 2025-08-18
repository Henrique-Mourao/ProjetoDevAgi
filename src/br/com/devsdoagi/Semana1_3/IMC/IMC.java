package br.com.devsdoagi.Semana1_3.IMC;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //
        System.out.println("Insira o seu peso corporal: ");
        double peso = sc.nextDouble();
        System.out.println("Entre com a sua altura: ");
        double altura = sc.nextDouble();

        //Variavel
        double resultado;
        resultado = peso / (altura * altura);

        if (resultado < 18.5){
            System.out.println("Seu peso está abaixo");
        } if (resultado >= 18.5 && resultado <= 24.9){
            System.out.println("Seu peso está normal");
        } if (resultado >= 25 && resultado <= 29.9){
            System.out.println("Você está com sobrepeso");
        } if (resultado >= 30 && resultado <= 34.9){
            System.out.println("Você está com Obesidade grau I");
        } if (resultado >= 35 && resultado <= 39.9){
            System.out.println("Você está com Obesidade grau II");
        } else {
            System.out.println("Você está com Obesidade Mórbida");
        }
    }
}
