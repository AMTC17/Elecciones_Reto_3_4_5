/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;


import Clases.ClsJdbc;
import Clases.ClsMensaje;
import java.sql.PreparedStatement;
import Clases.ClsVotante;

/**
 *
 * @author Mauricio
 */
public class MdlVotante {
    
    ClsJdbc jdbc;
    
    public MdlVotante(){
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }
    
    //METODO DE AGREGAR
    public ClsMensaje agregarVotante(ClsVotante votante){
        
        ClsMensaje mensaje;
        
        try{
            String sql = "INSERT INTO tbl_votantes VALUES (?, ?, ?, ?, ?)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, votante.getNumeroCedula());
            sentencia.setString(2, votante.getNombre());
            sentencia.setString(3, votante.getCorreo());
            sentencia.setString(4, votante.getTelefono());
            sentencia.setString(5, votante.getDireccion());
            
            int resultado = sentencia.executeUpdate();
            
            if(resultado >=1 ){
                
                mensaje = new ClsMensaje(ClsMensaje.OK, 
                        "Se ha añadido un votante de manera exitosa");
                return mensaje;
                
            }
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Ocurrio un error");
            return mensaje;
            
            
        }catch (Exception excepcion){//algo esta pasando y está cambiando la fecha inicial que entra al sistema
            
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Ocurrio un error" 
                    + excepcion.getMessage());
            
            return mensaje;
            
        }
        
    }
    
    
    
}
