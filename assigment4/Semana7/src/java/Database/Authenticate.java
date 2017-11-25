/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author dmz
 */
public class Authenticate {
    
    public static boolean authenticate(String username, String password){
        
        String userDataBase ="Miguel" ;
        String passDataBase ="123" ;
        
        if(username.equals(userDataBase) && password.equals(passDataBase)){
            
        return true;
        
        }else{
            
        return false;
    
        }

    }
    
}
