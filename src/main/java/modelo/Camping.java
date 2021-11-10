/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import data.Detalles_Parcela;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author luisc
 */
public class Camping {
    private ArrayList<Parcela> parcelas = new ArrayList<Parcela>(); 
    private Cliente cliente;
    private ArrayList<Reserva> reservas = new ArrayList<Reserva>();
    private ArrayList<Parcela> carrito = new ArrayList<Parcela>();
    private ArrayList<Actividad> actividades = new ArrayList();
    
    public Camping(){
        this.cargarDatos();
    }
    
    public void cargarDatos(){
        Parcela p = new Parcela(0,300,true,12,10);
        Parcela p2 = new Parcela(1,250,true,8,7);
        Parcela p3 = new Parcela(2,150,false,5,4);
        cliente = new Cliente("Victor Serrano","2106H",105);
        parcelas.add(p);
        System.out.println(p);
        parcelas.add(p2);
        parcelas.add(p3);
        
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


    
    public Cliente[] getListaClientes(Object o) {
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
}

