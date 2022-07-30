/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mauricio
 */
public class ClsJdbc {
    
    //parametros de conexion
    String driver = "com.mysql.cj.jdbc.Driver";
    String usuario = "root";
    String contrasenia = "";
    String bd = "bd_elecciones_reto345";
    String url = "jdbc:mysql://localhost:3306/" + this.bd;
    
    
    public Connection conexion;
    
    
    public void CrearConexion(){
        
        try{
            Class.forName(driver);
            this.conexion = DriverManager.getConnection(url, usuario, contrasenia);
            
            if(this.conexion != null){
                System.out.println("Conexion exitosa");
            }
            
        }catch(Exception error){
            System.out.println("Ocurrio un error de conexion " + error.getMessage());
        }
    }
    
}
