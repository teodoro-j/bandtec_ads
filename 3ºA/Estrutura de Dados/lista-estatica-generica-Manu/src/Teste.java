
public class Teste {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		ListaObj<String> lista = new ListaObj<String>(4);

		lista.adicionaLista("Emanuelle");
		lista.adicionaLista("Adriana");
		lista.adicionaLista("Victor");
		lista.adicionaLista("Pietro");
		// lista.adicionaLista("Bianca");
		// lista.exibeLista();

		//lista.buscaLista("Victor");

		// lista.removePeloIndice(2);
		//lista.removePeloElemento("Victor");
		//lista.exibeLista();
		
		System.out.println(lista.getTamanho());
		System.out.println("Elemento correpondente ao índice: "+lista.getElem(0));
		lista.limpaLista();
		lista.exibeLista();

	}
}
