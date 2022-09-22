/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.szyfrowanie;

import java.sql.Types;
import java.util.Arrays;

/**
 *
 * @author lewandowskikacper
 */
public class Szyfrowanie extends javax.swing.JFrame {

    /**
     * Creates new form Szyfrowanie
     */
    public Szyfrowanie() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRB1 = new javax.swing.JRadioButton();
        jRB2 = new javax.swing.JRadioButton();
        jBZakoduj = new javax.swing.JButton();
        jBWyczysc = new javax.swing.JButton();
        jBZapisz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTALeft = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTARight = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 450));
        setMinimumSize(new java.awt.Dimension(800, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 450));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 450));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 450));

        buttonGroup1.add(jRB1);
        jRB1.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jRB1.setSelected(true);
        jRB1.setText("KODOWANIE");
        jRB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB2);
        jRB2.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        jRB2.setText("DEKODOWANIE");
        jRB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB2ActionPerformed(evt);
            }
        });

        jBZakoduj.setBackground(new java.awt.Color(255, 204, 102));
        jBZakoduj.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jBZakoduj.setText("ZAKODUJ");
        jBZakoduj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBZakodujActionPerformed(evt);
            }
        });

        jBWyczysc.setBackground(new java.awt.Color(255, 204, 102));
        jBWyczysc.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jBWyczysc.setText("WYCZYŚĆ");
        jBWyczysc.setPreferredSize(new java.awt.Dimension(120, 40));

        jBZapisz.setBackground(new java.awt.Color(255, 204, 102));
        jBZapisz.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jBZapisz.setText("ZAPISZ");
        jBZapisz.setPreferredSize(new java.awt.Dimension(120, 40));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Zaszyfrowany teskt");

        jTALeft.setColumns(20);
        jTALeft.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jTALeft.setRows(5);
        jScrollPane1.setViewportView(jTALeft);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(384, 227));

        jTARight.setEditable(false);
        jTARight.setColumns(20);
        jTARight.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jTARight.setRows(5);
        jScrollPane2.setViewportView(jTARight);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jRB1)
                .addGap(32, 32, 32)
                .addComponent(jRB2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBZakoduj, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBWyczysc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBZapisz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRB1)
                    .addComponent(jRB2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBZakoduj, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBWyczysc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBZapisz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBZakodujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBZakodujActionPerformed
        if(jRB1.isSelected()){
            String text = jTALeft.getText();
            text = text.toLowerCase();
            String litery = "abcdefghijklmnopqrstuwxyz";
            char[] tab1 = text.toCharArray();
            char[] tab2 = litery.toCharArray();
            String odp = "";
            for(int i=0; i<text.length(); i++){
                char q = text.charAt(i);
                int s = Arrays.asList(tab2).indexOf(q);
                char w = tab2[s+3];
                text = text.substring(0,i)+w+text.substring(i+1);
            }
            jTALeft.setText(text);
        }
    }//GEN-LAST:event_jBZakodujActionPerformed

    private void jRB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB1ActionPerformed
        jBZakoduj.setText("ZAKODUJ");
        jBZapisz.setText("ZAPISZ");
        jLabel1.setText("Zakodowany text");
    }//GEN-LAST:event_jRB1ActionPerformed

    private void jRB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB2ActionPerformed
        jBZakoduj.setText("ODKODUJ");
        jBZapisz.setText("WCZYTAJ");
        jLabel1.setText("Odkodowany tekst");
    }//GEN-LAST:event_jRB2ActionPerformed

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
            java.util.logging.Logger.getLogger(Szyfrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szyfrowanie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szyfrowanie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBWyczysc;
    private javax.swing.JButton jBZakoduj;
    private javax.swing.JButton jBZapisz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRB1;
    private javax.swing.JRadioButton jRB2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTALeft;
    private javax.swing.JTextArea jTARight;
    // End of variables declaration//GEN-END:variables
}
