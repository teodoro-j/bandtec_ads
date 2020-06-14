package joaoteodoro.corporequisicao.controllers;

import joaoteodoro.corporequisicao.modelo.Configuracoes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/config")
public class ConfiguracaoController {

    private List<Configuracoes> lista =  new ArrayList<>();

    @GetMapping
    public ResponseEntity getLista() {
        if(this.lista.isEmpty()) {
            return ResponseEntity.noContent().build();

        }
        return ResponseEntity.ok(this.lista);
    }

    @PostMapping
    public ResponseEntity addConfig(@RequestBody Configuracoes novaConfiguracao) {
        this.lista.add(novaConfiguracao);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
