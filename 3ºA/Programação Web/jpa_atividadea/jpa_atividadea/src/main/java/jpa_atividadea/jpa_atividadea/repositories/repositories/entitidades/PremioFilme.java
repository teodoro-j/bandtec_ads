package jpa_atividadea.jpa_atividadea.repositories.repositories.entitidades;

import javax.persistence.*;

@Entity
@Table(name= "premio_filme")
public class PremioFilme {

    @Id
    @GeneratedValue
    @Column(name= "id")
    private Integer id;


    @ManyToOne
    @Column(name= "file_id")
    private Filme filme;

    @ManyToOne
    @Column(name= "premio_id")
    private Premio premio;

    @ManyToOne
    @Column(name= "categoria_premio_id")
    private CategoriaPremio categoria_premio_id;

    @Column(name= "ano_premio")
    private Integer ano;

    @Column(name= "destaque_discurso", length = 200)
    private String destaque_discurso;
}
