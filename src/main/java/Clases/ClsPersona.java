/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Mauricio
 */
public class ClsPersona {
    
    private String numeroCedula;
    private String nombre;

    public ClsPersona(String numeroCedula, String nombre) {
        this.numeroCedula = numeroCedula;
        this.nombre = nombre;
    }
    
    
    
    

    /**
     * @return the numeroCedula
     */
    public String getNumeroCedula() {
        return numeroCedula;
    }

    /**
     * @param numeroCedula the numeroCedula to set
     */
    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
