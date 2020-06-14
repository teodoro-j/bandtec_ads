import java.util.Scanner;

public class ExercicioVetor4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        int numeroDigitado, count;


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor inteiro");
            vetor[i] = leitor.nextInt();
        }

        while (true) {
            count = 0;
            System.out.println("Digite um número qualquer");
            numeroDigitado = leitor.nextInt();

            for (int item : vetor) {
                if (numeroDigitado == item) {
                    count++;
                }
            }

        }


    }
}
