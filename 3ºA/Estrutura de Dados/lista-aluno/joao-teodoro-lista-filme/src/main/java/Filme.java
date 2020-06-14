public class Filme {
    private int idFilme;
    private String nome;
    private double nota;
    private String genero;
    private int idade;

    public Filme(int idFulme, String nome, double nota, String genero, int idade) {
        this.idFilme = idFulme;
        this.nome = nome;
        this.nota = nota;
        this.genero = genero;
        this.idade = idade;
    }

    public Integer getIdFilme() { return idFilme; }

    public void setIdFilme(Integer idFulme) { this.idFilme = idFilme; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public double getNota() { return nota; }

    public void setNota(double nota) { this.nota = nota; }

    public String getGenero() { return genero; }

    public void setGenero(String genero) { this.genero = genero; }

    public int getIdade() { return idade; }

    public void setIdade(int idade) { this.idade = idade; }

    @Override
    public String toString() {
        return "Filme{" +
                "idFulme=" + idFilme +
                ", nome='" + nome + '\'' +
                ", nota=" + nota +
                ", genero='" + genero + '\'' +
                ", idade=" + idade +
                '}';
    }
}
