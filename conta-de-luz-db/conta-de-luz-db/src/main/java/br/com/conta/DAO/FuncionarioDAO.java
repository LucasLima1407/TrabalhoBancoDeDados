package br.com.conta.DAO;

import br.com.conta.model.Funcionario;
import br.com.conta.model.Pessoa;
import br.com.conta.model.TipoPessoa;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO extends ConexaoDB{
    private static final String INSERT_FUNCIONARIO_SQL = "INSERT INTO funcionario (codigo_funcional, pessoa_id) VALUES (?, ?) ;";
    private static final String SELECT_FUNCIONARIO_BY_ID = "SELECT id, codigo_funcional, pessoa_id FROM funcionario WHERE id = ?";
    private static final String SELECT_ALL_FUNCIONARIO = "SELECT * FROM funcionario;";
    private static final String DELETE_FUNCIONARIO_SQL = "DELETE FROM funcionario WHERE id = ?;";
    private static final String UPDATE_FUNCIONARIO_SQL = "UPDATE funcionario SET codigo_funcional = ?, pessoa_id = ? WHERE id = ?;";

    public void insertFuncionarioSQL(Funcionario entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_FUNCIONARIO_SQL)) {
            preparedStatement.setString(1, entidade.getCodigo_funcionario());
            preparedStatement.setInt(2, entidade.getPessoa_id());

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Funcionario selectFuncionario(int id) {
        Funcionario entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_FUNCIONARIO_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String codigoFuncional = rs.getString("codigo_funcional");
                Integer pessoa_id = rs.getInt("pessoa_id");
                entidade = new Funcionario(id, codigoFuncional,pessoa_id );
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Funcionario> selectAllFuncionario() {
        List<Funcionario> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_FUNCIONARIO)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String codigoFuncional = rs.getString("codigo_funcional");
                int pessoa_id = rs.getInt("pessoa_id");
                entidades.add(new Funcionario(id, codigoFuncional, pessoa_id));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteFuncionario(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_FUNCIONARIO_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean updateFuncionarioi(Funcionario entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_FUNCIONARIO_SQL)) {
            statement.setString(1, entidade.getCodigo_funcionario());
            statement.setInt(1, entidade.getPessoa_id());
            statement.setInt(2, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}