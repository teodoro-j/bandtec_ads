public abstract class Medico implements Bonificavel {

    private int crm;
    private String nome;

    public Medico(int crm, String nome) {
        this.crm = crm;
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm=" + crm +
                ", nome='" + nome + '\'' +
                '}';
    }
}
