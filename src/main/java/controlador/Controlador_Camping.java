/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import data.Detalles_Parcela;
import java.util.ArrayList;
import modelo.Camping;
import modelo.Parcela;

/**
 *
 * @author luisc
 */
public class Controlador_Camping{
    Camping c;
    
    public Controlador_Camping() {
        c = new Camping();
    }
    
    public ArrayList getParcelas()
    {
        ArrayList<Parcela> parcelas_noreservadas = new ArrayList();
        ArrayList<Parcela> parcelas = c.getParcelas();
        for(int i =0;i<parcelas.size();i++)
        {
            if(!parcelas.get(i).estaReservada())
                parcelas_noreservadas.add(parcelas.get(i));
        }
        return (ArrayList)parcelas_noreservadas;
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
       if ( c.getCliente().getMetros() <= c.getCliente().getReserva().getMetros()){
           return true;
       }
       return false;
    }
    
}
