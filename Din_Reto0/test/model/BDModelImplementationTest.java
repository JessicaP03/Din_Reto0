/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.BDException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Test de la clase BDModelImplementation del paquete de modelo
 * @author Gonzalo y Jessica
 */
public class BDModelImplementationTest {
    private BDModelImplementation bdi;
    
    public BDModelImplementationTest() {
    }

    /**
     * Metodo para abrir la conexion con el Before para antes de testear.
     */
    @Before
    public void setUp() throws ClassNotFoundException{
        try {
            bdi = new BDModelImplementation();
            bdi.openConnection();
        } catch (BDException ex) {
            Logger.getLogger(BDModelImplementationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }

    /**
     * Testeo del metodo getGreet de la database.
     */
    @Test
    public void testGetGreet(){
       
        try {
            String message = bdi.getGreet();
            String result = "Hola Buenas Tardes 2DamC";
            assertEquals(message, result);
        } catch (BDException ex) {
            Logger.getLogger(BDModelImplementationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * Metodo para cerrar la conexión con el After para despues del testeo.
     */
    
    @After
    public void closeConnection() throws SQLException{
        bdi.closeConnection();
    }
}
