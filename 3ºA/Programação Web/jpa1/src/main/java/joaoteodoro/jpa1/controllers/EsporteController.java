package joaoteodoro.jpa1.controllers;

import joaoteodoro.jpa1.entidades.Esporte;
import joaoteodoro.jpa1.repositorios.EsporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/esportes")
public class EsporteController {

    @Autowired
    private EsporteRepository repository;

    /* @PostMapping
    public ResponseEntity criarEsporte(@RequestBody Esporte novoEsporte) {
        this.repository.save(novoEsporte);
        return ResponseEntity.created(null).build();
    }

    @GetMapping
    public ResponseEntity listaEsporte() {
        if (this.repository.count() > 0){
            return ResponseEntity.ok(this.repository.findAll());
        } else {
            return ResponseEntity.noContent().build();
        }
    }*/

    @GetMapping
    public ResponseEntity getEsportes() {
        List<Esporte> lista = repository.findAll();

        if (lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(lista);
        }
    }

    @GetMapping("/{id}")
        public ResponseEntity getEsporte(@PathVariable Integer id){
        Optional<Esporte> consultaEsporte =  this.repository.findById(id);

        if (consultaEsporte.isPresent()) {
            return ResponseEntity.ok(consultaEsporte.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteEsporte(@PathVariable Integer id){
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
