/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import data.Detalles_Parcela;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Float.parseFloat;
import java.util.ArrayList;
import java.util.Date;
import modelo.Camping;
import modelo.Cliente;
import modelo.Parcela;
import modelo.Reserva;

/**
 *
 * @author luisc
 */
public class Controlador_Camping{
    Camping c;
    
    public Controlador_Camping() {
        c = new Camping();
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
       if ( c.getCliente().getMetros() <= c.getMetrosCarrito()){
           return true;
       }
       return false;
    }
 
    public ArrayList parcelasDisponibles()
    {
        ArrayList<Reserva> r = c.getReservas();
        Cliente cl = c.getCliente();
        Reserva res = cl.getReserva();
        
        ArrayList parcelasReservables = getParcelasNoReservadas();
        
        Date fechaini,fechafin;
        for(Reserva it : r)
        {
            fechaini = it.getFecha_inicio_reserva();
            fechafin = it.getFecha_fin_reserva();
            
            //Para que pueda hacer la reserva, esta no debe estar entre las horas de otras reservas.
            if((fechaini.before(res.getFecha_inicio_reserva()) &&  fechafin.before(
                    res.getFecha_inicio_reserva())) || (fechaini.after(res.getFecha_fin_reserva())
                    && fechafin.after(res.getFecha_fin_reserva())))
            {
                if(!parcelasReservables.contains((Object)it))
                    parcelasReservables.add(it);
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
    public void sancionarCliente(Object c) {
        
    }

    public boolean confirmarEntrada(Date llegada, Date salida, String smetros) {
        boolean ok=true;
        Float metros;
        if((!smetros.isBlank() || !contieneLetras(smetros)))
        {
           smetros = smetros.replaceAll(",",".");
           metros= parseFloat(smetros);
           if(llegada != null && salida != null && metros != 0)
           {
               if(llegada.before(salida))
               {
                   Cliente cl = c.getCliente();
                   cl.setMetros(metros);
                   Reserva r = cl.getReserva();
                   r.setFecha_inicio_reserva(llegada);
                   r.setFecha_fin_reserva(salida);
                   
                   c.setCliente(cl);
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
        Reserva r =  cl.getReserva();
        for(Parcela p : c.getCarrito())
        {
            p.setReservada(r);
            r.addParcela(p);
        }
        cl.setReserva(r);
        c.vaciarCarrito();
        
    }

    
}
