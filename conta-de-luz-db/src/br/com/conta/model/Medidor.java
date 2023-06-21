package br.com.conta.model;

public class Medidor extends GenericModel {
    private String descricao;
    private Interger rota_id;
    private Interger poste_id;

    public Medidor(String descricao, Interger rota_id, Interger poste_id) {
        this.descricao = descricao;
        this.rota_id = rota_id;
        this.poste_id = poste_id;
    }
    public Medidor(Interger id,String descricao, Interger rota_id, Interger poste_id) {
        this.descricao = descricao;
        this.rota_id = rota_id;
        this.poste_id = poste_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Interger getRota_id() {
        return rota_id;
    }

    public void setRota_id(Interger rota_id) {
        this.rota_id = rota_id;
    }

    public Interger getPoste_id() {
        return poste_id;
    }

    public void setPoste_id(Interger poste_id) {
        this.poste_id = poste_id;
    }
    @Override
    public String toString() {
        return "Medidor {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + getDescricao() + "\'"
                "medidor='" + RotaDAO.selectRota(rota_id) + "\'" +
                "poste='" + PosteDAO.selectTimeRota(poste_id) + "\'" +
                '}';
    }
}
}