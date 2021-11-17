/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cliente;
import modelo.Gestor;

/**
 *
 * @author luisc
 */
public class factory{
    final String gestorID = "0000";
    
    public factory(){
        
    }

    public Object crearCliente(String nombre,String dni)
    {
        if(!dni.equals(gestorID))
            return new Cliente(nombre,dni);
        else
            return new Gestor(nombre,gestorID,gestorID);
    }
}
