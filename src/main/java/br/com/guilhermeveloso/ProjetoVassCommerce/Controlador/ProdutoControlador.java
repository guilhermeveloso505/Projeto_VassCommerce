package br.com.guilhermeveloso.ProjetoVassCommerce.Controlador;

import br.com.guilhermeveloso.ProjetoVassCommerce.DTO.ProdutoCreateRequest;
import br.com.guilhermeveloso.ProjetoVassCommerce.DTO.ProdutoMapper;
import br.com.guilhermeveloso.ProjetoVassCommerce.DTO.ProdutoResponse;
import br.com.guilhermeveloso.ProjetoVassCommerce.Model.ProdutoModel;
import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.Produto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(
        value = "/produto",
        produces = "application/json"
)
public class ProdutoControlador {

    private final ProdutoModel model;

    public ProdutoControlador(
            @Qualifier("produtoModelSql") ProdutoModel model
    ) {
        this.model = model;
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<ProdutoResponse> criar(
            @Valid @RequestBody ProdutoCreateRequest body
    ) {

        Produto created = model.criar(body);

        URI location = URI.create(
                "/produto/" + created.getId()
        );

        return ResponseEntity
                .created(location)
                .body(ProdutoMapper.toResponse(created));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoResponse> buscar(
            @PathVariable Long id
    ) {

        return model.obterPorId(id)
                .map(produto ->
                        ResponseEntity.ok(
                                ProdutoMapper.toResponse(produto)
                        )
                )
                .orElseGet(() ->
                        ResponseEntity.notFound().build()
                );
    }

    @GetMapping
    public ResponseEntity<List<ProdutoResponse>> listar(
            @RequestParam(required = false) String nome,
            @RequestParam(required = false) BigDecimal valorMinimo,
            @RequestParam(required = false) BigDecimal valorMaximo
    ) {

        List<Produto> encontrados =
                model.buscar(
                        nome,
                        valorMinimo,
                        valorMaximo
                );

        List<ProdutoResponse> resposta =
                encontrados
                        .stream()
                        .map(ProdutoMapper::toResponse)
                        .toList();

        return ResponseEntity.ok(resposta);
    }
}