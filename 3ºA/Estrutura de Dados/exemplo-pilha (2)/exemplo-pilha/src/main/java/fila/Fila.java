package fila;

public class Fila {
    private Integer tamanho;
    private String[] fila;

    public Fila(int capacidade) {
        tamanho= 0;
        fila = new String[capacidade];
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
            fila[tamanho] = info;
            tamanho++;
        }
    }

    public String peek() {
            return fila[0];
    }

    public String poll(){

        if(isEmpty()){
            System.out.println("A fila esta vazia");
        }

        String primeiro = this.peek();
        for(int i = 0; i < this.tamanho - 1; i++){
            this.fila[i] = this.fila[i + 1];
        }
        this.tamanho--;
        return primeiro;
    }

    public void exibe() {
        if(isEmpty()) {
            System.out.println("Pilha vazia");
        }
        else {
            for(int i = 0; i <= tamanho; i++) {
                System.out.println(fila[i]);
            }
        }

    }
}
