package br.com.conta.DAO;

import br.com.conta.model.Rota;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class RotaDAO extends  ConexaoDB{
    private static final String INSERT_ROTA_SQL = "INSERT INTO pessoa (descricao) VALUES (?) ;";
    private static final String SELECT_ROTA_BY_ID = "SELECT id, descricao FROM pessoa WHERE id = ?";
    private static final String SELECT_ALL_ROTA= "SELECT * FROM tipo_fase;";
    private static final String DELETE_ROTA_SQL = "DELETE FROM tipo_fase WHERE id = ?;";
    private static final String UPDATE_ROTA_SQL = "UPDATE pessoa SET descricao = ? WHERE id = ?;";

    public void insertRota(Rota entidade) {
        try (PreparedStatement preparedStatement = prepararSQL(INSERT_ROTA_SQL)) {
            preparedStatement.setString(1, entidade.getDescricao());

        } catch (SQLException e) {
            printSQLException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Rota selectRotaById(int id) {
        Rota entidade = null;
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ROTA_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String descricao = rs.getString("descricao");
                entidade = new Rota(id, descricao);
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return entidade;
    }

    public List<Rota> selectAllRota() {
        List<Rota> entidades = new ArrayList<>();
        try (PreparedStatement preparedStatement = prepararSQL(SELECT_ALL_ROTA)) {
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String descricao = rs.getString("descricao");
                entidades.add(new Rota(id, descricao));
            }
        } catch (SQLException e) {
            printSQLException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return entidades;
    }

    public boolean deleteRota(int id) throws SQLException {
        try (PreparedStatement statement = prepararSQL(DELETE_ROTA_SQL)) {
            statement.setInt(1, id);
            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateRota(Rota entidade) throws SQLException {
        try (PreparedStatement statement = prepararSQL(UPDATE_ROTA_SQL)) {
            statement.setString(1, entidade.getDescricao());
            statement.setInt(2, entidade.getId());

            return statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}