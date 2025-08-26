/*1. Controle de Saldo de Contas
Crie um programa que armazene os saldos de 10 contas bancárias em um vetor.
O usuário deve poder buscar o saldo de uma conta pelo índice do vetor.
Se o usuário inserir um índice inválido, capture e trate ArrayIndexOutOfBoundsException
Exemplo de Entrada:
Digite o índice da conta: 12
Saída Esperada:
Erro: Conta não encontrada!*/

package br.com.devsdoagi.JavaBasico.Semana3_4.TryCatch;
import java.util.Scanner;

public class TrySaldo {
    public static void main(String[] args) {
        double[] saldos = {100.0, 250.5, 300.0, 450.7, 120.0, 900.0, 50.0, 600.3, 800.0, 75.0};
        Scanner sc = new Scanner(System.in);


        try {
            System.out.print("Digite o índice da conta: ");
            int indice = sc.nextInt();
            System.out.println("Saldo da conta: " + saldos[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Conta não encontrada!");
        }
    }
}

