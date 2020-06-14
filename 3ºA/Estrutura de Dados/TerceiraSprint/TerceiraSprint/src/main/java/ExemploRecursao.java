public class ExemploRecursao {
    public static void contagemRegressiva(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void contagemRegressivaRecursiva(int n) {
        if (n == 0) {
            System.out.println(n);
        } else {
            System.out.println(n);
            contagemRegressivaRecursiva(n-1);
        }
    }

    public static int fatorial(int n) {
        if (n == 0) {
            return 1; // 0! = 1
        } else {
            // 5! = 5 * 4!
            // N! = N * N-1!
            return n * fatorial(n-1);
        }
    }

    public static void exibeVetor(int[] v, int n) {
        if (n < v.length) {
            System.out.println(v[n]);
            exibeVetor(v, n+1);
        }
    }

    public static void main(String[] args) {
        contagemRegressiva(5);
        System.out.println("--------");
        contagemRegressivaRecursiva(5);

        System.out.println("--------");
        System.out.println("5! = " + fatorial(5));

        int[] v = {2,4,6,8,10,12,14,16};

        System.out.println("--------");
        exibeVetor(v, 0);
    }
}
