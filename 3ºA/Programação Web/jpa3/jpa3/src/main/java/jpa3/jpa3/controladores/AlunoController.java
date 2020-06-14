package jpa3.jpa3.controladores;

import jpa3.jpa3.entidades.Alunos;
import jpa3.jpa3.repositorio.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @PostMapping
    public ResponseEntity criarAluno(@RequestBody Alunos novoAluno) {
        repository.save(novoAluno);
        return created(null).build();
    }

    //PARA CRIAR OS FILTROS NA HORA DA PESQUISA
    @GetMapping
    public ResponseEntity consultaAlunos(
            @RequestParam(required = false) String bairro,
            @RequestParam(required = false) String classe
    ) {
        Alunos consulta = new Alunos();
        consulta.setBairro(bairro);
        consulta.setClasseSocial(classe);

        // Consulta por EXAMPLE com os atributos não nulos
        List alunos = repository.findAll(Example.of(consulta));

        return alunos.isEmpty() ? noContent().build() : ok(alunos);
    }

    @GetMapping("/simples")
    public ResponseEntity consultaSimples() {
        List alunos = repository.findAllSimples();

        return alunos.isEmpty() ? noContent().build() : ok(alunos);
    }

    @GetMapping("/classe-media")
    public ResponseEntity consultaClasseMedia(@RequestParam(required = false) String bairro) {
        List alunos = bairro==null ?
                repository.findAllClasseMedia() : repository.findByClasseMediaBairro(bairro);

        return alunos.isEmpty() ? noContent().build() : ok(alunos);
    }

    @DeleteMapping("/incompletos")
    public ResponseEntity excluirIncompletos() {
        int excluidos = repository.deleteIncompletos();
        return ok(excluidos+ "registros excluidos");
    }

    @GetMapping("/turma/{id}")
    public ResponseEntity consultarAlunoPorTurma(@PathVariable Integer id) {
        List alunos = repository.findByTurmaId(id);

        return alunos.isEmpty() ? notFound().build() : ok(alunos);
    }

}
