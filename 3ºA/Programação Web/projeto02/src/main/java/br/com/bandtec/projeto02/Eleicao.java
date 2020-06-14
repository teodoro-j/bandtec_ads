package br.com.bandtec.projeto02;

public class Eleicao {

    private Integer votosCandidato1=0;
    private Integer votosCandidato2=0;
    private Integer votosInvalidos=0;

    public Eleicao(Integer votosCandidato1, Integer votosCandidato2, Integer votosInvalidos) {
        this.votosCandidato1 = votosCandidato1;
        this.votosCandidato2 = votosCandidato2;
        this.votosInvalidos = votosInvalidos;
    }

    public Integer getVotosCandidato1() {
        return votosCandidato1;
    }

    public Integer getVotosCandidato2() {
        return votosCandidato2;
    }

    public Integer getVotosInvalidos() {
        return votosInvalidos;
    }

    public Integer getTotalVotos() {
        return votosCandidato1+votosCandidato2+votosInvalidos;
    }

    public void adicionarVotosCandidato1() {
        votosCandidato1++;
    }

    public void adicionarVotosCandidato2() {
        votosCandidato2++;

    }

    public void adicionarVotoInvalido() {
        votosInvalidos++;
    }

}
