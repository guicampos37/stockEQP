/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.Usuario;
import java.awt.List;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class CadastrodeUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadastrodeUsuario
     */
    public CadastrodeUsuario() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        inputConfSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        radioComum = new javax.swing.JRadioButton();
        radioAdm = new javax.swing.JRadioButton();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 650));
        setSize(new java.awt.Dimension(900, 657));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 12, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(907, 94));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DE USUÁRIO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(306, 306, 306))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        inputNome.setBorder(null);
        inputNome.setPreferredSize(new java.awt.Dimension(390, 38));
        getContentPane().add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 400, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        inputEmail.setBorder(null);
        inputEmail.setPreferredSize(new java.awt.Dimension(390, 38));
        getContentPane().add(inputEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 400, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        inputSenha.setBorder(null);
        inputSenha.setPreferredSize(new java.awt.Dimension(211, 38));
        getContentPane().add(inputSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Tipo de usuário:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        inputConfSenha.setBorder(null);
        inputConfSenha.setPreferredSize(new java.awt.Dimension(211, 38));
        getContentPane().add(inputConfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Confirmação de senha:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        radioComum.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radioComum.setText("Comum");
        radioComum.setPreferredSize(new java.awt.Dimension(108, 20));
        radioComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioComumActionPerformed(evt);
            }
        });
        getContentPane().add(radioComum, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 160, -1));

        radioAdm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radioAdm.setText("Administrador");
        radioAdm.setPreferredSize(new java.awt.Dimension(108, 20));
        radioAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAdmActionPerformed(evt);
            }
        });
        getContentPane().add(radioAdm, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 160, -1));

        btnCadastrar.setBackground(new java.awt.Color(97, 107, 242));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setPreferredSize(new java.awt.Dimension(189, 39));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, -1));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 80, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaDeVisualizacao view = new TelaDeVisualizacao();
        view.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void radioAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAdmActionPerformed
        radioComum.setSelected(false);
    }//GEN-LAST:event_radioAdmActionPerformed

    private void radioComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioComumActionPerformed
        radioAdm.setSelected(false);
    }//GEN-LAST:event_radioComumActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        try {
            String nome, email, senha, confSenha;
            String [] erros = new String[5];
            int tipoConta = 0;
            
            nome = inputNome.getText();
            email = inputEmail.getText();
            senha = new String(inputSenha.getPassword());
            confSenha = new String(inputConfSenha.getPassword());
            
            if(radioAdm.isSelected()) {
                tipoConta = 1;
            }
            if(radioComum.isSelected()) {
                tipoConta = 2;
            }
            
            Usuario usuario = new Usuario();
            
            usuario.setNome(nome);
            usuario.setEmail(email);
            
            if(senha.equals(confSenha)) {
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                byte messageDigest[] = md.digest(senha.getBytes("UTF-8"));
                
                StringBuilder sb = new StringBuilder();
                
                for(byte b : messageDigest) {
                    sb.append(String.format("%02X", 0xFF & b));                    
                }
                String senhaHex = sb.toString();
                
                usuario.setSenha(senhaHex);
            } else {
                JOptionPane.showMessageDialog(null, "Confirmação de senha incorreta");   
                return;
            }
            usuario.setCargo_id(tipoConta);
            
            if(usuario.getCargo_id() == 0 || usuario.getNome() == null || usuario.getEmail() == null || usuario.getSenha() == null) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para cadastrar o usuário");
                return;
            }
                
            usuario.store(usuario);

            //JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
            TelaDeVisualizacao view = new TelaDeVisualizacao();
            view.setVisible(true);
            this.dispose();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para cadastrar o usuário");
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrodeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrodeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrodeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrodeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrodeUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPasswordField inputConfSenha;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputNome;
    private javax.swing.JPasswordField inputSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioAdm;
    private javax.swing.JRadioButton radioComum;
    // End of variables declaration//GEN-END:variables
}