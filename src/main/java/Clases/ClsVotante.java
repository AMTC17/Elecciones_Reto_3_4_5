/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Mauricio
 */
public class ClsVotante extends ClsPersona{
    
    private String direccion;

    public ClsVotante(String direccion, String numeroCedula, String nombre, String Correo, String Telefono) {
        super(numeroCedula, nombre, Correo, Telefono);
        this.direccion = direccion;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
