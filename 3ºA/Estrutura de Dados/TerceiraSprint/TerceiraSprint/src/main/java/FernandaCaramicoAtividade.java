import java.util.Scanner;

public class FernandaCaramicoAtividade {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        System.out.println("Seu baralho é o abaixo:");
        System.out.println(baralho.getBaralho());

        System.out.println("Embaralhando . . . ");
        baralho.embaralhar();

        Scanner leitor = new Scanner(System.in);
        Integer cartasVirar = -1;
        while(true) {
            try {
                System.out.println("Quantas cartas você deseja que sejam viradas? (Entre 3 e 10)");
                cartasVirar = leitor.nextInt();
                if ((cartasVirar > 10 || cartasVirar < 3))
                    throw new Exception("Digite novamente. O número deve ser entre 3 e 10");
                break;
            } catch(Exception erro) {
                System.out.println(erro);
            }
        }

        Integer somaCartas = -1;
        while(true) {
            try {
                System.out.println("Qual você acha que vai ser a soma das cartas viradas?");
                somaCartas = leitor.nextInt();
                if ((somaCartas < 3))
                    throw new Exception("Digite novamente. O número deve ser maior que 3");
                break;
            } catch(Exception erro) {
                System.out.println(erro);
            }
        }

        Integer somandoVirando = 0;
        Carta cartaAgora;
        for(int i = 0; i < cartasVirar; i++) {
            cartaAgora = baralho.virarCarta();
            System.out.print("\nEstamos virando a carta: "+cartaAgora);
            somandoVirando += cartaAgora.getValor();
            System.out.println("A soma até agora foi de "+somandoVirando);
        }

        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Calculando");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");

        System.out.println("A soma das cartas viradas é "+somandoVirando);
        System.out.println("A soma que você queria é "+somaCartas);

        boolean ganhou = false;
        if (somaCartas == somandoVirando) {
            ganhou = true;
            System.out.println("Você ganhou! :D \nParabéns!");
        } else {
            System.out.println("Você perdeu... :( \nJogue novamente.");
            ganhou = false;
        }

    }
}
