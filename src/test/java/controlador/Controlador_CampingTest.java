/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controlador;

import data.Detalles_Parcela;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import modelo.Cliente;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class Controlador_CampingTest {
    
    public Controlador_CampingTest() {
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
     * Test of consultarParcela method, of class Controlador_Camping.
     */
    @Test
    public void testConsultarParcela() {
        System.out.println("consultarParcela");
        Object p = null;
        Controlador_Camping instance = new Controlador_Camping();
        Detalles_Parcela expResult = null;
        Detalles_Parcela result = instance.consultarParcela(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of añadirCarrito method, of class Controlador_Camping.
     */
    @Test
    public void testAñadirCarrito() {
        System.out.println("a\u00f1adirCarrito");
        Object parcela = null;
        Controlador_Camping instance = new Controlador_Camping();
        instance.añadirCarrito(parcela);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprobarMetros method, of class Controlador_Camping.
     */
    @Test
    public void testComprobarMetros() {
        System.out.println("comprobarMetros");
        Controlador_Camping instance = new Controlador_Camping();
        boolean expResult = false;
        boolean result = instance.comprobarMetros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parcelasDisponibles method, of class Controlador_Camping.
     */
    @Test
    public void testParcelasDisponibles() {
        System.out.println("parcelasDisponibles");
        Controlador_Camping instance = new Controlador_Camping();
        ArrayList expResult = null;
        ArrayList result = instance.parcelasDisponibles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParcelasNoReservadas method, of class Controlador_Camping.
     */
    @Test
    public void testGetParcelasNoReservadas() {
        System.out.println("getParcelasNoReservadas");
        Controlador_Camping instance = new Controlador_Camping();
        ArrayList expResult = null;
        ArrayList result = instance.getParcelasNoReservadas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarrito method, of class Controlador_Camping.
     */
    @Test
    public void testGetCarrito() {
        System.out.println("getCarrito");
        Controlador_Camping instance = new Controlador_Camping();
        ArrayList expResult = null;
        ArrayList result = instance.getCarrito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitarParcelaCarrito method, of class Controlador_Camping.
     */
    @Test
    public void testQuitarParcelaCarrito() {
        System.out.println("quitarParcelaCarrito");
        Object parcela = null;
        Controlador_Camping instance = new Controlador_Camping();
        instance.quitarParcelaCarrito(parcela);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sancionarCliente method, of class Controlador_Camping.
     */
    @Test
    public void testSancionarCliente() {
        System.out.println("sancionarCliente");
        Object c = null;
        Controlador_Camping instance = new Controlador_Camping();
        String expResult = "";
        String result = instance.sancionarCliente(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarEntrada method, of class Controlador_Camping.
     */
    @Test
    public void testConfirmarEntrada() {
        System.out.println("confirmarEntrada");
        Date llegada = null;
        Date salida = null;
        String smetros = "";
        Controlador_Camping instance = new Controlador_Camping();
        boolean expResult = false;
        boolean result = instance.confirmarEntrada(llegada, salida, smetros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reservarParcelas method, of class Controlador_Camping.
     */
    @Test
    public void testReservarParcelas() {
        System.out.println("reservarParcelas");
        Controlador_Camping instance = new Controlador_Camping();
        instance.reservarParcelas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActividades method, of class Controlador_Camping.
     */
    @Test
    public void testGetActividades() {
        System.out.println("getActividades");
        Controlador_Camping instance = new Controlador_Camping();
        ArrayList expResult = null;
        ArrayList result = instance.getActividades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParticipantes method, of class Controlador_Camping.
     */
    @Test
    public void testGetParticipantes() {
        System.out.println("getParticipantes");
        Object o = null;
        Controlador_Camping instance = new Controlador_Camping();
        ArrayList expResult = null;
        ArrayList result = instance.getParticipantes(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescuento method, of class Controlador_Camping.
     */
    @Test
    public void testSetDescuento() {
        System.out.println("setDescuento");
        float x = 0.0F;
        Controlador_Camping instance = new Controlador_Camping();
        instance.setDescuento(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Controlador_Camping.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Controlador_Camping instance = new Controlador_Camping();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaciarCarrito method, of class Controlador_Camping.
     */
    @Test
    public void testVaciarCarrito() {
        System.out.println("vaciarCarrito");
        Controlador_Camping instance = new Controlador_Camping();
        instance.vaciarCarrito();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistorico method, of class Controlador_Camping.
     */
    @Test
    public void testGetHistorico() {
        System.out.println("getHistorico");
        Controlador_Camping instance = new Controlador_Camping();
        ArrayList expResult = null;
        ArrayList result = instance.getHistorico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGanadorActividad method, of class Controlador_Camping.
     */
    @Test
    public void testSetGanadorActividad() {
        System.out.println("setGanadorActividad");
        Object cl = null;
        Object actividad = null;
        Controlador_Camping instance = new Controlador_Camping();
        instance.setGanadorActividad(cl, actividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of añadirActividad method, of class Controlador_Camping.
     */
    @Test
    public void testAñadirActividad() {
        System.out.println("a\u00f1adirActividad");
        Object actividad = null;
        Controlador_Camping instance = new Controlador_Camping();
        instance.añadirActividad(actividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarClienteActividad method, of class Controlador_Camping.
     */
    @Test
    public void testEliminarClienteActividad() {
        System.out.println("eliminarClienteActividad");
        Object actividad = null;
        Controlador_Camping instance = new Controlador_Camping();
        instance.eliminarClienteActividad(actividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActividadesCliente method, of class Controlador_Camping.
     */
    @Test
    public void testGetActividadesCliente() {
        System.out.println("getActividadesCliente");
        Controlador_Camping instance = new Controlador_Camping();
        ArrayList expResult = null;
        ArrayList result = instance.getActividadesCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anyadeActividad method, of class Controlador_Camping.
     */
    @Test
    public void testAnyadeActividad() {
        System.out.println("anyadeActividad");
        String tipo = "";
        String tit = "";
        Time horaini = null;
        Time horafin = null;
        Controlador_Camping instance = new Controlador_Camping();
        instance.anyadeActividad(tipo, tit, horaini, horafin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearCliente method, of class Controlador_Camping.
     */
    @Test
    public void testCrearCliente() {
        System.out.println("crearCliente");
        String nombre = "";
        String dni = "";
        Controlador_Camping instance = new Controlador_Camping();
        boolean expResult = false;
        boolean result = instance.crearCliente(nombre, dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iniciarLog method, of class Controlador_Camping.
     */
    @Test
    public void testIniciarLog() {
        System.out.println("iniciarLog");
        String nombre = "";
        String dni = "";
        Controlador_Camping instance = new Controlador_Camping();
        boolean expResult = false;
        boolean result = instance.iniciarLog(nombre, dni);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBlank method, of class Controlador_Camping.
     */
    @Test
    public void testIsBlank() {
        System.out.println("isBlank");
        String text = "";
        Controlador_Camping instance = new Controlador_Camping();
        boolean expResult = false;
        boolean result = instance.isBlank(text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}