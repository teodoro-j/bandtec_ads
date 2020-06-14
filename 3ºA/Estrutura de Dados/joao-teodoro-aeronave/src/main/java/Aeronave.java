import java.util.ArrayList;
import java.util.Scanner;

public class Aeronave {

    public static void exibirMatriz(boolean[][] matrizAero) {
        System.out.println("Exibição dos Assentos\n");

        String[] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};

        for (int numero = 0; numero < matrizAero[0].length; numero++) {
            System.out.print("\t" + (numero + 1) + "\t");
        }
        System.out.println();

        for (int linha = 0; linha < matrizAero.length; linha++) {
            System.out.print(alfabeto[linha] + "\t");
            for (int coluna = 0; coluna < matrizAero[linha].length; coluna++) {
                if (matrizAero[linha][coluna] == false) {
                    System.out.print("livre \t");
                } else {
                    System.out.print("Ocup \t");
                }
            }
            System.out.println();
        }
    }


    public static void reservaAssento(boolean[][] matrizAero) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a letra de uma fileira");
        String newFileira = leitor.next();
        int numLinha = newFileira.charAt(0) - 'A';

        System.out.println("Digite o número de uma fileira");
        int newAssento = leitor.nextInt() - 1;

        if (matrizAero[numLinha][newAssento] == false) {
            System.out.println("Reserva efetuada com SUCESSO!!");
            matrizAero[numLinha][newAssento] = true;
        } else {
            System.out.println("Esse assento já esta OCUPADO!!");
        }

    }

    public static void exibeFileira(boolean[][] matrizAero) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Integer> assentosLivres = new ArrayList<Integer>();

        System.out.println("Digite a letra de fileira");
        String exibeFileira = leitor.next();
        int numLinha = exibeFileira.charAt(0) - 'A';

        if (numLinha < 0 || numLinha > matrizAero.length) {
            System.out.println("Fileira Inválida!!");
        } else {
            for (int coluna = 0; coluna < matrizAero[numLinha].length; coluna++) {
                if (matrizAero[numLinha][coluna] == false) {
                    assentosLivres.add(coluna + 1);
                }
            }

            if (assentosLivres.size() == 0) {
                System.out.println("Não há assentos LIVRES!!");
            } else {
                for (int linha = 0; linha < assentosLivres.size(); linha++) {
                    System.out.print(assentosLivres.get(linha) + "\t");
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean fim = false;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a quantidade de Fileiras da Aerona (Entre 4 e 9):");
        int fileiras = leitor.nextInt();

        System.out.println("Digite a quantidade de assentos da Aeronave (Entre 15 e 20):");
        int assentos = leitor.nextInt();

        while (((fileiras < 4 || fileiras > 9) || (assentos < 15 || assentos > 20))) {
            try {
                if (fileiras < 4 || fileiras > 9)
                    throw new Exception("Quantidade de fileiras inválida (Digite um valor entre 4 e 9)");

                if (assentos < 15 || assentos > 20)
                    throw new Exception("Quantidade de assentos inválida (Digite um valor entre 15 e 20)");

            } catch (Exception erro) {
                System.out.println(erro);
                System.out.println("Digite a quantidade de Fileiras da Aerona (Entre 4 e 9):");
                fileiras = leitor.nextInt();
                System.out.println("Digite a quantidade de assentos da Aeronave (Entre 15 e 20):");
                assentos = leitor.nextInt();
            }
        }


        boolean[][] aeronave = new boolean[fileiras][assentos];

        for (int linha = 0; linha < fileiras; linha++) {
            for (int coluna = 0; coluna < assentos; coluna++) {
                aeronave[linha][coluna] = false;
            }
        }

        while (!fim) {
            System.out.println("\nEscolha uma das opções:");
            System.out.println("1- Exibir mapas de assentos");
            System.out.println("2- Reserva de assento");
            System.out.println("3- Exibir assentos livres de uma fileira");
            System.out.println("4- Sair");
            int opcao = leitor.nextInt();

            switch (opcao) {

                case 1:
                    exibirMatriz(aeronave);
                    break;

                case 2:
                    reservaAssento(aeronave);
                    break;

                case 3:
                    exibeFileira(aeronave);
                    break;

                case 4:
                    fim = true;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }
    }
}
