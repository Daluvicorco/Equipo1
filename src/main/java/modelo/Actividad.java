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
    private Cliente ganador;
    
    public Actividad(String tipo, String n, Time hI, Time hF) {
        participantes = new ArrayList();
        this.tipo=tipo;
        nombre = n;
        horaInicio = hI;
        horaFin = hF;
    }

    public Cliente getGanador() {
        return ganador;
    }

    public void setGanador(Cliente ganador) {
        this.ganador = ganador;
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
    
    @Override
    public String toString(){
       return this.tipo+": "+this.nombre; 
    }

    public void addParticipante(Cliente cli) {
        if(!participantes.contains(cli))
            participantes.add(cli);
    }

    public void removeParticipante(Cliente cli) {
        participantes.remove(cli);
    }
}
