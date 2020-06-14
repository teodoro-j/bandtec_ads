package joaoteodoro.jpa1.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cidade {

    @Id
    @GeneratedValue
    private Integer id;
    private String nome;
    private Integer habitantes;
    private boolean capital;

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public Integer getHabitantes() { return habitantes; }

    public void setHabitantes(Integer habitantes) { this.habitantes = habitantes; }

    public boolean isCapital() { return capital; }

    public void setCapital(boolean capital) { this.capital = capital; }
}
