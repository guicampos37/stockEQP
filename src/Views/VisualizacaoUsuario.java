/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Caio
 */
public class VisualizacaoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form VisualizacaoUsuario
     */
    public VisualizacaoUsuario() {
        initComponents();
        
        Connection conn = new Conexao().getConnection();
        
        try{
            Statement st = conn.createStatement();
            String sql = "SELECT * FROM produtos";
            
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()) {
                String id = rs.getString("id");
                String nome = rs.getString("nome");
                String codigo = rs.getString("codigo");
                String fornecedor = rs.getString("fornecedor");
                String quantidade = rs.getString("quantidade");
                String quantidade_minima = rs.getString("quantidade_minima");
                String categoria = rs.getString("categoria");
                String localizacao = rs.getString("localizacao_fisica");
                
                String tbData[] = {id, codigo, nome, fornecedor, quantidade, quantidade_minima, categoria, localizacao};
                DefaultTableModel tblModel = (DefaultTableModel)tabelaProdutos.getModel();
                tblModel.addRow(tbData);
            }
        } catch(Exception e) {
            System.err.println("Erro ao exibir os produtos: " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        pesquisaBtn = new javax.swing.JButton();
        campoPesquisa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "C??digo", "Nome", "Fornecedor", "Qtd Atual", "Qtd M??nima", "Categoria", "Localiza????o F??sica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.setGridColor(new java.awt.Color(0, 0, 0));
        tabelaProdutos.setPreferredSize(new java.awt.Dimension(525, 600));
        jScrollPane1.setViewportView(tabelaProdutos);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(1).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(80);
            tabelaProdutos.getColumnModel().getColumn(2).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(190);
            tabelaProdutos.getColumnModel().getColumn(4).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(80);
            tabelaProdutos.getColumnModel().getColumn(5).setPreferredWidth(60);
            tabelaProdutos.getColumnModel().getColumn(7).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(7).setPreferredWidth(190);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Estoque");

        pesquisaBtn.setForeground(new java.awt.Color(204, 204, 204));
        pesquisaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search icon.png"))); // NOI18N
        pesquisaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesquisaBtnMouseClicked(evt);
            }
        });

        campoPesquisa.setForeground(new java.awt.Color(204, 204, 204));
        campoPesquisa.setText("Digite para pesquisar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pesquisaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesquisaBtnMouseClicked
        String campo_pesquisa = campoPesquisa.getText();
        
        Connection conn = new Conexao().getConnection();
        try {        
            DefaultTableModel tblRemove = (DefaultTableModel)tabelaProdutos.getModel();
            
            if(campo_pesquisa.equals(null)) {
                String sql = "SELECT * FROM produtos";
                
                while(tblRemove.getRowCount() > 0) {
                    if (tblRemove.getRowCount() > 0){
                        for (int i=1;i<=tblRemove.getRowCount();i++){
                            tblRemove.removeRow(0);
                        }            
                    }
                }   
                
                PreparedStatement pstm = conn.prepareStatement(sql); 
                ResultSet rs = pstm.executeQuery();
                
                while(rs.next()) {                
                    String id = rs.getString("id");
                    String nome = rs.getString("nome");
                    String codigo = rs.getString("codigo");
                    String fornecedor = rs.getString("fornecedor");
                    String quantidade = rs.getString("quantidade");
                    String quantidade_minima = rs.getString("quantidade_minima");
                    String categoria = rs.getString("categoria");
                    String localizacao = rs.getString("localizacao_fisica");

                    String tbData[] = {id, codigo, nome, fornecedor, quantidade, quantidade_minima, categoria, localizacao};
                    DefaultTableModel tblModel = (DefaultTableModel)tabelaProdutos.getModel();
                    tblModel.addRow(tbData);
                }                
                
            } else { 
                String sql = "SELECT * FROM produtos WHERE nome LIKE '" + campo_pesquisa + "%'";                  
                
                while(tblRemove.getRowCount() > 0) {
                    if (tblRemove.getRowCount() > 0){
                        for (int i=1;i<=tblRemove.getRowCount();i++){
                            tblRemove.removeRow(0);
                        }            
                    }
                }
                PreparedStatement pstm = conn.prepareStatement(sql); 
                ResultSet rs = pstm.executeQuery();   
                
                while(rs.next()) {                
                    String id = rs.getString("id");
                    String nome = rs.getString("nome");
                    String codigo = rs.getString("codigo");
                    String fornecedor = rs.getString("fornecedor");
                    String quantidade = rs.getString("quantidade");
                    String quantidade_minima = rs.getString("quantidade_minima");
                    String categoria = rs.getString("categoria");
                    String localizacao = rs.getString("localizacao_fisica");

                    String tbData[] = {id, codigo, nome, fornecedor, quantidade, quantidade_minima, categoria, localizacao};
                    DefaultTableModel tblModel = (DefaultTableModel)tabelaProdutos.getModel();
                    tblModel.addRow(tbData);
                }                
            }                        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar pelo produto: " + e);            
        }
    }//GEN-LAST:event_pesquisaBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisualizacaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizacaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizacaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizacaoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizacaoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisaBtn;
    private javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables
}
