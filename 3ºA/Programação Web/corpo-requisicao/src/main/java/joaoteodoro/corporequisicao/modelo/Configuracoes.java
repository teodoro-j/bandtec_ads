package joaoteodoro.corporequisicao.modelo;

public class Configuracoes {

    private String idioma;
    private int conexao;
    private boolean contoleAdulto;

    public String getIdioma() { return idioma; }

    public void setIdioma(String idioma) { this.idioma = idioma; }

    public int getConexao() { return conexao; }

    public void setConexao(int conexao) { this.conexao = conexao; }

    public boolean isContoleAdulto() { return contoleAdulto; }

    public void setContoleAdulto(boolean contoleAdulto) { this.contoleAdulto = contoleAdulto; }
}
