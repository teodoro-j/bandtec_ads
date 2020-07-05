package br.com.bandtec.jpa5.controladores;

import br.com.bandtec.jpa5.entidades.Aluno;
import br.com.bandtec.jpa5.repositorios.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public ResponseEntity getAlunos() {
        List<Aluno> lista = repository.findAll();

        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(lista);
        }
    }

    // programar um Endpoint que retorne apenas 1 Aluno a partir do id
    // criar testes de integração automatizados na AlunoControllerTest para este método
    @GetMapping("/{id}")
    public ResponseEntity getAluno(@PathVariable Integer id) {
        Optional<Aluno> aluno = repository.findById(id);
        return ResponseEntity.of(aluno);
    }

    /*
    programa um EndPoint que receba um id de aluno via DELETE
    Ele tenta excluir o aluno, caso o id estaja correto, retornando assim, 200
    Caso o Id seja inválido, retorna 404 e, claro, não exclui o aluno da lista

    -> Teste automatizado de integração:
       - Teste se, ao passar um id válido, retorna 200 e se o a consulta de
         todos os alunos passa a trazer um item a menos (estou falando aqui do método getAlunos())
       - Teste se, ao passar um id inválido, retorna 404 e se a consulta de
         todos os alunos continua trazendo a mesma quantidade de alunos
         (estou falando aqui do método getAlunos())
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteAluno(@PathVariable Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
