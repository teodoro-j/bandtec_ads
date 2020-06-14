public class Teste {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        ListaObj<String> lista = new ListaObj<String>(5);

        lista.adiciona("Joao");
        lista.adiciona("Bianca");
        lista.adiciona("Mingardi");
        lista.adiciona("Gustavo");
        lista.adiciona("Celia");

        System.out.println(lista.getTamanho());
        System.out.println("Elemento correpondente ao índice: "+lista.getElem(0));
        lista.limpaLista();
        lista.exibe();

    }

}
