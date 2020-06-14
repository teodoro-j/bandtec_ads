package br.com.bandtec.jpa1.repository;

import br.com.bandtec.jpa1.entidades.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarroRepository extends JpaRepository<Carro, Integer> {

    // Dynamic Finders: Métodos que montam a instrução SQL

    // encontre por preço maior que um certo valor
    List<Carro> findByPrecoGreaterThan(Double valor);

    // encontre por marca igual a um certo valor
    List<Carro> findByMarca(String valor);

    // encontre por marca e modelo iguais a...
    List<Carro> findByMarcaAndModelo(String marca, String modelo);

    // conte quantos existem por certa marca
    Long countByMarca(String valor);
    // select count(*) from carro where marca=?

    // existem por certa marca?
    boolean existsByMarca(String valor);
    // select count(*) from carro where marca=?
    // se der >0 -> true. Senão, false

    // excluir todos de certa marca
    void deleteByMarca(String marca);
    // delete from carro where marca=?

}
