import java.util.ArrayList;

public class ControleBonus {

    private ArrayList<Bonificavel> listaBoni;

    public ControleBonus() {
        listaBoni = new ArrayList<Bonificavel>();
    }

    public void adicionaBonificavel(Bonificavel b) {
        listaBoni.add(b);
    }

    public double calculaTotalGasto() {
        double total=0;
        for (Bonificavel b: listaBoni) {
            total += b.getValorBonus();
        }
        return total;
    }

    public void exibeFuncionariosComBonus() {
        for (Bonificavel b : listaBoni) {
            System.out.println(b);
        }
    }


}
