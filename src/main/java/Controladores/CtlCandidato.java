/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsCandidato;
import Clases.ClsMensaje;
import Modelos.MdlCandidato;
import java.util.LinkedList;

/**
 *
 * @author Mauricio
 */
public class CtlCandidato {
    
    MdlCandidato modeloCandidato;

    public CtlCandidato() {
        this.modeloCandidato = new MdlCandidato();
        
    }
    
    public LinkedList<ClsCandidato> ObtenerCandidatos(){
        
        LinkedList<ClsCandidato> listaCandidatos = this.modeloCandidato.ObtenerCandidatos();
        return listaCandidatos;
    }
    
    //metodo para recibir la info de la vista
    
    public ClsMensaje agregarCandidato(ClsCandidato candidato){
    
        //aqui van las logicas de negocio/restricciones que yo requiera
        ClsMensaje mensaje = this.modeloCandidato.agregarCandidato(candidato);
        
        
        return mensaje;
    }
    
    public ClsMensaje eliminarCandidato(String id){
    
        //aqui van las logicas de negocio/restricciones que yo requiera
        ClsMensaje mensaje = this.modeloCandidato.eliminarCandidato(id);
                
        return mensaje;
    }
    
    
}
