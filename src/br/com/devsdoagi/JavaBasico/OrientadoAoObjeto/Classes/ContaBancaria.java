/*1. Conta Bancária (Setor Financeiro)
* Crie a classe ContaBancaria com os seguintes atributos privados:
* Implemente os métodos getters e setters, garantindo que:
* o saldo não pode ser alterado diretamente (sem setSaldo)
* o método depositar(double valor) só aceita valores positivos
* o método sacar(double valor) só permite saque se houver saldo suficiente.
* Crie um método exibirExtrato() para mostrar os dados da conta e o saldo atual.

Autor: Henrique Gonçalves Mourão
Data: 18/08/2025*/

package br.com.devsdoagi.JavaBasico.OrientadoAoObjeto.Classes;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
            System.out.println("Saldo realizado com Sucesso!!");
        }
        else{
            System.out.println("Valor Invalido!!");
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo Insulficiente!!");
        }
    }
    public void exibirExtrato(){
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero da Conta:" + getNumeroConta());
        System.out.println("Saldo:" + this.saldo);
    }
 }