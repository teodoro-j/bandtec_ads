package fila;

public class TesteCircular {

    public static void main(String[] args) {

        FilaCircula testeFila = new FilaCircula(5);
        testeFila.insert("João");
        testeFila.insert("Bianca");
        testeFila.insert("Gustavo");
        testeFila.insert("Guilherme");
        testeFila.insert("Célia");
        System.out.println(testeFila.poll());

        testeFila.insert("vivian");
        testeFila.insert("Yosh");

        System.out.println("O primeiro da fila é " + testeFila.peek());

        testeFila.exibe();
    }
}
