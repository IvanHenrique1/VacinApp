package dao;


import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
    
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "vacinapp";
    private static String usuario = "root";
    private static String senha = "";
   
    /**
     * Conecta com o DB
     * @return conexão estabelecida com a base ou null
     */
    public static Connection obtemConexao() {
        
        try {
            return DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + db, usuario, senha);
        }
        catch(Exception ex) {
            ex.printStackTrace();
            return null;
        }
    
    }
    
}
