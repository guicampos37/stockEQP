package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Produto {
    private int id;
    private String nome;
    private String codigo;
    private String fornecedor;
    private int quantidade;
    private int quantidade_minima;
    private String categoria;
    private String localizacao_fisica;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade_minima() {
        return quantidade_minima;
    }

    public void setQuantidade_minima(int quantidade_minima) {
        this.quantidade_minima = quantidade_minima;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocalizacao_fisica() {
        return localizacao_fisica;
    }

    public void setLocalizacao_fisica(String localizacao_fisica) {
        this.localizacao_fisica = localizacao_fisica;
    }
    
    public void store(Produto objProduto)
    {
        Connection conn = new Conexao().getConnection();
        
        try{
            String sql = "INSERT INTO produtos(nome, codigo, fornecedor, quantidade, quantidade_minima, categoria, localizacao_fisica) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objProduto.getNome());
            pstm.setString(2, objProduto.getCodigo());
            pstm.setString(3, objProduto.getFornecedor());
            pstm.setInt(4, objProduto.getQuantidade());            
            pstm.setInt(5, objProduto.getQuantidade_minima());
            pstm.setString(6, objProduto.getCategoria());
            pstm.setString(7, objProduto.getLocalizacao_fisica());
            
            pstm.execute();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o produto: " + e);            
        }
    }
    
    public void delete(int id)
    {
        Connection conn = new Conexao().getConnection();

        try{
            String sql = "DELETE from produtos WHERE id = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
        
            pstm.setInt(1, id);
            pstm.execute();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar o produto: " + e);                        
        }
    }
    
    public void update(int id, String codigo, String nome, String fornecedor, int qtd_atual, int qtd_minima, String localizacao) 
    {
        Connection conn = new Conexao().getConnection();
        
        try{
            String sql = "UPDATE produtos SET codigo = ?, nome = ?, fornecedor = ?, quantidade = ?, quantidade_minima = ?, localizacao_fisica = ? WHERE id = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
        
            pstm.setString(1, codigo);
            pstm.setString(2, nome);
            pstm.setString(3, fornecedor);
            pstm.setInt(4, qtd_atual);
            pstm.setInt(5, qtd_minima);
            pstm.setString(6, localizacao);
            pstm.setInt(7, id);
            pstm.execute();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar o produto: " + e);                        
        }
    }
}
