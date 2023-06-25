package br.com.conta.util;

import br.com.conta.DAO.*;
import br.com.conta.model.*;
import java.util.Arrays;

import java.sql.SQLException;

public class Teste {
    static TipoPessoaDAO tipopessoaDAO = new TipoPessoaDAO();
   static PessoaDAO pessoaDAO = new PessoaDAO();

    static FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    static PosteDAO posteDAO = new PosteDAO();

    static ClasseDAO classeDAO = new ClasseDAO();

    static CobrancaDAO cobrancaDAO = new CobrancaDAO();

    static ContratoDAO contratoDAO = new ContratoDAO();

    static MedicaoDAO medicaoDAO = new MedicaoDAO();

    static MedidorDAO medidorDAO = new MedidorDAO();

    static RotaDAO rotaDAO = new RotaDAO();

    static TarefaRotaDAO tarefaRotaDAO = new TarefaRotaDAO();

    static TarifaDAO tarifaDAO = new TarifaDAO();

    static TimeRotaDAO timeRotaDAO = new TimeRotaDAO();
    static TipoFaseDAO tipofaseDAO = new TipoFaseDAO();
    static ClienteDAO clienteDAO = new ClienteDAO();

    public static void main(String[] args) throws Exception {

        //Poste poste = new Poste(1,"4984534", "6749834", "679458043", "No Solo");
        //posteDAO.insertPoste(poste);
       //System.out.println(posteDAO.selectPosteById(1));
        // TipoPessoa tipoPessoa = tipopessoaDAO.selectTipoPessoaById(1);
        //Pessoa pessoa = new Pessoa(1,"Lucas", "06984803330", tipoPessoa, "675784033");
        // pessoaDAO.insertPessoa(pessoa);
       // TipoPessoa tipoPessoa = new TipoPessoa("novo");
       // tipopessoaDAO.insertTipoPessoa(tipoPessoa);
        //System.out.print(tipopessoaDAO.selectTipoPessoaById(1));
         TipoPessoa tipoPessoa = tipopessoaDAO.selectTipoPessoaById(2);
        //System.out.print(tipopessoaDAO.selectTipoPessoaById(1));
        Pessoa pessoa = pessoaDAO.selectPessoaById(1);
        //pessoaDAO.insertPessoa(pessoa);
        //System.out.print(pessoaDAO.selectPessoaById(22));
         //tipopessoaDAO.deleteTipoPessoa(5);
        //TipoFase tipoFase = new TipoFase("Monofasico");
        //tipofaseDAO.insertTipoFase(tipoFase);
        TipoFase tipoFase = tipofaseDAO.selectTipoFaseById(1);
        //System.out.print(tipofaseDAO.selectTipoFaseById(1));
       // Cliente cliente = new Cliente("0698480332301", "4", pessoa);
       // clienteDAO.insertCliente(cliente);
        // System.out.print(clienteDAO.selectClienteById(1));
        Cliente cliente = clienteDAO.selectClienteById(1);
        //Funcionario funcionario = new Funcionario("53473932213",pessoa);
        //funcionarioDAO.insertFuncionario(funcionario);
        //System.out.print(funcionarioDAO.selectFuncionario(3));
       // Funcionario funcionario = funcionarioDAO.selectFuncionario(1);
       // Rota rota = new Rota("Joquei Clube");
       // rotaDAO.insertRota(rota);
        //System.out.print(rotaDAO.selectRota(1));
        Rota rota = rotaDAO.selectRota(1);
        //Classe classe = new Classe("Não sei oque por aqui", tipoFase);
       // classeDAO.insertClasse(classe);
       // System.out.print(classeDAO.selectClasseById(1));
        Classe classe = classeDAO.selectClasseById(1);
    }
}