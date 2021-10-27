/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Camping;
import modelo.Reserva;

/**
 *
 * @author luisc
 */
public class Controlador_Camping{
    Camping c;
    
    public Controlador_Camping() {
        c = new Camping();
    }
    
    public boolean comprobarMetros() {
       if ( c.getCliente().getMetros() <= c.getCliente().getReserva().getMetros()){
           return true;
       }
       return false;
    }
    
}
