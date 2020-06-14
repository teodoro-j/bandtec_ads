package provaContinuada2.provaContinuada2.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cidade {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private Integer populacao;
    private boolean capital;

    @ManyToOne
    private Estado estado;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Integer getPopulacao() { return populacao; }

    public void setPopulacao(Integer populacao) { this.populacao = populacao; }

    public boolean isCapital() { return capital; }

    public void setCapital(boolean capital) { this.capital = capital; }

    public Estado getEstado() { return estado; }

    public void setEstado(Estado estado) { this.estado = estado; }
}
