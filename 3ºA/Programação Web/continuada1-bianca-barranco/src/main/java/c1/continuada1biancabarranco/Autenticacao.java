package c1.continuada1biancabarranco;

import java.time.LocalDateTime;

public class Autenticacao {

    private String login = "bianca_barranco";
    private String senha = "1234";
    private LocalDateTime autenticado;

    public Autenticacao(String login, String senha, LocalDateTime autenticado) {
        this.login = login;
        this.senha = senha;
        this.autenticado = autenticado;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public LocalDateTime getAutenticado() {
        return LocalDateTime.now();
    }
}
