package joaoteodoro.jpa1;

import joaoteodoro.jpa1.controllers.EsporteController;
import joaoteodoro.jpa1.entidades.Esporte;
import joaoteodoro.jpa1.repositorios.EsporteRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EsporteControllerTeste {

    @Autowired
    EsporteController controller;

    @MockBean
    EsporteRepository repository;

    @Test
    void getEsportes() {
        List<Esporte> lista = Arrays.asList(new Esporte(), new Esporte(), new Esporte());

        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>(lista));

        ResponseEntity resposta = controller.getEsportes();

        assertEquals(lista, resposta.getBody(),
                "A lista do repository deve ser a mesma da resposta do controller");

        assertEquals(200, resposta.getStatusCodeValue());

        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>());

        resposta = controller.getEsportes();

        assertNull(resposta.getBody(), "O corpo da resposta deve ser nulo");

        assertEquals(204, resposta.getStatusCodeValue(), "Consulta sem conteúdo deve retornar 204");

    }

    @Test
    void getEsporte() {
        Integer id = 25;

        Esporte esporte = new Esporte();
        esporte.setId(id);
        esporte.setNome("Natação");

        Mockito.when(repository.findById(id)).thenReturn(Optional.of(esporte));

        ResponseEntity resposta = controller.getEsporte(id);

        assertEquals(200, resposta.getStatusCodeValue(),
                "Esporte encontrado deve retornar status 200");

        assertEquals(esporte, resposta.getBody(),
                "O esporte que o repository retornou deve ser o mesmo do controller");

        Mockito.when(repository.findById(id)).thenReturn(Optional.empty());

        resposta = controller.getEsporte(798);

        assertEquals(404, resposta.getStatusCodeValue(),
                "Consulta por id inválido deve retornar status 404");

        assertNull(resposta.getBody(), "Consulta por id inválido deve vir sem corpo");
    }

    @Test
    void deleteEsporte() {

        Integer id = 25;
        List<Esporte> lista = new ArrayList<>(Arrays.asList(new Esporte(), new Esporte(), new Esporte()));

        Mockito.when(repository.findAll()).thenReturn(lista);
        ResponseEntity respostaAntes = controller.getEsportes();
        int esportesAntes = ((List) respostaAntes.getBody()).size();

        Mockito.when(repository.existsById(id)).thenReturn(true);

        Mockito.doAnswer(execucao -> lista.remove(0)).when(repository).deleteById(id);

        ResponseEntity respostaDelete = controller.deleteEsporte(id);

        ResponseEntity respostaDepois = controller.getEsportes();
        int esportesDepois = ((List) respostaDepois.getBody()).size();

        assertEquals(200, respostaDelete.getStatusCodeValue());
        assertTrue(esportesDepois == esportesAntes-1);

        Mockito.when(repository.existsById(id)).thenReturn(false);

        respostaDelete = controller.deleteEsporte(id);

        respostaDepois = controller.getEsportes();
        int esportesDepoisCenario2 = ((List) respostaDepois.getBody()).size();

        assertEquals(404, respostaDelete.getStatusCodeValue());
        assertEquals(esportesDepois, esportesDepoisCenario2);

    }

}

