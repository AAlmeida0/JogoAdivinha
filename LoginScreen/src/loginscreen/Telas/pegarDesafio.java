/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen.Telas;

import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import loginscreen.Classes.Jogo;

/**
 *
 * @author 250541
 */
public class pegarDesafio extends javax.swing.JFrame {

    /**
     * Creates new form pegarDesafio
     */
    public pegarDesafio() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        Move = new javax.swing.JLabel();
        btReturn = new javax.swing.JLabel();
        btDescricao1 = new javax.swing.JLabel();
        btDescricao2 = new javax.swing.JLabel();
        btDescricao3 = new javax.swing.JLabel();
        btDescricao = new javax.swing.JLabel();
        IGNORAR = new javax.swing.JTextField();
        btRefresh = new javax.swing.JLabel();
        btJogar = new javax.swing.JLabel();
        btJogar1 = new javax.swing.JLabel();
        btJogar2 = new javax.swing.JLabel();
        btJogar3 = new javax.swing.JLabel();
        btAjuda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDesafio = new javax.swing.JTable();
        pegarDesafio = new javax.swing.JLabel();
        Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 50, 30));

        jScrollPane2.setViewportView(jTextPane1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btExit.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 280, 170));

        Move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MoveMouseMoved(evt);
            }
        });
        getContentPane().add(Move, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 30));

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
        getContentPane().add(btReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, -1, 50));

        btDescricao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btDescricaoIn.png"))); // NOI18N
        btDescricao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDescricao1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDescricao1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDescricao1MouseExited(evt);
            }
        });
        getContentPane().add(btDescricao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 93, -1, -1));

        btDescricao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btDescricaoIn.png"))); // NOI18N
        btDescricao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDescricao2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDescricao2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDescricao2MouseExited(evt);
            }
        });
        getContentPane().add(btDescricao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        btDescricao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btDescricaoIn.png"))); // NOI18N
        btDescricao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDescricao3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDescricao3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDescricao3MouseExited(evt);
            }
        });
        getContentPane().add(btDescricao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 125, -1, -1));

        btDescricao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btDescricaoIn.png"))); // NOI18N
        btDescricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDescricaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btDescricaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btDescricaoMouseExited(evt);
            }
        });
        getContentPane().add(btDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 76, -1, -1));

        IGNORAR.setBackground(new java.awt.Color(153, 153, 153));
        IGNORAR.setEnabled(false);
        getContentPane().add(IGNORAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 30, 20));

        btRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1495693384_refresh.png"))); // NOI18N
        btRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btRefreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btRefreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btRefreshMouseExited(evt);
            }
        });
        getContentPane().add(btRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        btJogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/JogarOff.png"))); // NOI18N
        btJogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btJogarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btJogarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btJogarMouseExited(evt);
            }
        });
        getContentPane().add(btJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 93, -1, -1));

        btJogar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/JogarOff.png"))); // NOI18N
        btJogar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btJogar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btJogar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btJogar1MouseExited(evt);
            }
        });
        getContentPane().add(btJogar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 110, -1, -1));

        btJogar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/JogarOff.png"))); // NOI18N
        btJogar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btJogar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btJogar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btJogar2MouseExited(evt);
            }
        });
        getContentPane().add(btJogar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 125, -1, -1));

        btJogar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/JogarOff.png"))); // NOI18N
        btJogar3.setPreferredSize(new java.awt.Dimension(128, 17));
        btJogar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btJogar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btJogar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btJogar3MouseExited(evt);
            }
        });
        getContentPane().add(btJogar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 76, -1, -1));

        btAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/1495693343_help.png"))); // NOI18N
        btAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAjudaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btAjudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btAjudaMouseExited(evt);
            }
        });
        getContentPane().add(btAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        tbDesafio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID do Desafio", "Dificuldade", "Descrição", "Desafie!"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDesafio);
        if (tbDesafio.getColumnModel().getColumnCount() > 0) {
            tbDesafio.getColumnModel().getColumn(0).setResizable(false);
            tbDesafio.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbDesafio.getColumnModel().getColumn(1).setResizable(false);
            tbDesafio.getColumnModel().getColumn(1).setPreferredWidth(49);
            tbDesafio.getColumnModel().getColumn(2).setResizable(false);
            tbDesafio.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 500, 110));

        pegarDesafio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ranking.png"))); // NOI18N
        getContentPane().add(pegarDesafio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 50, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int yMouse;
    int xMouse;

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

    private void btDescricao1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDescricao1MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btDescricaoOut.png/"));
        btDescricao1.setIcon(ico);
        // TODO add your handling code here:
    }//GEN-LAST:event_btDescricao1MouseEntered

    private void btDescricao1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDescricao1MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btDescricaoIn.png/"));
        btDescricao1.setIcon(ico);
    }//GEN-LAST:event_btDescricao1MouseExited

    private void btDescricao2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDescricao2MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btDescricaoOut.png/"));
        btDescricao2.setIcon(ico);
        // TODO add your handling code here:
    }//GEN-LAST:event_btDescricao2MouseEntered

    private void btDescricao2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDescricao2MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btDescricaoIn.png/"));
        btDescricao2.setIcon(ico);
    }//GEN-LAST:event_btDescricao2MouseExited

    private void btDescricao3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDescricao3MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btDescricaoOut.png/"));
        btDescricao3.setIcon(ico);
        // TODO add your handling code here:
    }//GEN-LAST:event_btDescricao3MouseEntered

    private void btDescricao3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDescricao3MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btDescricaoIn.png/"));
        btDescricao3.setIcon(ico);
    }//GEN-LAST:event_btDescricao3MouseExited

    private void btDescricaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDescricaoMouseEntered
        // TODO add your handling code here:
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btDescricaoOut.png/"));
        btDescricao.setIcon(ico);
    }//GEN-LAST:event_btDescricaoMouseEntered

    private void btDescricaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDescricaoMouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btDescricaoIn.png/"));
        btDescricao.setIcon(ico);
    }//GEN-LAST:event_btDescricaoMouseExited

    private void btJogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogarMouseClicked
        JogarOn jogar = new JogarOn();
        jogar.set_visible(vet[1]);
        try {
            jogar.set_id(get_id(pilha.get(1)));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pegarDesafio.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btJogarMouseClicked

    private void btJogarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogarMouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/JogarOffOut.png/"));
        btJogar.setIcon(ico);
    }//GEN-LAST:event_btJogarMouseEntered

    private void btJogarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogarMouseExited

        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/JogarOff.png/"));
        btJogar.setIcon(ico);
    }//GEN-LAST:event_btJogarMouseExited

    private void btJogar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogar1MouseClicked

        JogarOn jogar = new JogarOn();

        jogar.set_visible(vet[2]);
        try {
            jogar.set_id(get_id(pilha.get(2)));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pegarDesafio.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btJogar1MouseClicked

    private void btJogar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogar1MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/JogarOffOut.png/"));
        btJogar1.setIcon(ico);        // TODO add your handling code here:
    }//GEN-LAST:event_btJogar1MouseEntered

    private void btJogar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogar1MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/JogarOff.png/"));
        btJogar1.setIcon(ico); // TODO add your handling code here:
    }//GEN-LAST:event_btJogar1MouseExited

    private void btJogar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogar2MouseClicked
        JogarOn jogar = new JogarOn();
        jogar.set_visible(vet[3]);
        try {
            jogar.set_id(get_id(pilha.get(3)));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pegarDesafio.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btJogar2MouseClicked

    private void btJogar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogar2MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/JogarOffOut.png/"));
        btJogar2.setIcon(ico);     // TODO add your handling code here:
    }//GEN-LAST:event_btJogar2MouseEntered

    private void btJogar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogar2MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/JogarOff.png/"));
        btJogar2.setIcon(ico);   // TODO add your handling code here:
    }//GEN-LAST:event_btJogar2MouseExited

    private void btJogar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogar3MouseClicked
        JogarOn jogar = new JogarOn();

        jogar.set_visible(vet[0]);
        try {
            jogar.set_id(get_id(pilha.get(0)));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pegarDesafio.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_btJogar3MouseClicked

    private void btJogar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogar3MouseEntered
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/JogarOffOut.png/"));
        btJogar3.setIcon(ico);      // TODO add your handling code here:
    }//GEN-LAST:event_btJogar3MouseEntered

    private void btJogar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogar3MouseExited
        ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/JogarOff.png/"));
        btJogar3.setIcon(ico); // TODO add your handling code here:
    }//GEN-LAST:event_btJogar3MouseExited

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

    private void btAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAjudaMouseClicked
        jPanel1.setVisible(true);
        jTextPane1.setText("- Clique em atualizar para \n"
                + "mostrar 4 novas combinações\n"
                + "- Clique em +Descição para mostrar a descrição do desafio\n"
                + "- Clique em Jogar para jogar o desafio selecionado");

    }//GEN-LAST:event_btAjudaMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jPanel1.setVisible(false);
        try {
            escolher();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pegarDesafio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btAjudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAjudaMouseEntered
ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btHelp2.png/"));
        btAjuda.setIcon(ico);
    }//GEN-LAST:event_btAjudaMouseEntered

    private void btAjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAjudaMouseExited
ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/1495693343_help.png/"));
        btAjuda.setIcon(ico);
    }//GEN-LAST:event_btAjudaMouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        Object[] options = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null,
                "Você deseja sair do jogo?", "ATENÇÃO",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                options, options[0]);
        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btDescricaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDescricaoMouseClicked
        jPanel1.setVisible(true);
        jTextPane1.setText(vet[0]);
    }//GEN-LAST:event_btDescricaoMouseClicked

    private void btDescricao1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDescricao1MouseClicked
        jPanel1.setVisible(true);
        jTextPane1.setText(vet[1]);
    }//GEN-LAST:event_btDescricao1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jPanel1.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btDescricao2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDescricao2MouseClicked
        jPanel1.setVisible(true);
        jTextPane1.setText(vet[2]);
    }//GEN-LAST:event_btDescricao2MouseClicked

    private void btDescricao3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDescricao3MouseClicked
        jPanel1.setVisible(true);
        jTextPane1.setText(vet[3]);
    }//GEN-LAST:event_btDescricao3MouseClicked

    private void btRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRefreshMouseClicked
   try {
            escolher();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pegarDesafio.class.getName()).log(Level.SEVERE, null, ex);
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_btRefreshMouseClicked

    private void btRefreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRefreshMouseEntered
ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/btResfresh.png/"));
        btRefresh.setIcon(ico);

    }//GEN-LAST:event_btRefreshMouseEntered

    private void btRefreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btRefreshMouseExited
