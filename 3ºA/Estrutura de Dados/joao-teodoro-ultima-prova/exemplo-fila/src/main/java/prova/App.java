package prova;

public class App {

    public static void main(String[] args) {

        FilaObj<Fila> chamadosOracle = new FilaObj(4);
        FilaObj<Fila> chamadosMsaf = new FilaObj(4);
        FilaObj<Fila> chamadosDfe = new FilaObj(3);
        FilaObj<Fila> chamadosSap = new FilaObj(5);

        chamadosOracle.insert("Chamado_12378");
        chamadosOracle.insert("Chamado_12379");
        chamadosOracle.insert("Chamado_12380");
        chamadosOracle.insert("Chamado_12381");

        chamadosMsaf.insert("Chamado_345");
        chamadosMsaf.insert("Chamado_346");
        chamadosMsaf.insert("Chamado_347");
        chamadosMsaf.insert("Chamado_348");

        chamadosDfe.insert("Chamado_676");
        chamadosDfe.insert("Chamado_677");
        chamadosDfe.insert("Chamado_678");

        chamadosSap.insert("Chamado_890");
        chamadosSap.insert("Chamado_891");
        chamadosSap.insert("Chamado_892");
        chamadosSap.insert("Chamado_893");
        chamadosSap.insert("Chamado_894");
        chamadosSap.insert("Chamado_895");


        System.out.println("Chamados Oracle");
        chamadosOracle.exibeFila();
        System.out.println();

        System.out.println("Chamados MasterSaf");
        chamadosMsaf.exibeFila();
        System.out.println();

        System.out.println("Chamados DFE");
        chamadosDfe.exibeFila();
        System.out.println();

        System.out.println("Chamados SAP");
        chamadosSap.exibeFila();
        System.out.println();


        System.out.println("Chamado removido: " + chamadosOracle.poll() + "\n");

        System.out.println("Chamdo removido: " + chamadosMsaf.poll() + "\n");

        System.out.println("Chamado removido: " + chamadosDfe.poll() + "\n");

        System.out.println("Chamado removido: " + chamadosSap.poll() + "\n");


        System.out.println("Chamados Oracle");
        chamadosOracle.exibeFila();
        System.out.println();

        System.out.println("Chamados MasterSaf");
        chamadosMsaf.exibeFila();
        System.out.println();

        System.out.println("Chamados DFE");
        chamadosDfe.exibeFila();
        System.out.println();

        System.out.println("Chamados SAP");
        chamadosSap.exibeFila();
        System.out.println();


        while (!chamadosOracle.isEmpty()) {
            System.out.println("Chamado removido: " + chamadosOracle.poll());
        }

        while (!chamadosMsaf.isEmpty()) {
            System.out.println("Chamado removido: " + chamadosMsaf.poll());
        }

        while (!chamadosDfe.isEmpty()) {
            System.out.println("Chamado removido: " + chamadosDfe.poll());
        }

        while (!chamadosSap.isEmpty()) {
            System.out.println("Chamado removido: " + chamadosSap.poll());
        }
    }
}
