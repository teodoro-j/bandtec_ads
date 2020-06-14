import java.util.ArrayList;

public class Carrinho {

    ArrayList<Vendavel> cart;

    public Carrinho() {
        cart = new ArrayList<Vendavel>();
    }

    public void adicionaVendavel(Vendavel v) {
        cart.add(v);
    }

    public double calculaTotalVenda() {
        double total=0;
        for (Vendavel vendavel: cart) {
            total+=vendavel.getValorVenda();
        }

        return total;

    }

    public void exibeItensCarrinho() {
        for (Vendavel vendavel: cart) {
            System.out.println(vendavel);
      }

    }
}
