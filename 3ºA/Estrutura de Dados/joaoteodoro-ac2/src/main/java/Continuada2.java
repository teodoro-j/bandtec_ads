import java.util.Scanner;

public class Continuada2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de Casas no Condomínio");
        int maxCasa = leitor.nextInt();

        while (maxCasa < 6 || maxCasa > 18) {
            try {
                if (maxCasa < 6 || maxCasa > 18)
                    throw new Exception("Digite um valor válido de Casas(entre 6 e 18)");

            } catch (Exception erro) {
                System.out.println(erro);
                System.out.println("Digite um valor válido de Casas(entre 6 e 18");
                maxCasa = leitor.nextInt();
            }
        }

        int[] casa = new int[maxCasa];
        int[][] consumo = new int[maxCasa][2];
        int[] variacoes = new int[maxCasa];

        for (int i = 0; i < casa.length; i++) {
            System.out.println("Digite o número da Casa");
            casa[i] = leitor.nextInt();
        }

        int somaConsumo1 = 0;
        int somaConsumo2 = 0;

        for (int matriz = 0; matriz < casa.length; matriz++) {
            System.out.println("Digite o consumo do ês anterior");
            consumo[matriz][0] = leitor.nextInt();
            somaConsumo1 += consumo[matriz][0];

            System.out.println("Digite a consumo desse mês");
            consumo[matriz][1] = leitor.nextInt();
            somaConsumo2 += consumo[matriz][1];

            variacoes[matriz] += (consumo[matriz][1] - consumo[matriz][0]);
        }

        System.out.printf("%-14s %9s %9s %9s", "CASA", "MÊS ANTERIOR", "MÊS ATUAL", "VARIAÇão");

        for(int linha = 0; linha < consumo.length; linha++){
            System.out.printf("\n%-13d %9d %9d %9d", casa[linha], consumo[linha][0], consumo[linha][1], variacoes[linha]);
        }
    }
}
