package br.com.guilhermeveloso.ProjetoVassCommerce.Modelos;

public class Cliente {

    private Integer id;
    private String nomeCompleto;
    private String email;
    private String fotoUrl;
    private String dataNascimento;
    private String cpf;

    public Cliente() {
    }

    public Cliente(
            Integer id,
            String nomeCompleto,
            String email,
            String fotoUrl,
            String dataNascimento,
            String cpf
    ) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.fotoUrl = fotoUrl;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
