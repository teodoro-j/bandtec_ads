import java.util.Scanner;

public class ExercicioVetorTurma {

    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        String[] turma1 = new String[10];  // Cria vetor para armazenar alunos da T1
        String[] turma2 = new String[10];  // Cria vetor para armazenar alunos da T2
        int ind1=0, ind2=0;     // índices do vetor turma1 e turma2, respectivamente
                                // ind1 representa a posição do vetor turma1 onde será armazenado o prox aluno
                                //      e tb a quantidade de alunos inseridos no vetor turma1
                                // ind2 representa a posição do vetor turma2 onde será armazenado o prox aluno
                                //      e tb a quantidade de alunos inseridos no vetor turma2

        String aluno, turma;    // Variáveis para ler o nome do aluno e o nome da turma

        // Loop que será executado 10 vezes, para ler os nomes de 10 alunos e as suas turmas
        for (int i=0; i < 10; i++) {
            System.out.println("Digite o nome do aluno");
            aluno= leitor.next();
            System.out.println("Digite a turma: T1 ou T2");
            turma= leitor.next();

            // Turma do aluno é "T1"?
            if (turma.equals("T1")) {
                turma1[ind1++] = aluno;    // Sim, então atribui o nome do aluno para o vetor
                                           // turma1, na posição ind1 e já incrementa o ind1
            }
            else {
                turma2[ind2++] = aluno;    // Não, então atribui o nome do aluno para o vetor
                                           // turma2, na posição ind2 e já incrementa o11 ind2
            }
        }

        // Exibe as quantidades de alunos de cada turma
        System.out.println("Quantidade de alunos da T1: " +
                           ind1);
        System.out.println("Quantidade de alunos da T2: " +
                ind2);

        if (ind1 == 0) {
            System.out.println("Não há alunos na turma T1");
        }
        else {
            // Exibe alunos da turma T1
            System.out.println("Alunos da T1:");
            for (int i = 0; i < ind1; i++) {       // percorre vetor enquanto i < ind1
                System.out.println(turma1[i]);
            }
        }

        if (ind2 == 0) {
            System.out.println("Não há alunos na turma T2");
        }
        else {
            // Exibe alunos da turma T2
            System.out.println("Alunos da T2:");
            for (int i = 0; i < ind2; i++) {        // percorre vetor enquanto i < ind2
                System.out.println(turma2[i]);
            }
        }

    }
}
