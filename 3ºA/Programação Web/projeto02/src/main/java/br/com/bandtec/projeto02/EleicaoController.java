package br.com.bandtec.projeto02;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eleicao")
public class EleicaoController {

    private Eleicao eleicao = new Eleicao(0,0,0);
    private Boolean existeEleitor;

    @GetMapping("/resultado")
    public Eleicao exibirResultado() {
        return eleicao;
    }

    @PostMapping("/registrar-eleitor/{idade}")
    public String cadastrarEleitor(
            @PathVariable("idade") Integer idade) {
        if (idade < 16) {
            existeEleitor=false;
            return "Eleitor não tem idade mínima";

        } else {
            existeEleitor=true;
            return "Eleitor pode votar";
        }
    }

    @PostMapping("/votar/{candidato}")
    public String votar(@PathVariable("candidato") Integer candidato) {

        if (existeEleitor.equals(true)) {
            if (candidato.equals(1)) {
                eleicao.adicionarVotosCandidato1();
                existeEleitor.equals(false);
                return "Voto computado";

            } else if (candidato.equals(2)) {
                eleicao.adicionarVotosCandidato2();
                existeEleitor.equals(false);
                return "Voto computado";
            } else {
                eleicao.adicionarVotoInvalido();
                existeEleitor.equals(false);
                return "";
            }
        } else {
            return "Registre o eleitor primeiro";
        }
    }




}
