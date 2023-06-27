package br.com.conta.util;

import br.com.conta.DAO.*;
import br.com.conta.model.*;
import br.com.conta.services.ServiceConta;

import java.sql.Timestamp;
import java.time.Instant;
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

    static ContaDeLuzDAO contaDeLuzDAO = new ContaDeLuzDAO();

    public static void main(String[] args) throws Exception {
        //cobrancaDAO.deleteCobranca(1);
       // tarifaDAO.deleteTarifa(1);
        //medicaoDAO.deleteMedicao(3);
       //timeRotaDAO.deleteTimeRota(1);
        //tarefaRotaDAO.deleteTarefaRota(1);
        //contratoDAO.deleteContrato(1);
        //medidorDAO.deleteMedidor(1);
        //classeDAO.deleteClasse(1);
        //rotaDAO.deleteRota(1);
        //funcionarioDAO.deleteFuncionario(1);
        //clienteDAO.deleteCliente(2);
        //clienteDAO.deleteCliente(3);
       // clienteDAO.deleteCliente(5);
        //tipofaseDAO.deleteTipoFase(1);
       // pessoaDAO.deletePessoa(1);
        //TipoPessoa tipoPessoa = new TipoPessoa("novo");
       // tipopessoaDAO.insertTipoPessoa(tipoPessoa);
        //tipopessoaDAO.deleteTipoPessoa(7);
     //TipoPessoa tipoPessoa2 = new TipoPessoa(1, "CPF");
     //tipopessoaDAO.updateTipoPessoa(tipoPessoa2);
       // posteDAO.deletePoste(1);
        //Poste poste1 = new Poste("4984534", "6749834", "679458043", "No Solo");
       // posteDAO.insertPoste(poste1);
      //Poste poste2 = new Poste(2,"1", "6749834", "679458043", "No Solo");
      // posteDAO.updatePoste(poste2);
       //System.out.println(posteDAO.selectPosteById(1));
      //  Poste poste = posteDAO.selectPosteById(2);
         //TipoPessoa tipoPessoa = tipopessoaDAO.selectTipoPessoaById(2);
        //Pessoa pessoa = new Pessoa(2,"L", "06984803330", tipoPessoa, "675784033");
        //pessoaDAO.updatePessoa(pessoa);
        // pessoaDAO.insertPessoa(pessoa);
        //System.out.print(tipopessoaDAO.selectTipoPessoaById(1));
         //TipoPessoa tipoPessoa = tipopessoaDAO.selectTipoPessoaById(2);
        //System.out.print(tipopessoaDAO.selectTipoPessoaById(1));
       // Pessoa pessoa = pessoaDAO.selectPessoaById(20);
        //pessoaDAO.insertPessoa(pessoa);
        //System.out.print(pessoaDAO.selectPessoaById(22));
         //tipopessoaDAO.deleteTipoPessoa(5);
       // TipoFase tipoFase = new TipoFase(2,"Monofasico");
        //tipofaseDAO.insertTipoFase(tipoFase);
       // tipofaseDAO.updateTipoFase(tipoFase);
      //  TipoFase tipoFase = tipofaseDAO.selectTipoFaseById(2);
        //System.out.print(tipofaseDAO.selectTipoFaseById(1));
      // Cliente cliente = new Cliente(6,"0698480332301", "4", pessoa);
       // clienteDAO.insertCliente(cliente);
       // clienteDAO.updateCliente(cliente);
        // System.out.print(clienteDAO.selectClienteById(1));
      //  Cliente cliente = clienteDAO.selectClienteById(6);
       // Funcionario funcionario = new Funcionario(4,"Eu",pessoa);
        //funcionarioDAO.insertFuncionario(funcionario);
        //funcionarioDAO.updateFuncionarioi(funcionario);
        //System.out.print(funcionarioDAO.selectFuncionario(3));
       // Funcionario funcionario = funcionarioDAO.selectFuncionario(4);
        //Rota rota = new Rota(2,"Carlito");
        //rotaDAO.insertRota(rota);
        //rotaDAO.updateRota(rota);
        //System.out.print(rotaDAO.selectRota(1));
     //   Rota rota = rotaDAO.selectRota(2);
       // Classe classe = new Classe(2,"Updated", tipoFase);
        //classeDAO.insertClasse(classe);
     //classeDAO.updateClasse(classe);
       // System.out.print(classeDAO.selectClasseById(1));
     //   Classe classe = classeDAO.selectClasseById(2);
       // Medidor medidor = new Medidor(2,"Medidor0", rota, poste);
        //medidorDAO.insertMedidor(medidor);
        //medidorDAO.updateMedidor(medidor);
        //System.out.print(medidorDAO.selectMedidorById(1));
     //   Medidor medidor = medidorDAO.selectMedidorById(2);
      //  Timestamp ts = Timestamp.from(Instant.now());
        //Contrato contrato = new Contrato(2,"2021", ts, ts, medidor, classe, cliente);
       // contratoDAO.insertContrato(contrato);
        //contratoDAO.updateContrato(contrato);
       // System.out.print(contratoDAO.selectContratoById(1));
     //  Contrato contrato = contratoDAO.selectContratoById(2);
        //TarefaRota tarefaRota = new TarefaRota(2, "fazer", ts, ts, "tarefa", rota);
        //tarefaRotaDAO.updateTarefaRota(tarefaRota);
        //tarefaRotaDAO.insertTarefaRota(tarefaRota);
        // System.out.println(tarefaRotaDAO.selectTarefaRota(1));
     //   TarefaRota tarefaRota = tarefaRotaDAO.selectTarefaRota(2);
     //TimeRota timeRota = new TimeRota(2, funcionario, tarefaRota);
        //timeRotaDAO.setInsertTimeRotaSQL(timeRota);
       // timeRotaDAO.updateTimeRota(timeRota);
        //System.out.print(timeRotaDAO.selectTimeRota(1));
       // TimeRota timeRota = timeRotaDAO.selectTimeRota(2);
       // Medicao medicao = new Medicao(4,"Maio", "2023", ts, "Muito", medidor, timeRota);
        //medicaoDAO.insertMedicao(medicao);
        //medicaoDAO.updateMedicao(medicao);
        //System.out.print(medicaoDAO.selectMedicaoById(1));
      //  Medicao medicao = medicaoDAO.selectMedicaoById(4);
       // Tarifa tarifa = new Tarifa(2,"Baixa", classe, "8753", "14/01", "14/05", "Alta");
        //tarifaDAO.insertTarifa(tarifa);
        //tarifaDAO.updateTarifa(tarifa);
        //System.out.println(tarifaDAO.selectTarifaById(1));
       // Tarifa tarifa = tarifaDAO.selectTarifaById(2);
      //  Cobranca cobranca = new Cobranca(2,"Outubro", "2023", tarifa, medicao);
       // cobrancaDAO.insertCobranca(cobranca);
       // cobrancaDAO.updateCobranca(cobranca);
        //System.out.println(cobrancaDAO.selectCobrancaById(1));
        //Cobranca cobranca = cobrancaDAO.selectCobrancaById(1);
        ServiceConta serviceConta = new ServiceConta(contaDeLuzDAO);
        ContaDeLuz response = serviceConta.ConsultContabyCPF("06984803330");
        System.out.println(response);
    }
}