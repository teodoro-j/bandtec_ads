package jpa3.jpa3.modelos;

import jpa3.jpa3.entidades.Alunos;

public class AlunoSimples {

    private Integer id;
    private String nome;

    public AlunoSimples(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() { return id; }

    public String getNome() { return nome; }
}
