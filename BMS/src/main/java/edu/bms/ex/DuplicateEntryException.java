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
public class DuplicateEntryException extends Exception {
    
    public DuplicateEntryException(String message) {
        super(message);
    }
    
    public DuplicateEntryException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
