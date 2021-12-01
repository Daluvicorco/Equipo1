/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.util.TimeZone;

/**
 *
 * @author luisc
 */

/*
*   Esto es una simple prueba. Hay que crear diferentes metodos para insertar/eliminar/modificar la base de datos.
*/

public class DAO {
    
    private Connection conexionBD;
    public DAO() {
        
        String bd = "jdbc:mysql://localhost/practicaIS2?serverTimezone=" + TimeZone.getDefault().getID();
        try {
         Class.forName("com.mysql.cj.jdbc.Driver"); // Driver de mysql
         // Conexión usando usuario y clave de administrador de la BD
         conexionBD = DriverManager.getConnection(bd,"root","victorserranoQL10");
        } catch (Exception e) { // Error en la conexión con la BD
         System.out.println("Error de conexión " + e.getMessage());
        }
        
        /*
        ResultSet resultados = null;
        try {
            String con;
            Statement s = conexionBD.createStatement();
            // Consulta SQL
            con = "SELECT id_prueba FROM prueba";
            resultados = s.executeQuery(con);
            while (resultados.next()) {
            int id = resultados.getInt("id_prueba");
            System.out.print(id);
           }
        } catch (Exception e) { // Error en al realizar la consulta
         System.out.println("Error en la petición a la BD");    
        }
        /*
        ResultSet resultados2 = null;
        try {
            int id = 10; // Valor a insertar
            Statement s = conexionBD.createStatement();
            // Operación SQL sobre la base de datos
            String con = "INSERT INTO prueba (id_prueba) VALUES ('" + id + "')";
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con);
            preparedStmt.executeUpdate();
        }
        catch(Exception e){ // Error al realizar la operación
         System.out.println("No se ha completado la operación");
        }
        */
    }
    
    public void añadirActividad(int id,String tipo,String tit,Time horaini,Time horafin)
    {        
        try {
            Statement s = conexionBD.createStatement();
            // Operación SQL sobre la base de datos
            String con = "INSERT INTO actividad (id,tipo,nombre,horaInicio,horaFin) VALUES ("+id+",'" + tipo +"','"+ tit+ "','"+horaini+"','"+horafin+"')";
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con);
            preparedStmt.executeUpdate();
        }
        catch(Exception e){ // Error al realizar la operación
         System.out.println("No se ha podido insertar la actividad" + e);
        } 
    }
    
    public void seleccionarGanadorActividad(String dni,int id)
    {
        try {
            Statement s = conexionBD.createStatement();
            // Operación SQL sobre la base de datos
            String con = "UPDATE actividad SET ganador ='"+ dni +"' WHERE id =" + id +";";
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con);
            preparedStmt.executeUpdate();
        }
        catch(Exception e){ // Error al realizar la operación
         System.out.println("No se ha podido insertar la actividad" + e);
        } 
    }
    
    public void crearCliente(String dni,String nombre)
    {
        try {
            Statement s = conexionBD.createStatement();
            // Operación SQL sobre la base de datos
            String con = "INSERT INTO cliente (dni,nombre) VALUES ('"+dni+"','" + nombre +"')";
            PreparedStatement preparedStmt = conexionBD.prepareStatement(con);
            preparedStmt.executeUpdate();
        }
        catch(Exception e){ // Error al realizar la operación
         System.out.println("No se ha podido insertar el cliente" + e);
        } 
    }

    public boolean logCliente(String nombre, String dni) {
        ResultSet resultados = null;
        try {
            String con;
            Statement s = conexionBD.createStatement();
            // Consulta SQL
            con = "select count(*) from cliente WHERE dni ='"+dni+"' AND nombre='" + nombre +"';";
            resultados = s.executeQuery(con);
            while (resultados.next()) {
            int id = resultados.getInt("count(*)");
            if(id > 0 )
                return true;
            else
                return false;
           }
        } catch (Exception e) { // Error en al realizar la consulta
         System.out.println("Error en la petición a la BD");    
        }
        return false;
     }
}
//String con = "select count(*) from cliente WHERE dni ='"+dni+"' AND nombre='" + nombre +"';";
/*if(Integer.parseInt(con) > 0 )
                return true;
            else
                return false;*/