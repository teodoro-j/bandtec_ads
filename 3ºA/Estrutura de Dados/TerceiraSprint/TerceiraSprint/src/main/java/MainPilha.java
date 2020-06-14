public class MainPilha {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);

        System.out.println("A lista está vazia?");
        System.out.println(pilha.isEmpty());
        System.out.println();
        System.out.println("A lista está cheia?");
        System.out.println(pilha.isFull());

        System.out.println();
        System.out.println("Tentando tirar algo se a pilha está vazia:");
        pilha.pop();

        System.out.println();
        System.out.println("Adicionando itens . . .");

        pilha.push(1);
        pilha.push(5);
        pilha.push(7);
        pilha.push(2);

        System.out.println();
        System.out.println("Essa é a sua pilha:");
        pilha.exibe();
        System.out.println();
        System.out.println();
        System.out.println("Essa é a sua pilha um em cima do outro:");
        pilha.exibeComoPilha();

        System.out.println();
        System.out.println("Testando a função pop");
        System.out.println(pilha.pop());
        System.out.println();
        System.out.println("Testando a função peek");
        System.out.println(pilha.peek());
    }
}
