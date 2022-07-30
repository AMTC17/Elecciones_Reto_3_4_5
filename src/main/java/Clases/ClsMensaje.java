/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Mauricio
 */
public class ClsMensaje {
    
    public final static String OK = "Ok";
    public final static String ERROR = "Error";
    public final static String ADVERTENCIA = "Advertencia";
    
    private String tipo;
    private String texto;

    public ClsMensaje(String tipo, String texto) {
        this.tipo = tipo;
        this.texto = texto;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
}
