/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import modelo.Reserva;

/**
 *
 * @author luisc
 */
public class Detalles_Parcela
{
    public int identificador;
    public float metros_cuadrados;
    public boolean tiene_luz;
    public float precio_dia;
    public float descuento_parcela;

    public Detalles_Parcela(int identificador, float metros_cuadrados, boolean tiene_luz, float precio_dia, float descuento_parcela) {
        this.identificador = identificador;
        this.metros_cuadrados = metros_cuadrados;
        this.tiene_luz = tiene_luz;
        this.precio_dia = precio_dia;
        this.descuento_parcela = descuento_parcela;
    }
    
    
}
