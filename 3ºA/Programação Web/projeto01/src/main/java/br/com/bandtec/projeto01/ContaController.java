package br.com.bandtec.projeto01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class ContaController {

    private Double saldo=0.0;
    private Integer operacoes = 0;

    @GetMapping
    public String inicio() {
        return "Conta Tudo Bem!";
    }

    @GetMapping("/saldo")
    public String saldo() {
        return "Seu saldo é de R$" + saldo;
    }

    @GetMapping("/depositar/{valor}")
    public void depositar(@PathVariable("valor") Double valor) {
        this.saldo +=valor;
        this.operacoes++;
    }

    @GetMapping("/sacar/{valor}")
    public void sacar(@PathVariable("valor") Double valor) {
        this.saldo -= valor;
        this.operacoes++;
    }

    @GetMapping("/contagem-operacoes")
    public Integer getOperacoes() {
        return this.operacoes;
    }
}
