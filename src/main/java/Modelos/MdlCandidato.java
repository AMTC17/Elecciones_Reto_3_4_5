/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidato;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Mauricio
 */
public class MdlCandidato { /////esto lo uso de referencia
    
    ClsJdbc jdbc;
    
    public MdlCandidato(){
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }///hasta aqui
    
    public ClsMensaje agregarCandidato(ClsCandidato candidato){
        
        ClsMensaje mensaje;
        
        try{
            String sql = "INSERT INTO tbl_candidatos VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, candidato.getNumeroCedula());
            sentencia.setString(2, candidato.getNombre());
            sentencia.setString(3, candidato.getCorreo());
            sentencia.setString(4, candidato.getTelefono());
            sentencia.setString(5, candidato.getPartido());
            sentencia.setString(6, candidato.getMensajeCampania());
            sentencia.setString(7, candidato.getDescripcion());
            sentencia.setString(8, candidato.getCiudadOrigen());
            
            int resultado = sentencia.executeUpdate();
            
            if(resultado >=1){
                
                mensaje = new ClsMensaje(ClsMensaje.OK, 
                        "Se ha añadido un candidato de manera exitosa");
                return mensaje;
                
            }
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Ocurrio un error");
            return mensaje;
            
            
        }catch (Exception excepcion){
            
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Ocurrio un error" 
                    + excepcion.getMessage());
            
            return mensaje;
            
        }
        
    }
    
    public ClsMensaje eliminarCandidato(String id){
        
        ClsMensaje mensaje;
        
        try{
            String sql = "DELETE FROM tbl_candidatos WHERE id_candidato = ?";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            sentencia.setString(1, id);
           
            int resultado = sentencia.executeUpdate();
            
            if(resultado >=1){
                
                mensaje = new ClsMensaje(ClsMensaje.OK, 
                        "Se ha eliminado un candidato de manera exitosa");
                return mensaje;
                
            }
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Ocurrio un error");
            return mensaje;
            
            
        }catch (Exception excepcion){
            
            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Ocurrio un error" 
                    + excepcion.getMessage());
            
            return mensaje;
            
        }
        
    }
    
    
    public LinkedList<ClsCandidato> ObtenerCandidatos(){
        
        try{
            
            LinkedList<ClsCandidato> lista = new LinkedList<>();
            
            String consulta = "SELECT * FROM tbl_candidatos";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            
            while(resultados.next()){
                
                String cedula = resultados.getString("id_candidato");
                String nombre = resultados.getString("nombre");
                String correo = resultados.getString("correo");
                String telefono = resultados.getString("telefono");
                String partido = resultados.getString("partido_politico");
                String mensajeCampania = resultados.getString("mensaje_campania");
                String descripcion = resultados.getString("descripcion");
                String ciudadOrigen = resultados.getString("ciudad_origen");
                
                ClsCandidato candidato = new ClsCandidato(partido, 
                mensajeCampania, ciudadOrigen, descripcion, cedula, 
                nombre, correo, telefono);
                
                lista.add(candidato);
            }
            
            return lista;
            
        }catch(Exception e){
            return null;
        }
       
        
        
    }
    
}
