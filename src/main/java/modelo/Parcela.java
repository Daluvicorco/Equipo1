/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import data.Detalles_Parcela;

/**
 *
 * @author luisc
 */
public class Parcela
{
    private int identificador;
    private float metros_cuadrados; 
    private boolean tiene_luz;
    private float precio_dia;
    static private float descuento_parcela;
    private Reserva reservada; //Transformar a ArrayList

    public Parcela(int identificador, float metros_cuadrados, boolean tiene_luz, float precio_dia, float descuento_parcela) {
        this.identificador = identificador;
        this.metros_cuadrados = metros_cuadrados;
        this.tiene_luz = tiene_luz;
        this.precio_dia = precio_dia;
        this.descuento_parcela = descuento_parcela;
        reservada = null;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public float getMetros_cuadrados() {
        return metros_cuadrados;
    }

    public void setMetros_cuadrados(float metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    public boolean isTiene_luz() {
        return tiene_luz;
    }

    public void setTiene_luz(boolean tiene_luz) {
        this.tiene_luz = tiene_luz;
    }

    public float getPrecio_dia() {
        return precio_dia;
    }

    public void setPrecio_dia(float precio_dia) {
        this.precio_dia = precio_dia;
    }

    public float getDescuento_parcela() {
        return descuento_parcela;
    }

    public static void setDescuento_parcela(float descuento_parcela) {
        Parcela.descuento_parcela = descuento_parcela;
    }

    public Reserva getReservada() {
        return reservada;
    }

    public void setReservada(Reserva reservada) {
        this.reservada = reservada;
    }
    
    
    @Override
    public String toString() {
        String s= "Parcela{" + "Metros cuadrados=" + metros_cuadrados + ", Luz= ";
        if(tiene_luz==true)
            s=s+"Si";
        else
            s=s+"No";
        s=s+", Precio Dia= " + precio_dia + "$ }";
        return s;
    }
    
    public Detalles_Parcela consultarParcela()
    {
        Detalles_Parcela detalles = new Detalles_Parcela(identificador,metros_cuadrados,tiene_luz,precio_dia,descuento_parcela);
        return detalles;
    }
    
    public boolean estaReservada()
    {
        boolean ok=true;
        if(reservada == null)
            ok=false;
        return ok;
    }
}
