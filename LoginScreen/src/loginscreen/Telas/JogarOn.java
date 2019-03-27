/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen.Telas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import loginscreen.Classes.*;
import javax.swing.JOptionPane;

/**
 *
 * @author 251364
 */
public class JogarOn extends javax.swing.JFrame {

    /**
     * Creates new form JogarOn
     */
    public JogarOn() {
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

        txtCombinacao = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        IGNORAR = new javax.swing.JTextField();
        N_vidas = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        N_tentativas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btReturn = new javax.swing.JLabel();
        Move = new javax.swing.JLabel();
        JogarOn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCombinacao.setBackground(new java.awt.Color(0, 0, 0));
        txtCombinacao.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        txtCombinacao.setForeground(new java.awt.Color(255, 255, 255));
        txtCombinacao.setBorder(null);
        txtCombinacao.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCombinacao.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCombinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCombinacaoActionPerformed(evt);
            }
        });
        txtCombinacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCombinacaoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCombinacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 400, 20));

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 250, 200));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        getContentPane().add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 380, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btVerificar.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, -1, 60));

        IGNORAR.setBackground(new java.awt.Color(153, 153, 153));
        IGNORAR.setEnabled(false);
        getContentPane().add(IGNORAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 30, 20));

        N_vidas.setText("00");
        getContentPane().add(N_vidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 20, -1));

        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 80, 90));

        jLabel2.setText("Vidas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 50, 30));

        jLabel4.setText("Tentativa");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        N_tentativas.setText("1");
        getContentPane().add(N_tentativas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jLabel5.setText("0");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

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
        getContentPane().add(btReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 650, -1, 50));

        Move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MoveMouseMoved(evt);
            }
        });
        getContentPane().add(Move, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 30));

        JogarOn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/JogarOn.png"))); // NOI18N
        getContentPane().add(JogarOn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int yMouse;
    int xMouse;
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Você deseja sair do jogo?", "ATENÇÃO",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);
        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel3MouseClicked
    public String id;
    int vidas;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

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

    private void btReturnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btReturnMouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btReturnQSOut.png/"));
        btReturn.setIcon(ico);
    }//GEN-LAST:event_btReturnMouseEntered

    private void btReturnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btReturnMouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btReturnQSIn.png/"));
        btReturn.setIcon(ico);
    }//GEN-LAST:event_btReturnMouseExited

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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //       JOptionPane.showMessageDialog(rootPane, "CLICADO");
        if (vidas == 0) {
            JOptionPane.showMessageDialog(rootPane, "Voce perdeu todas as vidas");
        } else {
            vidas--;
            N_vidas.setText(String.valueOf(vidas));
            if (!"".equals(txtCombinacao.getText())) {
                String resposta = obj_jogo.verifica(combinacao, txtCombinacao.getText());
                jTextArea1.append(resposta);
                jTextArea1.append("\n");
                boolean acertou = checar(resposta);
                if (acertou == true) {
                    Menu obj_menu = new Menu();
                    JOptionPane.showMessageDialog(rootPane, "Parabens você acertou a combinação \n pontuação : " + vidas);
                    try {
                        obj_jogo.atualizar_pontos(obj_menu.id, vidas);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(JogarOn.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    obj_menu.setVisible(true);
                    this.dispose();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "insira a combinação");
            }
        }
    }//GEN-LAST:event_jLabel1MouseClicked
    private boolean checar(String resp) {
        boolean resposta = false;
        for (int i = 0; i < resp.length() + 1; i++) {
            try {
                if ('1' != resp.charAt(i)) {
                    resposta = false;
                    break;
                }
            } catch (java.lang.StringIndexOutOfBoundsException ex) {
                resposta = true;
            }
        }
        return resposta;
    }
    private void txtCombinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCombinacaoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtCombinacaoActionPerformed
    String temp;

    private void txtCombinacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCombinacaoKeyTyped
        if (txtCombinacao.getText().length() + 1 == 16) {
            txtCombinacao.setText(temp);
        } else {
            temp = txtCombinacao.getText();
            if (txtCombinacao.getText().length() == 0) {
                jLabel5.setText("0");
            } else {
                jLabel5.setText(String.valueOf(temp.length() + 1));
            }
        }
    }//GEN-LAST:event_txtCombinacaoKeyTyped

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jPanel1.setVisible(true);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jPanel1.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseExited
    String ID;
    String combinacao = "";
    String desc = "";
    String dificuldade;
    Jogo obj_jogo = new Jogo();

    public void set_visible(String desc){
        jPanel1.setVisible(false);
        setVisible(true);
        jTextPane1.setText("- 1 letra certa \n- 2 letra errada \n- 3 letra certa mas no lugar errado\n \n \n- descrição "+desc);
    }
    
    public void set_id(String id) throws ClassNotFoundException {
        ID = id;
        String resp = obj_jogo.get_jogo(ID);

        int contador = 0;
        for (int a = 0; a < resp.length(); a++) {
            if (resp.charAt(a) == '-') {
                contador++;
                continue;
            }
            switch (contador) {
                case 0:
                    combinacao += resp.charAt(a);
                    break;
                case 1:
                    desc += resp.charAt(a);
                    break;
                case 2:
                    dificuldade += resp.charAt(a);
                    break;
            }
        }

        int resposta = 0;
        try {
            resposta = obj_jogo.get_vidas(id);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JogarOn.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (resposta != -1) {
            vidas = resposta;
            N_vidas.setText(String.valueOf(resposta));
        } else {
            JOptionPane.showMessageDialog(rootPane, "ERRO Não foi possivel pegar os dados do jogo " + "\n" + "verifique sua connecção com a internet");
        }

        //JOptionPane.showMessageDialog(rootPane, ID);
    }

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
            java.util.logging.Logger.getLogger(JogarOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogarOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogarOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogarOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogarOn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IGNORAR;
    private javax.swing.JLabel JogarOn;
    private javax.swing.JLabel Move;
    private javax.swing.JLabel N_tentativas;
    private javax.swing.JLabel N_vidas;
    private javax.swing.JLabel btReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField txtCombinacao;
    // End of variables declaration//GEN-END:variables
}