/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * Implementacion del modelo para leer el archivo
 * @author Gonzalo y Jessica
 */
public class FileModelImplementation implements ModelInterface{

    /**
     * Metodo para recoger el saludo del archivo
     * @return greeting
     */
    @Override
    public String getGreet() {
        
        String greeting = ResourceBundle.getBundle("model.Greet").getString("greet");
        
        return greeting;

    }
    
}
