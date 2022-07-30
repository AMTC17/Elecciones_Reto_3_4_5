/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsCandidato;
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
       
        return this.modeloCandidato.ObtenerCandidatos();
    }
    
    //metodo para recibir la info de la vista
    
    public boolean agregarCandidato(ClsCandidato candidato){
    
        //aqui van las logicas de negocio/restricciones que yo requiera
        boolean respuesta = this.modeloCandidato.agregarCandidato(candidato);
        
        
    return true;
    }
}
