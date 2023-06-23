package br.com.conta.model;

import br.com.conta.DAO.TipoPessoaDAO;

public class Pessoa extends GenericModel {

    static private TipoPessoaDAO tipoPessoaDAO = new TipoPessoaDAO();
    private final String nome;
    private final String cpf;

    private String cnpj;

    private final Integer tipoPessoa;


    public Pessoa(Integer id, String nome, String cpf, Integer tipoPessoa) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoPessoa = tipoPessoa;
        super.setId(id);
    }

    public Pessoa(Integer id, String nome, String cpf, Integer tipoPessoa, String cnpj ) throws Exception {
        this(id, nome, cpf, tipoPessoa);

        this.cnpj = cnpj;

    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Integer getTipoPessoa() {
        return tipoPessoa;
    }

    @Override
    public String toString() {
        return "Pessoa { \n" +
                "\t id= '" + this.getId() + "' \n" +
                "\t nome = '" + getNome() + "' \n" +
                "\t cpf = '" + getCpf() + "' \n" +
                "\t tipo_pessoa =  " + tipoPessoaDAO.selectTipoPessoaById(tipoPessoa) + "\n" +
                "\t }";
    }
}
