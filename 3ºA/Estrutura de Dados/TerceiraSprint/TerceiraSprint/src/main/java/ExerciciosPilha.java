import java.util.Scanner;

public class ExerciciosPilha {
    public static boolean ehPalindromo(int[] vetor) {
        Pilha pilhaVetor = new Pilha(vetor.length);

        for (int i = 0; i < vetor.length; i++) {
            pilhaVetor.push(vetor[i]);
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != pilhaVetor.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Exercicio 1 - Palíndromo");
        Pilha pilhaEx1 = new Pilha(5);

        int[] vetorTeste = {1,2,3,2,1};
        if(ehPalindromo(vetorTeste)) {
            System.out.println("O vetor "+ vetorTeste +" é palíndromo\n");
        } else {
            System.out.println("O vetor "+ vetorTeste +" não é palíndromo\n");
        }

        int[] vetorTeste2 = {1,2,3,5,1};
        if(ehPalindromo(vetorTeste2)) {
            System.out.println("O vetor "+ vetorTeste2 +" é palíndromo\n");
        } else {
            System.out.println("O vetor "+ vetorTeste2 +" não é palíndromo\n");
        }

        pilhaEx1.push(5);
        pilhaEx1.push(7);
        pilhaEx1.push(7);
        pilhaEx1.push(5);
        System.out.println("Sua pilha é a abaixo");
        pilhaEx1.exibe();
        String resposta = pilhaEx1.ehPalindromo() ? "É sim!" : "Não é.";
        System.out.println("É palíndromo? "+ resposta);

        System.out.println("\n\n--------------------------------------------------");
        System.out.println("Exercício 2 - Convertendo para binário");

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual número você gostaria de converter? (até 1023)"/*capacidade 10*/);

        //Integer numeroConverter = leitor.nextInt(); // ative esta se quer que o usuário insira
        Integer numeroConverter = 10; // ative esta se quer automatico convertendo o número 10

        Pilha pilhaResultadoBinario = new Pilha(10); // que número eu coloco aqui como capacidade?

        Integer topoDaPilha = -1;
        Integer numeroDivir = numeroConverter;

        while(true) {
            pilhaResultadoBinario.push(numeroDivir % 2);
            numeroDivir = numeroDivir / 2;
            topoDaPilha++;
            if (numeroDivir == 0) {
                break;
            }
        }

        System.out.print("O número "+numeroConverter+" em binário é: ");
        for (int i = 0; i <= topoDaPilha; i++ ) {
            System.out.print(pilhaResultadoBinario.pop());
        }

        System.out.println("\n\n--------------------------------------------------");
        System.out.println("Exercício 3 - Invertendo frase");
        Scanner leitorChar = new Scanner(System.in);
        System.out.println("Escreva uma frase que você gostaria de inverter.");

        //String fraseInserida = leitorChar.nextLine();// ative esta se quer que o usuário insira
        String fraseInserida = "Bom dia";// ative esta se quer automatico

        char[] fraseChar = fraseInserida.toCharArray();
        PilhaChar pilhaChar = new PilhaChar(fraseChar.length);

        for (int i = 0; i < fraseChar.length; i++) {
            pilhaChar.push(fraseChar[i]);
        }
        for (int i = 0; i < fraseChar.length; i++) {
            System.out.print(pilhaChar.pop());
        }

        System.out.println("\n\n--------------------------------------------------");
        System.out.println("Exercício 4 - Palíndromo com palavra");
        System.out.println("Escreva uma frase que você gostaria de saber se é palíndroma ou não.");
        //String fraseInseridaEx4 = leitorChar.nextLine();// ative esta se quer que o usuário insira
        String fraseInseridaEx4 = "socorram-me, subi no onibus em marrocos!";// ative esta se quer
        // automatico
        String fraseLimpaEx4 = fraseInseridaEx4.replaceAll("[^a-zA-Z]", "").toLowerCase(); //
        // ainda não funciona com á é ô e afins
        System.out.println("Frase limpa fica: "+fraseLimpaEx4);

        char[] fraseCharEx4 = fraseLimpaEx4.toCharArray();
        PilhaChar pilhaCharEx4 = new PilhaChar(fraseCharEx4.length);

        for (int i = 0; i < fraseCharEx4.length; i++) {
            pilhaCharEx4.push(fraseCharEx4[i]);
        }
        /*System.out.println("------------ \n");
        for (int i = 0; i < fraseChar.length; i++) {
            System.out.print(pilhaCharEx4.pop());
        }*/

        String respostaEx4 = pilhaCharEx4.ehPalindromo() ? "É sim!" : "Não é.";
        System.out.println("A frase \""+fraseInseridaEx4+"\" é palídroma? "+respostaEx4);


        System.out.println("\n\n--------------------------------------------------");
        System.out.println("Exercício 5 - Pilha de objetos");
        System.out.println("Vamos criar uma pilha para armazenar strings. Quantas?");
        // comentando o exercício para que rode automatico
        /*
        Integer capacidadePilhaObj = leitor.nextInt();

        PilhaObj pilhaObj = new PilhaObj(capacidadePilhaObj);

        Integer itensNaPilha = 0;
        while(itensNaPilha < capacidadePilhaObj) {
            System.out.println("Digite uma palavra ou frase para inserir na lista.");
            pilhaObj.push(leitorChar.nextLine());
            itensNaPilha++;
        }

        System.out.println("Sua pilha ficou como abaixo:");
        pilhaObj.exibe();
        System.out.println("\nDesempilhando sua pilha, fica assim:");
        for (int i = 0; i < capacidadePilhaObj; i++) {
            System.out.println("Desempilhando . . .");
            System.out.println(pilhaObj.pop());
        }*/

        System.out.println("\n\n--------------------------------------------------");
        System.out.println("Exercício 6 - Pilha auxiliar");
        Livro livroHarry = new Livro("Harry Potter", "JK");
        Livro livroIchigo = new Livro("Ichigo-ichie", "japan");
        Livro livroZen = new Livro("Sendo Zen", "Buda");
        Livro livroHQ = new Livro("Batman", "DC");
        Livro livroLady = new Livro("Lady Killers", "Darkside");

        PilhaObj<Livro> pilha = new PilhaObj<Livro>(5);
        pilha.push(livroHarry);
        pilha.push(livroIchigo);
        pilha.push(livroZen);
        pilha.push(livroHQ);
        pilha.push(livroLady);

        System.out.println("\nA pilha com os livros ficou assim:");
        pilha.exibeComoPilha();

        System.out.println("\nA pilha auxiliar dos livros ficou assim:");
        PilhaObj<Livro> pilhaAuxiliar = pilha.multiPop(2);
        System.out.println(pilhaAuxiliar);

        System.out.println("Vamor tirar o livro:");
        System.out.println(pilha.pop());
        System.out.println("O livro acima foi retirado.");

        System.out.println("Vamos reinserir os livros da pilha auxiliar");
        pilha.multiPush(pilhaAuxiliar);

        System.out.println("\nA pilha com os livros ficou assim:");
        pilha.exibeComoPilha();

    }
}
