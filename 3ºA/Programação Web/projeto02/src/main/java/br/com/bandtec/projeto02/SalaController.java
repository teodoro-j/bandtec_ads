package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sala")
public class SalaController {

    private Sala salaAtual;

    @GetMapping
    public Sala getSalaAtual() {
        return salaAtual;
    }

    @PostMapping("/cadastrar/{nome}/{capacidade}")
    public void cadastrarSala(
            @PathVariable("nome") String nome,
            @PathVariable("capacidade") Integer capacidade
    ) {
        salaAtual = new Sala(nome, capacidade);
    }

    //endpoint DELETE /excluir
    //ao ser invocado, ele "exclui" a sala (ela fica null)

    @DeleteMapping("/excluir")
    public void excluirSala() {
        salaAtual=null;
    }

    // endpoint PUT /atualizar/{nome}/{capacidade}
    // ao ser invocado, ele troca o nome e capacidade da sala atual
    //CASO a sala não seja nula.Caso ela seja nula, não faça nada

    @PutMapping("/atualizar/{nome}/{capacidade}")
    public void atualizarSala(
            @PathVariable("nome") String nome,
            @PathVariable("capacidade") Integer capacidade) {
        if(salaAtual!=null) {
            salaAtual = new Sala(nome, capacidade);
        }
    }



}
