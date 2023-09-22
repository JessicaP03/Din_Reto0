/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author poker
 */
public class JavaFXViewImplementation extends Application implements ViewInterface{

  private static String greeting;
  
    @Override
    public void start(Stage primaryStage) throws Exception {
       // System.out.println(greeting);
        FXMLLoader loader=new FXMLLoader(
                    getClass().getResource("FXMLDocument.fxml"));
            Parent root = (Parent)loader.load();
            //Get controller for graph 
            FXMLDocumentController viewController=
                    ((FXMLDocumentController)loader.getController());
            //Set greeting to be used in JavaFX view controller
     
      
            
            viewController.setGreeting(greeting);
            viewController.setStage(primaryStage);
            viewController.initStage(root);
    }

    @Override
    public void showGreet(String message) {
        greeting = message;
        launch(message);
    }
    
}
