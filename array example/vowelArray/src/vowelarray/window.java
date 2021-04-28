
package vowelarray;

public class window extends javax.swing.JFrame {

    datos execute = new datos();

    public window() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        vowel1 = new javax.swing.JLabel();
        vowel2 = new javax.swing.JLabel();
        vowel3 = new javax.swing.JLabel();
        vowel4 = new javax.swing.JLabel();
        vowel5 = new javax.swing.JLabel();
        field1 = new javax.swing.JLabel();
        field2 = new javax.swing.JLabel();
        field3 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        vowel1.setFont(new java.awt.Font("Verdana", 1, 55)); // NOI18N
        vowel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vowel1.setText("A");
        vowel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vowel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vowel1MouseClicked(evt);
            }
        });

        vowel2.setFont(new java.awt.Font("Verdana", 1, 55)); // NOI18N
        vowel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vowel2.setText("E");
        vowel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vowel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vowel2MouseClicked(evt);
            }
        });

        vowel3.setFont(new java.awt.Font("Verdana", 1, 55)); // NOI18N
        vowel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vowel3.setText("I");
        vowel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vowel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vowel3MouseClicked(evt);
            }
        });

        vowel4.setFont(new java.awt.Font("Verdana", 1, 55)); // NOI18N
        vowel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vowel4.setText("O");
        vowel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vowel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vowel4MouseClicked(evt);
            }
        });

        vowel5.setFont(new java.awt.Font("Verdana", 1, 55)); // NOI18N
        vowel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vowel5.setText("U");
        vowel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vowel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vowel5MouseClicked(evt);
            }
        });

        field1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        field1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        field1.setText("Field");

        field2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        field2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        field2.setText("Field");

        field3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        field3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        field3.setText("Field");

        name1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("NAME");
        name1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        name2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name2.setText("NAME");
        name2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        name3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name3.setText("NAME");
        name3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(vowel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(vowel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(vowel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(vowel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(vowel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vowel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vowel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vowel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vowel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vowel5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(field3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(field1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vowel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vowel1MouseClicked
        // Vowel A
        name1.setText(execute.vowelA[0]);
        name2.setText(execute.vowelA[1]);
        name3.setText(execute.vowelA[2]);
        field1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/a1.png")));
        field2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/a2.png")));
        field3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/a3.png")));
    }//GEN-LAST:event_vowel1MouseClicked

    private void vowel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vowel2MouseClicked
        // Vowel E
        name1.setText(execute.vowelE[0]);
        name2.setText(execute.vowelE[1]);
        name3.setText(execute.vowelE[2]);
        field1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/e1.png")));
        field2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/e2.png")));
        field3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/e3.png")));
    }//GEN-LAST:event_vowel2MouseClicked

    private void vowel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vowel3MouseClicked
        // Vowel I
        name1.setText(execute.vowelI[0]);
        name2.setText(execute.vowelI[1]);
        name3.setText(execute.vowelI[2]);
        field1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/i1.png")));
        field2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/i2.png")));
        field3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/i3.png")));
    }//GEN-LAST:event_vowel3MouseClicked

    private void vowel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vowel4MouseClicked
        // Vowel O
        name1.setText(execute.vowelO[0]);
        name2.setText(execute.vowelO[1]);
        name3.setText(execute.vowelO[2]);
        field1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/o1.png")));
        field2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/o2.png")));
        field3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/o3.png")));
    }//GEN-LAST:event_vowel4MouseClicked

    private void vowel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vowel5MouseClicked
        // Vowel U
        name1.setText(execute.vowelU[0]);
        name2.setText(execute.vowelU[1]);
        name3.setText(execute.vowelU[2]);
        field1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/u1.png")));
        field2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/u2.png")));
        field3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/u3.png")));
    }//GEN-LAST:event_vowel5MouseClicked

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
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel field1;
    public static javax.swing.JLabel field2;
    public static javax.swing.JLabel field3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel name1;
    public static javax.swing.JLabel name2;
    public static javax.swing.JLabel name3;
    public static javax.swing.JLabel vowel1;
    public static javax.swing.JLabel vowel2;
    public static javax.swing.JLabel vowel3;
    public static javax.swing.JLabel vowel4;
    public static javax.swing.JLabel vowel5;
    // End of variables declaration//GEN-END:variables
}
