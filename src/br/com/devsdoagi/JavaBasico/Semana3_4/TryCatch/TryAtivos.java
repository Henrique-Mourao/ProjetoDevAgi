package br.com.devsdoagi.JavaBasico.Semana3_4.TryCatch;
import java.util.Scanner;
public class TryAtivos {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quantos preços quer calcular? ");
            int numero = Integer.parseInt(sc.nextLine());
            double[] precos = new double[numero];
            for(int i = 0; i < numero; i++ ){
                System.out.println("Digite o preço do dia" + (1 + i) + "");
                String entrada = sc.nextLine();
                precos[i] = Double.parseDouble(entrada); // se não for número válido, cai no NumberFormatException
            }
            if (precos.length < 3) {
                throw new IllegalArgumentException("É necessário pelo menos 3 preços para calcular a média móvel.");
            }
            for (int i = 2; i < precos.length; i++) {
                double media = (precos[i] + precos[i - 1] + precos[i - 2]) / 3.0;
                System.out.println("Média Móvel (dia " + (i + 1) + "): " + media);
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor informado não é numérico!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}




