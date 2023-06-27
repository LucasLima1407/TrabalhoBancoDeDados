package br.com.conta.services;

import br.com.conta.DAO.ContaDeLuzDAO;
import br.com.conta.model.ContaDeLuz;

public class ServiceConta  {

    private ContaDeLuzDAO contaDeLuzDAO;


    public ServiceConta(ContaDeLuzDAO contaDeLuzDAO) {
        this.contaDeLuzDAO = contaDeLuzDAO;
    }

    public ContaDeLuz ConsultContabyCPF(String cpf) throws  IllegalArgumentException{
        String regex = "\\d{11}";
        boolean valido = cpf.matches(regex);

        if (!valido){
            throw new IllegalArgumentException("CPF INVALIDO");
        }

        return contaDeLuzDAO.selectContaDeLuz(cpf);
    }

}