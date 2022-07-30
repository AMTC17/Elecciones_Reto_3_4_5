/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Mauricio
 */
public class ClsCandidato extends ClsPersona {
    
    private String partido;
    private String mensajeCampania;
    private String ciudadOrigen;
    private String descripcion;

    public ClsCandidato(String partido, String mensajeCampania, 
            String ciudadOrigen, String descripcion, String numeroCedula, 
            String nombre, String Correo, String Telefono) 
    {
        super(numeroCedula, nombre, Correo, Telefono);
        this.partido = partido;
        this.mensajeCampania = mensajeCampania;
        this.ciudadOrigen = ciudadOrigen;
        this.descripcion = descripcion;
    }

    
    
    /**
     * @return the partido
     */
    public String getPartido() {
        return partido;
    }

    /**
     * @param partido the partido to set
     */
    public void setPartido(String partido) {
        this.partido = partido;
    }

    /**
     * @return the mensajeCampania
     */
    public String getMensajeCampania() {
        return mensajeCampania;
    }

    /**
     * @param mensajeCampania the mensajeCampania to set
     */
    public void setMensajeCampania(String mensajeCampania) {
        this.mensajeCampania = mensajeCampania;
    }

    /**
     * @return the ciudadOrigen
     */
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    /**
     * @param ciudadOrigen the ciudadOrigen to set
     */
    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
