public class ExerciciosArvore {
    public static void main(String[] args) {
        System.out.println("Exercício 1");
        System.out.println("-------------------------------");

        System.out.println("A Árvore da esquerda é como abaixo:");
        System.out.println("(A(B(E)(F))(C)(D(G)))");
        System.out.println("i. Grau dos nós: " +
                "\n\tA - Grau 3" +
                "\n\tB - Grau 2" +
                "\n\tC - Grau 0" +
                "\n\tD - Grau 1" +
                "\n\tE - Grau 0" +
                "\n\tF - Grau 0" +
                "\n\tG - Grau 0" +
                "\nii. Grau da árvore: "+
                "\n\tA árvore tem grau 3" +
                "\niii. Folhas da árvore: "+
                "\n\tAs folhas são E, F, G." +
                "\niv. Raíz da árvore: "+
                "\n\tA raíz da árvore é o nó A." +
                "\nv. Nós em cada nível: "+
                "\n\tNível 0 - Nó A" +
                "\n\tNível 1 - Nós B, C, D" +
                "\n\tNível 2 - Nós E, F, G" +
                "\nvi. Altura da árvore: "+
                "\n\tA árvore tem altura 2.");
        System.out.println();
        System.out.println("A Árvore da direita é como abaixo:");
        System.out.println("(A(B(D)(E))(C(F)))");
        System.out.println("i. Grau dos nós: " +
                "\n\tA - Grau 2" +
                "\n\tB - Grau 2" +
                "\n\tC - Grau 1" +
                "\n\tD - Grau 0" +
                "\n\tE - Grau 0" +
                "\n\tF - Grau 0" +
                "\nii. Grau da árvore (maior número de filhos): "+
                "\n\tA árvore tem grau 2" +
                "\niii. Folhas da árvore: "+
                "\n\tAs folhas são D, E, F." +
                "\niv. Raíz da árvore: "+
                "\n\tA raíz da árvore é o nó A." +
                "\nv. Nós em cada nível: "+
                "\n\tNível 0 - Nó A" +
                "\n\tNível 1 - Nós B, C" +
                "\n\tNível 2 - Nós D, E, F" +
                "\nvi. Altura da árvore: "+
                "\n\tA árvore tem altura 2.");

        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Exercício do slide - cria árvore");
        ArvoreBin arvoreBinaria = new ArvoreBin();
        Node raiz = new Node("6");
        arvoreBinaria.criaRaiz(raiz);
        arvoreBinaria.insereDir(raiz, "8");

        System.out.println(arvoreBinaria.insereDir(raiz, "8"));
        System.out.println(arvoreBinaria.getRaiz());

    }
}
