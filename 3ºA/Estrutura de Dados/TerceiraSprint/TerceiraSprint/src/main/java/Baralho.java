import java.util.Random;

public class Baralho {

    private PilhaObj<Carta> baralho;

    public Baralho() {
        String[] faces = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete",
                "Dama", "Rei"};
        String[] naipes = {"Copas", "Paus", "Ouros", "Espadas"};

        this.baralho = new PilhaObj<Carta>(52);

        for (int naipe = 0; naipe < 4; naipe++) {
            for (int face = 0; face < 13; face++) {
                baralho.push(new Carta(faces[face], face+1, naipes[naipe]));
            }
        }
        /*
        Carta cartaACopas = new Carta(faces[0], 1, naipes[0]);
        Carta carta2Copas = new Carta(faces[1], 2, naipes[0]);
        Carta carta3Copas = new Carta(faces[2], 3, naipes[0]);
        Carta carta4Copas = new Carta(faces[3], 4, naipes[0]);
        Carta carta5Copas = new Carta(faces[4], 5, naipes[0]);
        Carta carta6Copas = new Carta(faces[5], 6, naipes[0]);
        Carta carta7Copas = new Carta(faces[6], 7, naipes[0]);
        Carta carta8Copas = new Carta(faces[7], 8, naipes[0]);
        Carta carta9Copas = new Carta(faces[8], 9, naipes[0]);
        Carta carta10Copas = new Carta(faces[9], 10, naipes[0]);
        Carta cartaValeteCopas = new Carta(faces[10], 11, naipes[0]);
        Carta cartaDamasCopas = new Carta(faces[11], 12, naipes[0]);
        Carta cartaReiCopas = new Carta(faces[12], 13, naipes[0]);

        Carta cartaAPaus = new Carta(faces[0], 1, naipes[1]);
        Carta carta2Paus = new Carta(faces[1], 2, naipes[1]);
        Carta carta3Paus = new Carta(faces[2], 3, naipes[1]);
        Carta carta4Paus = new Carta(faces[3], 4, naipes[1]);
        Carta carta5Paus = new Carta(faces[4], 5, naipes[1]);
        Carta carta6Paus = new Carta(faces[5], 6, naipes[1]);
        Carta carta7Paus = new Carta(faces[6], 7, naipes[1]);
        Carta carta8Paus = new Carta(faces[7], 8, naipes[1]);
        Carta carta9Paus = new Carta(faces[8], 9, naipes[1]);
        Carta carta10Paus = new Carta(faces[9], 10, naipes[1]);
        Carta cartaValetePaus = new Carta(faces[10], 11, naipes[1]);
        Carta cartaDamasPaus = new Carta(faces[11], 12, naipes[1]);
        Carta cartaReiPaus = new Carta(faces[12], 13, naipes[1]);

        Carta cartaAOuros = new Carta(faces[0], 1, naipes[2]);
        Carta carta2Ouros = new Carta(faces[1], 2, naipes[2]);
        Carta carta3Ouros = new Carta(faces[2], 3, naipes[2]);
        Carta carta4Ouros = new Carta(faces[3], 4, naipes[2]);
        Carta carta5Ouros = new Carta(faces[4], 5, naipes[2]);
        Carta carta6Ouros = new Carta(faces[5], 6, naipes[2]);
        Carta carta7Ouros = new Carta(faces[6], 7, naipes[2]);
        Carta carta8Ouros = new Carta(faces[7], 8, naipes[2]);
        Carta carta9Ouros = new Carta(faces[8], 9, naipes[2]);
        Carta carta10Ouros = new Carta(faces[9], 10, naipes[2]);
        Carta cartaValeteOuros = new Carta(faces[10], 11, naipes[2]);
        Carta cartaDamasOuros = new Carta(faces[11], 12, naipes[2]);
        Carta cartaReiOuros = new Carta(faces[12], 13, naipes[2]);

        Carta cartaAEspadas = new Carta(faces[0], 1, naipes[3]);
        Carta carta2Espadas = new Carta(faces[1], 2, naipes[3]);
        Carta carta3Espadas = new Carta(faces[2], 3, naipes[3]);
        Carta carta4Espadas = new Carta(faces[3], 4, naipes[3]);
        Carta carta5Espadas = new Carta(faces[4], 5, naipes[3]);
        Carta carta6Espadas = new Carta(faces[5], 6, naipes[3]);
        Carta carta7Espadas = new Carta(faces[6], 7, naipes[3]);
        Carta carta8Espadas = new Carta(faces[7], 8, naipes[3]);
        Carta carta9Espadas = new Carta(faces[8], 9, naipes[3]);
        Carta carta10Espadas = new Carta(faces[9], 10, naipes[3]);
        Carta cartaValeteEspadas = new Carta(faces[10], 11, naipes[3]);
        Carta cartaDamasEspadas = new Carta(faces[11], 12, naipes[3]);
        Carta cartaReiEspadas = new Carta(faces[12], 13, naipes[3]);

        baralho.push(cartaACopas);
        baralho.push(carta2Copas);
        baralho.push(carta3Copas);
        baralho.push(carta4Copas);
        baralho.push(carta5Copas);
        baralho.push(carta6Copas);
        baralho.push(carta7Copas);
        baralho.push(carta8Copas);
        baralho.push(carta9Copas);
        baralho.push(carta10Copas);
        baralho.push(cartaValeteCopas);
        baralho.push(cartaDamasCopas);
        baralho.push(cartaReiCopas);

        baralho.push(cartaAPaus);
        baralho.push(carta2Paus);
        baralho.push(carta3Paus);
        baralho.push(carta4Paus);
        baralho.push(carta5Paus);
        baralho.push(carta6Paus);
        baralho.push(carta7Paus);
        baralho.push(carta8Paus);
        baralho.push(carta9Paus);
        baralho.push(carta10Paus);
        baralho.push(cartaValetePaus);
        baralho.push(cartaDamasPaus);
        baralho.push(cartaReiPaus);

        baralho.push(cartaAOuros);
        baralho.push(carta2Ouros);
        baralho.push(carta3Ouros);
        baralho.push(carta4Ouros);
        baralho.push(carta5Ouros);
        baralho.push(carta6Ouros);
        baralho.push(carta7Ouros);
        baralho.push(carta8Ouros);
        baralho.push(carta9Ouros);
        baralho.push(carta10Ouros);
        baralho.push(cartaValeteOuros);
        baralho.push(cartaDamasOuros);
        baralho.push(cartaReiOuros);

        baralho.push(cartaAEspadas);
        baralho.push(carta2Espadas);
        baralho.push(carta3Espadas);
        baralho.push(carta4Espadas);
        baralho.push(carta5Espadas);
        baralho.push(carta6Espadas);
        baralho.push(carta7Espadas);
        baralho.push(carta8Espadas);
        baralho.push(carta9Espadas);
        baralho.push(carta10Espadas);
        baralho.push(cartaValeteEspadas);
        baralho.push(cartaDamasEspadas);
        baralho.push(cartaReiEspadas);*/
    }

    public PilhaObj<Carta> getBaralho() {
        return baralho;
    }

    public void setBaralho(PilhaObj<Carta> baralho) {
        this.baralho = baralho;
    }

    public Carta removeCarta(int ind) {
        PilhaObj<Carta> aux = new PilhaObj<Carta>(53);
        // desempilha ind cartas de baralho, e empilha em aux
        for (int i = 0; i < ind; i++) {
            aux.push(baralho.pop());
        }
        Carta alvo = baralho.pop(); //alvo é a carta que quero remover
        // empilha novamente todas as ind cartas no baralho
        while(!aux.isEmpty()) {
            baralho.push(aux.pop());
        }
        return alvo; // retorna a carta alvo que foi removida
    }

    public void embaralhar() {
        Random nroAleatorio = new Random();
        for (int i = 0; i < 52; i++) {
            int indice = nroAleatorio.nextInt(52);
            if (indice != 0) {
                baralho.push(removeCarta(indice));
            }
        }
    }

    public Carta virarCarta() {
        return baralho.pop();
    }
}
