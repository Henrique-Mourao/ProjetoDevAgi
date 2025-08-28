package br.com.devsdoagi.JavaBasico.Semana3_4.Colecoes.Exercicios.Main;


import java.util.HashSet;
import java.util.Set;


public class MainContaUnica_1 {
    public static void main(String[] args) {
        Set<Integer> contas = new HashSet<>();


        adicionarConta(contas, 1001);
        adicionarConta(contas, 1002);
        adicionarConta(contas, 1001);

        existeConta(contas, 1002);
        existeConta(contas, 2000);

        exibirContas(contas);
    }

    public static void adicionarConta(Set<Integer> contas, int numeroConta) {
        System.out.println(contas.add(numeroConta)
                ? "Conta " + numeroConta + " adicionada com sucesso!"
                : "Conta " + numeroConta + " já existe no sistema.");
    }

    public static void existeConta(Set<Integer> contas, int numeroConta) {
        System.out.println(contas.contains(numeroConta)
                ? " Conta " + numeroConta + " já está cadastrada."
                : " Conta " + numeroConta + " não foi encontrada.");
    }

    public static void exibirContas(Set<Integer> contas) {
        System.out.println(contas.isEmpty()
                ? "Nenhuma conta cadastrada."
                : "Contas cadastradas:");
        contas.forEach(conta -> System.out.println("- Conta: " + conta));
    }
}

