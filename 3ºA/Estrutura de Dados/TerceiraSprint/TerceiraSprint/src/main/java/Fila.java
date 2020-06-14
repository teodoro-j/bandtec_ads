public class Fila {
    private int tamanho;
    private String[] fila;

    public Fila(int capacidade) {
        fila = new String[capacidade];
        tamanho = 0;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String[] getFila() {
        return fila;
    }

    public void setFila(String[] fila) {
        this.fila = fila;
    }

    public boolean isEmpty() {
        /*if (this.tamanho == 0) {
            return true;
        }
        return false;*/

        return this.tamanho == 0; // AAA A A A FAÇA ASSIMMMMM!!!
    }

    public boolean isFull() {
        if (this.tamanho == this.fila.length) {
            return true;
        }
        return false;
    }

    public void inserir(String info) {
        if (!this.isFull()) {
            this.fila[this.tamanho++] = info; // usar o tamanho e depois aumentar em 1
            return; // pra não colocar else
        }
        System.out.println("A fila está cheia.");
    }

    public String peek() {
        return this.fila[0];
    }

    public String poll() {
        if (!this.isEmpty()) {
            String eraPrimeiro = this.fila[0]; // pode ser também eraPrimeiro = peek();
            for (int i = 0; i < tamanho - 1; i++) {
                this.fila[i] = this.fila[i + 1];
            }
            // NAO DA SÓ PRA DIMINUIR O TAMANHO, TEM QUE TIRAR O ULTIMO!!
            this.fila[tamanho - 1] = null;

            tamanho--;
            return eraPrimeiro;
        }
        return "A fila está vazia"; // " é String, ' é char
    }

    public void exibe() {
        if (this.isEmpty()) {
            System.out.println("A fila está vazia");
        } else {
            for (int i = 0; i < tamanho; i++) {
                System.out.print(this.fila[i] + "\t-\t");
            }
                //System.out.println("\n");
        }
    }
}
