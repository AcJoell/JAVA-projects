package prestamos;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class windowL extends javax.swing.JFrame {
    
    data joinDB = new data();
    Connection enter = joinDB.conectando();
    libro lib = new libro();
    
    public windowL() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void printCreate(){
        String guardarCodigo = codigo.getText();
        String guardarTitulo = titulo.getText();
        String guardarEditor = editorial.getText();
        String guardarAutor = autor.getText();
        int guardarPaginas = Integer.parseInt(pagina.getText());
        
        if(lib.create(guardarCodigo, guardarTitulo, guardarEditor, guardarAutor, guardarPaginas)){
            JOptionPane.showMessageDialog(null, "El libro se ha creado con exito...");
        }
        else{
            JOptionPane.showMessageDialog(null, "Hubo un error al crear el libro...");
        }
    }
    
    public void printRead(){
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("CODIGO ID");
        tabla.addColumn("TITULO");
        tabla.addColumn("EDITORIAL");
        tabla.addColumn("AUTOR");
        tabla.addColumn("PAGINAS");
        listaLibro.setModel(tabla);
        
        String[] datosLibro = new String[5];
        
        try{
            ResultSet result = lib.read();
            while(result.next()){
                datosLibro[0]=result.getString(1);
                datosLibro[1]=result.getString(2);
                datosLibro[2]=result.getString(3);
                datosLibro[3]=result.getString(4);
                datosLibro[4]=result.getString(5);
                tabla.addRow(datosLibro);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pueden traer los libros... \n"+e);
        }
        
    }
    
    public void printUpdate(){
        String guardarCodig = codigo.getText();
        codigo.setEnabled(false);
        String guardarTitul = titulo.getText();
        String guardarEdito = editorial.getText();
        String guardarAutor = autor.getText();
        int guardarPaginas = Integer.parseInt(pagina.getText());
        if(lib.update(guardarCodig, guardarTitul, guardarEdito, guardarAutor, guardarPaginas)){
            JOptionPane.showMessageDialog(null,"La actualizacion se realizo exitosamente");
        } else {
            JOptionPane.showMessageDialog(null,"Hubo un error al realizar la actualizacion");
        }
    }
    
    public void printDelete(){
        String guardarCodigo = codigo.getText();
        
        if(lib.delete(guardarCodigo)){
            JOptionPane.showMessageDialog(null, "Successfully removed");
        } else {
            JOptionPane.showMessageDialog(null, "Delete failed");
        }
    }
    
    public void printClean(){
        codigo.setText("");
        codigo.setEnabled(true);
        titulo.setText("");
        editorial.setText("");
        autor.setText("");
        pagina.setText("");
    }
    
    public void printLoad(){
        int fila = listaLibro.getSelectedRow();
        
        if(fila>=0){
            // codigo, editorial, titulo, pagina
            codigo.setText(listaLibro.getValueAt(fila, 0).toString());
            titulo.setText(listaLibro.getValueAt(fila, 1).toString());
            editorial.setText(listaLibro.getValueAt(fila, 2).toString());
            autor.setText(listaLibro.getValueAt(fila, 3).toString());
            pagina.setText(listaLibro.getValueAt(fila, 4).toString());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        dalete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        read = new javax.swing.JButton();
        create = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        codigo = new javax.swing.JTextField();
        titulo = new javax.swing.JTextField();
        editorial = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaLibro = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        pagina = new javax.swing.JTextField();
        load = new javax.swing.JButton();

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

        dalete.setBackground(new java.awt.Color(255, 87, 34));
        dalete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        dalete.setForeground(new java.awt.Color(238, 238, 238));
        dalete.setText("DELETE");
        dalete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daleteActionPerformed(evt);
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
        codigo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
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

        titulo.setBackground(new java.awt.Color(238, 238, 238));
        titulo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        titulo.setForeground(new java.awt.Color(19, 22, 25));
        titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        titulo.setText("TITULO");
        titulo.setDisabledTextColor(new java.awt.Color(19, 22, 25));
        titulo.setPreferredSize(new java.awt.Dimension(79, 26));
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        editorial.setBackground(new java.awt.Color(238, 238, 238));
        editorial.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        editorial.setForeground(new java.awt.Color(19, 22, 25));
        editorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editorial.setText("EDITORIAL");
        editorial.setDisabledTextColor(new java.awt.Color(19, 22, 25));
        editorial.setPreferredSize(new java.awt.Dimension(79, 26));
        editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editorialActionPerformed(evt);
            }
        });

        autor.setBackground(new java.awt.Color(238, 238, 238));
        autor.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        autor.setForeground(new java.awt.Color(19, 22, 25));
        autor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        autor.setText("AUTOR");
        autor.setDisabledTextColor(new java.awt.Color(19, 22, 25));
        autor.setPreferredSize(new java.awt.Dimension(79, 26));
        autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorActionPerformed(evt);
            }
        });

        listaLibro.setBackground(new java.awt.Color(19, 22, 25));
        listaLibro.setForeground(new java.awt.Color(238, 238, 238));
        listaLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        listaLibro.setGridColor(new java.awt.Color(0, 173, 181));
        jScrollPane1.setViewportView(listaLibro);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TB LIBRO");

        pagina.setBackground(new java.awt.Color(238, 238, 238));
        pagina.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        pagina.setForeground(new java.awt.Color(19, 22, 25));
        pagina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pagina.setText("PAGINAS");
        pagina.setDisabledTextColor(new java.awt.Color(19, 22, 25));
        pagina.setPreferredSize(new java.awt.Dimension(79, 26));
        pagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaActionPerformed(evt);
            }
        });

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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4)
                            .addComponent(create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(read, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(dalete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(autor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(autor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dalete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

    private void editorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editorialActionPerformed

    private void autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autorActionPerformed

    private void paginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paginaActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        printCreate();
        printRead();
    }//GEN-LAST:event_createActionPerformed

    private void readActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readActionPerformed
        printRead();
    }//GEN-LAST:event_readActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        printUpdate();
        printClean();
        printRead();
    }//GEN-LAST:event_updateActionPerformed

    private void daleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daleteActionPerformed
        printDelete();
        printRead();
    }//GEN-LAST:event_daleteActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        printClean();
        printLoad();
    }//GEN-LAST:event_loadActionPerformed

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
            java.util.logging.Logger.getLogger(windowL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(windowL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(windowL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(windowL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new windowL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField autor;
    public static javax.swing.JTextField codigo;
    private javax.swing.JButton create;
    private javax.swing.JButton dalete;
    public static javax.swing.JTextField editorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable listaLibro;
    private javax.swing.JButton load;
    public static javax.swing.JTextField pagina;
    private javax.swing.JButton read;
    public static javax.swing.JTextField titulo;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
