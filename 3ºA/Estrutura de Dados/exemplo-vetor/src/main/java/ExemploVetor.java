import java.util.Scanner;

public class ExemploVetor {

    // Método que recebe como argumento um vetor de inteiros
    // e exibe seus valores
    public static void exibeVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "]=" + v[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int tamanho, soma = 0, contaPar = 0;

        // Declara um vetor de inteiros, de tamanho 5
        int[] vet;
        vet = new int[5];

        Scanner leitor = new Scanner(System.in);

        // Solicita que o usuário digite os valores para preencher o vetor
        // Lê os valores e armazena os valores lidos no vetor
        for (int i = 0; i < vet.length ; i++) {
            System.out.println("Digite um número");
            vet[i] = leitor.nextInt();
        }

        // Exibe os valores do vetor usando for
        exibeVetor(vet);

        // Declara outro vetor, mas dessa vez, já inicializa com valores
        int[] vet2 = {100, 200, 300, 400};
        // Exibe os valores do vetor vet2
        exibeVetor(vet2);

        // Solicita que o usuário digite um valor positivo
        // que vai ser usado como o tamanho de um 3o vetor
        do {
            System.out.println("Digite o tamanho do vetor");
            tamanho = leitor.nextInt();
        } while (tamanho <= 0);

        // Cria um vetor vet3 com o tamanho digitado pelo usuário
        String[] vet3 = new String[tamanho];

        // Solicita que o usuário digite os valores para
        // preencher o vetor vet3
        for (int i=0; i < vet3.length; i++) {
            System.out.println("Digite um nome");
            vet3[i] = leitor.next();
        }

        // Exibe o conteúdo de vet3 com o for enhanced
        // Esse tipo de for serve para quando se quer obter
        // os valores do vetor
        for (String nome : vet3) {
            System.out.println(nome);
        }

        // Calcular e exibir a soma dos elementos do vetor vet
        // Usando o for enhanced
        for (int num : vet) {
            soma += num;
        }
//        // Usando for tradicional
//        for (int i=0; i < vet.length; i++) {
//            soma += vet[i];
//        }
        System.out.println("A soma dos valores de vet é " + soma);

        // Exibir a quantidade de pares que estão no vetor vet
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                contaPar++;
            }
        }
        System.out.println("No vetor vet, existem " +
                           contaPar + " números pares");

        // Criar um vetor de String com os nomes dos meses do ano
        // Solicitar que o usuário digite um número entre 1 e 12
        // Enquanto o número não for válido, solicitar novamente
        // Exibir o nome do mês correspondente ao número digitado

        String[] meses = {"janeiro","fevereiro","março","abril","maio",
        "junho","julho","agosto","setembro","outubro","novembro",
        "dezembro"};
        int mes;
        do {
            System.out.println("Digite um número");
            mes = leitor.nextInt();
        } while(mes <1 || mes >12);
        System.out.println("O mes escolhido foi: " + meses[mes-1]);



    }
}
