/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class CalcularPrecio {
    private Parcela parcela;
    private Reserva reserva;
    
    public CalcularPrecio(Parcela p, Reserva r) {
        parcela = p;
        reserva = r;
        //precioXDia = (reserva.getFechaRealEnt() - reserva.getFechaRealSalida()) / 100;
    }
    
    public float getPrecio() {
        long diff = (reserva.getFecha_fin_reserva().getTime() - reserva.getFecha_inicio_reserva().getTime())/86400000;


        
        if(diff >= 15) {
          return diff * parcela.getPrecio_dia() * (100-parcela.getDescuento_parcela())/100;
        }
        return diff * parcela.getPrecio_dia();
    }
}
