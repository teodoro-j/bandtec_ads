public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(String cor, double espessuraContorno, double base, double altura) {
        super(cor, espessuraContorno);
        this.base = base;
        this.altura = altura;
    }

    public double calculaArea() {
        return (base*altura)/2;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                "area=" + String.format("%.2f",calculaArea()) +
                "} " + super.toString();
    }
}
