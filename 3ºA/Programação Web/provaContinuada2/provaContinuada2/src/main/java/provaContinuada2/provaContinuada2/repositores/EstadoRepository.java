package provaContinuada2.provaContinuada2.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import provaContinuada2.provaContinuada2.entidades.Cidade;

import javax.transaction.Transactional;
import java.util.List;

public interface EstadoRepository extends JpaRepository<Cidade, Integer> {


    @Transactional
    @Modifying
    @Query("delete from Estado a where e.id is null")
    int excluirEstado();

    List<Cidade> findByEstadoId(int idEstado);

    @Query("select a from Cidade a where c.gidla is not null")
    List<Cidade> findByEstadoSigla(String sigla);

}
