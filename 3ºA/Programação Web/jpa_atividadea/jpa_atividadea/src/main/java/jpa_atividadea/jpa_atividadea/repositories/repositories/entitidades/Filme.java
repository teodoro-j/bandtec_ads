package jpa_atividadea.jpa_atividadea.repositories.repositories.entitidades;

import org.springframework.boot.autoconfigure.condition.ConditionalOnCloudPlatform;

import javax.persistence.*;

@Entity
@Table(name= "filme")
public class Filme {

    @Id
    @GeneratedValue
    @Column(name= "filme_id")
    private Integer id;

    @Column(name= "nome_filme", length = 50)
    private String nome;

    @Column(name= "ano_filme")
    private Integer ano;

    @ManyToOne
    @Column(name= "categoria_id")
    private CategoriaFilme categoria_filme;

    @Column(name= "obs", length = 200)
    private String obs;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Integer getAno() { return ano; }

    public void setAno(Integer ano) { this.ano = ano; }

    public CategoriaFilme getCategoria_filme() { return categoria_filme; }

    public void setCategoria_filme(CategoriaFilme categoria_filme) { this.categoria_filme = categoria_filme; }

    public String getObs() { return obs; }

    public void setObs(String obs) { this.obs = obs; }
}
