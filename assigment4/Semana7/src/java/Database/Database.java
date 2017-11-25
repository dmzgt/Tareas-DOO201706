package Database;

import java.*;
import Modelo.User;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.ParserException;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Database {
private static String getPathDatabase()   {
    return "C:\\Users\\aaron_000\\Desktop\\json-simple-1.1.1.jar";
}

private static boolean setJsonObject(String name, String password, String lastname, String password1){
JSONObject obj= new JSONObject();

obj.put("Nombre del Usuario",name);
obj.put ("Password",password);
obj.put("Lastname",lastname);

String rutaJson = getPathDatabase ();
try (FileWriter file = new FileWriter(rutaJson)){
    file.write(obj.toJSONString());
    return true;
}   catch (IOException ioext) {
        return false;
    }
}

private static JSONObject getJsonObject() throws org.json.simple.parser.ParseException {

        try {
            String rutaJson = getPathDatabase();
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(rutaJson));

            JSONObject jsonObject =  (JSONObject) obj;

            return jsonObject;
        }
        catch( IOException | ParseException ioext) {
            return null;
        }
    }

public boolean setUser(String name,String lastname,String username, String password){
boolean isSetup= setJsonObject(name , lastname, username,password);
return isSetup;
} 

public static User getUserByUsername(String username) throws ParseException {
    User user;

    JSONObject jsonObject = getJsonObject(); //llama a método anterior

    if(jsonObject != null) {
        String name = (String) jsonObject.get(username);
        

		//Valida si el usuario que se pide es igual al que se encuentra
		//en el archivo JSON
        if(username.equals(username)) {
            user = new User(String username, String pass); //Completar con todas las propiedades del usuario
            user.setUsername(name);
        }
        else {
            user = null;
        }

        return user;
    }
    else{
        return null;
    }
}

public static User getUserByUsernamePassword(String username, String password) throws ParseException{
    User user;

    JSONObject jsonObject = getJsonObject(); //Llamáda a método

    if(jsonObject != null) {
        String name = (String) jsonObject.get(username);
        String pass = (String)jsonObject.get(password);
		//Validar password y usuario
		//passwordDb no existe en este contexto. Usar el ejemplo de propiedadDb
        if(username.equals(username) && password.equals(password)) {
            
            user = new User(String user, String pass);
            user.setUsername(String username);//Completar con propiedades para construir objeto          
            
        }
        else {
            user = null;
        }

        return user;
    }
    else{
        return null;
    }
}


}
