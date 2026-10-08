package br.com.guilhermeveloso.ProjetoVassCommerce.Controlador;

import br.com.guilhermeveloso.ProjetoVassCommerce.Data.DataStore;
import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.TipoCartao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipo-cartao")
public class TipoCartaoControlador {

    @GetMapping
    public ResponseEntity<List<TipoCartao>> listar() {
        return ResponseEntity.ok(DataStore.tiposCartao);
    }
}