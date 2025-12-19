
package com.mycompany.proyectofinal;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMTMonokaiProIJTheme;
import com.mycompany.vistas.principal;
import com.mycompany.vistas.registrarentrenador;
import com.mycompany.vistas.registrarusuario;
import com.mycompany.vistas.rutina1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.UIManager;


public class Proyectofinal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Proyectofinal.class.getName());

    
    public Proyectofinal() {
        initComponents();
        Estilos();
        MostrarPanel();
    }
    public void MostrarPanel(){
        CambioPanel(new principal());
    }
    public static void CambioPanel(JPanel p){
        p.setSize(600,600);
        p.setLocation(0,0);
        baseinformacion.removeAll();
        baseinformacion.add(p, BorderLayout.CENTER);
        baseinformacion.revalidate();
        baseinformacion.repaint();
    }
    private void Estilos() {
        //estilos
        //nombregym.putClientProperty( "FlatLaf.style", "font: 14 $light.font" );
        //nombregym.setForeground(Color.black);  
          nombregym.putClientProperty( "FlatLaf.style", "font: bold $h1.regular.font" );
          nombregym.setForeground(Color.black);
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        base2 = new javax.swing.JPanel();
        nombregym = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        bregistrarusuario = new javax.swing.JButton();
        bregistrarentrenador = new javax.swing.JButton();
        brutinas = new javax.swing.JButton();
        bprincipal = new javax.swing.JButton();
        baseinformacion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        base.setBackground(new java.awt.Color(45, 42, 46));

        base2.setBackground(new java.awt.Color(255, 255, 153));

        nombregym.setText("GIMNASIO HANAYAMA");

        separador.setForeground(new java.awt.Color(0, 0, 0));

        bregistrarusuario.setBackground(new java.awt.Color(45, 42, 46));
        bregistrarusuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bregistrarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account-multiple.png"))); // NOI18N
        bregistrarusuario.setText("Registrar Usuario");
        bregistrarusuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        bregistrarusuario.setBorderPainted(false);
        bregistrarusuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bregistrarusuario.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bregistrarusuario.setIconTextGap(15);
        bregistrarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bregistrarusuarioActionPerformed(evt);
            }
        });

        bregistrarentrenador.setBackground(new java.awt.Color(45, 42, 46));
        bregistrarentrenador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bregistrarentrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account-multiple.png"))); // NOI18N
        bregistrarentrenador.setText("Registrar Entrenador");
        bregistrarentrenador.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        bregistrarentrenador.setBorderPainted(false);
        bregistrarentrenador.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bregistrarentrenador.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bregistrarentrenador.setIconTextGap(15);
        bregistrarentrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bregistrarentrenadorActionPerformed(evt);
            }
        });

        brutinas.setBackground(new java.awt.Color(45, 42, 46));
        brutinas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        brutinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesa.png"))); // NOI18N
        brutinas.setText("Rutinas");
        brutinas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        brutinas.setBorderPainted(false);
        brutinas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        brutinas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        brutinas.setIconTextGap(15);
        brutinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brutinasActionPerformed(evt);
            }
        });

        bprincipal.setBackground(new java.awt.Color(45, 42, 46));
        bprincipal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home-outline.png"))); // NOI18N
        bprincipal.setText("Principal");
        bprincipal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        bprincipal.setBorderPainted(false);
        bprincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bprincipal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        bprincipal.setIconTextGap(15);
        bprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout base2Layout = new javax.swing.GroupLayout(base2);
        base2.setLayout(base2Layout);
        base2Layout.setHorizontalGroup(
            base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(nombregym, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
            .addGroup(base2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(separador)
                .addGap(55, 55, 55))
            .addComponent(bprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bregistrarusuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bregistrarentrenador, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
            .addComponent(brutinas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        base2Layout.setVerticalGroup(
            base2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(nombregym, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(bprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bregistrarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bregistrarentrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(brutinas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );

        baseinformacion.setBackground(new java.awt.Color(45, 42, 46));

        javax.swing.GroupLayout baseinformacionLayout = new javax.swing.GroupLayout(baseinformacion);
        baseinformacion.setLayout(baseinformacionLayout);
        baseinformacionLayout.setHorizontalGroup(
            baseinformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        baseinformacionLayout.setVerticalGroup(
            baseinformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addComponent(base2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(baseinformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(baseinformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bregistrarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bregistrarusuarioActionPerformed
        CambioPanel(new registrarusuario());
    }//GEN-LAST:event_bregistrarusuarioActionPerformed

    private void bregistrarentrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bregistrarentrenadorActionPerformed
        CambioPanel(new registrarentrenador());
    }//GEN-LAST:event_bregistrarentrenadorActionPerformed

    private void brutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brutinasActionPerformed
        CambioPanel(new rutina1());
    }//GEN-LAST:event_brutinasActionPerformed

    private void bprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprincipalActionPerformed
            CambioPanel(new principal());
    }//GEN-LAST:event_bprincipalActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new Proyectofinal().setVisible(true));
        FlatMTMonokaiProIJTheme.setup();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JPanel base2;
    private static javax.swing.JPanel baseinformacion;
    private javax.swing.JButton bprincipal;
    private javax.swing.JButton bregistrarentrenador;
    private javax.swing.JButton bregistrarusuario;
    private javax.swing.JButton brutinas;
    private javax.swing.JLabel nombregym;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables

    
}
