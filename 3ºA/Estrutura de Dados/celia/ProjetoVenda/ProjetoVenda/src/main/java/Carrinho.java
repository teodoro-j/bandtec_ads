import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    List<Vendavel> list = new ArrayList<Vendavel>();

    public Carrinho(List<Vendavel> list) {
        this.list = list;
    }

    public void adicionaVendavel(Vendavel v){
        list.add(v);
    }

    public Double calculaTotalTributo(){
        Double total = 0.0;

        for (Vendavel v : list) {
            total += v.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho(){
        System.out.println(list.toString());
    }

}
