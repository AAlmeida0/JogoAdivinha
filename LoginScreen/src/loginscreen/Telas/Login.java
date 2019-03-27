/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen.Telas;

import loginscreen.Classes.*;
import java.awt.Image;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import loginscreen.Telas.Menu;

/**
 *
 * @author Andre
 */
public class Login extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    /**
     * Creates new form Tela
     */
    public Login() {
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

        txtSenha = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        btRegistrar = new javax.swing.JLabel();
        btLogar = new javax.swing.JLabel();
        IGNORAR = new javax.swing.JTextField();
        Move = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        Tela = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(520, 240));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSenha.setBackground(new java.awt.Color(0, 0, 0));
        txtSenha.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setBorder(null);
        txtSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 220, 20));

        txtUsuario.setBackground(new java.awt.Color(0, 0, 0));
        txtUsuario.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 220, 20));

        btRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btRegistroIN.png"))); // NOI18N
        btRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRegistrarMouseExited(evt);
            }
        });
        getContentPane().add(btRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        btLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btLogarIN.png"))); // NOI18N
        btLogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLogarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btLogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btLogarMouseExited(evt);
            }
        });
        getContentPane().add(btLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        IGNORAR.setBackground(new java.awt.Color(153, 153, 153));
        IGNORAR.setEnabled(false);
        getContentPane().add(IGNORAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 30, 20));

        Move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MoveMouseMoved(evt);
            }
        });
        getContentPane().add(Move, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 30));

        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 50, 30));

        Tela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LoginScreen.png"))); // NOI18N
        getContentPane().add(Tela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked

        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitMouseClicked

    private void btLogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLogarMouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btLogarOut.png/"));
        btLogar.setIcon(ico);

// TODO add your handling code here:
    }//GEN-LAST:event_btLogarMouseEntered

    private void btLogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLogarMouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btLogarIN.png/"));
        btLogar.setIcon(ico);

// TODO add your handling code here:
    }//GEN-LAST:event_btLogarMouseExited

    private void btRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegistrarMouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btRegistroOut.png/"));
        btRegistrar.setIcon(ico);

// TODO add your handling code here:
    }//GEN-LAST:event_btRegistrarMouseEntered

    private void btRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegistrarMouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btRegistroIN.png/"));
        btRegistrar.setIcon(ico);
        // TODO add your handling code here:
    }//GEN-LAST:event_btRegistrarMouseExited

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);

        // TODO add your handling code here:
    }//GEN-LAST:event_MoveMouseDragged

    private void MoveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseMoved

        xMouse = evt.getX();
        yMouse = evt.getY();

// TODO add your handling code here:
    }//GEN-LAST:event_MoveMouseMoved

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed
    static usuario obj_usuario = new usuario();
    private void btLogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLogarMouseClicked
        String nome = txtUsuario.getText();
        String senha = txtSenha.getText();
        String resposta = "";
        if (!nome.equals("") && !senha.equals("")) {
            try {
                resposta = obj_usuario.Get_id(nome, senha);
                //JOptionPane.showMessageDialog(rootPane, resposta);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (resposta.equals("null")) {
                JOptionPane.showMessageDialog(rootPane, "Usuario ou senha incorreto");
            } else {
                Menu obj_menu = new Menu();
                try {
                    obj_menu.setVisible(true);
                    obj_menu.get_dados(nome, senha);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Insira login e senha");
        }

    }//GEN-LAST:event_btLogarMouseClicked

    private void btRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRegistrarMouseClicked
        Registrar Reg = new Registrar();

        Reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btRegistrarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JTextField IGNORAR;
    private javax.swing.JLabel Move;
    private javax.swing.JLabel Tela;
    private javax.swing.JLabel btLogar;
    private javax.swing.JLabel btRegistrar;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
