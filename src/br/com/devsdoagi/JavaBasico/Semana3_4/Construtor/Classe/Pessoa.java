package br.com.devsdoagi.JavaBasico.Semana3_4.Construtor.Classe;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String ana, int i) {
    }

    public Pessoa() {

    }

    // Getter para obter o nome
    public String getNome() {
        return nome;
    }
    // Setter para alterar o nome
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Getter para obter a idade
    public int getIdade() {
        return idade;
    }

    // Setter para alterar a idade com validação
    public void setIdade(int idade) {

        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida.");
        }
    }
    // Método para exibir as informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
} // encerra a classe Pessoa

