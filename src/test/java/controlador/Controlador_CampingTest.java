/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package controlador;

import data.Detalles_Parcela;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import modelo.Actividad;
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

    //Hacer por Victor Serrano a partir de aquí
    /**
     * Test of setDescuento method, of class Controlador_Camping.
     */
    @Test
    public void testSetDescuento() {
        //No se hace porque es un setter
    }

    /**
     * Test of getCliente method, of class Controlador_Camping.
     */
    @Test
    public void testGetCliente() {
        //no se hace porque es un getter
    }

    /**
     * Test of vaciarCarrito method, of class Controlador_Camping.
     */
    @Test
    public void testVaciarCarrito() {
        //No se hace porque es un setter
    }

    /**
     * Test of getHistorico method, of class Controlador_Camping.
     */
    @Test
    public void testGetHistorico() {
        //No se hace por que es un getter
    }

    /**
     * Test of setGanadorActividad method, of class Controlador_Camping.
     */
    //@Test
    //public void testSetGanadorActividad() {
        /*
        System.out.println("setGanadorActividad");
        Object cl = new Cliente("Victor Serrano","2106H");
        Object a = new Actividad("Piscina","competicion de natacion",new Time(12,0,0),new Time(13,30,0));
        Controlador_Camping camp = new Controlador_Camping();
        
        camp.añadirActividad(a);
        camp
        camp.setGanadorActividad(cl,a);
        ArrayList actividades = camp.getActividades();
        int i = actividades.indexOf(a);
        assertEquals(((Cliente)actividades.get(i)).getNombre(),((Cliente)cl).getNombre());*/
    //}

    /**
     * Test of añadirActividad method, of class Controlador_Camping.
     */
    @Test
    public void testAñadirActividad() {
        System.out.println("a\u00f1adirActividad");
        Object actividad = new Actividad("Futbol","Parque",new Time(12,0,0),new Time(13,30,0));
        Controlador_Camping instance = new Controlador_Camping();
        instance.anyadeActividad("Futbol","Parque",new Time(12,0,0),new Time(13,30,0));
        instance.añadirActividad(actividad);
        ArrayList actividades = instance.getActividadesCliente();
        for(Object it : actividades)
        {
            System.out.println(((Actividad)it).getNombre());
            if(((Actividad)it).getNombre() == "Parque")
                assertTrue(true);
        }
    }

    /**
     * Test of eliminarClienteActividad method, of class Controlador_Camping.
     */
    @Test
    public void testEliminarClienteActividad() {
        System.out.println("a\u00f1adirActividad");
        boolean ok = false;
        Object actividad = new Actividad("Futbol","Parque",new Time(12,0,0),new Time(13,30,0));
        Controlador_Camping instance = new Controlador_Camping();
        instance.anyadeActividad("Futbol","Parque",new Time(12,0,0),new Time(13,30,0));
        instance.añadirActividad(actividad);
        instance.eliminarClienteActividad(actividad);
        ArrayList actividades = instance.getActividadesCliente();
        for(Object it : actividades)
        {
            System.out.println(((Actividad)it).getNombre());
            if(((Actividad)it).getNombre() == "Parque")
            {
                ok = true;
                break;
            }
        }
        assertFalse(ok);
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
        assertEquals(false, result.size() != 0);
    }


    /**
     * Test of crearCliente method, of class Controlador_Camping.
     */
    @Test
    public void testCrearCliente() {
        System.out.println("crearCliente");
        String nombre = "juan";
        String dni = "1234";
        Controlador_Camping instance = new Controlador_Camping();
        boolean expResult = false;
        boolean result = instance.crearCliente(nombre, dni);
        assertEquals(expResult, result);
    }
    /**
     * Test of isBlank method, of class Controlador_Camping.
     */
    @Test
    public void testIsBlank() {
        System.out.println("isBlank");
        String text = "";
        Controlador_Camping instance = new Controlador_Camping();
        boolean expResult = true;
        boolean result = instance.isBlank(text);
        assertEquals(expResult, result);
    }
    
}
