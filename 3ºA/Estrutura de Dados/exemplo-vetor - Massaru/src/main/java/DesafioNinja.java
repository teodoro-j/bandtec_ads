import java.util.Scanner;

public class DesafioNinja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Integer[] vetor1 = new Integer[5];
        Integer[] vetor2 = new Integer[5];

        Integer[] vetorOrganizado = new Integer[10];

        for(Integer i=0; i<5; i++){
            System.out.println("Digite 5 numeros");
            vetor1[i] = scan.nextInt();
        }
        for(Integer i=0; i<5; i++){
            System.out.println("Digite outros numeros");
            vetor2[i] = scan.nextInt();
        }

        order(vetor1);
        order(vetor2);

        Integer a = 0;
        Integer b = 0;
        Boolean ok1 = true;
        Boolean ok2 = true;


        for (Integer i =0; i < vetorOrganizado.length; i++) {
            if(a >= 5) {
                ok1 = false;
                vetorOrganizado[i] = vetor2[b];
                b++;
            }
            if(b >= 5){
                ok2 = false;
                vetorOrganizado[i] = vetor1[a];
                a++;
            }

            if( ok1 && ok2) {
                if (vetor1[a] < vetor2[b]) {
                    vetorOrganizado[i] = vetor1[a];
                    a++;
                } else {
                    vetorOrganizado[i] = vetor2[b];
                    b++;
                }
            }
        }

        for (Integer nmr :
                vetorOrganizado) {
            System.out.println(nmr);
        }
    }

    public static void order(Integer[] vetor) {
        for(Integer i = 0; i < vetor.length; i++){
            for(Integer j = 0; j < vetor.length - 1; j++) {
                if(vetor[j] > vetor[j + 1]){
                    Integer leftHand = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = leftHand;
                }
            }
        }
    }
}
