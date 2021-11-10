/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import data.Detalles_Parcela;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author luisc
 */
public class Camping {
    private ArrayList<Parcela> parcelas = new ArrayList<Parcela>(); //Cliente con todas las parcelas existentes
    private Cliente cliente; //Cliente actual
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>(); //ArrayList con todas las reservas
    private ArrayList<Parcela> carrito = new ArrayList<Parcela>(); //ArrayList con todas las parcelas dentro del carrito
    private ArrayList<Actividad> actividades = new ArrayList(); //ArrayList con todas las actividades existentes
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>(); //ArrayList con todos los clientes existentes del programa
    private Date fechainicio; //Atributo temporal sobre fecha inicial reserva
    private Date fechafin; //Atributo temporal sobre fecha fin reserva
    private float metros; //Atributo temporal sobre metros tienda campaña
    
    public Camping(){
        this.cargarDatos();
    }
    
    public void cargarDatos(){ //Funcion que carga unos datos iniciales al proyecto
        Parcela p = new Parcela(0,300,true,12,10);
        Parcela p2 = new Parcela(1,250,true,8,7);
        Parcela p3 = new Parcela(2,150,false,5,4);
        cliente = new Cliente("Victor Serrano","2106H",105);
        parcelas.add(p2);
        parcelas.add(p3);
        Actividad a1 = new Actividad("Piscina","competicion de natacion",new Time(12,0,0),new Time(13,30,0));
        Actividad a2 = new Actividad("Fronton","competicion de fronton",new Time(14,0,0),new Time(15,30,0));
        Actividad a3 = new Actividad("Juegos de mesa","competicion de parchis",new Time(16,30,0),new Time(18,0,0));
        actividades.add(a1);
        actividades.add(a2);
        actividades.add(a3);
    }
    
    public ArrayList<Parcela> getParcelas()
    {
        return parcelas;
    }
    

    public void reservarParcela(Object p)
    {
        Parcela par = (Parcela)p;
        //parcelas.remove(par);
    }
    
    public void setCliente(Cliente c)
    {
        this.cliente = c;
    }
    
    public Cliente getCliente()
    {
        return cliente;
    }
    
    public void addCarrito(Object parcela)
    {
        if(parcela != null)
            carrito.add((Parcela)parcela);
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }   

    public ArrayList<Parcela> getCarrito() {
        return carrito;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }
    
    public void eliminarParcelaCarrito(Parcela parcela) {
        carrito.remove(parcela);
    }


    
    public ArrayList<Cliente> getListaClientes(Object o) {
        Actividad a = (Actividad)o;
        for(Actividad ac : actividades) {
            if(ac.getNombre().equals(a.getNombre())) {
                return ac.getParticipantes();
            }
        }
        return null;
    }

    public float getMetrosCarrito() {
        float count =0;
        for(int i=0;i<carrito.size();i++)
            count = count + carrito.get(i).getMetros_cuadrados();
        
        return count;
    }

    public void addReserva(Reserva r) {
        reservas.add(r);
    }

    public void vaciarCarrito() {
        carrito.clear();
    }

    public void setDescuento_parcela(float x) {
        Parcela.setDescuento_parcela(x);
    }
    
    //Funcion que cambia los valores temporales del cliente
    public void añadirDatosReservaCliente(Date fechaini, Date fechaf, float mtr)
    {
        fechainicio = fechaini;
        fechafin = fechaf;
        metros = mtr;
    }

    public float getMetrosCliente() {
        return metros;
    }

    public Date getFechaInicio() {
        return fechainicio;
    }

    public Date getFechaFin() {
        return fechafin;
    }
}

