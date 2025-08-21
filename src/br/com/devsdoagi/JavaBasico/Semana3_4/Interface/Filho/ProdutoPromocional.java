package br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Filho;

import br.com.devsdoagi.JavaBasico.Semana3_4.Interface.Implementacao.IDescontavel;

public class ProdutoPromocional implements IDescontavel {
    @Override
    public double calcularPrecoFinal(double precoBase) {
        return precoBase * 0.80; // 20% de desconto
    }
}
