package joaoteodoro.jpa1.controllers;

import joaoteodoro.jpa1.entidades.Cidade;
import joaoteodoro.jpa1.repositorios.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeRepository repository;

    @PostMapping
    private ResponseEntity criarCidade(@RequestBody Cidade novaCidade){
        this.repository.save(novaCidade);
        return ResponseEntity.created( null).build();
    }

    @GetMapping
    private ResponseEntity listaCidade() {
        if (this.repository.count() > 0) {
            return ResponseEntity.ok(this.repository.findAll());
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/contagem")
    private ResponseEntity contagemCidade() {
        return ResponseEntity.ok(this.repository.count());
    }

    @GetMapping("/{id}")
    public ResponseEntity getCidade(@PathVariable Integer id) {
        Optional<Cidade> consultaCidade = this.repository.findById(id);

        if(consultaCidade.isPresent()) {
            return ResponseEntity.ok(consultaCidade.get());
        } else{
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity excluirCidade(@PathVariable Integer id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

