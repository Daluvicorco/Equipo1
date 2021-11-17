/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import controlador.Controlador_Camping;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author enriq
 */
public class Interfaz_Carrito_Sin_Reserva extends javax.swing.JFrame {

    private Interfaz_Gestor ini;
    private Controlador_Camping c;
    private DefaultListModel listaCarrito;
    /**
     * Creates new form Interfaz_Carrito_Sin_Reserva
     */
    public Interfaz_Carrito_Sin_Reserva(Controlador_Camping camp) {
        initComponents();
        c = camp;
        listaCarrito = new DefaultListModel();
        ArrayList carrito = c.getCarrito();
        
        for(Object it : carrito)
        {
            listaCarrito.addElement(it);
        }
        listaParcelasElegidas.setModel(listaCarrito);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloVentana = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaParcelasElegidas = new javax.swing.JList<>();
        botonReservar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloVentana.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tituloVentana.setText("Parcelas seleccionadas");

        listaParcelasElegidas.setMaximumSize(new java.awt.Dimension(33, 80));
        listaParcelasElegidas.setMinimumSize(new java.awt.Dimension(33, 80));
        listaParcelasElegidas.setPreferredSize(new java.awt.Dimension(33, 80));
        listaParcelasElegidas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaParcelasElegidasvalueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaParcelasElegidas);

        botonReservar.setText("Reservar");
        botonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(tituloVentana)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonReservar)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(botonReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminar)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaParcelasElegidasvalueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaParcelasElegidasvalueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_listaParcelasElegidasvalueChanged

    private void botonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservarActionPerformed
        // Comprobar tamaño de la tienda
        if(c.comprobarMetros()){
            c.reservarParcelas();
            ini = new Interfaz_Gestor(c);
            ini.setLocationRelativeTo(this);
            ini.setVisible(true);
            this.setVisible(false);
        } else {
            // Lanzar interfaz de error
            //InfoLabel.setText("El tamaño de las tiendas es mayor que las parcelas seleccionadas");
        }
    }//GEN-LAST:event_botonReservarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        Interfaz_Reserva res = new Interfaz_Reserva(c);
        res.setLocationRelativeTo(this);
        res.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if(listaParcelasElegidas.getSelectedIndex()!=-1)
        c.quitarParcelaCarrito(listaParcelasElegidas.getSelectedValue());
        listaCarrito.removeElement(listaParcelasElegidas.getSelectedValue());
    }//GEN-LAST:event_botonEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonReservar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaParcelasElegidas;
    private javax.swing.JLabel tituloVentana;
    // End of variables declaration//GEN-END:variables
}