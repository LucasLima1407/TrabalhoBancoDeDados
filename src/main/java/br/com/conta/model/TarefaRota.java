package br.com.conta.model;

import br.com.conta.DAO.RotaDAO;

import java.sql.Timestamp;
public class TarefaRota extends  GenericModel {
    private String obervacao;
    private Timestamp data_inicio;
    private Timestamp data_final;

    private Rota rota_model;


    public TarefaRota(Integer id, String obervacao, Timestamp data_inicio, Timestamp data_final, Rota rota_model) {
        this.obervacao = obervacao;
        this.data_inicio = data_inicio;
        this.data_final = data_final;
        this.rota_model = rota_model;

        super.setId(id);
    }


    public String getObervacao() {
        return obervacao;
    }

    public Timestamp getData_inicio() {
        return data_inicio;
    }

    public Timestamp getData_fim() {
        return data_final;
    }

    public int getRotaModel() {
        return rota_model.getId();
    }

    @Override
    public String toString() {
        return "tarefa_rota { \n" +
                "\t id='" + this.getId() + "\' \n"  +
                "\t observacao=" + obervacao + "\n" +
                "\t data_inicio= " + data_inicio + "\n" +
                "\t data_final="+ data_final + "\n"+
                "\t rota = " + getRotaModel() +
                "\t } ";
    }
}