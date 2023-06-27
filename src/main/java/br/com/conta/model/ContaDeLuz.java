package br.com.conta.model;

public class ContaDeLuz extends GenericModel {

    private String nome;
    private String cpf;
    private String cnpj;
    private String poste;
    private String classe;
    private String tipoFase;

    public ContaDeLuz(String nome, String cpf, String cnpj, String poste, String classe, String tipoFase) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.poste = poste;
        this.classe = classe;
        this.tipoFase = tipoFase;
    }

    public String getPoste() {
        return poste;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getClasse() {
        return classe;
    }

    public String getTipoFase() {
        return tipoFase;
    }
    public String getCpf() {
        return cpf;
    }
    @Override
    public String toString() {
        return "ContaDeLuz{ \n" +
                " \tnome=" + getNome() + "\n" +
                " \tcpf=" + getCpf() + "\n" +
                " \tcnpj=" + getCnpj() + "\n" +
                " \tposte=" + getPoste() + "\n" +
                " \tclasse=" + getClasse() + "\n" +
                " \ttipoFase=" + getTipoFase() + "\n" +
                '}';
    }

}
