 package tricky;

import java.util.Random;
import javax.swing.JOptionPane;

public class game extends javax.swing.JFrame {

    datos execute = new datos();
    String[][] caja = new String[3][3];
    public int elepc;
    
    public void changeWindow(){
        footer enter = new footer();
        this.setVisible(false);
        enter.setVisible(true);
    }    

    public String[][] getCaja() {
        return caja;
    }

    public void setCaja(String[][] caja) {
        this.caja = caja;
    }
    
    Random aleatorio = new Random();
    
    public game() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        po1 = new javax.swing.JLabel();
        po2 = new javax.swing.JLabel();
        po3 = new javax.swing.JLabel();
        po4 = new javax.swing.JLabel();
        po5 = new javax.swing.JLabel();
        po6 = new javax.swing.JLabel();
        po7 = new javax.swing.JLabel();
        po8 = new javax.swing.JLabel();
        po9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        po1.setFont(new java.awt.Font("Verdana", 1, 75)); // NOI18N
        po1.setForeground(new java.awt.Color(0, 0, 0));
        po1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        po1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        po1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                po1MouseClicked(evt);
            }
        });
        jPanel1.add(po1);

        po2.setFont(new java.awt.Font("Verdana", 1, 75)); // NOI18N
        po2.setForeground(new java.awt.Color(0, 0, 0));
        po2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        po2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        po2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                po2MouseClicked(evt);
            }
        });
        jPanel1.add(po2);

        po3.setFont(new java.awt.Font("Verdana", 1, 75)); // NOI18N
        po3.setForeground(new java.awt.Color(0, 0, 0));
        po3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        po3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        po3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                po3MouseClicked(evt);
            }
        });
        jPanel1.add(po3);

        po4.setFont(new java.awt.Font("Verdana", 1, 75)); // NOI18N
        po4.setForeground(new java.awt.Color(0, 0, 0));
        po4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        po4.setText("B");
        po4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        po4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                po4MouseClicked(evt);
            }
        });
        jPanel1.add(po4);

        po5.setFont(new java.awt.Font("Verdana", 1, 75)); // NOI18N
        po5.setForeground(new java.awt.Color(0, 0, 0));
        po5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        po5.setText("A");
        po5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        po5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                po5MouseClicked(evt);
            }
        });
        jPanel1.add(po5);

        po6.setFont(new java.awt.Font("Verdana", 1, 75)); // NOI18N
        po6.setForeground(new java.awt.Color(0, 0, 0));
        po6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        po6.setText("D");
        po6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        po6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                po6MouseClicked(evt);
            }
        });
        jPanel1.add(po6);

        po7.setFont(new java.awt.Font("Verdana", 1, 75)); // NOI18N
        po7.setForeground(new java.awt.Color(0, 0, 0));
        po7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        po7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        po7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                po7MouseClicked(evt);
            }
        });
        jPanel1.add(po7);

        po8.setFont(new java.awt.Font("Verdana", 1, 75)); // NOI18N
        po8.setForeground(new java.awt.Color(0, 0, 0));
        po8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        po8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        po8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                po8MouseClicked(evt);
            }
        });
        jPanel1.add(po8);

        po9.setFont(new java.awt.Font("Verdana", 1, 75)); // NOI18N
        po9.setForeground(new java.awt.Color(0, 0, 0));
        po9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        po9.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 51, 51)));
        po9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                po9MouseClicked(evt);
            }
        });
        jPanel1.add(po9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void po1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_po1MouseClicked
        // PO1
        po1.setText(execute.item);
        caja[0][0] = po1.getText();
        elecciones();
        execute.aleatorPc();
        elecciones();
    }//GEN-LAST:event_po1MouseClicked

    private void po2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_po2MouseClicked
        // PO2
        po2.setText(execute.item);
        caja[0][1] = po1.getText();
        elecciones();
        execute.aleatorPc();
        elecciones();
    }//GEN-LAST:event_po2MouseClicked

    private void po3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_po3MouseClicked
        // PO3
        po3.setText(execute.item);
        caja[0][2] = po1.getText();
        elecciones();
        execute.aleatorPc();
        elecciones();
    }//GEN-LAST:event_po3MouseClicked

    private void po4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_po4MouseClicked
        // PO4
        po4.setText(execute.item);
        caja[1][0] = po1.getText();
        elecciones();
        execute.aleatorPc();
        elecciones();
    }//GEN-LAST:event_po4MouseClicked

    private void po5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_po5MouseClicked
        // PO5
        po5.setText(execute.item);
        caja[1][1] = po1.getText();
        elecciones();
        execute.aleatorPc();
        elecciones();
    }//GEN-LAST:event_po5MouseClicked

    private void po6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_po6MouseClicked
        // PO6
        po6.setText(execute.item);
        caja[1][2] = po1.getText();
        elecciones();
        execute.aleatorPc();
        elecciones();
    }//GEN-LAST:event_po6MouseClicked

    private void po7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_po7MouseClicked
        // PO7
        po7.setText(execute.item);
        caja[2][0] = po1.getText();
        elecciones();
        execute.aleatorPc();
        elecciones();
    }//GEN-LAST:event_po7MouseClicked

    private void po8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_po8MouseClicked
        // PO8
        po8.setText(execute.item);
        caja[2][1] = po1.getText();
        elecciones();
        execute.aleatorPc();
        elecciones();
    }//GEN-LAST:event_po8MouseClicked

    private void po9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_po9MouseClicked
        // PO9
        po9.setText(execute.item);
        caja[2][2] = po1.getText();
        elecciones();
        execute.aleatorPc();
        elecciones();
    }//GEN-LAST:event_po9MouseClicked
    
    public void elecciones(){      
        
        //HORIZONTAL

        if(caja[0][0]!=null && caja[0][1]!=null && caja[0][2]!=null){
            if(caja[0][0]==caja[0][1] & caja[0][1]==caja[0][2]){
                JOptionPane.showMessageDialog(null,"TRES - EN - LINEA");
                changeWindow();
            }
        }
        if(caja[1][0]!=null && caja[1][1]!=null && caja[1][2]!=null){
            if(caja[1][0]==caja[1][1] && caja[1][1]==caja[1][2]){
                JOptionPane.showMessageDialog(null,"TRES - EN - LINEA");
                changeWindow();
            }
        }
        if(caja[2][0]!=null && caja[2][1]!=null && caja[2][2]!=null){
            if(caja[2][0]==caja[2][1] && caja[2][1]==caja[2][2]){
                JOptionPane.showMessageDialog(null,"TRES - EN - LINEA");
                changeWindow();
            }
        }
        
        //VERTICAL
        
        if(caja[0][0]!=null && caja[1][0]!=null && caja[2][0]!=null){
            if(caja[0][0]==caja[1][0] && caja[1][0]==caja[2][0]){
                JOptionPane.showMessageDialog(null,"TRES - EN - LINEA");
                changeWindow();
            }
        }
        if(caja[0][1]!=null && caja[1][1]!=null && caja[2][1]!=null){
            if(caja[0][1]==caja[1][1] && caja[1][1]==caja[2][1]){
                JOptionPane.showMessageDialog(null,"TRES - EN - LINEA");
                changeWindow();
            }
        }
        if(caja[0][2]!=null && caja[1][2]!=null && caja[2][2]!=null){
            if(caja[0][2]==caja[1][2] && caja[1][2]==caja[2][2]){
                JOptionPane.showMessageDialog(null,"TRES - EN - LINEA");
                changeWindow();
            }
        }
        
        //DIAGONAL
        
        if(caja[0][0]!=null && caja[1][1]!=null && caja[2][2]!=null){
            if(caja[0][0]==caja[1][1] && caja[1][1]==caja[2][2]){
                JOptionPane.showMessageDialog(null,"TRES - EN - LINEA");
                changeWindow();
            }
        }
        if(caja[0][2]!=null && caja[1][1]!=null && caja[2][0]!=null){
            if(caja[0][2]==caja[1][1] && caja[1][1]==caja[2][0]){
                JOptionPane.showMessageDialog(null,"TRES - EN - LINEA");
                changeWindow();
            }
        }
    }
    
    /*
    00 01 02
    10 11 12
    20 21 22
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
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel po1;
    public static javax.swing.JLabel po2;
    public static javax.swing.JLabel po3;
    public static javax.swing.JLabel po4;
    public static javax.swing.JLabel po5;
    public static javax.swing.JLabel po6;
    public static javax.swing.JLabel po7;
    public static javax.swing.JLabel po8;
    public static javax.swing.JLabel po9;
    // End of variables declaration//GEN-END:variables
}
