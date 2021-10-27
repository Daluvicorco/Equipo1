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
    private float precioXDia;
    
    public CalcularPrecio(Parcela p, Reserva r) {
        parcela = p;
        reserva = r;
        //precioXDia = (reserva.getFechaRealEnt() - reserva.getFechaRealSalida()) / 100;
    }
    
    public float getPrecio() {
        int diaEnt = 0; //reserva.getFechaRealEnt().getTime() / 86400000;
        int diaSal = 0; //reserva.getFechaRealSalida().getTime() / 86400000;
        int diasEstancia = diaSal - diaEnt;
        
        if(diasEstancia >= 15) {
          return parcela.getPrecio_dia() * parcela.getDescuento_parcela();
        }
        return parcela.getPrecio_dia();
    }
}
