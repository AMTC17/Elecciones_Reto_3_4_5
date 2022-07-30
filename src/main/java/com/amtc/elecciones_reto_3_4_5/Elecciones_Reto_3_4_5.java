/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.amtc.elecciones_reto_3_4_5;

import Clases.ClsJdbc;

/**
 *
 * @author Mauricio
 */
public class Elecciones_Reto_3_4_5 {

    public static void main(String[] args) {
        //System.out.println("Hello mundo!");
        
        ClsJdbc jdbc = new ClsJdbc();
        jdbc.CrearConexion();
        
    }
}
