package br.com.conta.model;

public class Pessoa extends GenericModel {
    private String nome;
    private String cpf;
    private String cnpj;
    private Interger tipo_pessoa_id;

    public Pessoa(String nome, String cpf, String cnpj, Interger tipo_pessoa_id) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.tipo_pessoa_id = tipo_pessoa_id;
    }
    public Pessoa(Interger id, String nome, String cpf, String cnpj, Interger tipo_pessoa_id) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.tipo_pessoa_id = tipo_pessoa_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Interger getTipo_pessoa_id() {
        return tipo_pessoa_id;
    }

    public void setTipo_pessoa_id(Interger tipo_pessoa_id) {
        this.tipo_pessoa_id = tipo_pessoa_id;
    }

    @Override
    public String toString() {
        return "Pessoa { \n" +
                "id=" + this.getId() +
                "nome=" + getNome() + "\' \n" +
                "cpf=" + getCpf() + "\' \n"  +
                "tipo_pessoa = " + tipoPessoaDAO.selectTipoPessoa(tipo_pessoa_id) + "\' \n" +
                '}';
    }
}
}