//Metodo referente ao objeto que foi criado nessa pagina. Essa pagina é o main.

package br.com.devsdoagi.JavaBasico.OrientadoAoObjeto.Classes;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    /* public String modelo;
        public String marca;
        public int ano;


        //Metodo para acelerar o carro
        public void acelerar(){
            System.out.println("O carro está Acelerando");
        }
        //Metodo para frear carro
        public void frear(){
            System.out.println("O carro está Freiando");
        }
        //Metodo para mostrar as informacoes do carro
        public void mostrarInformacoes() {
            System.out.println("Marca:" + this.marca);
            System.out.println("Modelo:" + this.modelo);
            System.out.println("Ano:" + this.ano);
        }*/

    public double calcularMedia() {
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public String verificarSituacao() {
        String resultado;
        double media = calcularMedia();
        if (media >= 8) {
            resultado ="você foi aprovado";
            return resultado;
        } else if (media <8 && media >=4) {
            resultado ="você está na média";
            return resultado;
        }else{
            resultado="você está de recuperação";
            return resultado;
        }
    }
        public void exibirResultado() {
            System.out.println(nome);
            System.out.println(verificarSituacao());
        }
}

