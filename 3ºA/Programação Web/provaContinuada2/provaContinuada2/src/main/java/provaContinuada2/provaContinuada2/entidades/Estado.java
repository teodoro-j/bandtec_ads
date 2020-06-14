package provaContinuada2.provaContinuada2.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Estado {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private String sigla;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getSigla() { return sigla; }

    public void setSigla(String sigla) { this.sigla = sigla; }
}
