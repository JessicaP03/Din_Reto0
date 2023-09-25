/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.BDException;

/**
 * Interface del modelo
 * @author Gonzalo y Jessica
 */
public interface ModelInterface{
    
    public String getGreet() throws BDException;
}
