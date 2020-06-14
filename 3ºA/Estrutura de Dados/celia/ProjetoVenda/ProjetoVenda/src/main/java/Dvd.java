public class Dvd extends Produto {

    private String nome;
    private String gravadora;

    public Dvd(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    public Double getValorVenda() {
        return precoCusto*=0.20;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                ", Valor Venda='" + getValorVenda() + '\'' +
                '}';
    }
}
