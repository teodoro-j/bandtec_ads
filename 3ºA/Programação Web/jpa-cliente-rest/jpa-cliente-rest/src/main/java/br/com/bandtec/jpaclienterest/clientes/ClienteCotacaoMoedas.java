package br.com.bandtec.jpaclienterest.clientes;

import br.com.bandtec.jpaclienterest.modelos.ConversaoMoeda;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@FeignClient(value = "exchangeratesapi", url = "https://api.exchangeratesapi.io")
public interface ClienteCotacaoMoedas {

    @GetMapping("/latest")
    ConversaoMoeda getCotacao(@RequestParam String symbols, @RequestParam String base);

    @GetMapping("/latest")
    ConversaoMoeda getCotacaoPorData(@RequestParam String data);


}
