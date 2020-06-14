public class FilaObj<T> {

    //Atributos
    private int tamanho;
    private T[] fila;

    public FilaObj(int capacidade) {
        fila = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public T[] getFila() {
        return fila;
    }

    public void setFila(T[] fila) {
        this.fila = fila;
    }

    public boolean isEmpty() {
        if (this.tamanho == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (this.tamanho == this.fila.length) {
            return true;
        }
        return false;
    }

    public void inserir(T info) {
        if (!this.isFull()) {
            this.fila[this.tamanho++] = info; // usar o tamanho e depois aumentar em 1
        } else {
            System.out.println("A fila está cheia.");
        }
    }

    public T peek() {
        return this.fila[0];
    }

    public T poll() {
        if(!this.isEmpty()) {
            T eraPrimeiro = this.fila[0];
            for (int i = 0; i < tamanho-1; i++) {
                this.fila[i] = this.fila[i+1];
            }
            tamanho--;
            return eraPrimeiro;
        }
        return null;
    }

    public void exibe() {
        if (this.isEmpty()) {
            System.out.print("A fila está vazia");
        } else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(this.fila[i] + "\t");
            }
        }
    }

}
