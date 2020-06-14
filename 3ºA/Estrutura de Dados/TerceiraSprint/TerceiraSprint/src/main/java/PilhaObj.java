import java.util.Arrays;

public class PilhaObj<T> {

    // Atributos
    private T[] pilha;    // vetor onde será armazenado os elementos da lista
    private int topo;


    // Construtor
    // Recebe o tamanho máximo da lista
    public PilhaObj(int tam) {
        this.pilha= (T[]) new Object[tam];    // Cria o vetor com o tamanho máximo recebido
        this.topo = -1;
    }

    public T[] getPilha() {
        return pilha;
    }

    public void setPilha(T[] pilha) {
        this.pilha = pilha;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
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

    /* métodos para usar no obj livro*/
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

}
