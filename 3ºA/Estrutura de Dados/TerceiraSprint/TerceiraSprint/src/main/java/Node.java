public class Node {
    public String conteudo;
    public Node esq;
    public Node dir;

    public Node(String conteudo) {
        this.conteudo = conteudo;
        this.esq = null;
        this.dir = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Node getEsq() {
        return esq;
    }

    public void setEsq(Node esq) {
        this.esq = esq;
    }

    public Node getDir() {
        return dir;
    }

    public void setDir(Node dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Node{" +
                "conteudo='" + conteudo + '\'' +
                ", esq=" + esq +
                ", dir=" + dir +
                '}';
    }
}
