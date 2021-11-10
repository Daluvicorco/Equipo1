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
        parcelas_reservadas = new ArrayList<Parcela>();
    }

    public Reserva() {
        parcelas_reservadas = new ArrayList<Parcela>();
    }
    
    public float getMetros(){
        float count =0;
        for (int i=0;i<parcelas_reservadas.size();i++){
            count = count+parcelas_reservadas.get(i).getMetros_cuadrados();
        }
        return count;
    }

    public Date getFecha_inicio_reserva() {
        return fecha_inicio_reserva;
    }

    public void setFecha_inicio_reserva(Date fecha_inicio_reserva) {
        this.fecha_inicio_reserva = fecha_inicio_reserva;
    }

    public Date getFecha_fin_reserva() {
        return fecha_fin_reserva;
    }

    public void setFecha_fin_reserva(Date fecha_fin_reserva) {
        this.fecha_fin_reserva = fecha_fin_reserva;
    }

    public Date getFecha_real_entrada() {
        return fecha_real_entrada;
    }

    public void setFecha_real_entrada(Date fecha_real_entrada) {
        this.fecha_real_entrada = fecha_real_entrada;
    }

    public Date getFecha_real_salida() {
        return fecha_real_salida;
    }

    public void setFecha_real_salida(Date fecha_real_salida) {
        this.fecha_real_salida = fecha_real_salida;
    }

    public ArrayList<Parcela> getParcelas_reservadas() {
        return parcelas_reservadas;
    }

    public void setParcelas_reservadas(ArrayList<Parcela> parcelas_reservadas) {
        this.parcelas_reservadas = parcelas_reservadas;
    }

    public Cliente getCliente_reserva() {
        return cliente_reserva;
    }

    public void setCliente_reserva(Cliente cliente_reserva) {
        this.cliente_reserva = cliente_reserva;
    }

    public void addParcela(Parcela p) {
        parcelas_reservadas.add(p);
    }
    
}
