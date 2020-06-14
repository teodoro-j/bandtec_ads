package br.com.bandtec.jpa1.controllers;

import br.com.bandtec.jpa1.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private CarroRepository repository;

    @GetMapping
    // A anotação @RequestParam indica a presença de Parâmetros de Requisição
    // Por padrão, ela OBRIGA que o parâmetro seja informado
    // Para deixar o parâmetro opcional, usamos "required = false"
    // a URL para chamar com eles seria /carros?marca=talmarca&modelo=talmodelo
    public ResponseEntity getTodos(
            @RequestParam(required = false) String marca,
            @RequestParam(required = false) String modelo
    ) {

        // se o parâmetro não for enviado, chega null aqui
        // List carros = marca==null ? repository.findAll() : repository.findByMarca(marca);

        // return carros.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(carros);


         // versão SEM operador ternário

        List carros;

        // vamos considerar que só filtra se passar marca E modelo
        if (marca == null || modelo == null) {
            carros = repository.findAll();
        } else {
            carros = repository.findByMarcaAndModelo(marca, modelo);
        }

        if (carros.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(carros);
        }

    }

    @GetMapping("/caros")
    public ResponseEntity getCaros() {
        // select * from carro where preco > 200000
        List carrosCaros = repository.findByPrecoGreaterThan(200000.0);

        if (carrosCaros.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(carrosCaros);
        }
    }
}
