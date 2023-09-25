/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * Implementación de la vista por texto
 * @author Gonzalo y Jessica
 */

public class TextViewImplementation implements ViewInterface{

    /**
     * Imprime por consola el saludo
     * @param message mensaje de texto
     */
    @Override
    public void showGreet(String message) {
        System.out.println(message);
    }
    
}
