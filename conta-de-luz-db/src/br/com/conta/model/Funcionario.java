package br.com.conta.model;

public class Funcionario extends GenericModel {
    private String codigo_funcionario;
    private Interger pessoa_id;

    public Funcionario(String codigo_funcionario, Interger pessoa_id) {
        this.codigo_funcionario = codigo_funcionario;
        this.pessoal_id = pessoa_id;
    }
    public Funcionario(Interger id, String codigo_funcionario, Interger pessoa_id) {
        this.codigo_funcionario = codigo_funcionario;
        this.pessoal_id = pessoa_id;
        super.setId(id)
    }

    public String getCodigo_funcionario() {
        return codigo_funcionario;
    }

    public void setCodigo_funcionario(String codigo_funcionario) {
        this.codigo_funcionario = codigo_funcionario;
    }

    public Interger getPessoa_id() {
        return pessoal_id;
    }

    public void setPessoal_id(Interger pessoa_id) {
        this.pessoal_id = pessoa_id;
    }

    @Override
    public String toString() {
        return "Funcionario {" +
                "id='" + this.getId() + "\'" +
                "codigo_funcionario='" + getCodigo_funcionario() + "\'" +
                "pessoa='" + PessoaDAO.selectPessoa(pessoa_id) + "\'" +
                '}';
    }
}
}