public class Vendedor extends Funcionario {
    //Atributos
    private double vendas;
    private double taxa;

    //Construtor
    public Vendedor(String nome, String cpf, double vendas, double taxa) {
        super(nome, cpf);
        this.vendas = vendas;
        this.taxa = taxa;
    }


    //Métodos
    public double calcSalario() {
        return vendas * taxa;
    }

    //Método toString
    @Override
    public String toString() {
        return "Vendedor{" +
                "vendas=" + String.format("R$ %.2f",vendas) +
                ", taxa=" + String.format("%.2f",taxa) +
                ", salario=" + String.format("R$ %.2f",calcSalario()) +
                "} " + super.toString();
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
