public class AlunoFundamental extends Aluno {

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public AlunoFundamental(String nome, String ra, double nota1, double nota2, double nota3, double nota4) {
        super(nome, ra);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    @Override
    public double calculaMedia() {
        return (nota1 + nota2 + nota3 + nota4)/4;
    }

    @Override
    public String toString() {
        return "AlunoFundamental{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
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

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }
}
