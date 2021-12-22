/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import data.DAO;
import data.Detalles_Parcela;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Float.parseFloat;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import modelo.Actividad;
import modelo.Camping;
import modelo.Cliente;
import modelo.Gestor;
import modelo.Parcela;
import modelo.Reserva;

/**
 *
 * @author luisc
 */
public class Controlador_Camping{
    Camping c;
    factory f;
    DAO d;
    public Controlador_Camping() {
        c = new Camping();
        f = new factory();
        d = new DAO();
    }
    

    
    public Detalles_Parcela consultarParcela(Object p)
    {
        Parcela par = (Parcela)p;
        return par.consultarParcela();
    }
    
    public void añadirCarrito(Object parcela)
    {
            c.addCarrito(parcela);
    }
    public boolean comprobarMetros() {
       if ( c.getMetrosCliente() <= c.getMetrosCarrito()){
           return true;
       }
       return false;
    }
 
    public ArrayList parcelasDisponibles()
    {
        Date fechai,fechaf;
        ArrayList<Reserva> r = c.getReservas();
        Cliente cl = c.getCliente();
        fechai = c.getFechaInicio();
        fechaf = c.getFechaFin();
        
        ArrayList parcelasReservables = getParcelasNoReservadas();
        
        Date fechaini,fechafin;
        for(Reserva it : r)
        {
            fechaini = it.getFecha_inicio_reserva();
            fechafin = it.getFecha_fin_reserva();
            //Para que pueda hacer la reserva, esta no debe estar entre las horas de otras reservas.
            if(fechaini.after(fechaf) || fechafin.before(fechai))
            {
                for(int i=0;i<it.getParcelas_reservadas().size();i++)
                {
                    if(!parcelasReservables.contains((Object)it.getParcelas_reservadas().get(i)))
                    parcelasReservables.add((Object)it.getParcelas_reservadas().get(i));
                }
            }
        }
        
        return parcelasReservables;
    }
    
    public ArrayList getParcelasNoReservadas()
    {
        ArrayList<Parcela> parcelas_noreservadas = new ArrayList();
        ArrayList<Parcela> parcelas = c.getParcelas();
        ArrayList<Parcela> carrito = c.getCarrito();
        for(int i =0;i<parcelas.size();i++)
        {
            if(!parcelas.get(i).estaReservada())
                parcelas_noreservadas.add(parcelas.get(i));
        }
        
        parcelas_noreservadas.removeAll(carrito);
        return (ArrayList)(parcelas_noreservadas);
    }

    public ArrayList getCarrito() {
        return (ArrayList)c.getCarrito();
    }

    public void quitarParcelaCarrito(Object parcela) {
        c.eliminarParcelaCarrito((Parcela)parcela);
    }
    public String sancionarCliente(Object c) {
        Cliente cli =(Cliente) c;
        cli.setSancion(true);
        cli.setMensajeSancion("Usted está sancionado durante 1 dia");
        return "Usted está sancionado durante 1 dia";
    }

    public boolean confirmarEntrada(Date llegada, Date salida, String smetros) {
        boolean ok=true;
        Float metros;
        //if((!smetros.isBlank() || !contieneLetras(smetros)))
        if((smetros != null || !smetros.isEmpty() || !contieneLetras(smetros)))
        {
           smetros = smetros.replaceAll(",",".");
           metros= parseFloat(smetros);
           if(llegada != null && salida != null && metros != 0)
           {
               if(llegada.before(salida)) //Comprueba que la fecha de llegada sea anterior a la de salida
               {
                   //Añadir atributos temporales a controlador
                   c.añadirDatosReservaCliente(llegada, salida, metros);
               }
               else
                   ok = false;
           }
           else
               ok=false;
        }
        else 
            ok=false;
        
        return ok;        
    }

    private boolean contieneLetras(String smetros) {
        boolean ok=true;
        int i=0;
        char car;
        while(i<smetros.length() && ok == true)
        {
            car  = smetros.charAt(i);
            System.out.println("Analizando "+ car + "Valor: " + isLetter(car));
            ok = ( isDigit(i) || car == ',' || car == '.' );
            i++;
        }
        return ok;
    }

    public void reservarParcelas() {
        Cliente cl = c.getCliente();
        Reserva r =  new Reserva(c.getFechaInicio(),c.getFechaFin(),cl);
        for(Parcela p : c.getCarrito())
        {
            p.setReservada(r);
            r.addParcela(p);
        }
        
        cl.addReserva(r);
        c.addReserva(r);
        c.vaciarCarrito();
        
    }

    public ArrayList getActividades() {
        return c.getActividades();
    }
    
    public ArrayList getParticipantes(Object o) {
        return c.getListaClientes(o);
    }

    public void setDescuento(float x) {
        Parcela.setDescuento_parcela(x);
    }
    
    public Cliente getCliente(){
        return c.getCliente();
    }

    public void vaciarCarrito() {
        c.vaciarCarrito();
    }
    
    public ArrayList getHistorico() {
        return c.getHistoria();
    }

    public void setGanadorActividad(Object cl, Object actividad) {
       c.setGanadorActividad(cl,actividad);
       Actividad act = (Actividad) actividad;
       Cliente client = (Cliente) cl;
       d.seleccionarGanadorActividad(client.getDni(), act.getId());
    }

    public void añadirActividad(Object actividad) {
        ArrayList<Actividad> a = c.getActividades();
        Actividad ac = (Actividad)actividad;
        Cliente cli = c.getCliente();
        for(Actividad it : a)
        {
            if(it.getNombre().equals(ac.getNombre()))
                it.addParticipante(cli);
        }
    }

    public void eliminarClienteActividad(Object actividad) {
        ArrayList<Actividad> a = c.getActividades();
        Actividad ac = (Actividad)actividad;
        Cliente cli = c.getCliente();
        for(Actividad it : a)
        {
            if(it.getNombre().equals(ac.getNombre()))
                it.removeParticipante(cli);
        }
    }

    public ArrayList getActividadesCliente() {
        ArrayList<Actividad> a = c.getActividades();
        ArrayList<Cliente> participantes;
        Cliente cli = c.getCliente();
        ArrayList participo = new ArrayList();
        for(Actividad it : a)
        {
            participantes = it.getParticipantes();
            for(Cliente cl : participantes)
            {
                if(cl.getNombre().equals(cli.getNombre()) && !participo.contains((Object)cli))
                    participo.add((Object)it);
            }
        }
        return participo;
    }
    
    public void anyadeActividad(String tipo,String tit,Time horaini,Time horafin){
        Actividad x = new Actividad(tipo,tit,horaini,horafin);
        d.añadirActividad(x.getId(),tipo,tit,horaini,horafin);
        c.anyadeAct(x);
    }

    public boolean crearCliente(String nombre, String dni) {
        Object o = (Object)f.crearCliente(nombre,dni);
        c.setCliente((Cliente)o);
        
        if ( o instanceof Gestor){
            c.setGestor((Gestor)o);
            return true;
        }
        d.crearCliente(dni, nombre);
        c.setCliente((Cliente)o);
        return false;
    }

    public boolean iniciarLog(String nombre, String dni) {
        return d.logCliente(nombre,dni);
    }
    
    public boolean isBlank(String text){
        try {
            return (text.equals("") || text.trim().length() == 0);
        } catch (NullPointerException e){ return true; }
    }
}
