package prestamos;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class windowE extends javax.swing.JFrame {
    
    data joinDB = new data();
    Connection enter = joinDB.conectando();
    estudiante estu = new estudiante();
    
    public windowE() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void printRead(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("CODIGO ID");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("APELLIDO");
        tabla.addColumn("DIRECCION");
        listaEstudiante.setModel(tabla);
        
        String[] datosEstudiante = new String[4];
        
        try{
            ResultSet result = estu.read();
            while(result.next()){
                datosEstudiante[0]=result.getString(1);
                datosEstudiante[1]=result.getString(2);
                datosEstudiante[2]=result.getString(3);
                datosEstudiante[3]=result.getString(4);
                tabla.addRow(datosEstudiante);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pueden traer los estudiantes... \n"+e);
        }
    }
    
    public void printCreate(){
      String guardarCodigo = codigo.getText();
      String guardarNombre = nombre.getText();
      String guardarApelli = apellido.getText();
      String guardarDirecc = direccion.getText();
      
      if(estu.create(guardarCodigo, guardarNombre, guardarApelli, guardarDirecc)){
          JOptionPane.showMessageDialog(null, "El estudiante se ha creado con exito...");
      } else {
          JOptionPane.showMessageDialog(null, "Hubo un error al crear el estudiante...");
      }
    }
    
    public void printUpdate(){
        String guardarCodig = codigo.getText();
        codigo.setEnabled(false);
        String guardarNombr = nombre.getText();
        String guardarApell = apellido.getText();
        String guardarDirec = direccion.getText();
        
        if(estu.update(guardarCodig, guardarNombr, guardarApell, guardarDirec)){
            JOptionPane.showMessageDialog(null,"La actualizacion se realizo exitosamente");
        } else {
            JOptionPane.showMessageDialog(null,"Hubo un error al realizar la actualizacion");
        }
    }
    
    public void printDelete(){
        int fila = listaEstudiante.getSelectedRow();
        String guardarCodigo = listaEstudiante.getValueAt(fila, 0).toString();

        int answer = Integer.parseInt(JOptionPane.showInputDialog(null, "No podra recuperar los datos borrados.\nDigite:\n1. Continuar\n2. Cancelar"));
        if(answer == 1){
            if(estu.delete(guardarCodigo)){
                JOptionPane.showMessageDialog(null, "Successfully removed");
            } else {
                JOptionPane.showMessageDialog(null, "Delete failed");
            }
        } else {}
    }
    
    public void printClean(){
        codigo.setText("");
        codigo.setEnabled(true);
        nombre.setText("");
        apellido.setText("");
        direccion.setText("");
    }
    
    public void printLoad(){
        int fila = listaEstudiante.getSelectedRow();
        
        if(fila>=0){
            // codigo, nombre, apellido, direccion
            codigo.setText(listaEstudiante.getValueAt(fila, 0).toString());
            codigo.setEnabled(false);
            nombre.setText(listaEstudiante.getValueAt(fila, 1).toString());
            apellido.setText(listaEstudiante.getValueAt(fila, 2).toString());
            direccion.setText(listaEstudiante.getValueAt(fila, 3).toString());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        read = new javax.swing.JButton();
        create = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        codigo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaEstudiante = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        load = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(19, 22, 25));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TB ESTUDIANTE");

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

        nombre.setBackground(new java.awt.Color(238, 238, 238));
        nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(19, 22, 25));
        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setText("NOMBRE");
        nombre.setDisabledTextColor(new java.awt.Color(19, 22, 25));
        nombre.setPreferredSize(new java.awt.Dimension(79, 26));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        apellido.setBackground(new java.awt.Color(238, 238, 238));
        apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        apellido.setForeground(new java.awt.Color(19, 22, 25));
        apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido.setText("APELLIDO");
        apellido.setDisabledTextColor(new java.awt.Color(19, 22, 25));
        apellido.setPreferredSize(new java.awt.Dimension(79, 26));
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        direccion.setBackground(new java.awt.Color(238, 238, 238));
        direccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        direccion.setForeground(new java.awt.Color(19, 22, 25));
        direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        direccion.setText("DIRECCION");
        direccion.setDisabledTextColor(new java.awt.Color(19, 22, 25));
        direccion.setPreferredSize(new java.awt.Dimension(79, 26));
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        listaEstudiante.setBackground(new java.awt.Color(19, 22, 25));
        listaEstudiante.setForeground(new java.awt.Color(238, 238, 238));
        listaEstudiante.setModel(new javax.swing.table.DefaultTableModel(
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
        listaEstudiante.setGridColor(new java.awt.Color(0, 173, 181));
        jScrollPane1.setViewportView(listaEstudiante);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        load.setBackground(new java.awt.Color(255, 87, 34));
        load.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        load.setForeground(new java.awt.Color(238, 238, 238));
        load.setText("LOAD");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4)
                                    .addComponent(create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(read, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(apellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(load, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE))))
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(delete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap())
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

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        printClean();
        printLoad();
    }//GEN-LAST:event_loadActionPerformed

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
            java.util.logging.Logger.getLogger(windowE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField apellido;
    public static javax.swing.JTextField codigo;
    private javax.swing.JButton create;
    private javax.swing.JButton delete;
    public static javax.swing.JTextField direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable listaEstudiante;
    private javax.swing.JButton load;
    public static javax.swing.JTextField nombre;
    private javax.swing.JButton read;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
