package br.com.devsdoagi.JavaBasico.Semana1_3.Financeiro.JurosSimples;

import java.util.Scanner;

public class Juros {

    public static double JurosSimples() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o Capital Inicial em R$: ");
        double capitalInicial = sc.nextDouble();
        System.out.println("Entre com a taxa de juros: ");
        double t_juros = sc.nextDouble();
        t_juros = t_juros /100;
        System.out.println("Entre com o tempo em anos: ");
        int anos = sc.nextInt();
        //Calculo
        return capitalInicial + (capitalInicial * t_juros * anos);
    }

    public static void main(String[] args) {
        double resultado;
        resultado = JurosSimples();
        System.out.printf("Resultado R$: %.2f ", resultado);
    }
}
