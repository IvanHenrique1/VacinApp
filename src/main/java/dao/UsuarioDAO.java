package dao;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Usuario;
import java.sql.SQLException;
import java.sql.Time;
import static java.time.Clock.system;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import model.Paciente;
import view.TDashboardAdmin;
import view.TFila;
import view.TGerarRelatorio;

public class UsuarioDAO {

    public static boolean existe(Usuario usuario) {

        String sql = "SELECT * FROM usuario WHERE cpf = ? AND senha =?";

        try {
            Connection con = ConnectionFactory.obtemConexao();

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, usuario.getCpf());
            pst.setString(2, usuario.getSenha());

            //ResultSet resultado = pst.executeQuery();
            try (ResultSet rs = pst.executeQuery();) {
                if (rs.next()) {
                    usuario.setCpf(rs.getString("cpf"));
                    usuario.setSenha(rs.getString("senha"));
                    usuario.setAdmin(rs.getBoolean("atd0adm1"));
                    return true;
                   
                } else {
                    usuario.setCpf(null);
                    usuario.setSenha(null);
                    usuario.setAdmin(false);
                    return false;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return false;
    }

    public static void cadastrarUsuario(Usuario usuario) {
        
        String sql = "INSERT INTO usuario (cpf, senha, atd0adm1) VALUES (?, ?, ?)";
        
        try {
            
            Connection con = ConnectionFactory.obtemConexao();
            
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, usuario.getCpf());
            pst.setString(2, usuario.getSenha());
            pst.setBoolean(3, usuario.isAdmin());
            
            pst.execute();
            
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    public static void excluirUsuario(Usuario usuario) {
        String sql = "DELETE FROM usuario WHERE id_usuario = ?";

        try {

            Connection con = ConnectionFactory.obtemConexao();

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, usuario.getId());

            pst.execute();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static boolean existeIfExclui(Usuario usuario) {

        String sql = "SELECT * FROM usuario WHERE id_usuario = ?";

        try {
            Connection con = ConnectionFactory.obtemConexao();

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setInt(1, usuario.getId());

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

    public static float relatorio(Paciente p) {

        String sql = "set @data1 = ? ; set @data2 = ? ; select d, cast(count(vacinado)/(@data2-@data1) AS DECIMAL(3,2)\n"
                + ") media from vacinados where data_vacinacao between @data1 and @data2  \n"
                + "group by d";

        try {

            Connection con = ConnectionFactory.obtemConexao();

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, p.getData_inicial());
            pst.setString(2, p.getData_final());

            pst.execute();

            ResultSet resultado = pst.executeQuery();
            JOptionPane.showMessageDialog(null, resultado);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;

    }
}
