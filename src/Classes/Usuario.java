package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private int cargo_id;

    public int getCargo_id() {
        return cargo_id;
    }

    public void setCargo_id(int cargo_id) {
        this.cargo_id = cargo_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public ResultSet autenticacaoUsuario(Usuario objUsuario)
    {
        Connection conn = new Conexao().getConnection();
        
        try{
            String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuario.getEmail());
            pstm.setString(2, objUsuario.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuário: " + e);
            return null;
        }
    }
    
    public boolean store(Usuario objUsuario)
    {
        Connection conn = new Conexao().getConnection();
        
        try {
            String sql = "INSERT INTO usuarios(nome, email, senha, cargo_id ) VALUES (?,?,?,?)";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuario.getNome());
            pstm.setString(2, objUsuario.getEmail());
            pstm.setString(3, objUsuario.getSenha());
            pstm.setInt(4, objUsuario.getCargo_id());
            
            pstm.execute();
            return true;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuário: " + e);
            return false;
        }
    }
}
