/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author luisc
 */
public class Reserva{
    private Date fecha_inicio_reserva;
    private Date fecha_fin_reserva;
    private Date fecha_real_entrada;
    private Date fecha_real_salida;
    private ArrayList<Parcela> parcelas_reservadas;
    private Cliente cliente_reserva;

    public Reserva(Date fecha_inicio_reserva, Date fecha_fin_reserva, ArrayList<Parcela> parcelas_reservadas, Cliente cliente_reserva) {
        this.fecha_inicio_reserva = fecha_inicio_reserva;
        this.fecha_fin_reserva = fecha_fin_reserva;
        this.parcelas_reservadas = parcelas_reservadas;
        this.cliente_reserva = cliente_reserva;
    }

    public Reserva() {
        
    }
    
    public float getMetros(){
        float count =0;
        for (int i=0;i<parcelas_reservadas.size();i++){
            count = count+parcelas_reservadas.get(i).getMetros_cuadrados();
        }
        return count;
    }
    
}
