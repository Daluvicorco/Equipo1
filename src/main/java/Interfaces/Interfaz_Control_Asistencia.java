/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import controlador.Controlador_Camping;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Usuario
 */
public class Interfaz_Control_Asistencia extends javax.swing.JFrame {
    
    private Controlador_Camping cc;
    private DefaultListModel modeloClientes;
    public static String mensajeSancion;
    /**
     * Creates new form Interfaz_Control_Asistencia
     */
    public Interfaz_Control_Asistencia(Controlador_Camping camp) {
        initComponents();
        cc = camp;
        ListaClientes.removeAll();
        ArrayList participantes = cc.getParticipantes(Interfaz_Gestor_Actividades.actividad);
        modeloClientes = new DefaultListModel();
        for(Object c : participantes) {
            modeloClientes.addElement(c);
        }
        ListaClientes.setModel(modeloClientes);
        bSancionar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaClientes = new javax.swing.JList<>();
        bSancionar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListaClientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        ListaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListaClientes);

        bSancionar.setText("Sancionar");
        bSancionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSancionarActionPerformed(evt);
            }
        });

        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bSancionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(bSancionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSancionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSancionarActionPerformed
        // TODO add your handling code here:
        Object clienteASancionar = ListaClientes.getSelectedValue();
        mensajeSancion = cc.sancionarCliente(clienteASancionar);
    }//GEN-LAST:event_bSancionarActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        // TODO add your handling code here:
        Interfaz_Gestor_Actividades ga = new Interfaz_Gestor_Actividades(cc);
        ga.setVisible(true);

    }//GEN-LAST:event_bVolverActionPerformed

    private void ListaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaClientesMouseClicked
        // TODO add your handling code here:
        if (!ListaClientes.isSelectionEmpty()){
            bSancionar.setEnabled(true);
        }
    }//GEN-LAST:event_ListaClientesMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListaClientes;
    private javax.swing.JButton bSancionar;
    private javax.swing.JButton bVolver;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
