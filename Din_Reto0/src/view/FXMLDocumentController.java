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
import javafx.stage.Stage;

/**
 *
 * @author poker
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
     private static final Logger LOGGER = Logger.getLogger(Controller.class.getName());
    private Stage stage;
    
    @FXML
    private TextField idText;
    
    private String message;
      
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    public void initStage(Parent root) {
              
        LOGGER.info("Starting Stage");
     
        Scene scene = new Scene(root);
        stage.setScene(scene);
    
        
        stage.setTitle("Saludo");
        stage.setResizable(false);
        idText.setText(message);
     }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}
