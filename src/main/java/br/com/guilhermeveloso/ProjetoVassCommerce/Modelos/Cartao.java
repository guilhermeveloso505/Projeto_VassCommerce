package br.com.guilhermeveloso.ProjetoVassCommerce.Modelos;

public class Cartao {

    private Integer id;
    private String dataCriacao;
    private Boolean exclusivo;
    private Integer idCliente;
    private Integer idTipoCartao;
    private String tipoCartao;

    public Cartao() {
    }

    public Cartao(
            Integer id,
            String dataCriacao,
            Boolean exclusivo,
            Integer idCliente,
            Integer idTipoCartao,
            String tipoCartao
    ) {
        this.id = id;
        this.dataCriacao = dataCriacao;
        this.exclusivo = exclusivo;
        this.idCliente = idCliente;
        this.idTipoCartao = idTipoCartao;
        this.tipoCartao = tipoCartao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Boolean getExclusivo() {
        return exclusivo;
    }

    public void setExclusivo(Boolean exclusivo) {
        this.exclusivo = exclusivo;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdTipoCartao() {
        return idTipoCartao;
    }

    public void setIdTipoCartao(Integer idTipoCartao) {
        this.idTipoCartao = idTipoCartao;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }
}
