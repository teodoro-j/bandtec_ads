public class Horista extends Funcionario {
    //Atributos
    private int qtdHora;
    private double valorHora;

    public Horista(String nome, String cpf, int qtdHora, double valorHora) {
        super(nome, cpf);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    //Métodos

    @Override
    public double calcSalario() {
        return qtdHora*valorHora;
    }

    @Override
    public String toString() {
        return "Horista{" +
                "qtdHora=" + qtdHora +
                ", valorHora=" + String.format("R$ %.2f",valorHora) +
                ", salario=" + String.format("R$ %.2f",calcSalario()) +
                "} " + super.toString();
    }

    public int getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(int qtdHora) {
        this.qtdHora = qtdHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}




