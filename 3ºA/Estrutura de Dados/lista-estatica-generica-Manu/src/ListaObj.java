
public class ListaObj<T> {

	private T[] vetor;
	int nroElem;

	public ListaObj(int tam) {

		vetor = (T[]) new Object[tam];
		this.nroElem = 0;
	}

	public void adicionaLista(T valor) {
		if (nroElem >= vetor.length) {
			System.out.println("A lista está cheia");
		} else {
			vetor[nroElem++] = valor;
			System.out.println("Elemento adicionado!");
		}

	}

	public void exibeLista() {
		System.out.println("Exibindo elementos do vetor...");
		for (int i = 0; i < nroElem; i++) {
			System.out.println("Elemento de índice " + i + ": " + vetor[i]);
		}
	}

	public int buscaLista(T elemento) {

		int resposta = -1;
		for (int i = 0; i < nroElem; i++) {
			if (vetor[i].equals(elemento)) {
				resposta = i;
				System.out.println("O índice do elemento é: " + resposta);
				break;
			}
		}

		return resposta;
	}

	public boolean removePeloIndice(int indice) {

		boolean resposta = false;
		if (indice < 0 || indice >= nroElem) {

			return false;
		} else {
			for (int i = indice; i < nroElem - 1; i++) {

				if (indice + 1 != nroElem) {
					vetor[i] = vetor[i + 1];
				}
				this.nroElem--;
			}
			return true;
		}
	}

	public boolean removePeloElemento(T elemento) {
		return removePeloIndice(buscaLista(elemento));
	}

	public int getTamanho() {
		return nroElem;
	}

	public T getElem(int indice) {
		if (indice < 0 || indice >= nroElem) {
			return null;
		} else {
			return vetor[indice];
		}
	}

	public void limpaLista() {
		nroElem = 0;
	}

}
