import java.util.Scanner;

public class DesafioNinja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] vetor1 = new Integer[5];
        Integer[] vetor2 = new Integer[5];

        Integer[] vetor1Organizado = new Integer[5];
        Integer[] vetor2Organizado = new Integer[5];

        for(Integer i=0; i<5; i++){
            System.out.println("Digite 5 numeros");
            vetor1[i] = scan.nextInt();
        }

        for(Integer i=0; i<5; i++){
            System.out.println("Digite outros numeros");
            vetor2[i] = scan.nextInt();
        }


    }
}
