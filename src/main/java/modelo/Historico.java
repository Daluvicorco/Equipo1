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
}
