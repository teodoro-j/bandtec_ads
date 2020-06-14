package br.com.bandtec.jpa3.modelos;

import br.com.bandtec.jpa3.entidades.Aluno;

public class AlunoSimples {

    private Integer id;

    private String nome;

    public AlunoSimples(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public AlunoSimples(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
