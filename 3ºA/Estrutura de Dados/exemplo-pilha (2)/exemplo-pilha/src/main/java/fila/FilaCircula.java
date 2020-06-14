package fila;

public class FilaCircula {
    private int tamanho;
    private String[] fila;
    private int inicio;
    private int fim;

    public FilaCircula(int capacidade) {
        fila = new String[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = 0;
    }
    public boolean isEmpty() {
        if(tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if(tamanho == fila.length){
            return true;
        } else {
            return false;
        }
    }

    public void insert(String info){
        if(!isFull()){
            fila[fim] = info;
            fim++;
            fim = fim % fila.length;
            tamanho++;
        } else{
            System.out.println("Fila cheia");
        }
    }

    public String peek() {
        return fila[inicio];
    }

    public String poll(){
        String primeiro = peek();

        if(!isEmpty()){
            fila[inicio] = null;
            inicio++;
            inicio = inicio % fila.length;
            tamanho--;
        }
        return primeiro;
    }

    public void exibe() {
        if(isEmpty()) {
            System.out.println("Pilha vazia");
        }
        else {
            for(int i = inicio, cont  = 0; cont < tamanho; i = (i+1) % fila.length, cont++) {
                System.out.println(fila[i]);
            }
        }

    }
}
