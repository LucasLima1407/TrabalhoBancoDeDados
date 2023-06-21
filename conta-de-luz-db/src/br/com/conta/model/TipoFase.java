package br.com.conta.model;

public class TipoFase extends GenericModel {
    private String descricao;

    public Funcionario(String descricao) {
        this.descricao = descricao;
    }
    public Funcionario(String descricao) {
        this.descricao = descricao;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return "TipoFase {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + getDescricao() + "\'" +
                '}';
    }
}
}