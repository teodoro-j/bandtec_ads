public class TestaFigura {

    public static void main(String[] args) {

        Quadrado quadrado= new Quadrado("amarelo",1.0,2.0);
        Retangulo retangulo= new Retangulo("rosa",1.0,3.0,2.0);
        Triangulo triangulo= new Triangulo("verde",1.0,3.0,4.0);
        Circulo circulo= new Circulo("laranja", 1.0,2.0);

        System.out.println(quadrado);
        System.out.println(retangulo);
        System.out.println(triangulo);
        System.out.println(circulo);

    }
}
