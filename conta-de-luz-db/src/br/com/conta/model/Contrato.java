package br.com.conta.model;

public class Contrato extends GenericModel {
    private String descricao;
    private String data_inicio;
    private String data_criacao;
    private Interger medidor_id;
    private Interger classe_id;
    private Interger cliente_id;

    public Contrato(String descricao, String data_inicio, String data_criacao, Interger medidor_id, Interger classe_id, Interger cliente_id) {
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_criacao = data_criacao;
        this.medidor_id = medidor_id;
        this.classe_id = classe_id;
        this.cliente_id = cliente_id;
    }
    public Contrato(Interger id, String descricao, String data_inicio, String data_criacao, Interger medidor_id, Interger classe_id, Interger cliente_id) {
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_criacao = data_criacao;
        this.medidor_id = medidor_id;
        this.classe_id = classe_id;
        this.cliente_id = cliente_id;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(String data_criacao) {
        this.data_criacao = data_criacao;
    }

    public Interger getMedidor_id() {
        return medidor_id;
    }

    public void setMedidor_id(Interger medidor_id) {
        this.medidor_id = medidor_id;
    }

    public Interger getClasse_id() {
        return classe_id;
    }

    public void setClasse_id(Interger classe_id) {
        this.classe_id = classe_id;
    }

    public Interger getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Interger cliente_id) {
        this.cliente_id = cliente_id;
    }
    @Override
    public String toString() {
        return "Contrato {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + getDescricao() + "\'" +
                "data_inicio='" + getData_inicio() + "\'" +
                "data_criacao='" + getData_criacao() + "\'" +
                "medidor='" + MedidorDAO.selectMedidor(medidor_id) + "\'" +
                "classe='" + ClasseDAO.selectClasse(classe_id) + "\'" +
                "cliente='" + ClienteDAO.selectCliente(cliente_id) + "\'" +
                '}';
    }
}
}