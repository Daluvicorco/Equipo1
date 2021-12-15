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
    ArrayList<Parcela> parcelas = new ArrayList<>(); //Cliente con todas las parcelas existentes
    Cliente cliente; //Cliente actual
    Gestor gestor;
    ArrayList<Reserva> reservas = new ArrayList<Reserva>(); //ArrayList con todas las reservas
    ArrayList<Parcela> carrito = new ArrayList<Parcela>(); //ArrayList con todas las parcelas dentro del carrito
    ArrayList<Actividad> actividades = new ArrayList(); //ArrayList con todas las actividades existentes
    ArrayList<Cliente> clientes = new ArrayList<Cliente>(); //ArrayList con todos los clientes existentes del programa
    Date fechainicio; //Atributo temporal sobre fecha inicial reserva
    Date fechafin; //Atributo temporal sobre fecha fin reserva
    float metros; //Atributo temporal sobre metros tienda campaña
    Historico h; //Atributo para el historico
    
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
//        Parcela p = new Parcela(0,300,true,12,10);
//        Parcela p2 = new Parcela(1,250,true,8,7);
//        Parcela p3 = new Parcela(2,150,false,5,4);
//        cliente = new Cliente("Victor Serrano","2106H");
//        parcelas.add(p2);
//        parcelas.add(p3);
//        Actividad a1 = new Actividad("Piscina","competicion de natacion",new Time(12,0,0),new Time(13,30,0));
//        Actividad a2 = new Actividad("Fronton","competicion de fronton",new Time(14,0,0),new Time(15,30,0));
//        Actividad a3 = new Actividad("Juegos de mesa","competicion de parchis",new Time(16,30,0),new Time(18,0,0));
//        actividades.add(a1);
//        actividades.add(a2);
//        actividades.add(a3);
//        Cliente cliente = new Cliente("Gonzalo Montes","12345678F");
//        Reserva reserva = new Reserva(new Date(2021, 11, 18), new Date(2021, 12, 10), cliente);
//        reserva.setParcelas_reservadas(parcelas);
//        reservas.add(reserva);
//        h = new Historico(cliente, reservas);
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of cargarDatos method, of class Camping.
     */
    @Test
    public void testCargarDatos() {
        System.out.println("cargarDatos");
        Camping instance = new Camping();
        instance.cargarDatos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getParcelas method, of class Camping.
     */
    @Test
    public void testGetParcelas() {
        System.out.println("getParcelas");
        Camping instance = new Camping();
        ArrayList<Parcela> expResult = null;
        ArrayList<Parcela> result = instance.getParcelas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reservarParcela method, of class Camping.
     */
    @Test
    public void testReservarParcela() {
        System.out.println("reservarParcela");
        Object p = null;
        Camping instance = new Camping();
        instance.reservarParcela(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("getCliente");
        Camping instance = new Camping();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("getReservas");
        Camping instance = new Camping();
        ArrayList<Reserva> expResult = null;
        ArrayList<Reserva> result = instance.getReservas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarrito method, of class Camping.
     */
    @Test
    public void testGetCarrito() {
        System.out.println("getCarrito");
        Camping instance = new Camping();
        ArrayList<Parcela> expResult = null;
        ArrayList<Parcela> result = instance.getCarrito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActividades method, of class Camping.
     */
    @Test
    public void testGetActividades() {
        System.out.println("getActividades");
        Camping instance = new Camping();
        ArrayList<Actividad> expResult = null;
        ArrayList<Actividad> result = instance.getActividades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("getListaClientes");
        Object o = null;
        Camping instance = new Camping();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.getListaClientes(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("addReserva");
        Reserva r = null;
        Camping instance = new Camping();
        instance.addReserva(r);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vaciarCarrito method, of class Camping.
     */
    @Test
    public void testVaciarCarrito() {
        System.out.println("vaciarCarrito");
        Camping instance = new Camping();
        instance.vaciarCarrito();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescuento_parcela method, of class Camping.
     */
    @Test
    public void testSetDescuento_parcela() {
        System.out.println("setDescuento_parcela");
        float x = 0.0F;
        Camping instance = new Camping();
        instance.setDescuento_parcela(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of añadirDatosReservaCliente method, of class Camping.
     */
    @Test
    public void testAñadirDatosReservaCliente() {
        System.out.println("a\u00f1adirDatosReservaCliente");
        Date fechaini = null;
        Date fechaf = null;
        float mtr = 0.0F;
        Camping instance = new Camping();
        instance.añadirDatosReservaCliente(fechaini, fechaf, mtr);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMetrosCliente method, of class Camping.
     */
    @Test
    public void testGetMetrosCliente() {
        System.out.println("getMetrosCliente");
        Camping instance = new Camping();
        float expResult = 0.0F;
        float result = instance.getMetrosCliente();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaInicio method, of class Camping.
     */
    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        Camping instance = new Camping();
        Date expResult = null;
        Date result = instance.getFechaInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFin method, of class Camping.
     */
    @Test
    public void testGetFechaFin() {
        System.out.println("getFechaFin");
        Camping instance = new Camping();
        Date expResult = null;
        Date result = instance.getFechaFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("anyadeAct");
        Actividad a = null;
        Camping instance = new Camping();
        instance.anyadeAct(a);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHistoria method, of class Camping.
     */
    @Test
    public void testGetHistoria() {
        System.out.println("getHistoria");
        Camping instance = new Camping();
        ArrayList expResult = null;
        ArrayList result = instance.getHistoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGestor method, of class Camping.
     */
    @Test
    public void testSetGestor() {
        System.out.println("setGestor");
        Gestor gestor = null;
        Camping instance = new Camping();
        instance.setGestor(gestor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
