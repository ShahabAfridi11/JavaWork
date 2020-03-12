/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.gui.validators;

import edu.bms.ex.InvalidNumberException;

/**
 *
 * @author Shahab Afridi
 */
public interface IValidator {

    public void validateInitialDeposit(String... fields) throws InvalidNumberException;
    
    public void validateAccountNumber(String... fields) throws InvalidNumberException;
    
}
