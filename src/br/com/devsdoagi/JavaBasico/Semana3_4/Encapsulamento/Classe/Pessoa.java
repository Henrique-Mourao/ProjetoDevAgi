package br.com.devsdoagi.JavaBasico.Semana3_4.Encapsulamento.Classe;

public class Pessoa {

        private String nome;
        private int idade;
        // Construtor explícito com parâmetros
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }
    }
