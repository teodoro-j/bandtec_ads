package br.com.bandtec.jpaclienterest.clientes;

import br.com.bandtec.jpaclienterest.modelos.Cep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "viacep", url = "https://viacep.com.br")
public interface ClienteViaCep {

    @GetMapping("/ws/{cep}/json")
    Cep getCep(@PathVariable String cep);

}
