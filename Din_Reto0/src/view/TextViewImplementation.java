/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 * Implementación de la vista 
 * @author 
 * @param message
 */
public class TextViewImplementation implements ViewInterface{

    @Override
    public void showGreet(String message) {
        System.out.println(message);
    }
    
}
