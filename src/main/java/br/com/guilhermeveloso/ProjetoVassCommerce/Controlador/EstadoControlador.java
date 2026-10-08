package br.com.guilhermeveloso.ProjetoVassCommerce.Controlador;

import br.com.guilhermeveloso.ProjetoVassCommerce.Data.DataStore;
import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.Cidade;
import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.Estado;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estado")
public class EstadoControlador {

    @GetMapping
    public ResponseEntity<List<Estado>> listar() {
        return ResponseEntity.ok(DataStore.estados);
    }

    @GetMapping("/{idestado}/cidade")
    public ResponseEntity<List<Cidade>> listarCidades(
            @PathVariable Integer idestado
    ) {

        boolean estadoExiste = DataStore.estados
                .stream()
                .anyMatch(estado -> estado.getId().equals(idestado));

        if (!estadoExiste) {
            return ResponseEntity.notFound().build();
        }

        List<Cidade> resultado = DataStore.cidades
                .stream()
                .filter(cidade ->
                        cidade.getIdEstado().equals(idestado)
                )
                .toList();

        return ResponseEntity.ok(resultado);
    }
}