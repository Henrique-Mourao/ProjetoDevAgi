package br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.Filho;

import br.com.devsdoagi.JavaBasico.Semana3_4.Heranca.Pai.Produto;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String codigo, String nome, double preco, String dataValidade){
            super(codigo, nome, preco);
            this.dataValidade = dataValidade;
        }
        public void processarProduto () {
            System.out.println("O produto " + nome + " com o código: " + codigo + " está custando: R$" + preco + " com a data de validade " + dataValidade);

        }
    }

