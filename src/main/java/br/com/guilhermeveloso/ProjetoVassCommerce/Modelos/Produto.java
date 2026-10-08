package br.com.guilhermeveloso.ProjetoVassCommerce.Modelos;

import java.math.BigDecimal;

public class Produto {

    private Integer id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private String dataInicio;
    private String dataCadastro;
    private String dataUltimaAtualizacao;
    private BigDecimal valorUnitario;
    private Integer idCategoria;

    public Produto() {
    }

    public Produto(
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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(String dataUltimaAtualizacao) {
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
}
