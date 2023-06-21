package br.com.conta.model;

public class Classe extends GenericModel{
    private String descricao;
    private Integer tipo_fase_id;

    public Classe(String descricao, int tipo_fase_id) {
        this.descricao = descricao;
        this.tipo_fase_id = tipo_fase_id;
    }
    public Classe(Integer id, String descricao, Integer tipo_fase_id){
        this.descricao = descricao;
        this.tipo_fase_id = tipo_fase_id;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getTipo_fase_id() {
        return tipo_fase_id;
    }

    public void setTipo_fase_id(Integer tipo_fase_id) {
        this.tipo_fase_id = tipo_fase_id;
    }

    @Override
    public String toString() {
        return "Classe {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + getDescricao() + "\'" +
                "tipo_fase='" + TipoFaseDAO.selectTipoFase(tipo_fase_id) + "\'" +
                '}';
    }
}
}