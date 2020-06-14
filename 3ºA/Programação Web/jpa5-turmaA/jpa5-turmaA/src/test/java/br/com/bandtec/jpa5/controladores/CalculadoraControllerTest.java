package br.com.bandtec.jpa5.controladores;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraControllerTest {

    @Test
    @DisplayName("Soma entre 2 números")
    void somaEntre2Numeros() {

        // cenário 1
        Double n1 = 10.0;
        Double n2 = 20.0;
        Double esperado = 30.0;

        CalculadoraController controller = new CalculadoraController();
        ResponseEntity resposta = controller.somar(n1,n2);

        assertEquals(esperado, resposta.getBody(), "A soma entre "+n1+" e "+n2+" deve dar "+esperado);

        // cenário 2
        n1 = -15.0;
        n2 = 20.0;
        esperado = 7.0;

        resposta = controller.somar(n1,n2);

        assertEquals(esperado, resposta.getBody(), "A soma entre "+n1+" e "+n2+" deve dar "+esperado);

    }

    @Test
    void dividir() {
        CalculadoraController controller = new CalculadoraController();

        // cenário 1
        double n1 = 40;
        double n2 = 2;
        double esperado = 20;
        ResponseEntity resposta = controller.dividir(n1, n2);
        assertEquals(200, resposta.getStatusCodeValue(), "Divisão possível deve retornar status 200");
        assertEquals(esperado, resposta.getBody(), "Divisão entre "+n1+" e "+n2+" deve dar "+esperado);

        // cenário 2
        n1 = 10;
        n2 = 0;
        resposta = controller.dividir(n1, n2);
        assertEquals(400, resposta.getStatusCodeValue(), "Divisão por 0 deve retornar status 400");
        assertEquals("Não posso dividir por 0!", resposta.getBody());

    }

    @Test
    void testarConfiguracoes() throws NoSuchMethodException {

        Class classe = CalculadoraController.class;

        // verificando se a classe está anotada com @RestController
        assertTrue(classe.isAnnotationPresent(RestController.class),
                    "A classe deve estar anotada com @RestController");

        Method somar = classe.getDeclaredMethod("somar", Double.class, Double.class);

        assertTrue(somar.isAnnotationPresent(GetMapping.class),
                    "Método somar() deve estar anotado com @GetMapping");

        String uriEsperada = "/somar/{n1}/{n2}";
        assertEquals(uriEsperada, somar.getDeclaredAnnotation(GetMapping.class).value()[0],
                "A URI de somar() deve ser "+uriEsperada);
    }
}



