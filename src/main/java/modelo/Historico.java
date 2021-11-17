/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Historico {
    private Cliente c;
    private ArrayList<Reserva> r;
    
    public Historico(Cliente cli, ArrayList<Reserva> res) {
        c = cli;
        r = new ArrayList();
        r = res;
    }
    
    public String getCliente() {
        return c.getDni() + c.getNombre();
    }
    
    public String getReservas() {
        String aux = "";
        for(Reserva res : r) {
            if(res.getCliente_reserva().getDni().equals(c.getDni())) {
                aux += res.getFecha_inicio_reserva() + " " + res.getFecha_fin_reserva();
            }
        }
        return aux;
    }
}
