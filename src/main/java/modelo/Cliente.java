
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
    private boolean sancion = false;
    private String mensajeSancion;
    
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

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    public boolean getSancion(){
        return sancion;
    }
    
    public void setSancion(boolean s){
        this.sancion= s;
    }
    
    public void setMensajeSancion(String s){
        this.mensajeSancion =  s;
    }
    
    public String getMensajeSancion(){
        return this.mensajeSancion;
    }
}
