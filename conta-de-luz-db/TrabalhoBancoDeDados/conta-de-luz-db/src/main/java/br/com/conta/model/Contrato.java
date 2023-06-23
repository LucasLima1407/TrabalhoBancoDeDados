package br.com.conta.model;

import br.com.conta.DAO.MedidorDAO;
import br.com.conta.DAO.ClasseDAO;
import br.com.conta.DAO.ClienteDAO;

public class Contrato extends GenericModel {
    private String descricao;
    private String data_inicio;
    private String data_criacao;
    private int medidor_id;
    private int classe_id;
    private int cliente_id;

    public Contrato(String descricao, String data_inicio, String data_criacao, int medidor_id, int classe_id, int cliente_id) {
        this.descricao = descricao;
        this.data_inicio = data_inicio;
        this.data_criacao = data_criacao;
        this.medidor_id = medidor_id;
        this.classe_id = classe_id;
        this.cliente_id = cliente_id;
    }
    public Contrato(int id, String descricao, String data_inicio, String data_criacao, int medidor_id, int classe_id, int cliente_id) {
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

    public int getMedidor_id() {
        return medidor_id;
    }

    public void setMedidor_id(int medidor_id) {
        this.medidor_id = medidor_id;
    }

    public int getClasse_id() {
        return classe_id;
    }

    public void setClasse_id(int classe_id) {
        this.classe_id = classe_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    @Override
    public String toString() {
        return "Contrato {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + getDescricao() + "\'" +
                "data_inicio='" + getData_inicio() + "\'" +
                "data_criacao='" + getData_criacao() + "\'" +
                "medidor='" + MedidorDAO.selectMedidorById(medidor_id) + "\'" +
                "classe='" + ClasseDAO.selectClasseById(classe_id) + "\'" +
                "cliente='" + ClienteDAO.selectClienteById(cliente_id) + "\'" +
                '}';
    }
}
