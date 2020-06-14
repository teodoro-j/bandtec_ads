import java.util.ArrayList;

public class Cadastro {

private ArrayList<Aluno> lista;

    public Cadastro() {

        lista= new ArrayList<Aluno>();
    }

    public void adicionaAluno(Aluno a) {
        lista.add(a);
    }

    public void exibeTodos() {
        System.out.println("\nExibindo todos os alunos");
        for (Aluno a : lista) {
            System.out.println(a);
        }
    }

    public void exibeAlunosGraduacao() {
        System.out.println("\nExibindo todos os alunos de Graduação");
        for (Aluno a : lista) {
            if(a instanceof AlunoGraduacao)
            System.out.println(a);
        }
    }

    public void exibirAprovados() {
        System.out.println("\nExibindo todos os alunos aprovados");
        for (Aluno a : lista) {
            if(a.calculaMedia()>=5.0) {
                System.out.println(a);
            }

        }
    }

    public Aluno buscaAluno(String ra) {
        System.out.println("\nBuscando alunos pelo ra");
        for (Aluno a : lista) {
            if (ra.equals(a.getRa())) {
                System.out.println(a);
            }
        }

        return null;


    }
}
