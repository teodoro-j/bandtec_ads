public class Pilha {
    private int topo;
    private int[] pilha;

    public Pilha(int capacidade) {
        this.pilha = new int[capacidade];
        this.topo = -1;
    }

    public boolean isEmpty() {
//        if (topo == -1) {
//            return true;
//        } else {
//            return false;
//        } << ctrl+/ para comentar

        return topo == -1;
    }

    public boolean isFull() {
//        if (topo == pilha.length -1) {
//            return true;
//        } else {
//            return false;
//        }

        return topo == pilha.length -1;
    }

    public void push(int info) {
        if (!isFull()) {
            pilha[++topo] = info;
        } else {
            System.out.println("Pilha está cheia.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            // v1
            // return pilha[topo--];

            // v2
            int retorno = pilha[topo];
            topo--;
            return retorno;
        } else {
            System.out.println("A pilha está vazia");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return pilha[topo];
        } else {
            System.out.println("A pilha está vazia");
            return -1;
        }
    }

    public void exibe() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.print(pilha[i] + "\t");
            }
        }
    }

    public void exibeComoPilha() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia");
        } else {
            for (int i = topo; i >= 0 ; i--) {
                System.out.print(pilha[i] + "\n");
            }
        }
    }

    public boolean ehPalindromo() {
        Pilha pilhaReversa = new Pilha(this.pilha.length);

        if (isEmpty()) {
            return false;
        } else {
            for (int i = 0; i <= topo; i++) {
                pilhaReversa.push(this.pop());
            }

            boolean ehIgual = false;

            for (int i = 0; i<= topo; i++) {
                if (this.pilha[i] == pilhaReversa.pilha[i]) {
                    ehIgual = true;
                } else {
                    ehIgual = false;
                    break;
                }
            }

            return ehIgual;
        }
    }

}

