/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.LimiteDigitos;
import model.Usuario;
import javax.swing.JOptionPane;
import dao.UsuarioDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ivan1
 */
public class TCadastroAtendenteOuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroAtendenteOuAdmin
     */
    public TCadastroAtendenteOuAdmin() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        cpfField.setDocument(new LimiteDigitos(11));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        cpfField = new javax.swing.JTextField();
        senhaField = new javax.swing.JPasswordField();
        atendenteBox = new javax.swing.JCheckBox();
        adminBox = new javax.swing.JCheckBox();
        cadastrarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de usuário");

        cpfField.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));
        cpfField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfFieldActionPerformed(evt);
            }
        });

        senhaField.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));
        senhaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaFieldActionPerformed(evt);
            }
        });

        atendenteBox.setText("Atendente");
        atendenteBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                atendenteBoxStateChanged(evt);
            }
        });
        atendenteBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atendenteBoxActionPerformed(evt);
            }
        });

        adminBox.setText("Admin");
        adminBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBoxActionPerformed(evt);
            }
        });

        cadastrarButton.setBackground(new java.awt.Color(99, 218, 201));
        cadastrarButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cadastrarButton.setForeground(new java.awt.Color(0, 0, 0));
        cadastrarButton.setText("Cadastrar");
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltarButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(adminBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(atendenteBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(senhaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(atendenteBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adminBox)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(voltarButton)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed

       String cpf = cpfField.getText();
       String senha = String.valueOf(senhaField.getPassword());
       boolean admin = adminBox.isSelected();

        Usuario usuario = new Usuario(cpf, senha, admin);
        UsuarioDAO uDAO = new UsuarioDAO();

        do {

            if (cpfField.getText() == null || cpfField.getText().trim().equals("") || senhaField.getPassword() == null || senhaField.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(this, "Falha no cadastro por falta de dados!", "Registro falhou!", JOptionPane.ERROR_MESSAGE);
                cpfField.setText("");
                senhaField.setText("");
                return;
            }
            if (adminBox.isSelected() && atendenteBox.isSelected()) {
                JOptionPane.showMessageDialog(this, "Falha no cadastro por excesso de dados!", "Registro falhou!", JOptionPane.ERROR_MESSAGE);
                cpfField.setText("");
                senhaField.setText("");
                return;
            }
            if (!adminBox.isSelected() && !atendenteBox.isSelected()) {
                JOptionPane.showMessageDialog(this, "Falha no cadastro por falta de dados!", "Registro falhou!", JOptionPane.ERROR_MESSAGE);
                cpfField.setText("");
                senhaField.setText("");
                return;
            }

        } while (cpfField.getText() == null || cpfField.getText().trim().equals("") || senhaField.getPassword() == null || (adminBox.isSelected() && atendenteBox.isSelected()) || (!adminBox.isSelected() && !atendenteBox.isSelected()));

        if (UsuarioDAO.existe(usuario)) {
            JOptionPane.showMessageDialog(this, "Este usuário já existe!", "Registro falhou!", JOptionPane.ERROR_MESSAGE);
            cpfField.setText("");
            senhaField.setText("");
            return;
        } else {
            UsuarioDAO.cadastrarUsuario(usuario);
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");
        }


    }//GEN-LAST:event_cadastrarButtonActionPerformed

    private void senhaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaFieldActionPerformed

    }//GEN-LAST:event_senhaFieldActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed

        try {
            TDashboardAdmin tela = new TDashboardAdmin();
            tela.setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TCadastroAtendenteOuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TCadastroAtendenteOuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TCadastroAtendenteOuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TCadastroAtendenteOuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_voltarButtonActionPerformed

    private void cpfFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfFieldActionPerformed


    }//GEN-LAST:event_cpfFieldActionPerformed

    private void atendenteBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atendenteBoxActionPerformed

    }//GEN-LAST:event_atendenteBoxActionPerformed

    private void adminBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBoxActionPerformed

    }//GEN-LAST:event_adminBoxActionPerformed

    private void atendenteBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_atendenteBoxStateChanged

    }//GEN-LAST:event_atendenteBoxStateChanged

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
            java.util.logging.Logger.getLogger(TCadastroAtendenteOuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TCadastroAtendenteOuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TCadastroAtendenteOuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TCadastroAtendenteOuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TCadastroAtendenteOuAdmin().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TCadastroAtendenteOuAdmin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(TCadastroAtendenteOuAdmin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(TCadastroAtendenteOuAdmin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(TCadastroAtendenteOuAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox adminBox;
    private javax.swing.JCheckBox atendenteBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JTextField cpfField;
    private javax.swing.JPasswordField senhaField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
