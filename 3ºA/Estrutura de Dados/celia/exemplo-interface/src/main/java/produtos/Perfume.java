package produtos;

public class Perfume extends Produto {
    private String fragancia;

    public Perfume(int codigo, String descricao, double preco, String fragancia) {
        super(codigo, descricao, preco);
        this.fragancia = fragancia;
    }

    public double getValorTributo() {
        return getPreco() * 0.27;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "fragancia='" + fragancia + '\'' +
                ", tributo=" + getValorTributo() +
                "} " + super.toString();
    }
}
