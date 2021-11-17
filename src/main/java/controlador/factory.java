/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Cliente;

/**
 *
 * @author luisc
 */
public class factory{

    private Cliente crearCliente(boolean tipo,String contraseña,String nombre)
    {
        if(tipo == true)
            return new Cliente();
        else
            return new Administrador();
    }
}
