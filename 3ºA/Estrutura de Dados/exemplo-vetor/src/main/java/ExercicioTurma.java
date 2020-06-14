import java.util.Scanner;

public class ExercicioTurma {

    //Vetor sem buracos (1 índice para cada vetor)

    public static void main(String[] args) {

        String nome;
        String turma;
        String[] t1= new String[10];
        String[] t2= new String[10];
        int qtdAlunosT1=0;
        int qtdAlunosT2=0;


        Scanner leitor = new Scanner(System.in);

        for(int i=0; i< 10; i++) {

            System.out.println("Qual o nome do aluno?");
            nome= leitor.next();

            System.out.println("Ele pertence a turma t1 ou t2?");
            turma = leitor.next();
            if(turma.equals("t1") ) {
                t1[qtdAlunosT1]=nome;
                qtdAlunosT1++;
            }
            if(turma.equals("t2")) {
                t2[qtdAlunosT2]=nome;
                qtdAlunosT2++;
            }

        }

        System.out.println("A quantidade de alunos da t1 é " + qtdAlunosT1 + " e os alunos são: ");
        for (int i = 0; i < qtdAlunosT1; i++) {
            System.out.print(t1[i] + "\t");
        }
        System.out.println();

        System.out.println("A quantidade de alunos da t2 é " + qtdAlunosT2 + " e os alunos são: ");
        for (int i = 0; i < qtdAlunosT2; i++) {
            System.out.print(t2[i] + "\t");
        }
        System.out.println();

    }
}
