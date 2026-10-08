package br.com.guilhermeveloso.ProjetoVassCommerce.DTO;

import java.math.BigDecimal;

public class ProdutoResponse {

    private Integer id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private String dataInicio;
    private String dataCadastro;
    private String dataUltimaAtualizacao;
    private BigDecimal valorUnitario;
    private Integer idCategoria;

    public ProdutoResponse() {
    }

    public ProdutoResponse(
            Integer id,
            String nome,
            String descricao,
            BigDecimal preco,
            String dataInicio,
            String dataCadastro,
            String dataUltimaAtualizacao,
            BigDecimal valorUnitario,
            Integer idCategoria
    ) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.dataInicio = dataInicio;
        this.dataCadastro = dataCadastro;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.valorUnitario = valorUnitario;
        this.idCategoria = idCategoria;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public String getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }
}