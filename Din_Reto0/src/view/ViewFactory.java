/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ResourceBundle;

/**
 * Factoria de la vista
 * @author Gonzalo y Jessica
 */
public class ViewFactory {
    
    /**
     * Metodo para leer el archivo de propiedades y devuelve el tipo del vista
     * @return view
     */
    public ViewInterface getView(){
        ViewInterface view = null;
        String dato = ResourceBundle.getBundle("application.Config").getString("view_type");
        
        if(dato.equalsIgnoreCase("text")){
            view = new TextViewImplementation();
        }
        
        if(dato.equalsIgnoreCase("javafx")){
           view = new JavaFXViewImplementation();
        }
        return view;
    }
}
