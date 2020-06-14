import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestaCarrinho {

    public static void main(String[] args) {

        boolean fim = false;
        int codigo, opcao;
        double precoCusto;
        String nome,autor,isbn;
        String gravadora;
        String descricao;
        int quantHoras;
        double valorHora;

        Scanner leitor= new Scanner(System.in);
        Scanner leitorS = new Scanner(System.in);

        Carrinho carrinho= new Carrinho();

        while (!fim) {

            System.out.println("Escolha uma das opções:");
            System.out.println("1: Adicionar livro");
            System.out.println("2: Adicionar DVD");
            System.out.println("3: Adicionar Servico");
            System.out.println("4: Exibir itens do carrinho");
            System.out.println("5: Exibir total de venda");
            System.out.println("6: Fim");
            opcao= leitor.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Digite o código do livro:");
                    codigo =leitor.nextInt();
                    System.out.println("Digite o preço do custo do livro:");
                    precoCusto =leitor.nextDouble();
                    System.out.println("Digite o nome do livro:");
                    nome= leitorS.nextLine();
                    System.out.println("Digite o nome do autor do livro");
                    autor= leitorS.nextLine();
                    System.out.println("Digite o isbn do livro");
                    isbn = leitor.next();
                    Livro livro= new Livro(codigo,precoCusto,nome,autor,isbn);
                    carrinho.adicionaVendavel(livro);
                    break;
                case 2:
                    System.out.println("Digite o código do DVD:");
                    codigo =leitor.nextInt();
                    System.out.println("Digite o preço do custo do DVD:");
                    precoCusto =leitor.nextDouble();
                    System.out.println("Digite o nome do DVD:");
                    nome= leitorS.nextLine();
                    System.out.println("Digite o nome do autor do DVD");
                    autor= leitorS.nextLine();
                    System.out.println("Digite a gravadora do DVD");
                    gravadora= leitor.next();
                    DVD dvd= new DVD(codigo,precoCusto,nome,gravadora);
                    carrinho.adicionaVendavel(dvd);
                    break;
                case 3:
                    System.out.println("Digite o código do serviço:");
                    codigo =leitor.nextInt();
                    System.out.println("Digite a descrição do serviço:");
                    descricao =leitorS.nextLine();
                    System.out.println("Digite a quantidade de horas do serviço:");
                    quantHoras= leitor.nextInt();
                    System.out.println("Digite o valor da hora do serviço");
                    valorHora= leitor.nextDouble();
                    Servico servico= new Servico(descricao,codigo,quantHoras,valorHora);
                    carrinho.adicionaVendavel(servico);
                    break;
                case 4:
                    carrinho.exibeItensCarrinho();
                    break;
                case 5:
                    System.out.println("Valor total da venda: "+ carrinho.calculaTotalVenda());
                    break;
                case 6:
                    fim=true;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;

            }


        }



    }

    }

