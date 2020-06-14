import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TesteFilme {

    public static void gravaLista(ListaObj<Filme> lista) {
        FileWriter arq = null;
        Formatter saida = null;
        boolean deuRuim = false;
        String nomeArquivo = "filme.txt";

        try {
            arq = new FileWriter(nomeArquivo, true);
            saida = new Formatter(arq);
        } catch (IOException erro) {
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);
        }

        try {
            for (int i = 0; i < lista.getTamanho(); i++) {
                Filme f = lista.getElemento(i);

                saida.format("%d %s %.2f %s %d%n", f.getIdFilme(),
                        f.getNome(), f.getNota(), f.getGenero(), f.getIdade());

            }
        } catch (FormatterClosedException erro) {
            System.err.println("Erro ao gravar no arquivo");
            deuRuim = true;
        } finally {
            saida.close();
            try {
                arq.close();
            } catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void gravaFilmePorGenero(ListaObj<Filme> lista,String genero) {
        FileWriter arq = null;
        Formatter saida = null;
        boolean deuRuim = false;
        String nomeArquivo = "filmegenero.txt";

        try {
            arq = new FileWriter(nomeArquivo, false);
            saida = new Formatter(arq);
        } catch (IOException erro) {
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);
        }

        try {
            for (int i = 0; i < lista.getTamanho(); i++) {
                Filme f = lista.getElemento(i);
                if (f.getGenero().equalsIgnoreCase(genero)) {
                    saida.format("%d %s %.2f %s %d%n", f.getIdFilme(),
                            f.getNome(), f.getNota(), f.getGenero(), f.getIdade());
                }

            }
        } catch (FormatterClosedException erro) {
            System.err.println("Erro ao gravar no arquivo");
            deuRuim = true;
        } finally {
            saida.close();
            try {
                arq.close();
            } catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void leExibeArquivo(String nomeArquivo) {
        FileReader arq = null;
        Scanner entrada = null;
        boolean deuRuim = false;

        try {
            arq = new FileReader(nomeArquivo);
            entrada = new Scanner(arq);
        } catch (FileNotFoundException erro) {
            System.err.println("Arquivo não encontrado");
            System.exit(1);
        }

        try {
            System.out.printf("%-8s%-20s%-10s%-15s%-8s\n", "IDFILME", "NOME", "NOTA", "GENERO", "IDADE");

            while (entrada.hasNext()) {
                int id = entrada.nextInt();
                String nome = entrada.next();
                double nota = entrada.nextDouble();
                String genero = entrada.next();
                int idade = entrada.nextInt();
                System.out.printf("%-8d%-20s%-10.2f%-15s%-8d\n", id, nome, nota, genero, idade);
            }
        } catch (NoSuchElementException erro) {
            System.err.println("Arquivo com problemas.");
            deuRuim = true;
        } catch (IllegalStateException erro) {
            System.err.println("Erro na leitura do arquivo.");
            deuRuim = true;
        } finally {
            entrada.close();
            try {
                arq.close();
            } catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                deuRuim = true;
            }
            if (deuRuim) {
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {

        int id;
        String nome;
        double nota;
        String genero;
        int idade;
        boolean fim = false;
        ListaObj<Filme> lista = new ListaObj(10);
        Scanner leitor = new Scanner(System.in);

        while (!fim) {

            System.out.println("\nEscolha uma das opções:");
            System.out.println("1- Adicionar um filme");
            System.out.println("2- Exibir a lista");
            System.out.println("3- Gravar a lista em arquivo");
            System.out.println("4- Ler e exibir o arquivo gravado na opção 3");
            System.out.println("5- Gravar apenas filmes de um determinado gênero em arquivo");
            System.out.println("6- Ler e exibir o arquivo gravado na opção 4");
            System.out.println("7- Sair");
            int opcao = leitor.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o id do filme:");
                    id = leitor.nextInt();
                    System.out.println("Digite o nome do filme:");
                    nome = leitor.next();
                    System.out.println("Digite a nota atribuída pela crítica ao filme:");
                    nota = leitor.nextDouble();
                    System.out.println("Digite o gênero do filme:");
                    genero = leitor.next();
                    System.out.println("Digite a idade mínima para assistir o filme:");
                    idade = leitor.nextInt();

                    Filme filme = new Filme(id, nome, nota, genero, idade);
                    lista.adiciona(filme);
                    break;

                case 2:
                    if (lista.getTamanho() == 0) {
                        System.out.println("Lista está vazia");
                    } else {
                        lista.exibe();
                    }
                    break;

                case 3:
                    if (lista.getTamanho() == 0) {
                        System.out.println("Lista está vazia. Não há nada a gravar");
                    } else {
                        gravaLista(lista);
                        lista.limpa();
                    }
                    break;

                case 4:
                    leExibeArquivo("filme.txt");
                    break;

                case 5:
                    if (lista.getTamanho() == 0) {
                        System.out.println("Lista está vazia. Não há nada a gravar");
                    } else {
                        System.out.println("Digite um gênero:");
                        genero= leitor.next();
                        gravaFilmePorGenero(lista, genero);
                        lista.limpa();
                    }
                    break;

                case 6:
                    leExibeArquivo("filmegenero.txt");
                    break;

                case 7:
                    fim = true;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;




            }

        }
    }
}
