/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author enriq
 */
public class ReservaTest {
    
    public ReservaTest() {
    }

    @Test
    public void testGetMetros() throws ParseException {
        
        Parcela p1 = new Parcela(1, 12, true, 20, 5);
        Parcela p2 = new Parcela(2, 24, true, 18, 5);
        Cliente c = new Cliente("Sandra", "34652398X",3);
        Date dataini = new SimpleDateFormat("yyyy-MM-dd").parse("2021-09-10");
        Date datafin = new SimpleDateFormat("yyyy-MM-dd").parse("2021-09-30");
        Reserva r = new Reserva(dataini, datafin, c);
        r.addParcela(p1);
        r.addParcela(p2);
        
        float x = r.getMetros();
        assertTrue(x == 36,"X no vale 36, vale: "+x);
    }

    @Test
    public void testGetFecha_inicio_reserva() {
    }

    @Test
    public void testSetFecha_inicio_reserva() {
    }

    @Test
    public void testGetFecha_fin_reserva() {
    }

    @Test
    public void testSetFecha_fin_reserva() {
    }

    @Test
    public void testGetFecha_real_entrada() {
    }

    @Test
    public void testSetFecha_real_entrada() {
    }

    @Test
    public void testGetFecha_real_salida() {
    }

    @Test
    public void testSetFecha_real_salida() {
    }

    @Test
    public void testGetParcelas_reservadas() {
    }

    @Test
    public void testSetParcelas_reservadas() {
    }

    @Test
    public void testGetCliente_reserva() {
    }

    @Test
    public void testSetCliente_reserva() {
    }

    @Test
    public void testAddParcela() {
    }

    @Test
    public void testGetPrecio() {
    }
    
}
