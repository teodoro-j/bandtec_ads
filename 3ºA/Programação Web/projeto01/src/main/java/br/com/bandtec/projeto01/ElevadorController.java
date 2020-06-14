package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/elevador")
public class ElevadorController {

    private Double peso= 0.0;
    private Double pesoComPessoas=0.0;
    private Integer contador=0;

    @GetMapping("/configurar/{peso}")
    public String configurar(@PathVariable("peso") Double peso) {
        this.contador++;
        this.peso=peso;
        return "Elevador configurado para " + peso + "Kg";
    }

    @GetMapping("/subir/{quem}")
    public String subir(@PathVariable("quem") String quem) {
        if (contador.equals(0)) {
            return "Primeiro configure o peso máximo";
        } else {
            if (quem.equals("m")) {
                this.pesoComPessoas+=90;
            }
            else if (quem.equals("f") ) {
                this.pesoComPessoas+=70;
            }
            else if (quem.equals("c")) {
                this.pesoComPessoas+=40;
            }
            else {
                return "Valor inválido. Informe m, f ou c";
            }
        }

        if(pesoComPessoas> peso) {
            return "Alguém deve descer";
        } else {
            return "Elevador pode ir";
        }


    }

    @GetMapping("/descer/{quem}")
    public String descer(@PathVariable("quem") String quem) {
        if (quem.equals("m")) {
            this.pesoComPessoas -= 90;
        } else if (quem.equals("f")) {
            this.pesoComPessoas -= 70;
        } else if (quem.equals("c")) {
            this.pesoComPessoas -= 40;
        } else {
            return "Valor inválido. Informe m, f ou c";
        }

        if (pesoComPessoas > peso) {
            return "Alguém deve descer";
        } else {
            return "Elevador pode ir";
        }
    }

    }
