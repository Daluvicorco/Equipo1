
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cliente {
    private String nombre;
    private String dni;
    private float metrosTienda;
    private Reserva reserva;
    
    public Cliente(String n, String d, float mT) {
        nombre = n;
        dni = d;
        metrosTienda = mT;
        reserva = new Reserva();
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public float getMetros() {
        return metrosTienda;
    }
    public void setMetros(float nuevosMetros) {
        metrosTienda = nuevosMetros;
    }
    
    public Reserva getReserva() {
        return reserva;
    }
}
