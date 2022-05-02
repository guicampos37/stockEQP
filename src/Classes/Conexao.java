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
    

    
    /*
    public static Connection getConnection() 
    {
        try {
            Class.forName(driver);
            
            return DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    
    public static void closeConnection(Connection con)
    {
        if(con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt)
    {
        if(stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
        
        closeConnection(con);
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs)
    {
        if(rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: "+ex);
            }
        }
        
        closeConnection(con, stmt);
    }
    */
}
