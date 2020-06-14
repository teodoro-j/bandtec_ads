package joaoteodoro.jpa1.repositorios;

import joaoteodoro.jpa1.entidades.Esporte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EsporteRepository extends JpaRepository<Esporte, Integer> {
}