
package com.mycompany.vistas;

import com.mycompany.proyectofinal.Usuario;
import javax.swing.table.DefaultTableModel;


public class registrarusuario extends javax.swing.JPanel {
    
    DefaultTableModel tab = new DefaultTableModel();

    public registrarusuario() {
        initComponents();
        Estilos();
        String ids [] = {"Nombre","Documento","Edad","Codigo"};
        
        tab.setColumnIdentifiers(ids);
        
        jTable1.setModel(tab);
    }
    private void Estilos() {
        //estilos
        jLabel1.putClientProperty( "FlatLaf.style", "font: bold $h1.regular.font" );
        jLabel2.putClientProperty( "FlatLaf.style", "font: 15 $light.font" );
        jLabel3.putClientProperty( "FlatLaf.style", "font: 15 $light.font" );
        jLabel4.putClientProperty( "FlatLaf.style", "font: 15 $light.font" );
        jLabel5.putClientProperty( "FlatLaf.style", "font: 15 $light.font" );
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nombretxt = new javax.swing.JTextField();
        documentotxt = new javax.swing.JTextField();
        codigotxt = new javax.swing.JTextField();
        edadtxt = new javax.swing.JTextField();
        btnanadir = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(45, 42, 46));

        jLabel1.setText("Registrar Usuario");

        jLabel2.setText("Nombre");

        jLabel3.setText("Documento");

        jLabel4.setText("Edad");

        jLabel5.setText("Codigo");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        documentotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentotxtActionPerformed(evt);
            }
        });

        btnanadir.setBackground(new java.awt.Color(102, 255, 51));
        btnanadir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnanadir.setText("Añadir");
        btnanadir.setBorderPainted(false);
        btnanadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanadirActionPerformed(evt);
            }
        });

        btnborrar.setBackground(new java.awt.Color(255, 51, 0));
        btnborrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnborrar.setText("Borrar");
        btnborrar.setBorderPainted(false);
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btnactualizar.setBackground(new java.awt.Color(0, 153, 255));
        btnactualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.setBorderPainted(false);
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(documentotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnanadir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnborrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnactualizar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombretxt, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(documentotxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnanadir)
                    .addComponent(btnborrar)
                    .addComponent(btnactualizar))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void documentotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentotxtActionPerformed

    private void btnanadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanadirActionPerformed
       
        int docu = Integer.parseInt(documentotxt.getText());
        int ageu = Integer.parseInt(edadtxt.getText());
        int cod = Integer.parseInt(codigotxt.getText());
        
        Usuario  nuevousuario= new Usuario(nombretxt.getText(),docu,ageu,cod);
        
        
        tab.addRow(new Object []{
            nuevousuario.getNombre(),
            nuevousuario.getDocumento(),
            nuevousuario.getEdad(),
            nuevousuario.getCodigo()
        });
            
        nombretxt.setText("");
        documentotxt.setText("");
        edadtxt.setText("");
        codigotxt.setText("");
    }//GEN-LAST:event_btnanadirActionPerformed
//boton de eliminar
    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        tab.removeRow(jTable1.getSelectedRow());   
    }//GEN-LAST:event_btnborrarActionPerformed
//boton de actualizar
    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        tab.setValueAt( nombretxt.getText(),jTable1.getSelectedRow(),0);
        tab.setValueAt( documentotxt.getText(),jTable1.getSelectedRow(),1);
        tab.setValueAt( edadtxt.getText(),jTable1.getSelectedRow(),2);
        tab.setValueAt( codigotxt.getText(),jTable1.getSelectedRow(),3);
        nombretxt.setText("");
        documentotxt.setText("");
        edadtxt.setText("");
        codigotxt.setText("");
    }//GEN-LAST:event_btnactualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnanadir;
    private javax.swing.JButton btnborrar;
    private javax.swing.JTextField codigotxt;
    private javax.swing.JTextField documentotxt;
    private javax.swing.JTextField edadtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables

    
}
