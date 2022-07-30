/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.MdlVotante;
import Clases.ClsMensaje;
import Clases.ClsVotante;

/**
 *
 * @author Mauricio
 */
public class CtlVotante {
    
    MdlVotante modelo;
    
    public CtlVotante(){
        this.modelo = new MdlVotante();
    }
    
    public ClsMensaje agregarVotante(ClsVotante votante){
        
        ClsMensaje mensaje = this.modelo.agregarVotante(votante);
        return mensaje;
        
    }
    
}
