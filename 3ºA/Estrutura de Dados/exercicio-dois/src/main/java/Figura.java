public abstract class Figura {

    private String cor;
    private double espessuraContorno;

    public Figura(String cor, double espessuraContorno) {
        this.cor = cor;
        this.espessuraContorno = espessuraContorno;
    }

    public abstract double calculaArea();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getEspessuraContorno() {
        return espessuraContorno;
    }

    public void setEspessuraContorno(Double espessuraContorno) {
        this.espessuraContorno = espessuraContorno;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "cor='" + cor + '\'' +
                ", espessuraContorno=" + espessuraContorno +
                '}';
    }
}
