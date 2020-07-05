public class FilaPilha {

    private int[] vetor;
    private int tamanhoFila;
    private int topoPilha;

    public FilaPilha(int capacidade) {
        tamanhoFila = 0;
        topoPilha = capacidade;
        vetor = new int[capacidade];

    }

    public boolean isFilaEmpty() {

        return tamanhoFila == 0;
    }

    public boolean isPilhaEmpty() {

        return topoPilha == vetor.length;

    }

    public boolean isFull() {

        return tamanhoFila == topoPilha;
    }

    public void push(int info) {

        if (isFull()) {
            System.out.println("Pilha cheia!");
        } else {
            vetor[--topoPilha] = info;
        }


    }

    public int pop() {

        if (!isPilhaEmpty()) {
            return vetor[topoPilha++];
        } else {
            return -1;
        }
    }

    public void insert(int info) {
        if (isFull()) {
            System.out.println("Fila cheia!");
            return;
        }

        vetor[tamanhoFila++] = info;
    }

    public int poll() {

        int primeiro = vetor[0];

        if (!isFilaEmpty()) {
            for (int i = 0; i < tamanhoFila - 1; i++) {
                vetor[i] = vetor[i + 1];
            }

            vetor[tamanhoFila - 1] = 0;
            tamanhoFila--;
        }

        return primeiro;
    }

    public void exibeFila() {
        if (isFilaEmpty()) {
            System.out.println("Fila vazia!");
        } else {
            for (int i = 0; i < tamanhoFila; i++) {
                System.out.println(vetor[i]);
            }
        }
    }

    public void exibePilha() {

        if (isPilhaEmpty()) {
            System.out.println("Pilha vazia!");
        } else {

            for (int i = vetor.length - 1; i >= topoPilha; i--) {
                System.out.println(vetor[i]);
            }


        }

    }


}
