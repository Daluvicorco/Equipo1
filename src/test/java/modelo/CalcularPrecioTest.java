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
public class CalcularPrecioTest {
    
    public CalcularPrecioTest() {
    }

    @org.junit.jupiter.api.Test
    public void testGetPrecio() throws ParseException {
        Parcela p = new Parcela(1,6,true,10,5);
        Cliente c = new Cliente("Sandra", "34652398X",3);
        Date dataini = new SimpleDateFormat("yyyy-MM-dd").parse("2021-09-10");
        Date datafin = new SimpleDateFormat("yyyy-MM-dd").parse("2021-09-30");
        Reserva r = new Reserva(dataini,datafin,c);
        CalcularPrecio cp = new CalcularPrecio(p,r);
        
        float x = cp.getPrecio();
        assertTrue(x == 190,"X no vale 190, vale: "+x);
        
    }
    
}
