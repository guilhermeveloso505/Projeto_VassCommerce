package br.com.guilhermeveloso.ProjetoVassCommerce.Modelos;

import java.math.BigDecimal;

public class Pedido {

    private Integer id;
    private String dataCadastro;
    private BigDecimal valorTotal;
    private Integer idCliente;
    private Integer idStatus;
    private String status;

    public Pedido() {
    }

    public Pedido(
            Integer id,
            String dataCadastro,
            BigDecimal valorTotal,
            Integer idCliente,
            Integer idStatus,
            String status
    ) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.valorTotal = valorTotal;
        this.idCliente = idCliente;
        this.idStatus = idStatus;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}