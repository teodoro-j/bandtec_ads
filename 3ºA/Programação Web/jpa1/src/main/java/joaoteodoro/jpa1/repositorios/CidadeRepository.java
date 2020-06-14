package joaoteodoro.jpa1.repositorios;

import joaoteodoro.jpa1.entidades.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
