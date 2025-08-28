package br.com.devsdoagi.JavaBasico.Semana3_4.Colecoes.Exercicios.Main;

import java.util.HashMap;
import java.util.Map;

public class MainSaldoCliente_3 {
    public static void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldoInicial) {
        contas.put(numeroConta, saldoInicial);
    }

    static void depositar(Map<String, Double> contas, String numeroConta, double valor) {
        String mensagem = contas.containsKey(numeroConta)
                ? String.valueOf(contas.put(numeroConta, (contas.get(numeroConta) + valor))) : "Conta não encontrada!";
        if (!mensagem.isEmpty()) System.out.println(mensagem);
    }

    static void exibirSaldos(Map<String, Double> contas) {
        contas.forEach((conta, saldo) -> System.out.println("Conta: " + conta + " --- Saldo: R$ " + saldo));
    }

    public static void main(String[] args) {
        Map<String, Double> contas = new HashMap<>();
        adicionarCliente(contas, "001", 1000.0);
        adicionarCliente(contas, "002", 500.0);

        depositar(contas, "001", 100.0);
        depositar(contas, "002", 200.0);
        depositar(contas, "003", 350.0);

        exibirSaldos(contas);

    }
}
//!
