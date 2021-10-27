/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
    private Parcela parcela_reservada;
    private Cliente cliente_reserva;
}
