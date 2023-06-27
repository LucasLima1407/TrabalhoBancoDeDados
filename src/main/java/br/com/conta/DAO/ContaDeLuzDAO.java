package br.com.conta.DAO;

import br.com.conta.model.ContaDeLuz;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class ContaDeLuzDAO extends ConexaoDB{

    private static final String SELECT_CONTA_BY_ID = "SELECT tipo_fase.descricao AS tipo_fase, rota.descricao AS rota,  medidor.descricao AS medidor," +
            "poste.codigo AS poste, " +
            "pessoa.nome AS nome," +
            "pessoa.cpf AS cpf, " +
            "pessoa.cnpj AS cnpj, " +
            "classe.descricao AS classe, " +
            "tipo_fase.descricao AS tipo_fase "+
            "FROM tipo_fase " +
            "INNER JOIN classe ON classe.tipo_fase_id = tipo_fase.id " +
            "INNER JOIN contrato ON contrato.class_id = classe.id " +
            "INNER JOIN medidor ON medidor.id = contrato.medidor_id " +
            "INNER JOIN rota ON rota.id = medidor.rota_id " +
            "INNER JOIN poste ON poste.id = medidor.poste_id " +
            "INNER JOIN cliente ON cliente.id = contrato.cliente_id " +
            "INNER JOIN pessoa ON pessoa.id = cliente.pessoa_id " +
            "WHERE pessoa.cpf = ?; ";



    public ContaDeLuz  selectContaDeLuz( String cpfQuery) {
        ContaDeLuz entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_CONTA_BY_ID)) {
            preparedStatement.setString(1, cpfQuery);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String cnpj = rs.getString("cnpj");
                String poste = rs.getString("poste");
                String nome = rs.getString("nome");
                String classe = rs.getString("classe");
                String cpf = rs.getString("cpf");
                String tipoFase = rs.getString("tipo_fase");



                entidade =  new ContaDeLuz(nome, cpf, cnpj, poste, classe, tipoFase);

            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }
}