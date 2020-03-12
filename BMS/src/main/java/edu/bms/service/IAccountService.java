/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.service;

import edu.bms.ex.AccountNumberNotFountException;
import edu.bms.ex.DuplicateEntryException;
import edu.bms.ex.InsufficientBalanceException;
import edu.bms.ex.SystemNotAvalibleException;
import org.dom4j.Element;

/**
 *
 * @author Shahab Afridi
 */
public interface IAccountService {
    
    public static final String MSG_SYS_DOWN = "System is down please come again";
    public static final String MSG_XML_ERR = "Database format appearted to be invalid";
    public static final String MSG_DUPLICATE_ACCOUNT = "Account number is "
            + "already taken. Use another";
    
    
    public void openAccount(long accountNumber,String accountHolederName,
            String cnic,String phoneNumber,String accountType,double initialDeposit)
            throws SystemNotAvalibleException, DuplicateEntryException;
    
    public void updatePhoneNumber(long accountNumber,String newPhoneNumber);
    
    public void updateAddress(long accountNumber,String newAddress);
    
    public double withdraw(long accountNumber,double amount) throws InsufficientBalanceException;
    
    public double deposit(long accountNumber,double amount);
    
    public double transfer(long accountNumberTo,long accountNumberFrom,double amount);
    
    public void close(long accountNumber);
    
    public Element findAccountElement(long accountNumber)
            throws AccountNumberNotFountException;
    
}
