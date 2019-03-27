/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen.Telas;

import loginscreen.Classes.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 251364
 */
public class Desafio extends javax.swing.JFrame {

    int yMouse;
    int xMouse;

    /**
     * Creates new form Desafio
     */
    public Desafio() {
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

        txtCodigo = new javax.swing.JTextField();
        IGNORAR = new javax.swing.JTextField();
        txtaDescricao = new javax.swing.JTextArea();
        Move = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();
        btReturn = new javax.swing.JLabel();
        btDesafio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Desafio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setBackground(new java.awt.Color(0, 0, 0));
        txtCodigo.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setBorder(null);
        txtCodigo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCodigo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 350, 30));

        IGNORAR.setBackground(new java.awt.Color(153, 153, 153));
        IGNORAR.setEnabled(false);
        getContentPane().add(IGNORAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 30, 20));

        txtaDescricao.setBackground(new java.awt.Color(0, 0, 0));
        txtaDescricao.setColumns(20);
        txtaDescricao.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtaDescricao.setForeground(new java.awt.Color(255, 255, 255));
        txtaDescricao.setRows(5);
        txtaDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtaDescricaoKeyTyped(evt);
            }
        });
        getContentPane().add(txtaDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 350, 150));

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

        btReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btReturnQSIn.png"))); // NOI18N
        btReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btReturnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btReturnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btReturnMouseExited(evt);
            }
        });
        getContentPane().add(btReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, -1, -1));

        btDesafio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btCriarDesafioIn.png"))); // NOI18N
        btDesafio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDesafioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDesafioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDesafioMouseExited(evt);
            }
        });
        getContentPane().add(btDesafio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        jLabel1.setText("000");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        jLabel2.setText("00");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        Desafio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/desafio.png"))); // NOI18N
        getContentPane().add(Desafio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

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

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked

        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitMouseClicked

    private void btReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btReturnMouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btReturnQSIn.png/"));
        btReturn.setIcon(ico);
    }//GEN-LAST:event_btReturnMouseExited

    private void btReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btReturnMouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btReturnQSOut.png/"));
        btReturn.setIcon(ico);
    }//GEN-LAST:event_btReturnMouseEntered

    private void btReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btReturnMouseClicked
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Você deseja voltar ao menu principal?", "ATENÇÃO",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);
        if (i == JOptionPane.YES_OPTION) {
            Menu menu = new Menu();

            menu.setVisible(true);

            this.dispose();
        }
    }//GEN-LAST:event_btReturnMouseClicked

    private void btDesafioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDesafioMouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btCriarDesafioIn.png/"));
        btDesafio.setIcon(ico);
    }//GEN-LAST:event_btDesafioMouseEntered

    private void btDesafioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDesafioMouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btCriarDesafioOut.png/"));
        btDesafio.setIcon(ico);
    }//GEN-LAST:event_btDesafioMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btCriarDesafioOut.png/"));
        btDesafio.setIcon(ico);
        //JOptionPane.showMessageDialog(rootPane, Menu.id);
    }//GEN-LAST:event_formWindowOpened

    private void btDesafioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDesafioMouseClicked

        String codigo = txtCodigo.getText();
        String desc = txtaDescricao.getText();
        Menu obj_menu = new Menu();
        desafio obj_desafio = new desafio();
        String id = Menu.id;
        try {
            obj_desafio.criar_desafio(id, desc, txtCodigo.getText());
            JOptionPane.showMessageDialog(rootPane, "Desafio criado com sucesso");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Desafio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btDesafioMouseClicked
    String descricao;

    private void txtaDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaDescricaoKeyTyped
      if (txtaDescricao.getText().length() > 250){
          txtaDescricao.setText(descricao);
      }
      else {
          descricao = txtaDescricao.getText();
          jLabel1.setText(String.valueOf(descricao.length()));
      }
    }//GEN-LAST:event_txtaDescricaoKeyTyped
    
    String comb = "";
    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
       int temp = txtCodigo.getText().length();
        if (temp > 15){
           txtCodigo.setText(comb);
           jLabel2.setText(String.valueOf(comb.length()));
       }
       else {
           comb = txtCodigo.getText();
           jLabel2.setText(String.valueOf(comb.length()+1));
       }
    }//GEN-LAST:event_txtCodigoKeyTyped

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
            java.util.logging.Logger.getLogger(Desafio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desafio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desafio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desafio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desafio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Desafio;
    private javax.swing.JLabel Exit;
    private javax.swing.JTextField IGNORAR;
    private javax.swing.JLabel Move;
    private javax.swing.JLabel btDesafio;
    private javax.swing.JLabel btReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtaDescricao;
    // End of variables declaration//GEN-END:variables
}
