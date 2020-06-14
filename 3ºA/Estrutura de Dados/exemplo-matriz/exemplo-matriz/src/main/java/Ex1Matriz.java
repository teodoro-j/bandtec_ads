import java.util.Scanner;

public class Ex1Matriz {

    public static void main(String[] args) {
        int[][] matriz = new int [2][3];

        Scanner leitor = new Scanner(System.in);

        for (int linha=0; linha < matriz.length; linha++) {
            for (int coluna=0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor de matriz[" + linha +
                        "][" + coluna + "]");
                matriz[linha][coluna]= leitor.nextInt();
            }
        }

        System.out.println("\nExibindo matriz");
        exibeMatriz(matriz);
    }

    public static void exibeMatriz(int[][] m) {

        for (int linha=0; linha < m.length; linha++) {
            for (int coluna=0; coluna < m[linha].length; coluna++) {
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
}
