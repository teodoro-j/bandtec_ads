public class Carta {

    private String face; // A, 2, 3, ... Valete, Dama, Rei
    private Integer valor; // 1 a 13
    private String naipe; // Paus, Copas, Espadas, Ouros

    public Carta(String face, Integer valor, String naipe) {
        this.face = face;
        this.valor = valor;
        this.naipe = naipe;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        return "\n"+face + " de " + naipe + " (vale " + valor + ")";
    }
}
