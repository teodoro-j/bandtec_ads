public class Acionista implements Bonificavel {

    private String nome;
    private int quantAcoes;
    private double precoAcao;

    public Acionista(String nome, int quantAcoes, double precoAcao) {
        this.nome = nome;
        this.quantAcoes = quantAcoes;
        this.precoAcao = precoAcao;
    }


    public double getValorBonus() {
        return 0.25*(quantAcoes*precoAcao);
    }

    public String getNome() {
        return nome;
    }

    public int getQuantAcoes() {
        return quantAcoes;
    }

    public double getPrecoAcao() {
        return precoAcao;
    }

    @Override
    public String toString() {
        return "Acionista{" +
                "nome='" + nome + '\'' +
                ", quantAcoes=" + quantAcoes +
                ", precoAcao=" + precoAcao +
                ", bonus=" + getValorBonus() +
                '}';
    }
}
