
package ahorcado;

public class window extends javax.swing.JFrame {

    datos execute = new datos();

    public window() {
        initComponents();
        this.setTitle("Ahorcado");
        this.setSize(760,450);
        this.setLocationRelativeTo(null);
        execute.chooseWord();
        execute.assignLineOfWord();
        head.setText(""+execute.lineal);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        l23 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        l25 = new javax.swing.JLabel();
        l26 = new javax.swing.JLabel();
        l27 = new javax.swing.JLabel();
        head = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        imagenAhorcado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HANGMAN GAME");

        l1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("A");
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
        });

        l2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("B");
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
        });

        l3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("C");
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
        });

        l4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("D");
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
        });

        l5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l5.setText("E");
        l5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l5MouseClicked(evt);
            }
        });

        l6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setText("F");
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
        });

        l7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l7.setText("G");
        l7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l7MouseClicked(evt);
            }
        });

        l8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l8.setText("H");
        l8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l8MouseClicked(evt);
            }
        });

        l9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l9.setText("I");
        l9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l9MouseClicked(evt);
            }
        });

        l10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l10.setText("J");
        l10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l10MouseClicked(evt);
            }
        });

        l11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l11.setText("K");
        l11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l11MouseClicked(evt);
            }
        });

        l12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l12.setText("L");
        l12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l12MouseClicked(evt);
            }
        });

        l13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l13.setText("M");
        l13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l13MouseClicked(evt);
            }
        });

        l14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l14.setText("N");
        l14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l14MouseClicked(evt);
            }
        });

        l15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l15.setText("Ñ");

        l16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l16.setText("O");

        l17.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l17.setText("P");

        l18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l18.setText("Q");

        l19.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l19.setText("R");

        l20.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l20.setText("S");

        l21.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l21.setText("T");

        l22.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l22.setText("U");

        l23.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l23.setText("V");

        l24.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l24.setText("W");

        l25.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l25.setText("X");

        l26.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l26.setText("Y");

        l27.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l27.setText("Z");

        head.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head.setText("");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        imagenAhorcado.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        imagenAhorcado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenAhorcado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(l15)
                                .addGap(18, 18, 18)
                                .addComponent(l16)
                                .addGap(18, 18, 18)
                                .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(l18)
                                .addGap(15, 15, 15)
                                .addComponent(l19)
                                .addGap(17, 17, 17)
                                .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(l21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(l22)
                                .addGap(16, 16, 16)
                                .addComponent(l23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(l26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(l27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(l4)
                                        .addGap(16, 16, 16)
                                        .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(l7)
                                        .addGap(16, 16, 16)
                                        .addComponent(l8)
                                        .addGap(15, 15, 15)
                                        .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(l13)
                                        .addGap(18, 18, 18)
                                        .addComponent(l14))
                                    .addComponent(imagenAhorcado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(imagenAhorcado, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(head)
                        .addGap(98, 98, 98)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l15))
                .addGap(48, 48, 48))
        );

        imagenAhorcado.setVisible(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        // A clicked
        String op = "A";
        execute.playGame(op.charAt(0));
        l1.setVisible(false);
        l1.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        // B clicked
        String op = "B";
        execute.playGame(op.charAt(0));
        l2.setVisible(false);
        l2.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        // C clicked
        String op = "C";
        execute.playGame(op.charAt(0));
        l3.setVisible(false);
        l3.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l3MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
        // D clicked
        String op = "D";
        execute.playGame(op.charAt(0));
        l4.setVisible(false);
        l4.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l4MouseClicked

    private void l5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseClicked
        // E clicked
        String op = "E";
        execute.playGame(op.charAt(0));
        l5.setVisible(false);
        l5.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l5MouseClicked

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
        // F clicked
        String op = "F";
        execute.playGame(op.charAt(0));
        l6.setVisible(false);
        l6.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l6MouseClicked

    private void l7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l7MouseClicked
        // G clicked
        String op = "G";
        execute.playGame(op.charAt(0));
        l7.setVisible(false);
        l7.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l7MouseClicked

    private void l8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l8MouseClicked
        // H clicked
        String op = "H";
        execute.playGame(op.charAt(0));
        l8.setVisible(false);
        l8.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l8MouseClicked

    private void l9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l9MouseClicked
        // I clicked
        String op = "I";
        execute.playGame(op.charAt(0));
        l9.setVisible(false);
        l9.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l9MouseClicked

    private void l10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l10MouseClicked
        // J clicked
        String op = "J";
        execute.playGame(op.charAt(0));
        l10.setVisible(false);
        l10.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l10MouseClicked

    private void l11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l11MouseClicked
        // K clicked
        String op = "K";
        execute.playGame(op.charAt(0));
        l11.setVisible(false);
        l11.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l11MouseClicked

    private void l12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l12MouseClicked
        // L clicked
        String op = "L";
        execute.playGame(op.charAt(0));
        l12.setVisible(false);
        l12.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l12MouseClicked

    private void l13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l13MouseClicked
        // M clicked
        String op = "M";
        execute.playGame(op.charAt(0));
        l13.setVisible(false);
        l13.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l13MouseClicked

    private void l14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l14MouseClicked
        // N clicked
        String op = "N";
        execute.playGame(op.charAt(0));
        l14.setVisible(false);
        l14.setEnabled(false);
        execute.print();
    }//GEN-LAST:event_l14MouseClicked
    
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
    public static javax.swing.JLabel head;
    public static javax.swing.JLabel imagenAhorcado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel l1;
    public static javax.swing.JLabel l10;
    public static javax.swing.JLabel l11;
    public static javax.swing.JLabel l12;
    public static javax.swing.JLabel l13;
    public static javax.swing.JLabel l14;
    public static javax.swing.JLabel l15;
    public static javax.swing.JLabel l16;
    public static javax.swing.JLabel l17;
    public static javax.swing.JLabel l18;
    public static javax.swing.JLabel l19;
    public static javax.swing.JLabel l2;
    public static javax.swing.JLabel l20;
    public static javax.swing.JLabel l21;
    public static javax.swing.JLabel l22;
    public static javax.swing.JLabel l23;
    public static javax.swing.JLabel l24;
    public static javax.swing.JLabel l25;
    public static javax.swing.JLabel l26;
    public static javax.swing.JLabel l27;
    public static javax.swing.JLabel l3;
    public static javax.swing.JLabel l4;
    public static javax.swing.JLabel l5;
    public static javax.swing.JLabel l6;
    public static javax.swing.JLabel l7;
    public static javax.swing.JLabel l8;
    public static javax.swing.JLabel l9;
    // End of variables declaration//GEN-END:variables
}
