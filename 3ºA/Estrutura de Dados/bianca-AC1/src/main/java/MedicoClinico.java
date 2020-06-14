public class MedicoClinico extends Medico {

    private int qtdConsulta;
    private double valorConsulta;

    public MedicoClinico(int crm, String nome, int qtdConsulta, double valorConsulta) {
        super(crm, nome);
        this.qtdConsulta = qtdConsulta;
        this.valorConsulta = valorConsulta;
    }


    public double getValorBonus() {
        return 0.1*(qtdConsulta*valorConsulta);
    }

    public int getQtdConsulta() {
        return qtdConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    @Override
    public String toString() {
        return "MedicoClinico{" +
                "qtdConsulta=" + qtdConsulta +
                ", valorConsulta=" + valorConsulta +
                ", bonus=" + getValorBonus() +
                "} " + super.toString();
    }
}
