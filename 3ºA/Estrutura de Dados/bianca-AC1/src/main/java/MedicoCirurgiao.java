public class MedicoCirurgiao extends Medico {

    private int qtdCirurgia;
    private double valorCirurgia;
    private double valorAplicacaoAnestesia;

    public MedicoCirurgiao(int crm, String nome, int qtdCirurgia, double valorCirurgia, double valorAplicacaoAnestesia) {
        super(crm, nome);
        this.qtdCirurgia = qtdCirurgia;
        this.valorCirurgia = valorCirurgia;
        this.valorAplicacaoAnestesia = valorAplicacaoAnestesia;
    }


    public double getValorBonus() {
        return 0.15*(qtdCirurgia*(valorCirurgia+valorAplicacaoAnestesia));
    }

    public int getQtdCirurgia() {
        return qtdCirurgia;
    }

    public double getValorCirurgia() {
        return valorCirurgia;
    }

    public double getValorAplicacaoAnestesia() {
        return valorAplicacaoAnestesia;
    }

    @Override
    public String toString() {
        return "MedicoCirurgiao{" +
                "qtdCirurgia=" + qtdCirurgia +
                ", valorCirurgia=" + valorCirurgia +
                ", valorAplicacaoAnestesia=" + valorAplicacaoAnestesia +
                ", bonus=" + getValorBonus() +
                "} " + super.toString();
    }
}
