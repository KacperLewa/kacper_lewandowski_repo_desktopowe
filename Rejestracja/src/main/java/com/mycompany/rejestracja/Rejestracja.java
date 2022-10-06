/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rejestracja;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.JOptionPane;
/**
 *
 * @author lewandowskikacper
 */
public class Rejestracja extends javax.swing.JFrame {

    /**
     * Creates new form Rejestracja
     */
    public Rejestracja() {
        initComponents();
        
        f = new File("sekretnehasla.csv");
        
        Zapisz z = new Zapisz();
        
        
        jTFUser.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char sign = e.getKeyChar();
                if (sign >= 'A' && sign <= 'z'
                        || sign == KeyEvent.VK_BACK_SPACE){
                    
                } else {
                    jTFUser.setEditable(false);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                jTFUser.setEditable(true);
            }
        });
        
        jPFPassword.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char sign = e.getKeyChar();
                if (sign >= 'A' && sign <= 'z'
                        || sign >= '0' && sign <= '9'
                        || sign == KeyEvent.VK_BACK_SPACE){
                    
                } else {
                    jPFPassword.setEditable(false);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                jPFPassword.setEditable(true);
            }
        });
        
        jTFEmail.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char sign = e.getKeyChar();
                if (sign >= 'A' && sign <= 'z'
                        || sign == '@'
                        || sign == '.'
                        || sign == KeyEvent.VK_BACK_SPACE){
                    
                } else {
                    jTFEmail.setEditable(false);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                jTFEmail.setEditable(true);
            }
        });
        
        jPFConPassword.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char sign = e.getKeyChar();
                if (sign >= 'A' && sign <= 'z'
                        || sign >= '0' && sign <= '9'
                        || sign == KeyEvent.VK_BACK_SPACE){
                    
                } else {
                    jPFConPassword.setEditable(false);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                jPFConPassword.setEditable(true);
            }
        });
        
        jTFEmail2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char sign = e.getKeyChar();
                if (sign >= 'A' && sign <= 'z'
                        || sign == '@'
                        || sign == '.'
                        || sign == KeyEvent.VK_BACK_SPACE){
                    
                } else {
                    jTFEmail2.setEditable(false);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                jTFEmail2.setEditable(true);
            }
        });
        
        jPFPassword2.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char sign = e.getKeyChar();
                if (sign >= 'A' && sign <= 'z'
                        || sign >= '0' && sign <= '9'
                        || sign == KeyEvent.VK_BACK_SPACE){
                    
                } else {
                    jPFPassword2.setEditable(false);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                jPFPassword2.setEditable(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPFPassword = new javax.swing.JPasswordField();
        jPFConPassword = new javax.swing.JPasswordField();
        jLError1 = new javax.swing.JLabel();
        jLError2 = new javax.swing.JLabel();
        jLError3 = new javax.swing.JLabel();
        jLError4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFEmail2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPFPassword2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLError5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 380));
        setMinimumSize(new java.awt.Dimension(500, 380));
        setPreferredSize(new java.awt.Dimension(500, 380));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 380));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 380));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 380));

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 16)); // NOI18N
        jLabel1.setText("Rejestracja");

        jLabel2.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLabel2.setText("Username");

        jTFUser.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLabel3.setText("Email");

        jTFEmail.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLabel5.setText("Confirm password");

        jButton1.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jButton1.setText("Rejestracja");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLError1.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLError1.setForeground(new java.awt.Color(255, 0, 0));
        jLError1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLError2.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLError2.setForeground(new java.awt.Color(255, 0, 0));
        jLError2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLError3.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLError3.setForeground(new java.awt.Color(255, 0, 0));
        jLError3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLError4.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLError4.setForeground(new java.awt.Color(255, 0, 0));
        jLError4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel9.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFUser)
                    .addComponent(jTFEmail)
                    .addComponent(jPFPassword)
                    .addComponent(jPFConPassword)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLError1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLError2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(jLError3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 172, Short.MAX_VALUE)
                                .addComponent(jLError4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLError1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLError2))
                .addGap(7, 7, 7)
                .addComponent(jPFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLError3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFConPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jLabel9))
                    .addComponent(jLError4))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Rejestracja", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel6.setFont(new java.awt.Font("sansserif", 3, 16)); // NOI18N
        jLabel6.setText("Logowanie");

        jLabel7.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLabel8.setText("Password");

        jPFPassword2.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N

        jButton2.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jButton2.setText("Zaloguj");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLError5.setFont(new java.awt.Font("sansserif", 2, 18)); // NOI18N
        jLError5.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFEmail2)
                    .addComponent(jPFPassword2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLError5, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 300, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jLError5)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Logowanie", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String u = jTFUser.getText();
        String e = jTFEmail.getText();
        String p = new String (jPFPassword.getPassword());
        String cp = new String (jPFConPassword.getPassword());
        int d = u.length();
        int d2 = p.length();
        int g = 0;
        
        if(d >= 2 && d <= 20){
            g=g+1;
            jLError1.setText("");
        } else {
            jLError1.setText("*Dopuszczalna liczba znaków to od 2 do 20! ");
        }
        if(e.matches("[A-z](.*)@[A-z](.*)[.][A-z](.*)")){
            g=g+1;
            jLError2.setText("");
        } else {
            jLError2.setText("Źle podałeś email! ");
        }
        if(d2 >= 4){
            g=g+1;
            jLError3.setText("");
        } else {
            jLError3.setText("*Hasło musi mieć minimum 4 znaki! ");
        }
        if(p.equals(cp)){
            g=g+1;
            jLError4.setText("");
        } else {
            jLError4.setText("*Podałeś złe hasło! ");
        }
        if(g==4){
            z.zapisz(u, e, p);
            jLabel9.setText("Jesteś zarejestrowany! ");
        } else {
            jLabel9.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String e2 = jTFEmail2.getText();
        String p2 = new String (jPFPassword2.getPassword());
        String u = jTFUser.getText();
        z.odczyt(e2, p2, u);
        int s = z.getData();

        if(e2.equals("") || p2.equals("")){
            z.setData(2);
            s = z.getData();
        }

        if(e2.equals("")){
            s = 2;
        }
        

        if(s == 1){
                jLError5.setText("");
                JOptionPane.showMessageDialog(this, "Witaj: "+u);
            } else {
                jLError5.setText("*Podałeś złe dane! ");
            }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Rejestracja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rejestracja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rejestracja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rejestracja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rejestracja().setVisible(true);
            }
        });
    }
    File f;
    Zapisz z = new Zapisz();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLError1;
    private javax.swing.JLabel jLError2;
    private javax.swing.JLabel jLError3;
    private javax.swing.JLabel jLError4;
    private javax.swing.JLabel jLError5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPFConPassword;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JPasswordField jPFPassword2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFEmail;
    private javax.swing.JTextField jTFEmail2;
    private javax.swing.JTextField jTFUser;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
