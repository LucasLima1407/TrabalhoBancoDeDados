package br.com.conta.model;

import br.com.frota.DAO.TarifaDAO;
import br.com.frota.DAO.MedicaoDAO;

public class Cobranca extends GenericModel {
    private String mes_referencia;
    private String ano_referencia;
    private Interger tarifa_id;
    private Interger medicao_id;

    public Cobranca(String mes_referencia, String ano_referencia, Interger tarifa_id, Interger medicao_id) {
        this.mes_referencia = mes_referencia;
        this.ano_referencia = ano_referencia;
        this.tarifa_id = tarifa_id;
        this.medicao_id = medicao_id;
    }
    public Cobranca(Interger id, String mes_referencia, String ano_referencia, Interger tarifa_id, Interger medicao_id) {
        this.mes_referencia = mes_referencia;
        this.ano_referencia = ano_referencia;
        this.tarifa_id = tarifa_id;
        this.medicao_id = medicao_id;
        super.setId(id);
    }

    public String getMes_referencia() {
        return mes_referencia;
    }

    public void setMes_referencia(String mes_referencia) {
        this.mes_referencia = mes_referencia;
    }

    public String getAno_referencia() {
        return ano_referencia;
    }

    public void setAno_referencia(String ano_referencia) {
        this.ano_referencia = ano_referencia;
    }

    public Interger getTarifa_id() {
        return tarifa_id;
    }

    public void setTarifa_id(Interger tarifa_id) {
        this.tarifa_id = tarifa_id;
    }

    public Interger getMedicao_id() {
        return medicao_id;
    }

    public void setMedicao_id(Interger medicao_id) {
        this.medicao_id = medicao_id;
    }

    @Override
    public String toString() {
        return "Cobranca {" +
                "id='" + this.getId() + "\'" +
                "mes_referencia='" + getMes_referencia() + "\'" +
                "ano_referencia='" + getAno_referencia() + "\'" +
                "tarifa='" + TarifaDAO.selectTarifaById(tarifa_id) + "\'" +
                "medicao='" + MedicaoDAO.selectMedicaoById(medicao_id) + "\'" +
                '}';
    }
}