ImageIcon ico = new ImageIcon(getClass().getResource("/Imagens/1495693384_refresh.png/"));
        btRefresh.setIcon(ico);
    }//GEN-LAST:event_btRefreshMouseExited
    Stack<String> pilha = new Stack();
    Jogo obj_jogo = new Jogo();
    LinkedList<String> list = new LinkedList();

    private void escolher() throws ClassNotFoundException {
        pilha.setSize(0);
        list = obj_jogo.get_lista();
        boolean escolhido = false;
        int estado = 0;
        while (escolhido == false) {
            Random rand = new Random();
            int numero = rand.nextInt(list.size() - 1);
            switch (estado) {
                case 0:
                    pilha.add(list.get(numero));
                    estado++;
                    break;
                case 1:
                    if (!list.get(numero).equals(pilha.get(0))) {
                        pilha.add(list.get(numero));
                        estado++;
                    }
                    break;
                case 2:
                    if (!list.get(numero).equals(pilha.get(0)) && !list.get(numero).equals(pilha.get(1))) {
                        pilha.add(list.get(numero));
                        estado++;
                    }
                    break;
                case 3:
                    if (!list.get(numero).equals(pilha.get(0)) && !list.get(numero).equals(pilha.get(1)) && !list.get(numero).equals(pilha.get(2))) {
                        pilha.add(list.get(numero));
                        estado++;
                        escolhido = true;
                    }
                    break;

            }
        }
        mostrar();
    }
    String[] vet = new String[4];

    private void mostrar() {
        for (int i = 0; i < pilha.size(); i++) {
            String resultado = pilha.get(i);
            String id = "";
            String dificuldade = "";
            String descricao = "";
            int contador = 0;
            for (int a = 0; a < resultado.length(); a++) {
                if (resultado.charAt(a) == '-') {
                    contador++;
                    continue;
                }
                switch (contador) {
                    case 0:
                        id += resultado.charAt(a);
                        break;
                    case 1:
                        dificuldade += resultado.charAt(a);
                        break;
                    case 2:
                        descricao += resultado.charAt(a);
                        break;
                }
            }
            vet[i] = descricao;
            switch (dificuldade) {
                case "0":
                    dificuldade = "Fácil";
                    break;
                case "1":
                    dificuldade = "Médio";
                    break;
                case "2":
                    dificuldade = "Dificil";
                    break;
            }
            tbDesafio.setValueAt(id, i, 0);
            tbDesafio.setValueAt(dificuldade, i, 1);
        }

    }

    private String get_id(String temp) {
        String resposta = "";
        for (int a = 0; a < temp.length(); a++) {
            if (temp.charAt(a) == '-') {
                break;
            }
            resposta += temp.charAt(a);
        }
        return resposta;
    }

    public void set_visible() {
        jPanel1.setVisible(false);
        setVisible(true);
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
            java.util.logging.Logger.getLogger(pegarDesafio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pegarDesafio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pegarDesafio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pegarDesafio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pegarDesafio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JTextField IGNORAR;
    private javax.swing.JLabel Move;
    private javax.swing.JLabel btAjuda;
    private javax.swing.JLabel btDescricao;
    private javax.swing.JLabel btDescricao1;
    private javax.swing.JLabel btDescricao2;
    private javax.swing.JLabel btDescricao3;
    private javax.swing.JLabel btJogar;
    private javax.swing.JLabel btJogar1;
    private javax.swing.JLabel btJogar2;
    private javax.swing.JLabel btJogar3;
    private javax.swing.JLabel btRefresh;
    private javax.swing.JLabel btReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel pegarDesafio;
    private javax.swing.JTable tbDesafio;
    // End of variables declaration//GEN-END:variables
}
