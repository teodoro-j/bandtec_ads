import java.util.Arrays;

public class PilhaObj<T> {

    private T[] pilha;
    private int topo;


    public PilhaObj(int capacidade) {
        this.pilha= (T[]) new Object[capacidade];
        this.topo = -1;
    }

    @Override
    public String toString() {

        return "Pilha de Objetos {" +
                "pilha=" + Arrays.toString(pilha) +
                '}';
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == pilha.length -1;
    }

    public void push(T info) {
        if (!isFull()) {
            pilha[++topo] = info;
        } else {
            System.out.println("Pilha está cheia.");
        }
    }

    public T pop() {
        if (!isEmpty()) {
            T retorno = pilha[topo];
            topo--;
            return retorno;
        } else {
            System.out.println("A pilha está vazia");
            return null;
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return pilha[topo];
        } else {
            System.out.println("A pilha está vazia");
            return null;
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

    public PilhaObj <T> multiPop (int n) {
        if (n > this.pilha.length) {
            return null;
        } else {
            PilhaObj pilhaAux = new PilhaObj(n);
            for (int i = 0; i < n; i++) {
                pilhaAux.push(this.pop());
            }
            return pilhaAux;
        }
    }

    public void multiPush (PilhaObj <T> aux){
        for (int i = 0; i < aux.pilha.length; i++) {
            this.push(aux.pop());
        }
    }

    public void exibePilhaBaseParaTopo() {
        PilhaObj aux = new PilhaObj(this.topo + 1);
        while(!this.isEmpty()) {
            aux.push(this.pop());
        }

        T objAux;
        while(!aux.isEmpty()) {
            objAux = (T) aux.pop();
            System.out.println(objAux);
            this.push(objAux);
        }
    }
}

