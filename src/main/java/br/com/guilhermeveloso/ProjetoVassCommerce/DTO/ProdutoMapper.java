package br.com.guilhermeveloso.ProjetoVassCommerce.DTO;

import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.Produto;

public class ProdutoMapper {

    public static Produto toEntity(
            ProdutoCreateRequest request,
            Integer id
    ) {

        return new Produto(
                id,
                request.getNome(),
                request.getDescricao(),
                request.getPreco(),
                request.getDataInicio(),
                request.getDataCadastro(),
                request.getDataUltimaAtualizacao(),
                request.getValorUnitario(),
                request.getIdCategoria()
        );
    }

    public static ProdutoResponse toResponse(Produto produto) {

        return new ProdutoResponse(
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getPreco(),
                produto.getDataInicio(),
                produto.getDataCadastro(),
                produto.getDataUltimaAtualizacao(),
                produto.getValorUnitario(),
                produto.getIdCategoria()
        );
    }
}