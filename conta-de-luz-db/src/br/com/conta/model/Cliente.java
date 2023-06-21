package br.com.conta.model;

public class Cliente extends GenericModel{
    private String num_documento;
    private String num_cliente;
    private Interger pessoa_id;

    public Cliente(String num_documento, String num_cliente, int pessoa_id) {
        this.num_cliente = num_cliente ;
        this.num_documento = num_cliente;
        this.pessoa_id = pessoa_id;
    }
    public Cliente(Integer id, String num_cliente,String num_documento, Integer tipo_fase_id){
        this.num_cliente = num_cliente ;
        this.num_documento = num_documento;
        this.pessoa_id = pessoa_id;
        super.setId(id);
    }

    public String getNum_documento() {
        return num_documento;
    }

    public void setNum_documento(String num_documento) {
        this.num_documento = num_documento;
    }

    public String getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(String num_cliente) {
        this.num_cliente = num_cliente;
    }

    public Interger getPessoa_id() {
        return pessoa_id;
    }

    public void setPessoa_id(Interger pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "id='" + this.getId() + "\'" +
                "num_documento='" + getNumDocumento() + "\'" +
                "num_cliente='" + getNumCliente() + "\'" +
                "pessoa='" + PessoaDAO.selectPessoa(pessoa_id) + "\'" +
                '}';
    }
}
}