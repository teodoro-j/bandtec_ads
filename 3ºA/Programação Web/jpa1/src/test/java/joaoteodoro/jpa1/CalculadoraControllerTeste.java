package joaoteodoro.jpa1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraControllerTest {

    @Test
    @DisplayName("Subtração entre 2 números")
    void subtrair() {

        // cenário 1
        Double n1 = 10.0;
        Double n2 = 20.0;
        Double esperado = 10.0;

        CalculadoraController controller = new CalculadoraController();
        ResponseEntity resposta = controller.subtrair(n1, n2);

        assertEquals(esperado, resposta.getBody(), "A subtração entre " + n1 + " e " + n2 + " deve dar " + esperado);

        // cenário 2
        n1 = -100.0;
        n2 = 20.0;
        esperado = -80.0;

        resposta = controller.subtrair(n1, n2);

        assertEquals(esperado, resposta.getBody(), "A subtração entre " + n1 + " e " + n2 + " deve dar " + esperado);

        // cenário 3
        n1 = 100.0;
        n2 = -500.0;
        esperado = -400.0;

        resposta = controller.subtrair(n1, n2);

        assertEquals(esperado, resposta.getBody(), "A subtração entre " + n1 + " e " + n2 + " deve dar " + esperado);

        // cenário 4
        n1 = -50.0;
        n2 = 200.0;
        esperado = 150.0;

        resposta = controller.subtrair(n1, n2);

        assertEquals(esperado, resposta.getBody(), "A subtração entre " + n1 + " e " + n2 + " deve dar " + esperado);

        // cenário 4
        n1 = -50.0;
        n2 = 200.0;
        esperado = -250.0;

        resposta = controller.subtrair(n1, n2);

        assertEquals(esperado, resposta.getBody(), "A subtração entre " + n1 + " e " + n2 + " deve dar " + esperado);

    }

    @Test
    void calcularMedia() {
        CalculadoraController controller = new CalculadoraController();

        // cenário 1
        double n1 = 8.0;
        double n2 = 6.0;
        double esperado = 7.0;

        ResponseEntity resposta = controller.calcularMedia(n1, n2);
        assertEquals(esperado, resposta.getBody(), "A média entre " + n1 + " e " + n2 + " deve dar " + esperado);

        // cenário 2
        n1 = 2.0;
        n2 = 5.0;
        esperado = 7.0;

        resposta = controller.calcularMedia(n1, n2);
        assertEquals(esperado, resposta.getBody(), "A média entre " + n1 + " e " + n2 + " deve dar " + esperado);

        // cenário 3
        n1 = 5.0;
        n2 = 5.0;
        esperado = 7.0;

        resposta = controller.calcularMedia(n1, n2);
        assertEquals(esperado, resposta.getBody(), "A média entre " + n1 + " e " + n2 + " deve dar " + esperado);

    }

    @Test
    void testarConfiguracoes() throws NoSuchMethodException {

        Class classe = CalculadoraController.class;

        // verificando se a classe está anotada com @RestController
        assertTrue(classe.isAnnotationPresent(RestController.class),
                "A classe deve estar anotada com @RestController");

        Method subtrair = classe.getDeclaredMethod("subtrair", Double.class, Double.class);

        assertTrue(subtrair.isAnnotationPresent(GetMapping.class),
                "Método subtrair() deve estar anotado com @GetMapping");

        String uriEsperada = "/subtrair/{n1}/{n2}";
        assertEquals(uriEsperada, subtrair.getDeclaredAnnotation(GetMapping.class).value()[0],
                "A URI de subtrair() deve ser " + uriEsperada);
    }

    @Test
    @DisplayName("Subtração entre 3 números")
    void calcularMediaC() {
        CalculadoraController controller = new CalculadoraController();

        // cenário 1
        double n1 = 8.0;
        double n2 = 6.0;
        double n3 = 8.0;
        double esperado = 7.6;

        ResponseEntity resposta = controller.calcularMediaC(n1, n2, n3);
        assertEquals(esperado, resposta.getBody(), "A média entre " + n1 + " e " + n2 + " e " + n3 + "  deve dar " + esperado);

        // cenário 2
        n1 = 3.5;
        n2 = 5.0;
        n3 = 9.0;
        esperado = 7.0;

        resposta = controller.calcularMediaC(n1, n2, n3);
        assertEquals(esperado, resposta.getBody(), "A média entre " + n1 + " e " + n2 + " e " + n3 + "  deve dar " + esperado);

    }

    @Test
    void testarConfiguracoesDois() throws NoSuchMethodException {

        Class classe = CalculadoraController.class;

        // verificando se a classe está anotada com @RestController
        assertTrue(classe.isAnnotationPresent(RestController.class),
                "A classe deve estar anotada com @RestController");

        Method calcularMediaC = classe.getDeclaredMethod("mediacomp", Double.class, Double.class, Double.class);

        assertTrue(calcularMediaC.isAnnotationPresent(GetMapping.class),
                "Método calcularMediaC() deve estar anotado com @GetMapping");

        String uriEsperada = "/mediacomp/{n1}/{n2}";
        assertEquals(uriEsperada, calcularMediaC.getDeclaredAnnotation(GetMapping.class).value()[0],
                "A URI de mediacomp() deve ser " + uriEsperada);
    }
}
