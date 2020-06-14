public class ArvoreBin {
    public Node raiz;

    public ArvoreBin() {
        this.raiz = null;
    }

    public Node getRaiz() {
        return this.raiz;
    }

    public void criaRaiz(Node raiz) {
        this.raiz = raiz;
    }

    public Node insereDir(Node pai, String conteudo) {
        if (raiz != null && pai.getDir() != null) {
            Node direito = new Node(conteudo);
            pai.setDir(direito);
            return direito;
        }
        return null;
    }

    public Node insereEsq(Node pai, String conteudo) {
        if (raiz != null && pai.getEsq() != null) {
            Node esquerdo = new Node(conteudo);
            pai.setEsq(esquerdo);
            return esquerdo;
        }
        return null;
    }
}
