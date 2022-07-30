/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Mauricio
 */
public class ClsEleccion {
    
    private String idEleccion;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;
    private String categoria;

    public ClsEleccion(String idEleccion, String descripcion, String fechaInicio, String fechaFin, String categoria) {
        this.idEleccion = idEleccion;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.categoria = categoria;
    }

    /**
     * @return the idEleccion
     */
    public String getIdEleccion() {
        return idEleccion;
    }

    /**
     * @param idEleccion the idEleccion to set
     */
    public void setIdEleccion(String idEleccion) {
        this.idEleccion = idEleccion;
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

    /**
     * @return the fechaInicio
     */
    public String getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the fechaFin
     */
    public String getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
    
}
