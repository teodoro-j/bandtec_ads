public class AlunoPos extends Aluno {

    private double nota1;
    private double nota2;
    private double notaMonografia;


    public AlunoPos(String nome, String ra, double nota1, double nota2, double notaMonografia) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    @Override
    public double calculaMedia() {
        return (nota1+nota2+notaMonografia)/3;
    }

    @Override
    public String toString() {
        return "AlunoPos{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", notaMonografia=" + notaMonografia +
                ", media=" + String.format("%.2f",calculaMedia()) +
                "} " + super.toString();
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }
}
