package produtos;

import java.util.ArrayList;
import java.util.List;

public class Tributo {
    private List<Tributavel> tributos = new ArrayList<Tributavel>();

    public void adicionaTributavel(Tributavel tributo){
        this.tributos.add(tributo);
    }

    public double calculaTotalTributo(){
        System.out.println("Total dos tributos:");
        double total = 0.0;
        for(Tributavel t : tributos){
            total += t.getValorTributo();
        }
        return total;
    }

}
