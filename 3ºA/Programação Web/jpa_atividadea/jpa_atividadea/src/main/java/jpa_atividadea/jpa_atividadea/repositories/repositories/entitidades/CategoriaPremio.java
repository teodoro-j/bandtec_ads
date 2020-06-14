package jpa_atividadea.jpa_atividadea.repositories.repositories.entitidades;

import javax.persistence.*;

@Entity
@Table(name= "categoria_premio")
public class CategoriaPremio {

    @Id
    @GeneratedValue
    @Column(name="categoria_preio_id")
    private Integer id;

    @Column(name="categoria_premio_nome", length = 50)
    private String nome;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }
}
