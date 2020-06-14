public class Quadrado extends Figura {

    private double lado;

    public Quadrado(String cor, double espessuraContorno, double lado) {
        super(cor, espessuraContorno);
        this.lado = lado;
    }

    public double calculaArea() {
        return lado*lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                "area=" + String.format("%.2f",calculaArea()) +
                "} " + super.toString();
    }
}
