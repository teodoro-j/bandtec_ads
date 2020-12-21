public class Continente {
    private String nome;
    private int populacao;

    private boolean jaTeveGuerra = true;

    public boolean isJaTeveGuerra() {
        return jaTeveGuerra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
}
