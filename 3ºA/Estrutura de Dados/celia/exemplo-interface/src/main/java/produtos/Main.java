package produtos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto egeo = new Perfume(1002, "Doce pra caralho", 50.5, "doce");
        Produto mamao = new Alimento(1003, "Yoshi não gosta", 50.5, 15);
        Servico servico = new Servico("Marido de Aluguel", 500.00);
        Tributo tributo = new Tributo();
        tributo.adicionaTributavel(egeo);
        tributo.adicionaTributavel(mamao);
        tributo.adicionaTributavel(servico);
        System.out.println(tributo.calculaTotalTributo());

    }
}
