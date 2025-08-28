package br.com.devsdoagi.JavaBasico.Semana3_4.Colecoes.Exercicios2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainListClientes {

        private String nome;
        private String cpf;
        private int idade;

        public MainListClientes(String nome, String cpf, int idade) {
            this.nome = nome;
            this.cpf = cpf;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public int getIdade() {
            return idade;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", CPF: " + cpf + ", Idade: " + idade;
        }
    }

    class Main {
        public static void main(String[] args) {
            List<MainListClientes> clientes = new ArrayList<>();

            // Cadastro de clientes
            clientes.add(new MainListClientes("Ana Silva", "11111111111", 25));
            clientes.add(new MainListClientes("Bruno Souza", "22222222222", 30));
            clientes.add(new MainListClientes("Carla Pereira", "33333333333", 28));
            clientes.add(new MainListClientes("Diego Oliveira", "44444444444", 35));
            clientes.add(new MainListClientes("Fernanda Costa", "55555555555", 40));

            System.out.println("=== Lista de Clientes ===");
            for (MainListClientes c : clientes) {
                System.out.println(c);
            }

            Scanner sc = new Scanner(System.in);
            System.out.print("\nDigite o CPF do cliente que deseja buscar: ");
            String cpfBusca = sc.nextLine();

            MainListClientes encontrado = null;
            for (MainListClientes c : clientes) {
                if (c.getCpf().equals(cpfBusca)) {
                    encontrado = c;
                    break;
                }
            }

            String resultado = (encontrado != null)
                    ? "Cliente encontrado: " + encontrado
                    : "Cliente com CPF " + cpfBusca + " não encontrado.";

            System.out.println(resultado);

            sc.close();
        }
    }
