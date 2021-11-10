/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Actividad {
    private String tipo;
    private String nombre;
    private Time horaInicio;
    private Time horaFin;
    private ArrayList<Cliente> participantes;
    
    public Actividad(String n, Time hI, Time hF) {
        nombre = n;
        horaInicio = hI;
        horaFin = hF;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Time getHoraInicio() {
        return horaInicio;
    }

    public Time getHoraFin() {
        return horaFin;
    }

    public ArrayList<Cliente> getParticipantes() {
        return participantes;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoraInicio(Time horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(Time horaFin) {
        this.horaFin = horaFin;
    }
}
