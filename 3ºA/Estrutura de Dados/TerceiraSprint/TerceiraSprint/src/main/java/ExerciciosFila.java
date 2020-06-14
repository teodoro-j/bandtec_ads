public class ExerciciosFila {
    public static void main(String[] args) {
        System.out.println("\n\n---------------------------------------");
        System.out.println("Implementando a classe Fila");
        System.out.println("---------------------------------------");

        Fila fila = new Fila(5);

        System.out.println("Inserindo . . . . ");
        fila.inserir("Homem-aranha");
        fila.inserir("Um homem");
        fila.inserir("Naruto");
        fila.inserir("Laranja");
        fila.inserir("Penguim de Madagascar");
        fila.inserir("Gatinho");

        fila.exibe();

        if (fila.isEmpty()) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("A fila não está vazia");
        }

        if (fila.isFull()) {
            System.out.println("A fila está cheia.");
        } else {
            System.out.println("A fila não está cheia.");
        }

        System.out.println();
        System.out.println("O elemento " + fila.peek() + " é o primeiro da fila.");
        fila.exibe();
        System.out.println("O elemento "+ fila.poll() + " está saindo da fila.");
        fila.exibe();

        System.out.println("Agora, o elemento "+ fila.peek() + " é o próximo.");

        System.out.println("\nGatinho vai entrar na fila");
        if (!fila.isFull())  {
            System.out.println("A fila não está cheia.");
        }
        fila.inserir("Gatinho");
        fila.exibe();

        System.out.println("\n\n---------------------------------------");
        System.out.println("Classe fila circular");
        System.out.println("---------------------------------------");

        FilaCircular filaCircular = new FilaCircular(8);

        if (filaCircular.isEmpty()) {
            System.out.println("A fila circular está vazia");
        } else {
            System.out.println("A fila circular não está vazia");
        }

        if (filaCircular.isFull()) {
            System.out.println("A fila circular está cheia.");
        } else {
            System.out.println("A fila circular não está cheia.");
        }

        filaCircular.exibe();

        System.out.println("Vamos inserir dados  . . . ");
        filaCircular.insert("A");
        filaCircular.insert("B");
        filaCircular.insert("C");
        filaCircular.insert("D");

        filaCircular.exibe();

        System.out.println("O início da fila é "+filaCircular.getInicio());
        System.out.println("O tamanho da fila é "+filaCircular.getTamanho());
        System.out.println("O fim da fila é "+filaCircular.getFim());
        System.out.println();

        System.out.println("O elemento " + filaCircular.peek() + " é o primeiro da fila.");
        filaCircular.exibe();
        System.out.println("O elemento "+ filaCircular.poll() + " está saindo da fila.");
        filaCircular.exibe();

        System.out.println();
        System.out.println("O início da fila é "+filaCircular.getInicio());
        System.out.println("O tamanho da fila é "+filaCircular.getTamanho());
        System.out.println("O fim da fila é "+filaCircular.getFim());
        System.out.println();

        System.out.println("Agora, o elemento "+ filaCircular.peek() + " é o próximo.");

        filaCircular.insert("E");
        filaCircular.exibe();
        System.out.println("O início da fila é "+filaCircular.getInicio());
        System.out.println("O tamanho da fila é "+filaCircular.getTamanho());
        System.out.println("O fim da fila é "+filaCircular.getFim());
        System.out.println();

        filaCircular.insert("F");
        filaCircular.exibe();
        System.out.println("O início da fila é "+filaCircular.getInicio());
        System.out.println("O tamanho da fila é "+filaCircular.getTamanho());
        System.out.println("O fim da fila é "+filaCircular.getFim());
        System.out.println();

        filaCircular.insert("G");
        filaCircular.exibe();
        System.out.println("O início da fila é "+filaCircular.getInicio());
        System.out.println("O tamanho da fila é "+filaCircular.getTamanho());
        System.out.println("O fim da fila é "+filaCircular.getFim());
        System.out.println();

        filaCircular.insert("H");
        filaCircular.exibe();
        System.out.println("O início da fila é "+filaCircular.getInicio());
        System.out.println("O tamanho da fila é "+filaCircular.getTamanho());
        System.out.println("O fim da fila é "+filaCircular.getFim());
        System.out.println();

        filaCircular.insert("I");
        filaCircular.exibe();
        System.out.println("O início da fila é "+filaCircular.getInicio());
        System.out.println("O tamanho da fila é "+filaCircular.getTamanho());
        System.out.println("O fim da fila é "+filaCircular.getFim());
        System.out.println();

        filaCircular.insert("J");


        System.out.println("\n\n---------------------------------------------------------------");
        System.out.println("Exercício 2");

        int[] vetorEx2 = {2, 7, -3, -50, 45, -4, 30, -21, 38};
        int[] vetorExemplo = vetorEx2;
        FilaObj filaPositivos = new FilaObj(vetorExemplo.length);
        FilaObj filaNegativos = new FilaObj(vetorExemplo.length);

        for (int i = 0; i< vetorExemplo.length; i++) {
            if (vetorExemplo[i] < 0) {
                filaNegativos.inserir(vetorExemplo[i]);
            } else if (vetorExemplo[i] > 0) {
                filaPositivos.inserir(vetorExemplo[i]);
            } else {
                System.out.println("Número 0 encontrado. Será ignorado pois 0 é nulo.");
            }
        }

        System.out.println("A fila, com os valores positivos e, depois, os negativos:");
        int tamanhoFilaPositivos = filaPositivos.getTamanho();
        for (int i = 0; i < tamanhoFilaPositivos; i++) {
            System.out.print(filaPositivos.poll()+"\t");
        }
        int tamanhoFilaNegativos = filaNegativos.getTamanho();
        for (int i = 0; i < tamanhoFilaNegativos; i++) {
            System.out.print(filaNegativos.poll()+"\t");
        }

        if (filaNegativos.isEmpty() && filaPositivos.isEmpty()) {
            System.out.println("\nAs filas de positivos e negativos está vazia.");
        }

        System.out.println("\n\n---------------------------------------------------------------");
        System.out.println("Exercício 3");
        int[] vetorEx3 = {2, 7, -3, -50, 45, -4, 30, -21, 38};
        int[] vetorExemplo3 = vetorEx3;

        FilaObj filaPositivoMesmaOrdem = new FilaObj(vetorExemplo3.length);
        PilhaObj pilhaNegativosOrdemInversa = new PilhaObj(vetorExemplo3.length);

        for (int i = 0; i< vetorExemplo3.length; i++) {
            if (vetorExemplo3[i] < 0) {
                pilhaNegativosOrdemInversa.push(vetorExemplo[i]);
            } else if (vetorExemplo3[i] > 0) {
                filaPositivoMesmaOrdem.inserir(vetorExemplo[i]);
            } else {
                System.out.println("Número 0 encontrado. Será ignorado pois 0 é nulo.");
            }
        }

        System.out.println("A fila, com os valores positivos na mesma ordem e, depois, os " +
                "negativos em ordem reversa:");

        int tamanhoFilaPositivos3 = filaPositivoMesmaOrdem.getTamanho();
        for (int i = 0; i < tamanhoFilaPositivos3; i++) {
            System.out.print(filaPositivoMesmaOrdem.poll()+"\t");
        }


        int tamanhoPilhaNegativos3 = pilhaNegativosOrdemInversa.getTopo();
        for (int i = 0; i <= tamanhoPilhaNegativos3; i++) {
            System.out.print(pilhaNegativosOrdemInversa.pop()+"\t");
        }

        if (pilhaNegativosOrdemInversa.isEmpty() && filaPositivoMesmaOrdem.isEmpty()) {
            System.out.println("As filas e pilhas de positivos e negativos está vazia.");
        }

        System.out.println("\n\n---------------------------------------------------------------");
        System.out.println("Exercício 4\nTESTANDO CLASSE");

        DuasPilhas duasPilhas = new DuasPilhas(10);

        if (duasPilhas.isEmpty(1)) {
            System.out.println("A pilha 1 está vazia.");
        }
        if (duasPilhas.isEmpty(2)) {
            System.out.println("A pilha 2 está vazia.");
        }

        if (duasPilhas.isFull()) {
            System.out.println("As pilhas estão cheias.");
        } else {
            System.out.println("As pilhas não estão cheias.");
        }

        duasPilhas.push(1, 2);
        duasPilhas.push(1, 4);
        duasPilhas.push(1, 6);
        duasPilhas.push(1, 8);
        duasPilhas.push(1, 10);
        duasPilhas.push(1, 12);
        duasPilhas.push(1, 14);
        duasPilhas.push(2, 1);
        duasPilhas.push(2, 3);
        duasPilhas.push(2, 5);
        duasPilhas.push(2, 7);
        duasPilhas.exibeVetor();
        duasPilhas.exibePilha();

        System.out.println();
        System.out.println("Pop em 1 = "+duasPilhas.pop(1));
        System.out.println("Peek em 1 = "+duasPilhas.peek(1));
        duasPilhas.exibePilha();
        System.out.println();

        System.out.println();
        System.out.println("Pop em 2 = "+duasPilhas.pop(2));
        System.out.println("Peek em 2 = "+duasPilhas.peek(2));
        duasPilhas.exibePilha();

        System.out.println("\n\n---------------------------------------------------------------");
        System.out.println("Exercício 4\nRESOLUÇÃO");
        int[] v = {2,7, -3, -50, 45, -4, 30, -21, 38};
        DuasPilhas duasPilhasEx4 = new DuasPilhas(v.length);

        int itensEmPilha1 = 0;
        int itensEmPilha2 = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > 0) {
                /*System.out.println("Inserindo na pilha 1 o valor "+v[i]);*/
                duasPilhasEx4.push(1, v[i]);
                itensEmPilha1++;
            } else if (v[i] < 0) {
                /*System.out.println("Inserindo na pilha 2 o valor "+v[i]);*/
                duasPilhasEx4.push(2, v[i]);
                itensEmPilha2++;
            } else {
                System.out.println("O número 0 foi encontrado. Será ignorado pois 0 é neutro.");
            }
        }
        System.out.println("Terminamos de inserir");
        /*duasPilhasEx4.exibeVetor();*/
        duasPilhasEx4.exibePilha();

        System.out.println();
        System.out.println("\nTirando valores das pilhas");
        for (int i = 0; i < itensEmPilha1; i++) {
            System.out.print(duasPilhasEx4.pop(1) + "\t");
        }
        for (int i = 0; i < itensEmPilha2; i++) {
            System.out.print(duasPilhasEx4.pop(2) + "\t");
        }

        System.out.println();
        System.out.println("\nHá algo nas pilhas? Estão como abaixo");
        duasPilhasEx4.exibePilha();





    }
}
