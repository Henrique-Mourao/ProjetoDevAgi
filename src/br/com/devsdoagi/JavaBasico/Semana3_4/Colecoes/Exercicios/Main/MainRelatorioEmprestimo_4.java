//Um banco armazena os valores dos empréstimos ativos em um Map<String, List<Double>>, onde a chave é o CPF do cliente e o valor é uma lista com os valores das parcelas.
//Métodos sugeridos:
//void adicionarParcela(Map<String, List<Double>> emprestimos, String cpf, double valorParcela) – adiciona uma nova parcela ao cliente.
//
//
//double totalDevedor(Map<String, List<Double>> emprestimos, String cpf) – retorna o total devedor de um cliente.
//
//
//void exibirRelatorioDevedor(Map<String, List<Double>> emprestimos) – exibe o total devedor de todos os clientes.

package br.com.devsdoagi.JavaBasico.Semana3_4.Colecoes.Exercicios.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainRelatorioEmprestimo_4 {
    public static void main(String[] args) {
        Map<String> cpf = new HashMap<>();
        List<Double> valor = new ArrayList<>();
        adicionarParcela(emprestimos, "2030",20010);
        adicionarParcela(emprestimos, "37",392);

        exibirParcela(emprestimos);
    }
    public void adicionarParcela(Map<String, List<Double>> emprestimos, String cpf, double valorParcela) {
        System.out.println(emprestimos);
    }

    public double totalDevedor(Map<String, List<Double>> emprestimos, String cpf) {
    }
}
