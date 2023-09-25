/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.BDException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test de la clase FileModelImplementation del paquete de modelo
 * @author Gonzalo y Jessica
 */
public class FileModelImplementationTest {
    private FileModelImplementation fmi;
    
    public FileModelImplementationTest() {
    }

    /**
     * Testeo del metodo getGreet del archivo.
     */
    @Test
    public void testGetGreet() {
         try {
            String message = fmi.getGreet();
            String result = "Hola mundo";
            assertEquals(message, result);
        } catch (Exception ex) {
            Logger.getLogger(BDModelImplementationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
