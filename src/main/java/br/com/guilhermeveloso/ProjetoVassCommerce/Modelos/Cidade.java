package br.com.guilhermeveloso.ProjetoVassCommerce.Modelos;

public class Cidade {

    private Integer id;
    private String nome;
    private Integer idEstado;

    public Cidade() {
    }

    public Cidade(Integer id, String nome, Integer idEstado) {
        this.id = id;
        this.nome = nome;
        this.idEstado = idEstado;
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

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
}