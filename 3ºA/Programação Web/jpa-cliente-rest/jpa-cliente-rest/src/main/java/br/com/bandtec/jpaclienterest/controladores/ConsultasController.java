package br.com.bandtec.jpaclienterest.controladores;

import br.com.bandtec.jpaclienterest.clientes.ClienteCotacaoMoedas;
import br.com.bandtec.jpaclienterest.clientes.ClienteViaCep;
import br.com.bandtec.jpaclienterest.modelos.Cep;
import br.com.bandtec.jpaclienterest.modelos.ConversaoMoeda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/consultas")
public class ConsultasController {

    @Autowired
    private ClienteViaCep clienteViaCep;

    @Autowired
    private ClienteCotacaoMoedas clienteCotacaoMoedas;

    @GetMapping("/cep/{cep}")
    public ResponseEntity consultarCep(@PathVariable String cep) {
        Cep cepEncontrado = clienteViaCep.getCep(cep);

        if (cepEncontrado != null) {
            return ok(cepEncontrado);
        } else {
            return notFound().build();
        }
    }

    @GetMapping("/cotacao/{de}/{para}")
    public ResponseEntity converterMoeda(@PathVariable String de, @PathVariable String para) {
        ConversaoMoeda conversaoMoeda = clienteCotacaoMoedas.getCotacao(para, de);
        return ok(conversaoMoeda);

    }

    @GetMapping("/cotacao/{data}")
    public ResponseEntity exibirCotacoes(@PathVariable String data) {
        ConversaoMoeda conversaoMoeda= clienteCotacaoMoedas.getCotacaoPorData(data);
        return ok(conversaoMoeda);
    }
}
