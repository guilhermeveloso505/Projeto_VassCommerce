package br.com.guilhermeveloso.ProjetoVassCommerce.Modelos;

public class Endereco {

    private Integer id;
    private String rua;
    private String numero;
    private String cep;
    private String complemento;
    private String telefone;
    private String bairro;
    private Integer idCliente;
    private Integer idCidade;
    private String cidade;
    private Integer idEstado;
    private String estado;
    private String sigla;

    public Endereco() {
    }

    public Endereco(
            Integer id,
            String rua,
            String numero,
            String cep,
            String complemento,
            String telefone,
            String bairro,
            Integer idCliente,
            Integer idCidade,
            String cidade,
            Integer idEstado,
            String estado,
            String sigla
    ) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.telefone = telefone;
        this.bairro = bairro;
        this.idCliente = idCliente;
        this.idCidade = idCidade;
        this.cidade = cidade;
        this.idEstado = idEstado;
        this.estado = estado;
        this.sigla = sigla;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}