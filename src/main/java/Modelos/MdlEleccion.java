/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsEleccion;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Mauricio
 */
public class MdlEleccion {
    
    ClsJdbc jdbc;
    
    public MdlEleccion(){
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }
    
    //METODO DE AGREGAR
    public ClsMensaje agregarEleccion(ClsEleccion eleccion){
        
        ClsMensaje mensaje;
        
        try{
            String sql = "INSERT INTO tbl_elecciones VALUES (?, ?, ?, ?, ?, NOW(), 'abierta')";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, eleccion.getIdEleccion().substring(0,9));
            sentencia.setString(2, eleccion.getDescripcion());
            sentencia.setString(3, eleccion.getCategoria());
            sentencia.setString(4, eleccion.getFechaInicio());
            sentencia.setString(5, eleccion.getFechaFin());
            
            int resultado = sentencia.executeUpdate();
            
            if(resultado >=1 ){
                
                mensaje = new ClsMensaje(ClsMensaje.OK, 
                        "Se ha añadido una eleccion de manera exitosa");
                return mensaje;
                
            }
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Ocurrio un error");
            return mensaje;
            
            
        }catch (Exception excepcion){//algo esta pasando y está cambiando la fecha inicial que entra al sistema//era un error de netbeans
            
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Ocurrio un error" 
                    + excepcion.getMessage());
            
            return mensaje;
            
        }
        
    }
    
    public LinkedList<ClsEleccion> ObtenerElecciones(){
        
        try{
            
            LinkedList<ClsEleccion> listaElecciones = new LinkedList<>();
            
            String consulta = "SELECT * FROM tbl_elecciones";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            
            while(resultados.next()){
                
                String idEleccion = resultados.getString("id_eleccion");
                String descripcion = resultados.getString("descripcion");
                String fechaInicio =  resultados.getString("fecha_inicio");
                String fechaFin = resultados.getString("fecha_fin");
                String categoria = resultados.getString("categoria");
                
                ClsEleccion eleccion = new ClsEleccion(idEleccion, descripcion, 
                        fechaInicio, fechaFin, categoria);
                
                listaElecciones.add(eleccion);
            }
            return listaElecciones;
            
        }catch(Exception e){
            
            return null;
        }
        
        
        
        
    }
    
    
}
