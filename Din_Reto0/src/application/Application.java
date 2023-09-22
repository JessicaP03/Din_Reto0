/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import controller.Controller;
import exception.BDException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.ModelFactory;
import view.ViewFactory;

/**
 *
 * @author poker
 */
public class Application {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws BDException {
        String Dato = ResourceBundle.getBundle("application.Config").getString("view_type");

        ViewFactory view = new ViewFactory();
        ModelFactory model = new ModelFactory();
        Controller controller = new Controller();

        controller.run(view.getView(), model.getModel());

    }

}
