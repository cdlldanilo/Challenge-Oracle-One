package br.com.alura.hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.hotel.models.Hospede;

public class HospedeDAO {

    private Connection connection;

    public HospedeDAO(Connection connection) {
        this.connection = connection;
    }
    
    public List<Hospede> listar() {
        List<Hospede> hospedes = new ArrayList<>();
        String sql = "SELECT * FROM tb_hospedes";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.execute();

            trasformarResultSetEmReserva(hospedes, pstm);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return hospedes;
    }

    public List<Hospede> listarPeloSobreNome(String sobreNome) {
        List<Hospede> hospedes = new ArrayList<>();
        String sql = "SELECT * FROM tb_hospedes WHERE SOBRENOME = ?;";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, sobreNome);
            pstm.execute();

            trasformarResultSetEmReserva(hospedes, pstm);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return hospedes;
    }

    public void registrar(String nome, String sobreNome, String dataNascimento, String nacionalidade, String telefone, int idReserva) {
        String sql = "INSERT INTO tb_hospedes (`NOME`, `SOBRENOME`, `DATA_NASCIMENTO`, `NACIONALIDADE`, `TELEFONE`, ID_RESERVA) "
        		+ "VALUES (?, ?, ?, ?, ?, ?);";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setString(1, nome);
            pstm.setString(2, sobreNome);
            pstm.setString(3, dataNascimento);
            pstm.setString(4, nacionalidade);
            pstm.setString(5, telefone);
            pstm.setInt(6, idReserva);

            pstm.execute();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void alterar(Integer id, String nome, String sobreNome, String dataNascimento, String nacionalidade, String telefone, int idReserva) {
        String sql = "UPDATE tb_hospedes H SET H.NOME = ?, H.SOBRENOME = ?, H.DATA_NASCIMENTO = ?, " + 
                " H.TELEFONE = ?, H.ID_RESERVA = ? WHERE ID = ?";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            
        	pstm.setString(1, nome);
            pstm.setString(2, sobreNome);
            pstm.setString(3, dataNascimento);
            pstm.setString(4, nacionalidade);
            pstm.setString(5, telefone);
            pstm.setInt(6, idReserva);
            pstm.setInt(7, id);

            pstm.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deletar(Integer id) {
        String sql = "DELETE FROM tb_hospedes WHERE ID = ?;";

        try (PreparedStatement pstm = connection.prepareStatement(sql)) {
            pstm.setInt(1, id);
            pstm.execute();
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }

    private void trasformarResultSetEmReserva(List<Hospede> hospedes, PreparedStatement pstm) throws SQLException {
		try (ResultSet rst = pstm.getResultSet()) {
			while (rst.next()) {
				Hospede hospede = new Hospede(
                    rst.getInt(1), 
                    rst.getString(2), 
                    rst.getString(3), 
                    rst.getString(4), 
                    rst.getString(5),
                    rst.getString(6),
                    rst.getInt(7)
                );

				hospedes.add(hospede);
			}
		}
	}
}
