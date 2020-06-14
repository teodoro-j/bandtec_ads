import java.util.Scanner;

public class ExMatrizExtra {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor entre 5 e 15");
        int maxAluno = leitor.nextInt();

        while (maxAluno < 5 || maxAluno > 15) {
            try {
                if (maxAluno < 5 || maxAluno > 15)
                    throw new Exception("Digite um valor válido (entre 5 e 15)");
            } catch (Exception erro) {
                System.out.println(erro);
                System.out.println("Digite um valor válido (entre 5 e 15)");
                maxAluno = leitor.nextInt();
            }
        }

        String[] aluno = new String[maxAluno];
        double[][] notas = new double[maxAluno][2];
        double[] media = new double[2];

        for (int i = 0; i < aluno.length; i++) {
            System.out.println("Digite o nome de um Aluno");
            aluno[i] = leitor.next();
        }

        double soma1 = 0 ;
        double soma2 = 0 ;

        for (int mva = 0; mva < aluno.length; mva++) {
            System.out.println("Digite a nota da AC1");
            notas[mva][0] = leitor.nextInt();
            soma1 += notas[mva][0];

            System.out.println("Digite a nota da AC2");
            notas[mva][1] = leitor.nextInt();
            soma2 += notas[mva][1];
        }

        double c1Media = soma1 / maxAluno;
        double c2Media = soma2 / maxAluno;

        media[0] = c1Media;
        media[1] = c2Media;


        System.out.printf("%-14s %9s %9s", "NOME DO ALUNO", "NOTA AC1", "NOTA AC2");

        for(int linha = 0; linha < notas.length; linha++){
            System.out.printf("\n%-13s %9.2f %9.2f", aluno[linha], notas[linha][0], notas[linha][1]);
        }

        System.out.printf("\n\n%-13s %9.2f %9.2f", "MÉDIA", media[0], media[1]);


    }
}

