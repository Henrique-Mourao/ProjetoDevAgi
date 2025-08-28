package br.com.devsdoagi.JavaBasico.Semana3_4.Colecoes.Exercicios.Main;

import java.util.*;

class MainOrdenacaoSaldo_6 {
    String nome;
    double saldo;

    MainOrdenacaoSaldo_6(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + saldo;
    }
}

public class MainOrdenacaoSaldo_6{

    public static void adicionarCliente(List<MainOrdenacaoSaldo_6> clientes, String nome, double saldo) {
        clientes.add(new MainOrdenacaoSaldo_6(nome, saldo));
    }

    public static void ordenarPorSaldo(List<MainOrdenacaoSaldo_6> clientes) {
        clientes.sort((c1, c2) -> Double.compare(c2.saldo, c1.saldo));
    }

    public static void exibirClientes(List<MainOrdenacaoSaldo_6> clientes) {
        clientes.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<MainOrdenacaoSaldo_6> clientes = new ArrayList<>();
        adicionarCliente(clientes, "Ana", 2000);
        adicionarCliente(clientes, "Bruno", 5000);
        adicionarCliente(clientes, "Carla", 3500);
        ordenarPorSaldo(clientes);
        exibirClientes(clientes);
    }
}
