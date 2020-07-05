import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        //Teste do exercício

        int v[] = new int[10];

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {

            System.out.println("Digite um valor para preencher o vetor:");
            Integer valor = leitor.nextInt();

            v[i] = valor;
        }

        FilaPilha fp = new FilaPilha(v.length);

        for (int i = 0; i < v.length; i++) {

            if (v[i] < 10) {
                fp.push(v[i]);
            } else {
                fp.insert(v[i]);
            }
        }

        while (!fp.isPilhaEmpty()) {
            System.out.print(fp.pop() + "\t");
        }

        while (!fp.isFilaEmpty()) {
            System.out.print(fp.poll() + "\t");
        }


        //Validando os métodos

        /*FilaPilha filaPilha = new FilaPilha(4);

        System.out.println("Fila está vazia?");
        System.out.println(filaPilha.isFilaEmpty());

        System.out.println("\nPilha está vazia?");
        System.out.println(filaPilha.isPilhaEmpty());

        System.out.println("\nA filapilha está cheia?");
        System.out.println(filaPilha.isFull());

        System.out.println("\nAdicionando valores 10, 11 na fila e 12, 13 na pilha...");
        filaPilha.insert(10);
        filaPilha.insert(11);
        filaPilha.push(12);
        filaPilha.push(13);

        System.out.println("\nAdicionando um valor a mais na pilha e na fila...");
        filaPilha.insert(14);
        filaPilha.push(15);

        System.out.println("\nExibindo fila e pilha...");
        filaPilha.exibeFila();
        filaPilha.exibePilha();

        System.out.println("\nFila está vazia?");
        System.out.println(filaPilha.isFilaEmpty());

        System.out.println("\nPilha está vazia?");
        System.out.println(filaPilha.isPilhaEmpty());

        System.out.println("\nA filapilha está cheia?");
        System.out.println(filaPilha.isFull());

        System.out.println("\nTirando um item da fila...");
        System.out.println(filaPilha.poll());

        System.out.println("\nExibe fila");
        filaPilha.exibeFila();

        System.out.println("\nTirando um item da pilha...");
        System.out.println(filaPilha.pop());

        System.out.println("\nExibe pilha");
        filaPilha.exibePilha();*/
    }
}
