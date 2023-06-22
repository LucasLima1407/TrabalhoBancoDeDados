package br.com.conta.model;

import br.com.conta.DAO.ClasseDAO;
public class Tarifa extends GenericModel{
    private String taxa;
    private int classe_id;
    private String data_inicio;

    private String data_fim;

    private String aliquota_ICMS;

    static private final ClasseDAO classeDAO = new ClasseDAO();

    public Tarifa(String taxa, int classe_id, String data_inicio, String data_fim, String aliquota_ICMS) {
        this.taxa = taxa;
        this.classe_id = classe_id;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.aliquota_ICMS = aliquota_ICMS;
    }

    public Tarifa(int id,String taxa, int classe_id, String data_inicio, String data_fim, String aliquota_ICMS) {
        this.taxa = taxa;
        this.classe_id = classe_id;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.aliquota_ICMS = aliquota_ICMS;
        super.setId(id);
    }

    public String getTaxa() {
        return taxa;
    }

    public void setTaxa(String taxa) {
        this.taxa = taxa;
    }

    public int getClasse_id() {
        return classe_id;
    }

    public void setClasse_id(int classe_id) {
        this.classe_id = classe_id;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    public String getAliquota_ICMS() {
        return aliquota_ICMS;
    }

    public void setAliquota_ICMS(String aliquota_ICMS) {
        this.aliquota_ICMS = aliquota_ICMS;
    }

    @Override
    public String toString() {
        return "Tarifa {" +
                "id='" + this.getId() + "\'" +
                "taxa='" + getTaxa() + "\'" +
                "data_inicio='" + getData_inicio() + "\'" +
                "data_fim='" + getData_fim() + "\'" +
                "aliquota_ICMS='" + getAliquota_ICMS() + "\'" +
                "classe_id='" + classeDAO.selectClasseById(classe_id) + "\'" +
                '}';
    }
}