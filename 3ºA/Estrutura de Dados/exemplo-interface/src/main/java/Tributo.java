import java.util.ArrayList;

public class Tributo {

    private ArrayList<Tributavel> listaTrib;

    public Tributo() {
        listaTrib = new ArrayList<Tributavel>();
    }

    public void adicionaTributavel(Tributavel t) {
        listaTrib.add(t);
    }

    public double calculaTotalTributo() {
        double total=0;
        for (Tributavel t: listaTrib) {
            total += t.getValorTributo();
        }
        return total;
    }
}
