package br.com.conta.DAO;

import br.com.conta.model.TipoFase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class TipoFaseDAO extends  ConexaoDB{
    private static final String INSERT_TIPO_FASE_SQL = "INSERT INTO pessoa (descricao) VALUES (?) ;";
    private static final String SELECT_TIPO_FASE_BY_ID = "SELECT id, descricao FROM pessoa WHERE id = ?";
    private static final String SELECT_ALL_TIPO_FASE = "SELECT * FROM tipo_fase;";
    private static final String DELETE_TIPO_FASE_SQL = "DELETE FROM tipo_fase WHERE id = ?;";
    private static final String UPDATE_TIPO_FASE_SQL = "UPDATE pessoa SET descricao = ? WHERE id = ?;";

    public void insertTipoFase(TipoFase entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_TIPO_FASE_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());

        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public TipoFase selectTipoFaseById(int id) {
        TipoFase entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_TIPO_FASE_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                entidade = new TipoFase(id, descricao);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<TipoFase> selectAllTipoFase() {
        List<TipoFase> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_TIPO_FASE)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                entidades.add(new TipoFase(id, descricao));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteTipoFase(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_TIPO_FASE_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updatePessoa(TipoFase entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_TIPO_FASE_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setInt(2, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}