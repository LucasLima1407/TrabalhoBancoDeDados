package br.com.conta.model;

public class Medicao extends GenericModel {
    private String mes;
    private String ano;
    private String data_medicao;
    private String consumo;
    private Interger medidor_id;
    private Interger time_rota_id;

    public Medicao(String mes, String ano, String data_medicao, String consumo, Interger medidor_id, Interger time_rota_id) {
        this.mes = mes;
        this.ano = ano;
        this.data_medicao = data_medicao;
        this.consumo = consumo;
        this.medidor_id = medidor_id;
        this.time_rota_id = time_rota_id;
    }
    public Medicao(Interger id,String mes, String ano, String data_medicao, String consumo, Interger medidor_id, Interger time_rota_id) {
        this.mes = mes;
        this.ano = ano;
        this.data_medicao = data_medicao;
        this.consumo = consumo;
        this.medidor_id = medidor_id;
        this.time_rota_id = time_rota_id;
        super.setId(id);
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getData_medicao() {
        return data_medicao;
    }

    public void setData_medicao(String data_medicao) {
        this.data_medicao = data_medicao;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public Interger getMedidor_id() {
        return medidor_id;
    }

    public void setMedidor_id(Interger medidor_id) {
        this.medidor_id = medidor_id;
    }

    public Interger getTime_rota_id() {
        return time_rota_id;
    }

    public void setTime_rota_id(Interger time_rota_id) {
        this.time_rota_id = time_rota_id;
    }

    @Override
    public String toString() {
        return "Medicao {" +
                "id='" + this.getId() + "\'" +
                "ano='" + getAno() + "\'" +
                "mes='" + getMes() + "\'" +
                "data_medicao='" + getData_medicao() + "\'" +
                "consumo='" + getConsumo() + "\'" +
                "medidor='" + MedidorDAO.selectMedidorById(medidor_id) + "\'" +
                "time_rota='" + TimeRotaDAO.selectTimeRotaById(time_rota_id) + "\'" +
                '}';
    }
}
