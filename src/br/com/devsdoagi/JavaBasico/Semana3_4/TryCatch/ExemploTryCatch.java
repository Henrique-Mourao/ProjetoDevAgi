package br.com.devsdoagi.JavaBasico.Semana3_4.TryCatch;

public class ExemploTryCatch {
    public static void main(String[] args) {
        try {
            // Código que pode gerar erro
            int[] numeros = {1, 2, 3};
            System.out.println("Número na posição 2: " + numeros[2]); // ok
            System.out.println("Número na posição 5: " + numeros[5]); // erro

            int resultado = 10 / 0; // erro de divisão por zero
            System.out.println("Resultado: " + resultado);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Trata erro de acessar posição inválida do array
            System.out.println("Erro: Tentou acessar um índice fora do array!");
        } catch (ArithmeticException e) {
            // Trata erro de divisão por zero
            System.out.println("Erro: Não é possível dividir por zero!");
        } catch (Exception e) {
            // Trata qualquer outro tipo de erro não previsto
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            // Sempre será executado, com ou sem erro
            System.out.println("Bloco 'finally' executado!");
        }

        System.out.println("Programa finalizado!");
    }
       }

