package br.com.devsdoagi.JavaBasico.OrientadoAoObjeto.Classes;


public class Carro {
        public String marca, modelo;
        public int ano;

        //Metodo para acelerar o carro
        public void acelerar(){
                System.out.println("O Carro está acelerando!");
        }

        //Metodo para frear o carro
        public void frear(){
                System.out.println("O Carro está freado");
        }

        //Metodo mostrar informacoes
        public void mostrarInformacoes(){
                System.out.println("Marca: " + this.marca);
                System.out.println("Modelo: " + this.modelo);
                System.out.println("Ano: " + this.ano + "\n");
        }
}
