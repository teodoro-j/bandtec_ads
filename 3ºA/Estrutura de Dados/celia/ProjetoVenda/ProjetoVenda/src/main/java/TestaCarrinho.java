import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaCarrinho {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Vendavel> lista = new ArrayList<Vendavel>();

        Carrinho carrinho = new Carrinho(lista);

        while (true) {
            System.out.println("Escolha uma das opções \n" +
                    "1. Adicionar Livro \n" +
                    "2. Adicionar DVD \n" +
                    "3. Adicionar Servico \n" +
                    "4. Exibir Itens do carrinho \n" +
                    "5. Exibir total de venda \n" +
                    "6. Sair");
            Integer valor = scanner.nextInt();

            Integer codigo;
            Double precoCusto;
            String nome;
            switch (valor){
                case 1:
                    System.out.println("Por favor, adicione as informações respectivamente: \n" +
                            "Código, Preço, Nome, Autor, ISBN");

                    codigo = scanner.nextInt();
                    precoCusto = scanner.nextDouble();
                    nome = scanner.next();
                    String autor = scanner.next();
                    String isbn = scanner.next();

                    Vendavel l = new Livro(codigo, precoCusto, nome, autor, isbn);
                    carrinho.adicionaVendavel(l);
                    break;
                case 2:
                    System.out.println("Por favor, adicione as informações respectivamente: \n" +
                            "Código, Preço, Nome, Gravadora");

                    codigo = scanner.nextInt();
                    precoCusto = scanner.nextDouble();
                    nome = scanner.next();
                    String gravadora = scanner.next();

                    Dvd d = new Dvd(codigo, precoCusto, nome, gravadora);
                    carrinho.adicionaVendavel(d);
                    break;
                case 3:
                    System.out.println("Por favor, adicione as informações respectivamente: \n" +
                            "Descrição, código, Horas, Valor da Hora");

                    String descricao = scanner.next();
                    codigo = scanner.nextInt();
                    Integer qtdHoras = scanner.nextInt();
                    Double valorHora = scanner.nextDouble();

                    Servico s = new Servico(descricao, codigo, qtdHoras, valorHora);
                    carrinho.adicionaVendavel(s);
                    break;
                case 4:
                    carrinho.exibeItensCarrinho();
                    break;
                case 5:
                    System.out.println(carrinho.calculaTotalTributo());
                    break;
                case 6:
                    return;
            }
        }

    }
}
