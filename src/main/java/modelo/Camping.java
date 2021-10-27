/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import data.Detalles_Parcela;
import java.util.ArrayList;

/**
 *
 * @author luisc
 */
public class Camping {
    private ArrayList<Parcela> parcelas = new ArrayList<Parcela>(); 
    private Cliente cliente;
    
    public Camping(){
        this.cargarDatos();
    }
    
    public void cargarDatos(){
        Parcela p = new Parcela(0,300,true,12,10);
        Parcela p2 = new Parcela(1,250,true,8,7);
        Parcela p3 = new Parcela(2,150,false,5,4);
        Reserva r = new Reserva();
        parcelas.add(p);
        System.out.println(p);
        p.setReservada(r);
        parcelas.add(p2);
        parcelas.add(p3);
        
    }
    
    public ArrayList getParcelas()
    {
        ArrayList parcelas_noreservadas = new ArrayList();
        
        for(int i =0;i<parcelas.size();i++)
        {
            if(!parcelas.get(i).estaReservada())
                parcelas_noreservadas.add(parcelas.get(i));
        }
        return parcelas_noreservadas;
    }
    
    public Detalles_Parcela consultarParcela(Object p)
    {
        Parcela par = (Parcela)p;
        return par.consultarParcela();
    }
    public void reservarParcela(Object p)
    {
        Parcela par = (Parcela)p;
    }
    
    public void setCliente()
    {
        Cliente c;
    }
}

