package prestamos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class windowP extends javax.swing.JFrame {
    
    data joinDB = new data();
    Connection enter = joinDB.conectando();
    prestamo prest = new prestamo();
    estudiante estu = new estudiante();
    libro lib = new libro();
    
    public windowP() {
        initComponents();
        this.setLocationRelativeTo(null);
        estu.loadCombo(student);
        lib.loadCombo(book);
    }

    public void printCreate(){
      
      String guardarEstudiante = student.getItemAt(student.getSelectedIndex()).getCodigo();
      String guardarLibro = book.getItemAt(book.getSelectedIndex()).getCodigo();
      
      Date fechaPrestamo = (Date) fecha.getDate();
      long time = fechaPrestamo.getTime();
      java.sql.Date fechaMySQL = new java.sql.Date(time);
      String guardarFecha = fechaMySQL.toString();
      
      if(prest.create(guardarEstudiante, guardarLibro, guardarFecha)){
          JOptionPane.showMessageDialog(null, "El prestamo se ha creado con exito...");
      } else {
          JOptionPane.showMessageDialog(null, "Hubo un error al crear el prestamo...");
      }
    }
    
    public void printRead(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("CODIGO ID");
        tabla.addColumn("ESTUDIANTE");
        tabla.addColumn("LIBRO");
        tabla.addColumn("FECHA");
        listaPrestamo.setModel(tabla);
        
        String[] datosPrestamo = new String[4];
        
        try{
            ResultSet result = prest.read();
            while(result.next()){
                datosPrestamo[0]=result.getString(1);
                datosPrestamo[1]=result.getString(2);
                datosPrestamo[2]=result.getString(3);
                datosPrestamo[3]=result.getString(4);
                tabla.addRow(datosPrestamo);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pueden traer los libros... \n"+e);
        }
    }
    
    public void printUpdate(){
        String guardarCodigo = codigo.getText();
        //String guardarEstudiante = student.getItemAt(student.getSelectedIndex()).getCodigo();
        //String guardarLibro = book.getItemAt(book.getSelectedIndex()).getCodigo();
        
        Date fechaPrestamo = (Date) fecha.getDate();
        long time = fechaPrestamo.getTime();
        java.sql.Date fechaMySQL = new java.sql.Date(time);
        String guardarFecha = fechaMySQL.toString();
        
        if(prest.update(guardarFecha, guardarCodigo)){
            JOptionPane.showMessageDialog(null,"La actualizacion se realizo exitosamente");
        } else {
            JOptionPane.showMessageDialog(null,"Hubo un error al realizar la actualizacion");
        }
    }
    
    public void printDelete(){
        int fila = listaPrestamo.getSelectedRow();
        String guardarCodigo = listaPrestamo.getValueAt(fila, 0).toString();
        int answer = Integer.parseInt(JOptionPane.showInputDialog(null, "No podra recuperar los datos borrados.\nDigite:\n1. Continuar\n2. Cancelar"));
        if(answer == 1){
            if(prest.delete(guardarCodigo)){
                JOptionPane.showMessageDialog(null, "Successfully removed");
            } else {
                JOptionPane.showMessageDialog(null, "Delete failed");
            }
        } else {}
    }
    
    public void printClean(){
        student.setSelectedItem(null);
        book.setSelectedItem(null);
        fecha.setDate(null);
    }
    
    public void printLoad(){
        int fila = listaPrestamo.getSelectedRow();
         if(fila>=0){
             // estudiante, libro, fecha
             codigo.setText(listaPrestamo.getValueAt(fila, 0).toString());
             codigo.setEnabled(false);
             
             estu.loadCombo(student);
             lib.loadCombo(book);
             // estudiante.setText(listaPrestamo.getValueAt(fila, 1).toString());
             // libro.setText(listaPrestamo.getValueAt(fila, 2).toString());
             
             SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
             Date guardarFecha;
             try{
                 guardarFecha = formato.parse(listaPrestamo.getValueAt(fila, 3).toString());
                 fecha.setDate(guardarFecha);
             }
             catch(Exception e){
                 Logger.getLogger(windowP.class.getName()).log(Level.SEVERE, null, e);
             }
         }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        read = new javax.swing.JButton();
        create = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPrestamo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        load = new javax.swing.JButton();
        student = new javax.swing.JComboBox<>();
        book = new javax.swing.JComboBox<>();
        codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 22, 25));

        jSeparator2.setBackground(new java.awt.Color(0, 173, 181));
        jSeparator2.setForeground(new java.awt.Color(0, 173, 181));
        jSeparator2.setAlignmentX(6.9F);
        jSeparator2.setAlignmentY(6.9F);

        jSeparator3.setBackground(new java.awt.Color(0, 173, 181));
        jSeparator3.setForeground(new java.awt.Color(0, 173, 181));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");
        jSeparator3.setAlignmentX(6.9F);
        jSeparator3.setAlignmentY(6.9F);

        delete.setBackground(new java.awt.Color(255, 87, 34));
        delete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(238, 238, 238));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 87, 34));
        update.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(238, 238, 238));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        read.setBackground(new java.awt.Color(255, 87, 34));
        read.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        read.setForeground(new java.awt.Color(238, 238, 238));
        read.setText("READ");
        read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readActionPerformed(evt);
            }
        });

        create.setBackground(new java.awt.Color(255, 87, 34));
        create.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        create.setForeground(new java.awt.Color(238, 238, 238));
        create.setText("CREATE");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 173, 181));
        jSeparator4.setForeground(new java.awt.Color(0, 173, 181));
        jSeparator4.setAlignmentX(6.9F);
        jSeparator4.setAlignmentY(6.9F);

        listaPrestamo.setBackground(new java.awt.Color(19, 22, 25));
        listaPrestamo.setForeground(new java.awt.Color(238, 238, 238));
        listaPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listaPrestamo.setGridColor(new java.awt.Color(0, 173, 181));
        jScrollPane1.setViewportView(listaPrestamo);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TB PRESTAMO");

        fecha.setBackground(new java.awt.Color(238, 238, 238));
        fecha.setForeground(new java.awt.Color(19, 22, 25));

        load.setBackground(new java.awt.Color(255, 87, 34));
        load.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        load.setForeground(new java.awt.Color(238, 238, 238));
        load.setText("LOAD");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        student.setBackground(new java.awt.Color(255, 87, 34));
        student.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        student.setForeground(new java.awt.Color(238, 238, 238));
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });

        book.setBackground(new java.awt.Color(255, 87, 34));
        book.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        book.setForeground(new java.awt.Color(238, 238, 238));

        codigo.setBackground(new java.awt.Color(238, 238, 238));
        codigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        codigo.setForeground(new java.awt.Color(19, 22, 25));
        codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codigo.setText("CODIGO ID");
        codigo.setDisabledTextColor(new java.awt.Color(19, 22, 25));
        codigo.setPreferredSize(new java.awt.Dimension(79, 26));
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator4)
                            .addComponent(create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(read, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(student, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(book, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(create)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(read)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(load)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        printDelete();
        printRead();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        printUpdate();
        printClean();
        printRead();
    }//GEN-LAST:event_updateActionPerformed

    private void readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readActionPerformed
        printRead();
    }//GEN-LAST:event_readActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        printCreate();
        printRead();
    }//GEN-LAST:event_createActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        printClean();
        printLoad();
    }//GEN-LAST:event_loadActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

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
            java.util.logging.Logger.getLogger(windowP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<libro> book;
    public static javax.swing.JTextField codigo;
    private javax.swing.JButton create;
    private javax.swing.JButton delete;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable listaPrestamo;
    private javax.swing.JButton load;
    private javax.swing.JButton read;
    public static javax.swing.JComboBox<estudiante> student;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
