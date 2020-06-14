import java.util.Scanner;

public class ExemploVetor {
    public static void exibeVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("v["+i+"]="+v[i]+"\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int tamanho;
        // Declara um vetor de inteiros, de tamanho 5
        int[] vet = new int[5];
        Scanner leitor = new Scanner(System.in);
        
        // Solicita que o usuário digite os valores para preencher o vetor
        // Lê os valores e armazena os valores lidos no vetor
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um número");
            vet[i] = leitor.nextInt();
        }

        // Exibe os valores do vetor usando for
        exibeVetor(vet);

        // Declara outro vetor, mas dessa vez, já inicializa com valores
        int[] vet2 = {100,200,300,400};
        // Exibe os valores do vetor vet2
        exibeVetor(vet2);

        
        // Solicita que o usuário digte um valor positivo
        // que vai ser usado como o tamanho de um 3o vetor
        do {
            System.out.println("Digite o tamanho do vetor");
            tamanho = leitor.nextInt();
        } while (tamanho <= 0);
        
        // Cria um vetor vet3 com o tamanho digitado pelo usuário
        String[] vet3 = new String[tamanho];

        for(int i=0; i<vet3.length; i++){
            System.out.println("Digite um nome");
            vet3[i] = leitor.next();
        }

        for (String nome :
                vet3) {
            System.out.println(nome);
        }

        // Calcular e exibir a soma dos elementos de vet
        Integer total = 0;
        for (Integer valor :
                vet) {
            total += valor;
        }
        System.out.println(total);

        // exibir a quantidade de pares que estão no vetor vet
        Integer totalv2 = 0;
        for (Integer valor: vet) {
            if (valor % 2 == 0) {
                totalv2++;
            }
        }

        System.out.println(totalv2);

        //criar um vetor de string com os nomes dos meses do ano
        //solicitar que o usuario digite um numero entre 1 e 12
        //enquanto o numero nao for validado, solicitar novamente
        //exibir o nome do mes corresponde ao numero digitado

        String[] meses = {"jan", "fev", "mar", "abril",
                "maio", "jun", "jul", "ago", "set", "nov", "dez"};

        Integer nmr;
        do {
            System.out.println("Digite um numero entre 1 e 12");
            nmr = leitor.nextInt();
        }while (nmr < 0 || nmr > 12);

        System.out.println(meses[nmr - 1]);
    }
}
