package br.com.conta.model;

import java.sql.Timestamp;
public class TarefaRota extends  GenericModel {
    private String obervacao;
    private Timestamp dataInicio;
    private Timestamp dataFinal;

    private Rota rotaId;


    public TarefaRota(Integer id, String obervacao, Timestamp dataInicio, Timestamp dataFinal, Rota rotaId) {
        this.obervacao = obervacao;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.rotaId = rotaId;

        super.setId(id);
    }


    public String getObervacao() {
        return obervacao;
    }

    public Timestamp getDataInicio() {
        return dataInicio;
    }

    public Timestamp getDataFinal() {
        return dataFinal;
    }

    public int getRotaId() {
        return rotaId.getId();
    }

    @Override
    public String toString() {
        return "tarefa_rota { \n" +
                "\t id='" + this.getId() + "\' \n"  +
                "\t observacao=" + getObervacao() + "\n" +
                "\t dataInicio= " + getDataInicio() + "\n" +
                "\t dataFinal="+ getDataFinal() + "\n"+
                "\t rota_id = " + getRotaId() +
                "\t } ";
    }
}