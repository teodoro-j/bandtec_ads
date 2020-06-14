public class Engenheiro extends Funcionario {

    //Atributo
    private double salario;

    //Construtor
    public Engenheiro(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    //Implementação do método abstrato calcSalario()
    public double calcSalario() {
        return 0;
    }

    //toString

    @Override
    public String toString() {
        return "Engenheiro{" +
                "salario=" + String.format("R$ %.2f",salario) +
                "} " + super.toString();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
