import java.lang.reflect.Array;
import java.util.Scanner;

public class ExercicioVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // exercicio 1
        Integer[] nmrs = new Integer[7];
        for (Integer i=0; i< nmrs.length; i++){
            nmrs[i] = scan.nextInt();
        }

        for (Integer nmr :
                nmrs) {
            System.out.println(nmrs);
        }

        for (Integer i=6; i> nmrs.length; i--){
            nmrs[i] = scan.nextInt();
        }

        // exercicio 2
        String[] nomes = new String[10];
        for (Integer i=0; i< nomes.length; i++){
            nomes[i] = scan.next();
        }

        String resposta = "";
        System.out.println("Digite um nome");
        String nomeDigitado = scan.next();

        for (Integer i=0; i< nomes.length; i++){
            resposta = nomes[i].equals(nomeDigitado) ? "Nome encontrado no índice" +
                    ": "+i : "Nome não encontrado";
        }
        System.out.println(resposta);

        // exercicio 3
        Integer[] nmrs2 = new Integer[10];
        Integer valorTotal = 0;
        for(Integer i=0; i<nmrs2.length; i++){
            nmrs2[i] = scan.nextInt();
            valorTotal+= nmrs2[i];
        }
        Integer media = valorTotal / 10;
        System.out.println("A média é: "+ media);

        for (Integer nmr :
                nmrs2) {
            if(nmr > media){
                System.out.println(nmr);
            }
        }

        // exercicio 4
        Integer[] nmrs3 = new Integer[10];
        Integer count = 0;
        for(Integer i=0; i<nmrs3.length; i++){
            nmrs2[i] = scan.nextInt();
        }
        System.out.println("Digite um numero");
        Integer nm = scan.nextInt();
        for (Integer nmr :
                nmrs3) {
            if(nm == nmr){
                count++;
            }
        }
        System.out.println("O número "+nm+" ocorre "+count);

        // exercicio 5
        String[] carros = new String[5];
        Integer[] consumos = new Integer[5];

        for(Integer i=0; i<carros.length; i++){
            System.out.println("Digite o nome do carro e do seu consumo" +
                    " respectivamente");
            carros[i] = scan.next();
            consumos[i] = scan.nextInt();
        }
        Integer consumoMaisBaixo = consumos[0];

        for(Integer i=0; i<carros.length; i++) {
            if(consumos[i] < consumoMaisBaixo){
                consumoMaisBaixo = i;
            }
        }
        System.out.println("O carro mais economico é "+carros[consumoMaisBaixo]);

        // exercicio 6

        Integer dia;
        do {
            System.out.println("Digite o dia");
            dia = scan.nextInt();
        }while (dia > 31 || dia < 1);

        Integer mes;
        do {
            System.out.println("Digite o mes");
            mes = scan.nextInt();
        }while (mes > 12 || mes < 1);

        Integer[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        Integer totalDias = 0;
        for(Integer i=0; i<mes-2; i++ ){
            totalDias += diasPorMes[i];
        }
        totalDias += dia;
        System.out.println("O total de dias é "+totalDias);
    }
}
