package br.com.conta.util;

import br.com.conta.DAO.FuncionarioDAO;
import br.com.conta.DAO.PessoaDAO;
import br.com.conta.DAO.TipoPessoaDAO;
import br.com.conta.model.Funcionario;
import br.com.conta.model.Pessoa;
import br.com.conta.model.TipoPessoa;
import java.util.Arrays;

import java.sql.SQLException;

public class Teste {
    static TipoPessoaDAO tipo_pessoaDAO = new TipoPessoaDAO();
    static PessoaDAO pessoa = new PessoaDAO();

    static FuncionarioDAO funcionario = new FuncionarioDAO();
    public static void main(String[] args) throws Exception {

        TipoPessoa tipo_pessoa = new TipoPessoa(3, "pessoa batata doce doce");
        tipo_pessoaDAO.insertTipoPessoa(tipo_pessoa);

        System.out.print(tipo_pessoaDAO.selectTipoPessoaById(3));
        tipo_pessoaDAO.selectAllTipoPessoa().forEach(System.out::println);

        Pessoa pessoa1 = new Pessoa(1, "elisson", "544556464", 1);
        pessoa.insertPessoa(pessoa1);

        Funcionario funcionario1 = new Funcionario(1, "23123123123", 1);
        funcionario.insertFuncionarioSQL(funcionario1);

        funcionario.selectAllFuncionario().forEach(System.out::println);

    }
}