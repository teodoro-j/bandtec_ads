

public class Ex2Matriz {
    public static void main(String[] args) {
        int[][] matriz = { {5,6}, {2,4}, {9,8}};

        System.out.println("\nExibindo matriz");
        exibeMatriz(matriz);

        int[][] somaMatriz = new int [2][3];

        System.out.println("\nExibindo matriz");
        exibeMatrizSoma(somaMatriz);

    }


    public static void exibeMatriz(int[][] m) {
        for (int linha=0; linha < m.length; linha++) {
            for (int coluna=0; coluna < m[linha].length; coluna++) {
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void exibeMatrizSoma(int[][] n) {
        //int[][] matriz1 = { {5,6}, {2,4}, {9,8}};
        //int[][] matriz2 = { {5,6}, {2,4}, {9,8}};

        for (int linha=0; linha < n.length; linha++) {
            for (int coluna=0; coluna < n[linha].length; coluna++) {
                //somaMatriz[linha][coluna]= matriz1[linha][coluna] + matriz2[linha][coluna];
                System.out.print(n[linha][coluna] + "\t");
            }

            System.out.println();
        }
    }
}
