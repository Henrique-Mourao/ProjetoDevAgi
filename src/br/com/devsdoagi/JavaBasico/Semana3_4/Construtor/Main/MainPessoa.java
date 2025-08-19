package br.com.devsdoagi.JavaBasico.Semana3_4.Construtor.Main;
import br.com.devsdoagi.JavaBasico.Semana3_4.Construtor.Classe.Pessoa;

public class MainPessoa {
    public class Main {
        public static void main(String[] args) {
    // Passando parâmetros para o construtor
            Pessoa pessoa = new Pessoa("Ana", 25);
            pessoa.exibirInformacoes();
        }
    }
}

