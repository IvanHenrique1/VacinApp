package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Paciente;

public class PacienteDAO {

    public static boolean consulta(Paciente p) {

        String sql = "SELECT * FROM paciente WHERE nome = ? AND idade = ? AND area_saude = ? AND endereco = ? ";

        try {
            Connection con = ConnectionFactory.obtemConexao();

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, p.getNome());
            pst.setInt(2, p.getIdade());
            pst.setBoolean(3, p.getArea_saude());
            pst.setString(4, p.getEndereco());

            ResultSet resultado = pst.executeQuery();

            if (resultado.next() == true) {
                //resultado.getInt("tipo"); pegar o tipo de usuário (admin ou atendente)
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public void cadastrarPaciente(Paciente p) {

        String sql = "INSERT INTO paciente (nome, idade, area_saude, endereco, nivel) VALUES (?, ?, ?, ?, ?)";

        try {

            Connection con = ConnectionFactory.obtemConexao();

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, p.getNome());
            pst.setInt(2, p.getIdade());
            pst.setBoolean(3, p.getArea_saude());
            pst.setString(4, p.getEndereco());
            pst.setInt(5, p.getNivel());

            pst.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void atualizarCadastro(Paciente p) {
        String sql = "UPDATE paciente SET nome = ?, idade = ?, area_saude = ?, endereco = ?, data_vacina = ? WHERE id_paciente = ?";

        try {

            Connection con = ConnectionFactory.obtemConexao();

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, p.getNome());
            pst.setInt(2, p.getIdade());
            pst.setBoolean(3, p.getArea_saude());
            pst.setString(4, p.getEndereco());

            pst.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void excluirCadastro(Paciente p) {
        String sql = "DELETE FROM paciente WHERE id_paciente = ?";

        try {

            Connection con = ConnectionFactory.obtemConexao();

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, p.getId());

            pst.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void confirmaVacina(Paciente p) {
        String sql = "UPDATE paciente SET vacinado = ?, data_vacinacao = sysdate()  WHERE id_paciente = ?";

        try {

            Connection con = ConnectionFactory.obtemConexao();

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setBoolean(1, p.isVacinado());
            pst.setInt(2, p.getId());

            pst.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
