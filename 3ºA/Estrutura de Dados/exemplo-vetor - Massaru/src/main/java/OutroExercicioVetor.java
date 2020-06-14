import java.util.Scanner;

public class OutroExercicioVetor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] aluninhos = new String[10];
        String[] turma = new String[10];
        String[] turma1 = new String[10];
        String[] turma2 = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("nome aluno: ");
            aluninhos[i] = scan.next();
            System.out.println("turma: ");
            turma[i] = scan.next();
        }

        Integer countTurma1 = 0;
        Integer countTurma2 = 0;

        for (int i = 0; i < 10; i++) {
            if(turma[i].equals("T1")){
                turma1[countTurma1] = aluninhos[i];
                countTurma1++;
            } else {
                turma2[countTurma2] = aluninhos[i];
                countTurma2++;
            }
        }

        System.out.println("Turma 1");
        for (String tur: turma1) {
            System.out.println(tur);
        }

        System.out.println("Turma 2");
        for (String tur: turma2) {
            System.out.println(tur);
        }
    }
}
