public class Teste {

    public static void main(String[] args) {

        MedicoCirurgiao medicoCirurgiao= new MedicoCirurgiao(12345,"Marcos",10,3000.00,100.00);
        MedicoClinico medicoClinico= new MedicoClinico(56789,"Bruno",5,2000.00);
        Acionista acionista= new Acionista("Pamela",100,10.00);

        System.out.println("Bônus do médico cirurgião: " + medicoCirurgiao.getValorBonus());

        System.out.println("Bônus do médico clínico: " + medicoClinico.getValorBonus());

        System.out.println("Bônus da acionista: " + acionista.getValorBonus());

        ControleBonus controleBonus= new ControleBonus();
        controleBonus.adicionaBonificavel(medicoCirurgiao);
        controleBonus.adicionaBonificavel(medicoClinico);
        controleBonus.adicionaBonificavel(acionista);


        System.out.println("Total gasto: " + controleBonus.calculaTotalGasto());

        System.out.println("Funcionários com bônus: ");
        controleBonus.exibeFuncionariosComBonus();




    }
}
