public class Aluno {
    private Integer ra;
    private String nome;
    private double nota;


    opublic Alun0(Integer ra, String nome, double nota) {
        this.ra = ra;
        this.nome = nome;
        this.nota = nota;
    }

    public Integer getRa() { return ra; }

    public void setRa(Integer ra) { this.ra = ra; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public double getNota() { return nota; }

    public void setNota(double nota) { this.nota = nota; }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
