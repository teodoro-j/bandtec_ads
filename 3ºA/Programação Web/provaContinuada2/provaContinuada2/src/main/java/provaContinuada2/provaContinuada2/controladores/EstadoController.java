package provaContinuada2.provaContinuada2.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import provaContinuada2.provaContinuada2.entidades.Cidade;
import provaContinuada2.provaContinuada2.entidades.Estado;
import provaContinuada2.provaContinuada2.repositores.EstadoRepository;


import java.util.List;

@RestController
@RequestMapping("/cidades")
public class EstadoController {

    @Autowired
    private EstadoRepository repository;

    @PostMapping("/estados")
    public ResponseEntity criarEstado (@RequestBody Estado novoEstado){
        repository.save(novoEstado);
        return ResponseEntity.created(null).build();
        //return created(201).build();
    }

    @GetMapping("/estados")
    public ResponseEntity consultarEstado(@PathVariable String sigla) {
        List cidade = repository.findByEstadoSilga(sigla);

        return cidade.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(cidade);
    }
    }

    @DeleteMapping("/estados/{id}")
    public ResponseEntity excluirEstado(@PathVariable Integer id){

        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{populacao}{sigla]")
    public ResponseEntity consultarCidade(
            @RequestParam(required = false) Integer populacao,
            @RequestParam(required = false) String sigla
    ){
        Cidade consulta = new Cidade();
        consulta.setPopulacao(populacao);

        List cidades = repository.findAll(Example.of(consulta));

        return cidades.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(cidades);
    }


    @GetMapping("/estado/{id}")
    public ResponseEntity consultarAlunosPorTurma(@PathVariable Integer id) {
        List cidades = repository.findByEstadoId(id);

        return cidades.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(cidades);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluirCidade(@PathVariable Integer id){
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
