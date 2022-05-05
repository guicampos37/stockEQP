package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    
    public Connection getConnection()
    {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/stockdb";
        String user = "root";
        String pass = "root"; 
        
        Connection conexao = null;
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, pass);
            return conexao;
            
        } catch (Exception e){
            System.err.println("Erro na conexão: " + e);
            return null;
        }   
    }
}
