public class Servico implements Vendavel{

    private String descricao;
    private Integer codigo;
    private Integer qtdHoras;
    private Double valorHora;

    public Servico(String descricao, Integer codigo, Integer qtdHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public Double getValorVenda() {
        return qtdHoras * valorHora;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", codigo=" + codigo +
                ", qtdHoras=" + qtdHoras +
                ", valorHora=" + valorHora +
                ", Valor Venda=" + getValorVenda() +
                '}';
    }
}
