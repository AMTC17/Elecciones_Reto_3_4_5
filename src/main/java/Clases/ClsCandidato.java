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

    public ClsCandidato(String partido, String mensajeCampania, String numeroCedula, String nombre) {
        super(numeroCedula, nombre);
        this.partido = partido;
        this.mensajeCampania = mensajeCampania;
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
     * @return the mensajeCampaña
     */
    public String getMensajeCampania() {
        return mensajeCampania;
    }

    /**
     * @param mensajeCampaña the mensajeCampaña to set
     */
    public void setMensajeCampania(String mensajeCampania) {
        this.mensajeCampania = mensajeCampania;
    }
    

    
    
    
    

    
}
