package br.com.conta.model;

import br.com.conta.DAO.PessoaDAO;

public class Funcionario extends GenericModel {
    private String codigo_funcionario;
    private int pessoa_id;

    private static final PessoaDAO pessoaDAO = new PessoaDAO();

    public Funcionario(String codigo_funcionario, int pessoa_id) {
        this.codigo_funcionario = codigo_funcionario;
        this.pessoa_id = pessoa_id;
    }
    public Funcionario(int id, String codigo_funcionario, int pessoa_id) {
        this.codigo_funcionario = codigo_funcionario;
        this.pessoa_id = pessoa_id;
        super.setId(id);
    }

    public String getCodigo_funcionario() {
        return codigo_funcionario;
    }

    public void setCodigo_funcionario(String codigo_funcionario) {
        this.codigo_funcionario = codigo_funcionario;
    }

    public int getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoal_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

    @Override
    public String toString() {
        return "Funcionario {" +
                "id='" + this.getId() + "\'" +
                "codigo_funcionario='" + getCodigo_funcionario() + "\'" +
                "pessoa='" + pessoaDAO.selectPessoaById(pessoa_id) + "\'" +
                '}';
    }
}
