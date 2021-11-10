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
        long diaEnt = reserva.getFecha_real_entrada().getTime() / 86400000;
        long diaSal = reserva.getFecha_real_salida().getTime() / 86400000;
        long diasEstancia = diaSal - diaEnt;
        
        if(diasEstancia >= 15) {
          return diasEstancia * parcela.getPrecio_dia() * parcela.getDescuento_parcela();
        }
        return diasEstancia * parcela.getPrecio_dia();
    }
}
