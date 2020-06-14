import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Baralho baralho = new Baralho();

        System.out.println("Exibindo as Cartas do Baralho");
        baralho.exibir();
        System.out.println("FIM");
        baralho.embaralhar();
        System.out.println("Baralho Embaralhado com Sucesso!");
        System.out.println("Exibindo as Cartas do Baralho");
        baralho.exibir();
        System.out.println("FIM");
        baralho.embaralhar();
        System.out.println("Baralho Embaralhado com Sucesso!");

        int virarCarta;

        System.out.println("Digite quantas cartas devem ser viradas (entre 2 e 9)):");
        virarCarta = leitor.nextInt();
        while (virarCarta < 2 || virarCarta > 9) {
            try {
                if (virarCarta < 2 || virarCarta > 9)
                    throw new Exception("Quantidade inválida (Digite um valor entre 2 e 9)");
            } catch (Exception erro) {
                System.out.println(erro);
                System.out.println("Digite a quantidade de Cartas Válidas (Entre 4 e 9):");
                virarCarta = leitor.nextInt();
            }
        }

        System.out.println("Qual o valor da soma das cartas??");
        int cartasViradas = leitor.nextInt();
        while (cartasViradas < 2 || cartasViradas > 9) {
            try {
                if (cartasViradas < 0)
                    throw new Exception("Valor Inválido");
            } catch (Exception erro) {
                System.out.println(erro);
                System.out.println("Digite um valor válido para a soma das cartas viradas");
                cartasViradas = leitor.nextInt();
            }
        }

        int somaNaipes = 0;

        for(int i = 0; i < virarCarta; i++){
            System.out.println("Exibindo cartas viradas");
            Carta cartaVirada = baralho.virarCarta();

            if (cartaVirada.getNaipe() == "Paus" || cartaVirada.getNaipe() == "Espadas"){
                somaNaipes += cartaVirada.getValor();
            }
        }
        System.out.println("Exibindo soma de Cartas");
        System.out.println(somaNaipes);


        if(cartasViradas == somaNaipes){
            System.out.println("Você ganhou!!");
        } else {
            System.out.println("Você perdeu!!");
        }


    }
}

