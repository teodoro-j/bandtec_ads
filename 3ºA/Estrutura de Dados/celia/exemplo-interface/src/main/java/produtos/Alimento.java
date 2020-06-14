package produtos;

public class Alimento extends Produto {

    private int qtdVitaminas;

    public Alimento(int codigo, String descricao, double preco, int qtdVitaminas) {
        super(codigo, descricao, preco);
        this.qtdVitaminas = qtdVitaminas;
    }

    public double getValorTributo() {
        return getPreco() * 0.15;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "qtdVitaminas=" + qtdVitaminas +
                ", tributo=" + getValorTributo() +
                "} " + super.toString();
    }
}
