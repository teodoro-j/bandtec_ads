public class Circulo extends Figura{

    private double raio;

    public Circulo(String cor, double espessuraContorno, double raio) {
        super(cor, espessuraContorno);
        this.raio = raio;
    }


    public double calculaArea() {
        return 3.14*(raio*raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                "area=" + String.format("%.2f",calculaArea()) +
                "} " + super.toString();
    }
}
