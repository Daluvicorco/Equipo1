/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author luisc
 */
public class Camping {
    private ArrayList<Parcela> parcelas = new ArrayList<Parcela>();; 
    
    public Camping(){
        this.cargarDatos();
    }
    
    public void cargarDatos(){
        Parcela p = new Parcela(0,300,true,12,10);
        Parcela p2 = new Parcela(1,250,true,8,7);
        Parcela p3 = new Parcela(2,150,false,5,4);
        System.out.println(p);
        parcelas.add(p);
        
        parcelas.add(p2);
        parcelas.add(p3);
        
    }
    
    public ArrayList getParcelas()
    {
        return (ArrayList)parcelas;
    }
}

