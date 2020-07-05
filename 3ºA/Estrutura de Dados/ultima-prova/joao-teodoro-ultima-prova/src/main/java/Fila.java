import java.util.Arrays;

public class Fila {
    private Integer tamanho;
    private String[] chamados;

    public Fila(int capacidade) {
        tamanho= 0;
        chamados = new String[capacidade];
    }

    @Override
    public String toString() {
        return "Fila{" +
                "tamanho=" + tamanho +
                ", chamados=" + Arrays.toString(chamados) +
                '}';
    }

    public Integer getTamanho() { return tamanho; }

    public void setTamanho(Integer tamanho) { this.tamanho = tamanho; }

    public String[] getChamados() { return chamados; }

    public void setChamados(String[] chamados) { this.chamados = chamados; }
}
