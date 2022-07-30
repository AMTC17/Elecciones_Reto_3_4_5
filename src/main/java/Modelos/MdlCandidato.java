/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidato;
import Clases.ClsJdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Mauricio
 */
public class MdlCandidato {
    
    ClsJdbc jdbc;
    
    public MdlCandidato(){
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }
    
    public boolean  agregarCandidato(ClsCandidato candidato){
        
        return true;
        
    }
    
    public LinkedList<ClsCandidato> ObtenerCandidatos(){
        
        try{
            
            LinkedList<ClsCandidato> lista = new LinkedList<>();
            
            String consulta = "SELECT * FROM tbl_candidatos";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(consulta);
            ResultSet resultados = sentencia.executeQuery();
            
            while(resultados.next()){
                
                String partido = resultados.getString("partido_politico");
                String mensaje = resultados.getString("mensaje_campania"); 
                String cedula = resultados.getString("id_candidato");
                String nombre = resultados.getString("nombre");
                
                
                ClsCandidato candidato = new ClsCandidato(partido, mensaje, cedula, nombre);
                
                lista.add(candidato);
            }
            
            return lista;
            
        }catch(Exception e){
            return null;
        }
       
        
        
    }
    
}
