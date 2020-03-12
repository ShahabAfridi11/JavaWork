/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.ex;

/**
 *
 * @author Shahab Afridi
 */
public class AccountNumberNotFountException extends Exception {
    
    public AccountNumberNotFountException(String message) {
        super(message);
    }
    
    public AccountNumberNotFountException(String message, Throwable cause) {
        super(message, cause);
    }

}
