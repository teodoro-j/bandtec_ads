package br.com.bandtec.jpa5.controladores;

import br.com.bandtec.jpa5.entidades.Aluno;
import br.com.bandtec.jpa5.repositorios.AlunoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/*
A @SpringBootTest injeta um contexto Spring no teste,
permitindo a execução de testes INTEGRADOS (ou DE INTEGRAÇÃO).
Assim, a anotação @Autowired e o uso de Mocks funcionará
 */
@SpringBootTest
class AlunoControllerTest {

    @Autowired // essa anotação em classes de teste faz o objeto ser o mais real possível
    AlunoController controller;

    @MockBean
    AlunoRepository repository;

    @Test
    void getAlunos() {

        // cenário 1: todos os alunos que AlunoRepository acha no findAll()
        //            devem ser retornados pela Controller (mesma quantidade e ordem)

        // programando o mock (repository) para se comportar de forma a ajudar em nosso teste

        // #1 - Criando um "Dummy": Lista de aluno do "banco de dados"
        List<Aluno> lista = Arrays.asList(new Aluno(), new Aluno(), new Aluno());

        // #2 - Programando o Mock para retornar a "lista" quando pedirem seu findAll()
        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>(lista));
        // o new ArrayList<>(xxx) é para que apenas o conteúdo seja copiado e não
        // a referência em memória

        ResponseEntity resposta = controller.getAlunos();
        // isso é o corpo da resposta -> resposta.getBody() <- ou seja, isso é a List de Aluno

        // a lista do corpo da resposta possui os mesmos itens (quantidade e ordem)
        // do que o repository retornou no seu findAll() ?
        assertEquals(lista, resposta.getBody(),
                "A lista do repository deve ser a mesma da resposta do controller");

        // o status da resposta HTTP é 200?
        assertEquals(200, resposta.getStatusCodeValue());


        /*
        Cenário 2: Caso a tabela "aluno" esteja vazia, o Endpoint da Controller deve retornar:
                   a) nulo no corpo
                   b) código HTTP 204 (no-content)
         */

        // programando o Mock para retornar uma lista vazia (Repositories nunca retornam null)
        Mockito.when(repository.findAll()).thenReturn(new ArrayList<>());

        resposta = controller.getAlunos();

        assertNull(resposta.getBody(), "O corpo da resposta deve ser nulo");

        assertEquals(204, resposta.getStatusCodeValue(), "Consulta sem conteúdo deve retornar 204");

    }

    @Test
    void getAluno() {
         // Criando os dublês simples (dummy) usados pelo Mock

         Integer id = 99;

         Aluno aluno = new Aluno();
         aluno.setId(id);
         aluno.setNome("Zé Ruela");


         /*
         Cenário 1: Id válido traz um Aluno que não pode ser alterado pela controller
          */

         // programando o Mock para retornar o "aluno" em caso de findById()
         Mockito.when(repository.findById(id)).thenReturn(Optional.of(aluno));

         ResponseEntity resposta = controller.getAluno(id);

         assertEquals(200, resposta.getStatusCodeValue(),
                    "Aluno encontrado deve retornar status 200");

         assertEquals(aluno, resposta.getBody(),
                    "O aluno que o repository retornou deve ser o mesmo do controller");

         /*
         Cenário 2: Id inválido provoca um 404 - no content
          */

         // programando o Mock para retornar um Optional vazio em caso de findById()
        Mockito.when(repository.findById(id)).thenReturn(Optional.empty());

        resposta = controller.getAluno(798);

        assertEquals(404, resposta.getStatusCodeValue(),
                    "Consulta por id inválido deve retornar status 404");

        assertNull(resposta.getBody(), "Consulta por id inválido deve vir sem corpo");
    }

    @Test
    void deleteAluno() {
        // Criando os dublês simples (dummy) usados pelo Mock
        Integer id = 99;
        List<Aluno> lista = new ArrayList<>(Arrays.asList(new Aluno(), new Aluno(), new Aluno()));

        /*
        Cenário 1: id válido
         */
        Mockito.when(repository.findAll()).thenReturn(lista);
        ResponseEntity respostaAntes = controller.getAlunos();
        int alunosAntes = ((List) respostaAntes.getBody()).size();

        Mockito.when(repository.existsById(id)).thenReturn(true);

        // NOVIDADE: Mockando método void
        // dentro do doAnswer(execucao-> ) indicamos o que vai acontecer
        Mockito.doAnswer(execucao -> lista.remove(0)).when(repository).deleteById(id);

        ResponseEntity respostaDelete = controller.deleteAluno(id);

        ResponseEntity respostaDepois = controller.getAlunos();
        int alunosDepois = ((List) respostaDepois.getBody()).size();

        assertEquals(200, respostaDelete.getStatusCodeValue());
        assertTrue(alunosDepois == alunosAntes-1);

        /*
        Cenário 2: id inválido
         */
        Mockito.when(repository.existsById(id)).thenReturn(false);

        respostaDelete = controller.deleteAluno(id);

        respostaDepois = controller.getAlunos();
        int alunosDepoisCenario2 = ((List) respostaDepois.getBody()).size();

        assertEquals(404, respostaDelete.getStatusCodeValue());
        assertEquals(alunosDepois, alunosDepoisCenario2);

    }
}