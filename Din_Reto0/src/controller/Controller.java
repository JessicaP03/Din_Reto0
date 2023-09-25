/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import exception.BDException;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.ModelInterface;
import view.ViewInterface;

/**
 * Controlador de la aplicación
 * @author Gonzalo y Jessica
 */
public class Controller {
  
    
    private static final Logger LOGGER = Logger.getLogger(Controller.class.getName());
    
   
 /**
  * Metodo run para ejecutar ¡
  * @param view vista
  * @param model modelo
  * @throws BDException Excepcion de database
  */
    public void run(ViewInterface view, ModelInterface model) throws BDException{
       
           view.showGreet(model.getGreet());
       
    }
    
}
