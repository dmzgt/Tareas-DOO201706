/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author dmz
 */
public class User {
    
    /*Propiedades*/
    
    private String username;
    private String password;
    private String Nombre ;
    private String Apellidos;
    
    public User (String user, String pass){
        this.Nombre = "Miguel";
        this.Apellidos = "Salazar";
        pass = password;
        user = username;
        
    }
    
    public String getUsername(){
        
        return username;
    
    }
    
    public String getName(){
    
        return Nombre;
    }
    
    public String getLastName(){
    
        return Apellidos;
    }
    
    public String getFullName(){
    
        return Nombre + Apellidos;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
    
    
}


