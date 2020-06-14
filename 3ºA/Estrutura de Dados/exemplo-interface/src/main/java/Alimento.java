public class Alimento extends Produto {

    private int quantVitamina;

    public Alimento(int codigo, String descricao, double preco, int quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }

    public double getValorTributo() {
        return getPreco()*0.15;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "quantVitamina=" + quantVitamina +'\'' +
                ", tributo=" + getValorTributo()+
                "} " + super.toString();
    }
}
