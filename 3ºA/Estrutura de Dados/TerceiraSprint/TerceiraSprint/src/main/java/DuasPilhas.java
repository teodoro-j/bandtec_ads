public class DuasPilhas {
    private int topo1;
    private int topo2;
    private int[] vetor;

    public DuasPilhas(int capacidade) {
        this.vetor = new int[capacidade];
        this.topo1 = -1;
        this.topo2 = capacidade;
    }

    public int getTopo1() {
        return topo1;
    }

    public int getTopo2() {
        return topo2;
    }

    public boolean isEmpty(int nroPilha) {
        if (nroPilha == 1) {
            if (topo1 == -1) {
                return true;
            } else {
                return false;
            }
        } else if (nroPilha == 2) {
            if (topo2 == vetor.length) {
                return true;
            } else {
                return false;
            }
        }
        System.out.println("Essa pilha não existe.");
        return false;
    }

    public boolean isFull() {
        if ((topo2 - topo1) == 1) {
            return true;
        }
        return false;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void push(int nroPilha, int info) {
        if (isFull()) {
            System.out.println("A pilha está cheia. Não é possível inserir o valor "+ info+"!");
            return;
        } else {
            if (nroPilha == 1) {
                vetor[++topo1] = info;
                return;
            } else if (nroPilha == 2) {
                vetor[--topo2] = info;
                return;
            } else {
                System.out.println("Número de pilha inválido. Insira 1 ou 2.");
                return;
            }
        }
    }

    public int pop(int nroPilha) {
        if (nroPilha == 1) {
            int retorno = vetor[topo1];
            topo1 = topo1 - 1;
            return retorno;
        } else if (nroPilha == 2) {
            int retorno = vetor[topo2];
            topo2 = topo2 + 1;
            return retorno;
        } else {
            System.out.println("Número de pilha inválido. Insira 1 ou 2.");
        }
        return -999;
    }

    public int peek(int nroPilha) {
        if (nroPilha == 1) {
            return vetor[topo1];
        } else if (nroPilha == 2) {
            return vetor[topo2];
        } else {
            System.out.println("Número de pilha inválido. Insira 1 ou 2.");
        }
        return -999;
    }

    public void exibePilha() {
        if (!isEmpty(1)) {
            System.out.println("\nA pilha 1 é :");
            for (int i = 0; i <= topo1; i++) {
                System.out.print(vetor[i]+"\t");
            }
        } else {
            System.out.println("A pilha 1 está vazia.");
        }

        if (!isEmpty(2)) {
            System.out.println("\nA pilha 2 é :");
            /*System.out.println("Começando em "+(vetor.length-1));
            System.out.println("Terminando em "+ topo2);*/
            for (int i = vetor.length-1; i >= topo2; i--) {
                System.out.print(vetor[i]+"\t");
                /*System.out.print(">>(i =="+i+") (vetor.length="+vetor.length+") (topo2="+topo2+
                        ")" +
                        " \n");*/
            }
        } else {
            System.out.println("A pilha 2 está vazia.");
        }
    }

    public void exibeVetor() {
        System.out.println("O vetor está como abaixo:");
        for (int i = 0; i< vetor.length; i++) {
            System.out.print(vetor[i] + "\t");
        }
    }
}
