package jpa3.jpa3.repositorio;


import jpa3.jpa3.entidades.Alunos;
import jpa3.jpa3.modelos.AlunoSimples;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface AlunoRepository extends JpaRepository<Alunos, Integer>{

    @Query("select new jpa3.jpa3.modelos.AlunoSimples(a.id, a.nome from Aluno a)")
    List<AlunoSimples> findAllSimples();

    @Query("select a from Aluno a where a.ClasseSocial in ('A', 'B')")
    List<Alunos> findAllClasseMedia();

    @Query("select a from Aluno a where a.ClasseSocial in ('A', 'B') and a.bairro = ?1")
    List<Alunos> findByClasseMediaBairro(String bairro);

    @Transactional
    @Modifying
    @Query("delete from Aluno a where a.classeSocial is null and a.bairro is null and a.nascimento is null")
    int deleteIncompletos();

    List<Alunos> findByTurmaId(int idTurma);
}

