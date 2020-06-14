package joaoteodoro.corporequisicao.controllers;


import joaoteodoro.corporequisicao.modelo.Virus;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/virus")
public class VirusController {

    private List<Virus> lista = new ArrayList<>();

    @GetMapping
    public ResponseEntity getVirus() {
        if (this.lista.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(this.lista);
    }

    @PostMapping
    public ResponseEntity addVirus(@RequestBody Virus virus) {
        this.lista.add(virus);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity getId(@PathVariable("id") Integer id) {
        if(id+1 > lista.size()) {
            return ResponseEntity.status(404).build();
        }else {
            return ResponseEntity.ok(lista.get(id));
        }

    }

}

