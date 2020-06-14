import java.util.Scanner;

public class Ex3Matriz {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[] vetor = new int[3];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite um valor inteiro");
                int valor = leitor.nextInt();
            }
        }
        System.out.println("\nExibindo matriz");
        exibeMatriz(matriz);

        System.out.println("\n");
        exibeSoma(vetor);
    }

    public static void exibeMatriz(int[][] matriz) {

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void exibeSoma(int[] vetor) {
        int somaTotal = 0;

        for(int soma = 0; soma < vetor.length; soma++){
            System.out.println(vetor[soma] + "\t");
            somaTotal += vetor[soma];
        }
        vetor[0] = somaTotal;
        System.out.println();
    }
}
