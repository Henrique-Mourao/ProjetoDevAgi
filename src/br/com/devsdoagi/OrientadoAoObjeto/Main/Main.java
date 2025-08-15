package br.com.devsdoagi.OrientadoAoObjeto.Main;
import br.com.devsdoagi.OrientadoAoObjeto.Classes.Aluno;
import br.com.devsdoagi.OrientadoAoObjeto.Classes.Carro;

public class Main {
  public static void main(String[] args) {
      /*
        Aluno a1 = new Aluno("Henrique", 4, 10);
        double mediaHenrique = a1.calcularMedia();
        System.out.println(a1.verificarSituacao());
    }*/
      /*Carro meuCarro = new Carro("Toyota", "Corolla", 2022);

      meuCarro.mostrarInformacoes();
      meuCarro.acelerar();
      meuCarro.frear();*/

      Carro meuCarro = new Carro();

      meuCarro.marca = "Toyota";
      meuCarro.modelo = "Corolla";
      meuCarro.ano = 2022;

      meuCarro.mostrarInformacoes();
      meuCarro.acelerar();
      meuCarro.frear();
  }
}