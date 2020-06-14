//Criar um sistema que seja capax de receber os nomes dos artistas que faãro Show no Lollapalooza em São Paulo e
//os dias de cada Show


import java.util.Scanner;

public class Lollapalooza<T> {
    private String[] show = new String[6];
    private int[] dias = new int[6];
    int nomeShow;
    int nroDia;


    public void adicionaShow(String valor) {
        this.nomeShow = 0;

        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < nomeShow; i++) {
            System.out.println("Digite o nome do artista");
            show[i] = String.valueOf(leitor.nextInt());

            if (nomeShow >= show.length) {
                System.out.println("Já tem todos os Shows preenchidos");
            } else {
                show[nomeShow++] = valor;
                System.out.println("Elemento adicionado!");
            }
        }
    }

    public void adicionaDia(int data){
        this.nroDia = 0 ;

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < nroDia; i++){
            System.out.println("Digite o dia do Show");
            dias[i] = leitor.nextInt();

            if (nroDia >= dias.length) {
                System.out.println("Já tem todos os Shows preenchidos");
            } else {
                dias[nroDia++] = data;
                System.out.println("Elemento adicionado!");
            }
        }
    }

    public void exibeShoweDia() {
        System.out.println("Exibindo Artistas confirmados para o Lollapalooza");
        for (int i = 0; i < nomeShow; i++) {
            System.out.println("Show de índice " + nomeShow + ": " + show[nomeShow]+ " no dia "
            + dias[nroDia] + " de Abril.");
        }
    }

    public class buscaShow(int valor){
    int resposta = -1;
		for (int i = 0; i < nomeShow; i++) {
        if (show[i].equals(valor)) {
            resposta = i;
            System.out.println("O índice do show é: " + resposta);
            break;
        }
    }
		return resposta;

    }

    public class Calculo(int cal) {
        int total = 0;
        for (int valor: dias) {
            if (valor % 2 == 0) {
                total++;
            }
        }

        System.out.println(total);
    }

    public class exibeMenor(int pd) {
        Integer primDia = dias[];
        for(int n = 0; n < dias.length; n++ ){
            if(dias[n] < primDia){
                primDia = n;
            }
        }
        System.out.println("O primeiro dia de show é :" + dias[primDia]);
    }

}




