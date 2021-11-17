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
import modelo.Camping;

/**
 *
 * @author luisc
 */
public class Interfaz_Carrito extends javax.swing.JFrame {
    private Interfaz_Cliente ini;
    private Controlador_Camping c;
    private DefaultListModel listaCarrito;
    /**
     * Creates new form Interfaz_Carrito
     */
    public Interfaz_Carrito(Controlador_Camping camp) {
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

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaParcelasElegidas = new javax.swing.JList<>();
        tituloVentana = new javax.swing.JLabel();
        textoPrecio = new javax.swing.JLabel();
        precioReserva = new javax.swing.JLabel();
        botonReservar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaParcelasElegidas.setMaximumSize(new java.awt.Dimension(33, 80));
        listaParcelasElegidas.setMinimumSize(new java.awt.Dimension(33, 80));
        listaParcelasElegidas.setPreferredSize(new java.awt.Dimension(33, 80));
        listaParcelasElegidas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                Interfaz_Carrito.this.valueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listaParcelasElegidas);

        tituloVentana.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tituloVentana.setText("Parcelas seleccionadas");

        textoPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoPrecio.setText("Precio");

        precioReserva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        precioReserva.setText("148$");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonReservar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(precioReserva))
                                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonEliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(tituloVentana)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(tituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioReserva))
                        .addGap(18, 18, 18)
                        .addComponent(botonReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(botonEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        Interfaz_Reserva res = new Interfaz_Reserva(c);
        res.setLocationRelativeTo(this);
        res.setVisible(true);
        this.setVisible(false);
                
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservarActionPerformed
        // Comprobar tamaño de la tienda
        if(c.comprobarMetros()){
            c.reservarParcelas();
                ini = new Interfaz_Cliente(c);
            ini.setLocationRelativeTo(this);
            ini.setVisible(true);
            this.setVisible(false);
        } else {
            // Lanzar interfaz de error
            //InfoLabel.setText("El tamaño de las tiendas es mayor que las parcelas seleccionadas");
        }
    }//GEN-LAST:event_botonReservarActionPerformed

    private void valueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_valueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_valueChanged

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if(listaParcelasElegidas.getSelectedIndex()!=-1)
            c.quitarParcelaCarrito(listaParcelasElegidas.getSelectedValue());
        listaCarrito.removeElement(listaParcelasElegidas.getSelectedValue());
    }//GEN-LAST:event_botonEliminarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonReservar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaParcelasElegidas;
    private javax.swing.JLabel precioReserva;
    private javax.swing.JLabel textoPrecio;
    private javax.swing.JLabel tituloVentana;
    // End of variables declaration//GEN-END:variables
}
