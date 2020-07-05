package joaoteodoro.jpa1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

   /* @GetMapping("/somar/{n1}/{n2}")
    public ResponseEntity somar(@PathVariable Double n1, @PathVariable Double n2) {
        return ResponseEntity.ok(n1+n2);
    }


    @GetMapping("/dividir/{n1}/{n2}")
    public ResponseEntity dividir(@PathVariable Double n1, @PathVariable Double n2) {
        if (n2 == 0.0) {
            return ResponseEntity.badRequest().body("Não posso dividir por 0!");
        }
        return ResponseEntity.ok(n1/n2);
    } */

    @GetMapping("/subtrair/{n1}/{n2}")
    public ResponseEntity subtrair(@PathVariable Double n1, @PathVariable Double n2) {
        return ResponseEntity.ok(n1-n2);
    }

    @GetMapping("/media/{n1}/{n2}")
    public ResponseEntity calcularMedia(@PathVariable Double n1, @PathVariable Double n2){
        return ResponseEntity.ok((n1 + n2)/ 2);
    }
    @GetMapping("/mediacomp/{n1}/{n2}/{n3}")
    public ResponseEntity calcularMediaC(@PathVariable Double n1, @PathVariable Double n2, @PathVariable Double n3){
        return ResponseEntity.ok((((n1 + n2)/2)*0.4) + (n3 * 0,6));
    }



}

