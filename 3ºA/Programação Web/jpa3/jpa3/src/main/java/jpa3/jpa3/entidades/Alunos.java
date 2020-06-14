package jpa3.jpa3.entidades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Alunos {

    @Id
    @GeneratedValue
    private String id;
    private String nome;
    private LocalDate nascimento;

    private String bairro;
    private String classeSocial;

    @ManyToOne
    private Turma turma;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getNascimento() { return nascimento; }

    public void setNascimento(LocalDate nascimento) { this.nascimento = nascimento; }

    public String getBairro() { return bairro; }

    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getClasseSocial() { return classeSocial; }

    public void setClasseSocial(String classeSocial) { this.classeSocial = classeSocial; }

    public Turma getTurma() { return turma; }

    public void setTurma(Turma turma) { this.turma = turma; }
}
