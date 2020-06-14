public class TesteAluno {

    public static void main(String[] args) {

        AlunoFundamental alunoFundamental = new AlunoFundamental("Matheus", "123456",10.0,5.0,8.0,3.5);
        AlunoGraduacao alunoGraduacao= new AlunoGraduacao("Bianca","987654", 8.0,7.5);
        AlunoPos alunoPos= new AlunoPos("Pablo", "456789",8.0,9.0,6.5);
        AlunoPos alunoPos1 = new AlunoPos("Juarez", "9087",1.0,2.0,2.0);

        System.out.println(alunoFundamental);
        System.out.println(alunoGraduacao);
        System.out.println(alunoPos);
        System.out.println(alunoPos1);

        Cadastro cadastro= new Cadastro();
        cadastro.adicionaAluno(alunoFundamental);
        cadastro.adicionaAluno(alunoGraduacao);
        cadastro.adicionaAluno(alunoPos);
        cadastro.adicionaAluno(alunoPos1);

        cadastro.exibeTodos();
        cadastro.exibeAlunosGraduacao();
        cadastro.exibirAprovados();
        cadastro.buscaAluno("9087");
    }
}
