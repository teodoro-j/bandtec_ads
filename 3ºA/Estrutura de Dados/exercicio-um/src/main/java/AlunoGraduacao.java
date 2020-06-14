public class AlunoGraduacao extends Aluno {

    private double nota1;
    private double nota2;


    public AlunoGraduacao(String nome, String ra, double nota1, double nota2) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public double calculaMedia() {
        return (nota1 + nota2)/2;
    }

    @Override
    public String toString() {
        return "AlunoGraduacao{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
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
}
