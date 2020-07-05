package br.com.bandtec.jpa5.repositorios;

import br.com.bandtec.jpa5.entidades.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
