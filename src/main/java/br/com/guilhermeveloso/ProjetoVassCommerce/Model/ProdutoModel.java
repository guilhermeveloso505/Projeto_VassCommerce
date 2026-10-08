package br.com.guilhermeveloso.ProjetoVassCommerce.Model;

import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.Produto;
import br.com.guilhermeveloso.ProjetoVassCommerce.DTO.ProdutoCreateRequest;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ProdutoModel {

    Produto criar(ProdutoCreateRequest req);

    Optional<Produto> obterPorId(Long id);

    List<Produto> buscar(
            String nome,
            BigDecimal valorMinimo,
            BigDecimal valorMaximo
    );
}