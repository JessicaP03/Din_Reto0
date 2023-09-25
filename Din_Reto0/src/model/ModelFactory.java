/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;


/**
 * Factoria del modelo
 * @author Gonzalo y Jessica
 */
public class ModelFactory {
    
    /**
     * Metodo para leer el archivo de propiedades y devuelve el tipo del modelo
     * @return model
     */
    
    public ModelInterface getModel(){
    ModelInterface model = null;
    String dato = ResourceBundle.getBundle("application.Config").getString("model_type");
        
       if (dato.equalsIgnoreCase("file")){
           model = new FileModelImplementation();
       }
        
        if(dato.equalsIgnoreCase("db")){
           model = new BDModelImplementation();
           
        }
        return model;
    }
}
