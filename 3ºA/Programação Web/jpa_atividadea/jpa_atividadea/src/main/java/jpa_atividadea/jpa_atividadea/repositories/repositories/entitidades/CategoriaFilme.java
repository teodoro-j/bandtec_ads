package jpa_atividadea.jpa_atividadea.repositories.repositories.entitidades;

import javax.persistence.*;

@Entity
@Table(name= "Categoria_filme")
public class CategoriaFilme {
    @Id
    @GeneratedValue
    @Column(name="categoria_id")
    private Integer id;

    @Column(name="categoria_filme_nome", length = 50)
    private String nome;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }
}
