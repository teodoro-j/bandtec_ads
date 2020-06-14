public class TestaTributo {

    public static void main(String[] args) {

        Alimento mamao= new Alimento(1234,"Mamão Papaya", 10,3);
        Perfume doisUmDois= new Perfume(5678,"212",150,"amadeirado");
        Servico limpeza= new Servico("Limpeza de casa",140);

        System.out.println(mamao);
        System.out.println(doisUmDois);
        System.out.println(limpeza);

        Tributo trib = new Tributo();

        trib.adicionaTributavel(mamao);
        trib.adicionaTributavel(doisUmDois);
        trib.adicionaTributavel(limpeza);

        System.out.println("Total de impostos= " + trib.calculaTotalTributo());


    }
}
