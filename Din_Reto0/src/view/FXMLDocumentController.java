/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Controller;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Controaldor de la ventana FXMLDocument
 * @author Gonzalo y Jessica
 */
public class FXMLDocumentController  {
    
    @FXML
    private Label idLabel;
    
     private static final Logger LOGGER = Logger.getLogger(Controller.class.getName());
    private Stage stage;
    
    private String greeting;
   
    //private String message;
    @FXML
    private Pane idPane;

    
      
   /**
    * Metodo para inicializar la ventana con el mensaje
    * @param root  root
    */
    
    public void initStage(Parent root) {
              
        LOGGER.info("Starting Stage");
     
        Scene scene = new Scene(root);
        stage.setScene(scene);
    
        
        stage.setTitle("Saludo");
        stage.setResizable(false);
        idLabel.setVisible(true);
        idLabel.setText(greeting);
       
    
        stage.show();
     }

        public void setGreeting(String greeting){
        this.greeting=greeting;
    }
    
    public void setStage(Stage stage) {
        this.stage=stage;
    }
        
    
}
