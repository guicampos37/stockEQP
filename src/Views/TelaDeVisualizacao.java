/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.Conexao;
import Classes.Produto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Caio
 */
public class TelaDeVisualizacao extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeVisualizacao
     */
    public TelaDeVisualizacao() {
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
                String localizacao = rs.getString("localizacao_fisica");
                
                String tbData[] = {id, codigo, nome, fornecedor, quantidade, quantidade_minima, localizacao};
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        deletarProduto = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(238, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icone-certo.PNG"))); // NOI18N
        jLabel1.setText("LOGO");
        jLabel1.setPreferredSize(new java.awt.Dimension(236, 100));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 148, 46));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar produto");
        jButton1.setBorder(null);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 76, 120, 46));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Todos os usuários");
        jButton2.setBorder(null);
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 128, 120, 46));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cadastrar usuário");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, 46));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 125, 625));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Estoque");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 16, -1, -1));

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código", "Nome", "Fornecedor", "Qtd Atual", "Qtd Mínima", "Localização Física"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProdutos.setGridColor(new java.awt.Color(0, 0, 0));
        tabelaProdutos.setPreferredSize(new java.awt.Dimension(525, 600));
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(0).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(1).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabelaProdutos.getColumnModel().getColumn(2).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(180);
            tabelaProdutos.getColumnModel().getColumn(4).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(80);
            tabelaProdutos.getColumnModel().getColumn(5).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(5).setPreferredWidth(50);
            tabelaProdutos.getColumnModel().getColumn(6).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(6).setPreferredWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 45, 740, 569));

        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Digite para pesquisar");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 210, 30));

        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search icon.png"))); // NOI18N
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 30, 30));

        deletarProduto.setForeground(new java.awt.Color(204, 204, 204));
        deletarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/211835_trash_icon (1).png"))); // NOI18N
        deletarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletarProdutoMouseClicked(evt);
            }
        });
        getContentPane().add(deletarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 30, 30));

        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1976055_edit_edit document_edit file_edited_editing_icon.png"))); // NOI18N
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 30, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CadastrodeUsuario viewCadUsuario = new CadastrodeUsuario();
        viewCadUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void deletarProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletarProdutoMouseClicked
        //System.out.println(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0));
        String idString = (String) tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0);
        int id = Integer.parseInt(idString);
        
        int input = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar esse produto?");
        if(input == 0) {
            Produto p = new Produto();
            p.delete(id);
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso!");
            ((DefaultTableModel)tabelaProdutos.getModel()).removeRow(tabelaProdutos.getSelectedRow());
        }        
    }//GEN-LAST:event_deletarProdutoMouseClicked

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
            java.util.logging.Logger.getLogger(TelaDeVisualizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeVisualizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeVisualizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeVisualizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {;
            public void run() {
                new TelaDeVisualizacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletarProduto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables
}
