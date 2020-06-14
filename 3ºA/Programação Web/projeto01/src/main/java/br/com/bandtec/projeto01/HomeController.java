package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HomeController {

    @GetMapping
    public String getFraseInicial() {
        return "É nóis no Spring Boot!";
    }

    @GetMapping("/cumprimentar")
    public String cumprimentar() {
        return "Boa noite, meu querido!";
    }

    @GetMapping("/beijar/{quem}")
    public String beijar(@PathVariable("quem") String quem) {
        return "Beijo, "+quem+"!!!";
    }

    @GetMapping("/multiplicar/{n1}/{n2}")
    public String multiplicar(@PathVariable("n1") Double n1,
                              @PathVariable("n2") Double n2) {
        return "A multiplicação dá: " + (n1*n2);
    }
    @GetMapping("/calcular/{nome}/{nota1}/{nota2}")
    public String calcular(@PathVariable("nome") String nome,
                           @PathVariable("nota1") Double nota1,
                           @PathVariable("nota2") Double nota2) {
        Double media = (nota1+nota2)/2;

        if(media>=5) {
            return "Olá, " + nome+ ", sua média foi de " + (media) + " e seu resultado" +
                    " foi aprovado";
        } else {

            return "Olá, " + nome + ", sua média foi de " + (media) + " e seu resultado" +
                    " foi reprovado";

        }


    }

    @GetMapping("/meupet")
    public Animal getMeuPet() {
        Animal pet = new Animal("Xena", "Cachorro", 5);
        return pet;
    }

    @GetMapping("/varios-pets")
    public List<Animal> getVariosPets() {
        List animais = Arrays.asList(
                new Animal("Xena", "Cachorro", 5),
                new Animal("Batman", "Cachorro", 8),
                new Animal("Louro Jose", "Papagaio", 8)

        );

        return animais;
    }
}
