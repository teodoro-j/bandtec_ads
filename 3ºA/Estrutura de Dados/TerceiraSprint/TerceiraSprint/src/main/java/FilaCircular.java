public class FilaCircular {
    private int tamanho;
    private String[] fila;
    private int inicio;
    private int fim;

    public FilaCircular(int capacidade) {
        this.fila = new String[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = 0;
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

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public boolean isEmpty() {
        if (tamanho == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (tamanho != 0 && inicio == fim) {
            return true;
        }
        return false;
    }

    public void insert(String info) {
        if (!this.isFull()) {
            fila[fim] = info;
            // seráaa?? fim++ - tira o +1 abaixo
            fim = (fim + 1) % fila.length;

            tamanho = tamanho + 1;
        } else {
            System.out.println("A fila está cheia. Retire algum item e tente novamente");
        }
    }

    public String peek() {
        if (!this.isEmpty()) {
            return fila[inicio];
        }
        return "A fila está vazia.";
    }

    public String poll() {
        if(!this.isEmpty()) {
            String eraPrimeiro = fila[inicio];
            fila[inicio] = null;
           // inicio++;
            inicio = (inicio + 1) % fila.length;
            tamanho = tamanho - 1;
            return eraPrimeiro;
        }
        return "A fila está vazia.";
    }

    public void exibe() {
        if(this.isEmpty()) {
            System.out.println("Nada a exibir pois a fila circular está vazia.");
        } else {
            /*jeito ninja da Celia
            * for (int i = inicio, cont = 0; cont < tamanho; i=(i+1)%fila.length, cont++) {
            *   System.out.println(fila[i);
            * }
            * */

            int quantosFalta = tamanho;
            for (int i = inicio; i < fila.length; i++) {
                System.out.print(fila[i]+ "\t-\t");
                quantosFalta = quantosFalta - 1;
            }
            if (fim <= inicio) {
                for (int i = 0; i < quantosFalta; i++) {
                    System.out.print(fila[i]+ "\t-\t");
                }
            }
            System.out.println();
        }
    }
}
