import java.util.Scanner;

public class ExemploMatriz {

    public static void exibeMatriz(int[][] m) {
        // Loop para exibir os valores da matriz
        for (int linha=0; linha < m.length; linha++) {
            for (int coluna=0; coluna < m[linha].length; coluna++) {
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] vetor = new int[10];

        // Cria matriz de inteiros 3 x 4
        int[][] matriz = new int[3][4];

        // Cria outra matriz usando lista de inicializadores
        int[][] matriz1 = { {1,2}, {3,4}, {5,6}, {7,8} };

        // Cria uma matriz toda irregular com número de colunas
        // diferente em cada linha
        int[][] matrizLoka = { {1}, {2,3,4,5}, {6,7}, {8,9,10} };

        Scanner leitor = new Scanner(System.in);

        // Loop para preencher os valores da matriz
        for (int linha=0; linha < matriz.length; linha++) {
            for (int coluna=0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor de matriz[" + linha +
                                    "][" + coluna + "]");
                matriz[linha][coluna]= leitor.nextInt();
            }
        }

        System.out.println("\nExibindo matriz");
        exibeMatriz(matriz);

        System.out.println("\nExibindo matriz1");
        exibeMatriz(matriz1);

        System.out.println("\nExibindo matrizLoka");
        exibeMatriz(matrizLoka);

    }
}
