import java.util.Scanner;

public class ExMatrizExtraPlus {

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
        double[][] notas = new double[maxAluno][3];
        double[] media = new double[3];
        // double[] mediaAluno = new souble[maxAluno;]

        for (int i = 0; i < aluno.length; i++) {
            System.out.println("Digite o nome de um Aluno");
            aluno[i] = leitor.next();
        }

        double soma1 = 0;
        double soma2 = 0;
        double soma3 = 0;

        for (int mva = 0; mva < aluno.length; mva++) {
            System.out.println("Digite a nota da AC1");
            notas[mva][0] = leitor.nextInt();
            soma1 += notas[mva][0];

            System.out.println("Digite a nota da AC2");
            notas[mva][1] = leitor.nextInt();
            soma2 += notas[mva][1];

            notas[mva][2] += (notas[mva][0] + notas[mva][1])/2;
            soma3 += notas[mva][2];
            // novo vetor com a soma
            // mediaAluno[mva][2] += (notas[mva][0] + notas[mva][1])/2;
            // soma3 += mediaAluno[mva][2];
        }

        media[0] = soma1 / maxAluno;
        media[1] = soma2 / maxAluno;
        media[2] = soma3 / maxAluno;


        System.out.printf("%-14s %9s %9s %9s", "NOME DO ALUNO", "NOTA AC1", "NOTA AC2", "MÉDIA GERAL");

        for(int linha = 0; linha < notas.length; linha++){
            System.out.printf("\n%-13s %9.2f %9.2f %9.2f", aluno[linha], notas[linha][0], notas[linha][1], notas[linha][2]);
        }

        System.out.printf("\n\n%-13s %9.2f %9.2f %9.2f", "MÉDIA", media[0], media[1], media[2]);



    }
}

