package br.com.devsdoagi.JavaBasico.Semana3_4.TryCatch;

public class TryPlanilha {
    public static void main(String[] args) {
        try {
            double[][] riscos = {
                    {0.2, 0.5, 1.1, 0.4, 0.3},
                    {0.7, 0.9, 0.1, 0.6, 0.8},
                    {0.3, 0.5, 0.4, 0.2, 0.9},
                    {0.8, 0.1, 0.6, 0.7, 0.5},
                    {0.9, 0.4, 0.2, 0.3, 0.6}
            };

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (riscos[i][j] < 0 || riscos[i][j] > 1) {
                        throw new IllegalArgumentException(
                                "Valor inválido encontrado na célula [" + i + "][" + j + "]: " + riscos[i][j]
                        );
                    }
                }
            }

            System.out.println("Planilha de riscos validada com sucesso!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Matriz incompleta!");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
