package br.com.guilhermeveloso.ProjetoVassCommerce.Modelos;

public class TipoCartao {

    private Integer id;
    private String nome;

    public TipoCartao() {
    }

    public TipoCartao(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
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
}