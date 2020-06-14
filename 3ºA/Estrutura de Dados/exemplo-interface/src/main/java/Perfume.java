public class Perfume extends Produto {

    private String fragrancia;

    public Perfume(int codigo, String descricao, double preco, String fragrancia) {
        super(codigo, descricao, preco);
        this.fragrancia = fragrancia;
    }

    public double getValorTributo() {
        return getPreco()*0.27;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "fragrancia='" + fragrancia + '\'' +
                ", tributo=" + getValorTributo()+
                "} " + super.toString();
    }
}
