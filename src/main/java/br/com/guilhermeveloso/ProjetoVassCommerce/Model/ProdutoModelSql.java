package br.com.guilhermeveloso.ProjetoVassCommerce.Model;

import br.com.guilhermeveloso.ProjetoVassCommerce.DTO.ProdutoCreateRequest;
import br.com.guilhermeveloso.ProjetoVassCommerce.DTO.ProdutoMapper;
import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.Produto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service("produtoModelSql")
public class ProdutoModelSql implements ProdutoModel {

    @Override
    public Produto criar(ProdutoCreateRequest req) {
        Integer novoId =
                br.com.guilhermeveloso.ProjetoVassCommerce.Data.DataStore.produtos
                        .stream()
                        .mapToInt(Produto::getId)
                        .max()
                        .orElse(0) + 1;

        Produto produto = ProdutoMapper.toEntity(req, novoId);
        br.com.guilhermeveloso.ProjetoVassCommerce.Data.DataStore.produtos
                .add(produto);

        return produto;
    }

    @Override
    public Optional<Produto> obterPorId(Long id) {

        return br.com.guilhermeveloso.ProjetoVassCommerce.Data.DataStore.produtos
                .stream()
                .filter(produto ->
                        produto.getId().equals(id.intValue())
                )
                .findFirst();
    }

    @Override
    public List<Produto> buscar(
            String nome,
            BigDecimal valorMinimo,
            BigDecimal valorMaximo
    ) {

        return br.com.guilhermeveloso.ProjetoVassCommerce.Data.DataStore.produtos
                .stream()
                .filter(produto ->
                        nome == null ||
                                nome.isBlank() ||
                                produto.getNome()
                                        .toLowerCase()
                                        .contains(nome.toLowerCase())
                )
                .filter(produto ->
                        valorMinimo == null ||
                                produto.getPreco()
                                        .compareTo(valorMinimo) >= 0
                )
                .filter(produto ->
                        valorMaximo == null ||
                                produto.getPreco()
                                        .compareTo(valorMaximo) <= 0
                )
                .toList();
    }
}