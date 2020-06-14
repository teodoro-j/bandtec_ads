import java.util.Scanner;

public class ExercicioVetor5 {

    public static void main(String[] args) {

        String[] marcaCarro = new String[5];
        int[] consumoCarro = new int[5];
        int indiceCarro = 0;
        int consumoAtual = 0;

        Scanner leitor = new Scanner(System.in);
        Scanner leitorDoNumero = new Scanner(System.in);

        for (int i = 0; i < marcaCarro.length; i++) {
            System.out.println("Digite o nome de um modelo de carro ");
            marcaCarro[i] = leitor.nextLine();

            System.out.println("Digite o consumo do carro " + marcaCarro[i]);
            consumoCarro[i] = leitorDoNumero.nextInt();

            if (consumoCarro[i] > consumoAtual) {
                indiceCarro = i;
                consumoAtual = consumoCarro[i];
            }
        }

        System.out.println("O carro com melhor aproveitamento de gasolina é o "
                + marcaCarro[indiceCarro] + " com " + consumoCarro[indiceCarro] +
                " por litro");


        //Procura a marca de carro que tem a menor km por litro

        int menorKm = consumoCarro[0], indiceMenor=0;

        for(int i=1; i<consumoCarro.length; i++) {
            if(consumoCarro[i] < menorKm) {
                menorKm = consumoCarro[i];
                indiceMenor=i;
            }
        }

        System.out.println("O carro com pior aproveitamento de gasolina é o "
                + marcaCarro[indiceMenor] + " com " + consumoCarro[indiceMenor] +
                " por litro");

        for(String marca: marcaCarro) {
            System.out.println(marca + "\t");
        }
        for(int consumo: consumoCarro) {
            System.out.println(consumo + "\t");
        }
    }






}
