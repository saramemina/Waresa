/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Waresa01;

import javax.swing.*;

/**
 *
 * @author sara
 */
public class Esencial02 extends javax.swing.JFrame {

    /**
     * Creates new form Principal01
     */
    public Esencial02() {
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        Sonidos sonido = new Sonidos("WaresaRecursos/waterfall.wav");
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
        pnl_base = new javax.swing.JPanel();
        jPanelEsencial_c = new javax.swing.JPanel();
        jLabel_c = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbt_1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rbt_2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        rbt_3 = new javax.swing.JRadioButton();
        jPanelEsencial_i = new javax.swing.JPanel();
        jLabel_i = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        rbt_4 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        rbt_6 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(974, 546));

        pnl_base.setBackground(new java.awt.Color(90, 176, 233));

        jPanelEsencial_c.setBackground(new java.awt.Color(69, 163, 224));
        jPanelEsencial_c.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel_c.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel_c.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_c.setText("Contenido");
        jLabel_c.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setOpaque(false);

        rbt_1.setBackground(new java.awt.Color(255, 102, 102));
        buttonGroup1.add(rbt_1);
        rbt_1.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        rbt_1.setForeground(new java.awt.Color(255, 255, 255));
        rbt_1.setText("1. Componentes del diseño");
        rbt_1.setOpaque(false);
        rbt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(rbt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbt_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setOpaque(false);

        rbt_2.setBackground(new java.awt.Color(255, 102, 102));
        buttonGroup1.add(rbt_2);
        rbt_2.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        rbt_2.setForeground(new java.awt.Color(255, 255, 255));
        rbt_2.setText("2. Proceso de construcción");
        rbt_2.setOpaque(false);
        rbt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbt_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setOpaque(false);

        rbt_3.setBackground(new java.awt.Color(255, 102, 102));
        buttonGroup1.add(rbt_3);
        rbt_3.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        rbt_3.setForeground(new java.awt.Color(255, 255, 255));
        rbt_3.setText("3. Concejos y cuidados");
        rbt_3.setOpaque(false);
        rbt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(rbt_3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbt_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelEsencial_cLayout = new javax.swing.GroupLayout(jPanelEsencial_c);
        jPanelEsencial_c.setLayout(jPanelEsencial_cLayout);
        jPanelEsencial_cLayout.setHorizontalGroup(
            jPanelEsencial_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEsencial_cLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel_c)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanelEsencial_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelEsencial_cLayout.setVerticalGroup(
            jPanelEsencial_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEsencial_cLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanelEsencial_cLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_c))
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanelEsencial_i.setBackground(new java.awt.Color(69, 163, 224));
        jPanelEsencial_i.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel_i.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel_i.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_i.setText("Información");
        jLabel_i.setToolTipText("");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setOpaque(false);

        rbt_4.setBackground(new java.awt.Color(255, 102, 102));
        buttonGroup1.add(rbt_4);
        rbt_4.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        rbt_4.setForeground(new java.awt.Color(255, 255, 255));
        rbt_4.setText("Presentación");
        rbt_4.setOpaque(false);
        rbt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(rbt_4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbt_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel6.setOpaque(false);

        rbt_6.setBackground(new java.awt.Color(255, 102, 102));
        buttonGroup1.add(rbt_6);
        rbt_6.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        rbt_6.setForeground(new java.awt.Color(255, 255, 255));
        rbt_6.setText("Proclamación");
        rbt_6.setOpaque(false);
        rbt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbt_6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(rbt_6)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbt_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelEsencial_iLayout = new javax.swing.GroupLayout(jPanelEsencial_i);
        jPanelEsencial_i.setLayout(jPanelEsencial_iLayout);
        jPanelEsencial_iLayout.setHorizontalGroup(
            jPanelEsencial_iLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEsencial_iLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel_i)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEsencial_iLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jPanelEsencial_iLayout.setVerticalGroup(
            jPanelEsencial_iLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEsencial_iLayout.createSequentialGroup()
                .addGroup(jPanelEsencial_iLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEsencial_iLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEsencial_iLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel_i)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout pnl_baseLayout = new javax.swing.GroupLayout(pnl_base);
        pnl_base.setLayout(pnl_baseLayout);
        pnl_baseLayout.setHorizontalGroup(
            pnl_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_baseLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(pnl_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelEsencial_c, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEsencial_i, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91))
        );
        pnl_baseLayout.setVerticalGroup(
            pnl_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_baseLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanelEsencial_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanelEsencial_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_1ActionPerformed
        Esencial02_c1 c1 = new Esencial02_c1();
        this.dispose();
    }//GEN-LAST:event_rbt_1ActionPerformed

    private void rbt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_2ActionPerformed
        Esencial02_c2 c2 = new Esencial02_c2();
        this.dispose();
    }//GEN-LAST:event_rbt_2ActionPerformed

    private void rbt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_3ActionPerformed
        Esencial02_c3 c3 = new Esencial02_c3();
        this.dispose();
    }//GEN-LAST:event_rbt_3ActionPerformed

    private void rbt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_4ActionPerformed
        Esencial02_i1 i1 = new Esencial02_i1();
        this.dispose();
    }//GEN-LAST:event_rbt_4ActionPerformed

    private void rbt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbt_6ActionPerformed
        Esencial02_i2 i2 = new Esencial02_i2();
        this.dispose();
    }//GEN-LAST:event_rbt_6ActionPerformed

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
            java.util.logging.Logger.getLogger(Esencial02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Esencial02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Esencial02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Esencial02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Esencial02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel_c;
    private javax.swing.JLabel jLabel_i;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelEsencial_c;
    private javax.swing.JPanel jPanelEsencial_i;
    private javax.swing.JPanel pnl_base;
    private javax.swing.JRadioButton rbt_1;
    private javax.swing.JRadioButton rbt_2;
    private javax.swing.JRadioButton rbt_3;
    private javax.swing.JRadioButton rbt_4;
    private javax.swing.JRadioButton rbt_6;
    // End of variables declaration//GEN-END:variables
}
