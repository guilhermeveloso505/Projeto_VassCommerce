package br.com.guilhermeveloso.ProjetoVassCommerce.Controlador;

import br.com.guilhermeveloso.ProjetoVassCommerce.Data.DataStore;
import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.Categoria;
import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.Produto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaControlador {

    @GetMapping
    public ResponseEntity<List<Categoria>> listar(
            @RequestParam(required = false) String nome
    ) {

        if (nome == null || nome.isBlank()) {
            return ResponseEntity.ok(DataStore.categorias);
        }

        List<Categoria> resultado = DataStore.categorias
                .stream()
                .filter(categoria ->
                        categoria.getNome()
                                .toLowerCase()
                                .contains(nome.toLowerCase())
                )
                .toList();

        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/{idcategoria}/produto")
    public ResponseEntity<List<Produto>> listarProdutos(
            @PathVariable Integer idcategoria
    ) {

        boolean categoriaExiste = DataStore.categorias
                .stream()
                .anyMatch(categoria -> categoria.getId().equals(idcategoria));

        if (!categoriaExiste) {
            return ResponseEntity.notFound().build();
        }

        List<Produto> resultado = DataStore.produtos
                .stream()
                .filter(produto ->
                        produto.getIdCategoria().equals(idcategoria)
                )
                .toList();

        return ResponseEntity.ok(resultado);
    }
}