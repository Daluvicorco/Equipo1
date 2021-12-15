/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package modelo;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nengo
 */
public class CampingTest {
    
    public CampingTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of cargarDatos method, of class Camping.
     */
    @Test
    public void testCargarDatos() {
    }

    /**
     * Test of getParcelas method, of class Camping.
     */
    @Test
    public void testGetParcelas() {
    }

    /**
     * Test of reservarParcela method, of class Camping.
     */
    @Test
    public void testReservarParcela() {
    }

    /**
     * Test of setCliente method, of class Camping.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente c = new Cliente("Gonzalo Montes","12345678F");
        Camping instance = new Camping();
        instance.setCliente(c);
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance.getCliente());
        assertEquals(c, instance.getCliente());
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Camping.
     */
    @Test
    public void testGetCliente() {
    }

    /**
     * Test of addCarrito method, of class Camping.
     */
    @Test
    public void testAddCarrito() {
        System.out.println("addCarrito");
        Parcela parcela = new Parcela(1,250,true,8,7);
        Camping instance = new Camping();
        int oldsize = instance.getCarrito().size();
        instance.getCarrito().add(parcela);
        // TODO review the generated test code and remove the default call to fail.
        
        ArrayList<Parcela> oldcarrito = instance.getCarrito();
        assertTrue(oldsize==(instance.getCarrito().size()-1));
        assertTrue(instance.getCarrito().contains(parcela));
    }

    /**
     * Test of getReservas method, of class Camping.
     */
    @Test
    public void testGetReservas() {
    }

    /**
     * Test of getCarrito method, of class Camping.
     */
    @Test
    public void testGetCarrito() {
    }

    /**
     * Test of getActividades method, of class Camping.
     */
    @Test
    public void testGetActividades() {
    }

    /**
     * Test of eliminarParcelaCarrito method, of class Camping.
     */
    @Test
    public void testEliminarParcelaCarrito() {
        System.out.println("eliminarParcelaCarrito");
        Parcela parcela = new Parcela(1,250,true,8,7);
        Camping instance = new Camping();
        instance.addCarrito(parcela);
        int oldsize = instance.getCarrito().size();
        instance.eliminarParcelaCarrito(parcela);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(oldsize==(instance.getCarrito().size()+1));
        assertFalse(instance.getCarrito().contains(parcela));
    }

    /**
     * Test of getListaClientes method, of class Camping.
     */
    @Test
    public void testGetListaClientes() {
    }

    /**
     * Test of getMetrosCarrito method, of class Camping.
     */
    @Test
    public void testGetMetrosCarrito() {
        System.out.println("getMetrosCarrito");
        Parcela parcela = new Parcela(1,250,true,8,7);
        Parcela parcela2 = new Parcela(1,150,true,8,7);
        Camping instance = new Camping();
        instance.addCarrito(parcela);
        instance.addCarrito(parcela2);
        float expResult = 400;
        float result = instance.getMetrosCarrito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of addReserva method, of class Camping.
     */
    @Test
    public void testAddReserva() {
    }

    /**
     * Test of vaciarCarrito method, of class Camping.
     */
    @Test
    public void testVaciarCarrito() {
    }

    /**
     * Test of setDescuento_parcela method, of class Camping.
     */
    @Test
    public void testSetDescuento_parcela() {
    }

    /**
     * Test of añadirDatosReservaCliente method, of class Camping.
     */
    @Test
    public void testAñadirDatosReservaCliente() {
    }

    /**
     * Test of getMetrosCliente method, of class Camping.
     */
    @Test
    public void testGetMetrosCliente() {
    }

    /**
     * Test of getFechaInicio method, of class Camping.
     */
    @Test
    public void testGetFechaInicio() {
    }

    /**
     * Test of getFechaFin method, of class Camping.
     */
    @Test
    public void testGetFechaFin() {
    }

    /**
     * Test of setGanadorActividad method, of class Camping.
     */
    @Test
    public void testSetGanadorActividad() {
        System.out.println("setGanadorActividad");
        Camping instance = new Camping();
        Cliente cliente = new Cliente("Gonzalo Montes","12345678F");
        Actividad a1 = new Actividad("Piscina","competicion de natacion",new Time(12,0,0),new Time(13,30,0));
        instance.anyadeAct(a1);
        instance.setGanadorActividad(cliente, a1);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(a1.getGanador().equals(cliente));
    }

    /**
     * Test of anyadeAct method, of class Camping.
     */
    @Test
    public void testAnyadeAct() {
    }

    /**
     * Test of getHistoria method, of class Camping.
     */
    @Test
    public void testGetHistoria() {
    }

    /**
     * Test of setGestor method, of class Camping.
     */
    @Test
    public void testSetGestor() {
    }
    
}
