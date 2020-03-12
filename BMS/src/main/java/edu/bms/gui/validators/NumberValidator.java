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
public class NumberValidator implements IValidator {

    private static final String ERR_MSG1 = "Input is not a valid decimal number.";
    private static final String ERR_MSG2 = "Input is not a valid account number.";

    @Override
    public void validateInitialDeposit(String[] fields) throws InvalidNumberException {
        try {
            for (String field : fields) {
                Double.parseDouble(field);
            }
        } catch (NumberFormatException nfe) {
            throw new InvalidNumberException(ERR_MSG1, nfe);
        }
    }

    @Override
    public void validateAccountNumber(String... fields) throws InvalidNumberException {
        try {
            for (String field : fields) {
                Long.parseLong(field);
            }
        } catch (NumberFormatException nfe) {
            throw new InvalidNumberException(ERR_MSG2,nfe);
        }
    }

}
