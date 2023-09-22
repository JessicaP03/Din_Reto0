/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.BDException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementacion del modelo para leer desde la DB
 *
 * @author
 */
public class BDModelImplementation implements ModelInterface {

  
   
        /**
         * prepara la conexion
         */
    private Connection conex;

    /**
     * prepara la sentencia
     */
    private PreparedStatement stmt;

    /**
     * lee el archivo de configuracion
     */
    private ResourceBundle archivoConfig;

    /**
     * url para conectarse a la base de datos
     */
    private String url;

    /**
     * usuario para conectarse a la base de datos
     */
    private String usuario;

    /**
     * contraseña para conectarse a la base de datos
     */
    private String contraseña;

    /**
     *
     * driver para conectarse a la base de datos
     */
    private String driver;

    /**
     *
     * selecciona el saludo
     */
    private final String getGreeting = "SELECT message from greet";

    /**
     * constructor en el que se agragan los datos necesarios para conectarse a
     * la base de datos
     */
    public BDModelImplementation() {
        this.archivoConfig = ResourceBundle.getBundle("model.BDConnect");
        this.url = archivoConfig.getString("Conn");
        this.usuario = archivoConfig.getString("BDuser");
        this.contraseña = archivoConfig.getString("BDPass");
        this.driver = archivoConfig.getString("Driver");
    }

    /**
     * abre la conexion con la base de datos
     *
     * @throws ClassNotFoundException
     * @throws exception.BDException
     * @throws BDException Excepcion para cuanto intentas conectar con la BD
     */
    public void openConnection() throws ClassNotFoundException, BDException {
        try {
            Class.forName(driver);
            conex = DriverManager.getConnection(url, usuario, contraseña);
        } catch (SQLException e) {
            //e.printStackTrace();
            throw new BDException("ERROR");
        }
    }

    @Override
    public String getGreet() throws BDException {
         
        ResultSet rs = null;
        String saludo = "";
        
        
        try {
              this.openConnection();
            stmt = conex.prepareStatement(getGreeting); //Logger.getLogger(BdModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
            rs = stmt.executeQuery();
             if(rs.next()){
            saludo = rs.getString(1);
            this.closeConnection();
        }
        } catch (SQLException ex) {
            Logger.getLogger(BDModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BDModelImplementation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return saludo;
      
        
    
    }
    
     public void closeConnection() throws SQLException{
        if(conex != null){
            conex.close();
        }
        if(stmt !=null){
            conex.close();
        }
        

    }

}
