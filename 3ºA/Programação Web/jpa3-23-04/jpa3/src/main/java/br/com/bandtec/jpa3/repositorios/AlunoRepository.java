package br.com.bandtec.jpa3.repositorios;

import br.com.bandtec.jpa3.entidades.Aluno;
import br.com.bandtec.jpa3.modelos.AlunoSimples;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {

    // @Query serve para criar instruções de consultas personalizadas em JPQL
    // Na JPQL usamos os nomes das Classes e Atributos e não das Tabelas e Colunas
    //@Query("select new br.com.bandtec.jpa3.modelos.AlunoSimples(a.id, a.nome) from Aluno a")
    @Query("select new br.com.bandtec.jpa3.modelos.AlunoSimples(a) from Aluno a")
    List<AlunoSimples> findAllSimples();

    @Query("select a from Aluno a where a.classeSocial in ('A','B')")
    List<Aluno> findAllClasseMedia();

    // os parâmetros na JPQL começam do 1 (ex: ?1  ?2  ?3)
    // neste caso, só temo 1 parâmetro: ?1 -> será substituido pelo 1º argumento do método
    @Query("select a from Aluno a where a.classeSocial in ('A','B') and a.bairro = ?1")
    List<Aluno> findByClasseMediaBairro(String bairro);

    @Transactional // indica que o método usará uma transação junto ao banco
    @Modifying // indica que o método irá alterar registros no banco
    @Query("delete from Aluno a where a.classeSocial is null and a.bairro is null and a.nascimento is null")
    int deleteIncompletos();


    // recupera todos os alunos cujo id da turma é igual ao argumento "idTurma"
    List<Aluno> findByTurmaId(int idTurma);

    // recupera a quantidade de alunos cujo id da turma é igual ao argumento "idTurma"
    long countByTurmaId(int idTurma);

    // exclui todos os alunos cujo id da turma é igual ao argumento "idTurma"
    int deleteByTurmaId(int idTurma);
}
