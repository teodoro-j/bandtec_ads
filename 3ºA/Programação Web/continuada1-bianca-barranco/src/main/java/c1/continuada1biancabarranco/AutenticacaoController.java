package c1.continuada1biancabarranco;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/seguranca")
public class AutenticacaoController {

    private Autenticacao autenticacao;
    private Boolean existeUsuarioAutenticado = false;


    @PostMapping("/entrar/{login}/{senha}")
    public String logar(@PathVariable("login") String login,
                        @PathVariable("senha") String senha) {
        if (existeUsuarioAutenticado == false) {
            autenticacao = new Autenticacao("bianca_barranco", "1234", LocalDateTime.now());
            if (login.equals(autenticacao.getLogin()) && senha.equals(autenticacao.getSenha())) {
                existeUsuarioAutenticado = true;
                return "Usuário autenticado";
            } else {
                existeUsuarioAutenticado = false;
                return "Falha na autenticação";
            }
        } else {
            return "Já existe usuário autenticado";
        }

    }

    @GetMapping("/usuario")
    public Autenticacao retornarAutenticado() {
        return autenticacao;
    }

    @DeleteMapping("/usuario/logoff")
    public void deslogar() {
        existeUsuarioAutenticado = false;
        autenticacao = null;
    }

}
