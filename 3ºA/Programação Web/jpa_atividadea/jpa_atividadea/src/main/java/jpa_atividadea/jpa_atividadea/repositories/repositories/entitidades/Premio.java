package jpa_atividadea.jpa_atividadea.repositories.repositories.entitidades;

import javax.persistence.*;

@Entity
@Table(name= "premio")
public class Premio {
    @Id
    @GeneratedValue
    @Column(name="premio_id")
    private Integer id;

    @Column(name="premio_nome" ,length = 50)
    private String nome;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }
}
