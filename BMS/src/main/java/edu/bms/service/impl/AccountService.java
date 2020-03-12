/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.service.impl;

import edu.bms.ex.AccountNumberNotFountException;
import edu.bms.ex.DuplicateEntryException;
import edu.bms.ex.InsufficientBalanceException;
import edu.bms.ex.SystemNotAvalibleException;
import edu.bms.service.IAccountService;
import edu.bms.util.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 *
 * @author Shahab Afridi
 */
public class AccountService implements IAccountService {

    private static final Logger LOG;
    private static final String XML_PATH;

    static {
        XML_PATH = "G:\\workspace\\netbeans\\account1.xml";
        LOG = LogManager.getLogger(AccountService.class);
    }

    public AccountService() {

    }

    @Override
    public void openAccount(long accountNumber, String accountHolderName,
            String cnic, String phoneNumber, String accountType, double initialDeposit)
            throws SystemNotAvalibleException, DuplicateEntryException {

        try {
            this.createXMLIfNotExists();

            Document document = this.readXMLDocument();

            if (!this.accountExists(document, accountNumber)) {

                List<Element> elements = document.selectNodes("/" + Constants.EL_ACCOUNTS);
                Element accounts = elements.get(0);

                //adding a new element of account
                Element account = accounts.addElement(Constants.EL_ACCOUNT);
                account.addAttribute(Constants.ATTRIB_NUMBER, "" + accountNumber);
                account.addElement(Constants.EL_ACCOUNT_HOLDER).setText(accountHolderName);
                account.addElement(Constants.EL_TYPE).setText(accountType);
                account.addElement(Constants.EL_INITIAL_DEPOSIT).setText("" + initialDeposit);
                account.addElement(Constants.EL_CNIC).setText(cnic);
                account.addElement(Constants.EL_PHONE_NUMBER).setText(phoneNumber);
                account.addElement(Constants.EL_BALANCE).setText("" + initialDeposit);
                account.addElement(Constants.EL_STATUS).setText(Constants.STATUS_OPENED);

                //now writtng element to the xml file
                this.writeXMLDocument(document);
            } else {
                throw new DuplicateEntryException(MSG_DUPLICATE_ACCOUNT);
            }

        } catch (DocumentException | FileNotFoundException ex) {
            LOG.error("Error occured: {}", ex);
            throw new SystemNotAvalibleException(MSG_XML_ERR);
        } catch (IOException ioe) {
            throw new SystemNotAvalibleException(MSG_SYS_DOWN);
        }

//        Document document = DocumentHelper.createDocument();
//        Element accounts = document.addElement(Constants.EL_ACCOUNTS);
//        
//        Element account =accounts.addElement(Constants.EL_ACCOUNT).
//                addAttribute(Constants.ATTRIB_NUMBER,""+accountNumber);
//                account.addElement(Constants.EL_ACCOUNT_HOLDER).setText(accountHolederName);
//                account.addElement(Constants.EL_TYPE).setText(accountType);
//                //String iniBalance = Double.toString(initialDeposit);
//                account.addElement(Constants.EL_INITIAL_DEPOSIT).setText(""+initialDeposit);
//                account.addElement(Constants.EL_CNIC).setText(cnic);
//                account.addElement(Constants.EL_PHONE_NUMBER).setText(phoneNumber);
//                //account.addElement("").setText(phoneNumber);
//                //LOG.info(cnic);
//                
//        try {
//            XMLWriter writer = new XMLWriter(new FileOutputStream(XML_OUT1),
//                    OutputFormat.createPrettyPrint());
//            writer.write(document);
//        } catch (IOException ex) {
//            LOG.error("error while Writting xml ",ex);
//        }
    }

    @Override
    public void updatePhoneNumber(long accountNumber, String newPhoneNumber) {
        try {
            Document document = this.readXMLDocument();
            String query = "/" + Constants.EL_ACCOUNTS + "/" + Constants.EL_ACCOUNT
                    + "[@" + Constants.ATTRIB_NUMBER + "=" + accountNumber + "]";
            Element account = (Element) document.selectNodes(query).get(0);
            Element element = ((Element) account.selectNodes(Constants.EL_PHONE_NUMBER).get(0));
            element.setText(newPhoneNumber);
            this.writeXMLDocument(document);
        } catch (Throwable de) {
            LOG.error("Error accour", de);
        }
    }

    @Override
    public void updateAddress(long accountNumber, String newAddress) {

    }

    @Override
    public double withdraw(long accountNumber, double amount) 
            throws InsufficientBalanceException{

        try {
            if (xmlExist()) {
                Document document = this.readXMLDocument();
                String query = "/" + Constants.EL_ACCOUNTS + "/" + Constants.EL_ACCOUNT
                        + "[@" + Constants.ATTRIB_NUMBER + "=" + accountNumber + "]";
                Element account = (Element) document.selectNodes(query).get(0);
                Element element = ((Element) account.selectNodes(Constants.EL_BALANCE).get(0));
                String ele = element.getText();
                LOG.info(ele);
                //String balanceElement = element.toString();
                double balance = Double.parseDouble(ele);

                if (true) {
                    double totlaBalance = balance - amount;
                    LOG.info(totlaBalance);
                    //String tB = Double.toString(totlaBalance);
                    element.setText("" + totlaBalance);
                    this.writeXMLDocument(document);
                    return totlaBalance;
                } else {
                    throw new InsufficientBalanceException("Your have insufficient balance");
                } 

            }
        } catch (DocumentException | FileNotFoundException e) {
            LOG.info(e);
        } catch (IOException ioe) {
            LOG.info(ioe);
        }
        return 0;
    }

    @Override
    public double deposit(long accountNumber, double amount) {
        try {
            if (xmlExist()) {
                Document document = this.readXMLDocument();
                String query = "/" + Constants.EL_ACCOUNTS + "/" + Constants.EL_ACCOUNT
                        + "[@" + Constants.ATTRIB_NUMBER + "=" + accountNumber + "]";
                Element account = (Element) document.selectNodes(query).get(0);
                Element element = ((Element) account.selectNodes(Constants.EL_BALANCE).get(0));
                String ele = element.getText();
                LOG.info(ele);
                //String balanceElement = element.toString();
                double balance = Double.parseDouble(ele);
                double totlaBalance = balance + amount;
                LOG.info(totlaBalance);
                //String tB = Double.toString(totlaBalance);
                element.setText("" + totlaBalance);
                this.writeXMLDocument(document);
                return totlaBalance;
            }
        } catch (DocumentException | FileNotFoundException e) {
            LOG.info(e);
        } catch (IOException ioe) {
            LOG.info(ioe);
        }
        return 0;
    }

    @Override
    public double transfer(long accountNumberTo, long accountNumberFrom, double amount) {

        return 0;
    }

    @Override
    public void close(long accountNumber) {

    }

    @Override
    public Element findAccountElement(long accountNumber)
            throws AccountNumberNotFountException {

        try {
            Document document = this.readXMLDocument();
            String query = "/" + Constants.EL_ACCOUNTS + "/" + Constants.EL_ACCOUNT
                    + "[@" + Constants.ATTRIB_NUMBER + "=" + accountNumber + "]";
            return (Element) document.selectNodes(query).get(0);
        } catch (DocumentException t) {
            LOG.info(t);
            throw new AccountNumberNotFountException("file not found");
        }
    }

    private boolean accountExists(Document document, long accountNumber) {
        String query = "/listofaccount/account[@number = 111]";
        query = "/" + Constants.EL_ACCOUNTS + "/" + Constants.EL_ACCOUNT
                + "[@" + Constants.ATTRIB_NUMBER + "=" + accountNumber + "]";

        LOG.info("Query String Is " + query);

        return document.selectNodes(query).size() > 0;
    }

    private void createXMLIfNotExists() throws IOException {

        File xml = new File(XML_PATH);
        if (!xml.exists()) {
            Document document = DocumentHelper.createDocument();
            document.addElement(Constants.EL_ACCOUNTS);

            OutputStream os = new FileOutputStream(xml);
            XMLWriter writer = new XMLWriter(os, OutputFormat.createPrettyPrint());
            writer.write(document);
            os.close();
        }
    }

    private Document readXMLDocument() throws DocumentException {
        SAXReader reader = new SAXReader();
        return reader.read(XML_PATH);
    }

    private void writeXMLDocument(Document document) throws
            FileNotFoundException, IOException {

        OutputStream os = new FileOutputStream(XML_PATH);
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter writer = new XMLWriter(os, format);
        writer.write(document);
        os.close();

    }

    private long countAccounts(Document document) {
        String query = "/" + Constants.EL_ACCOUNTS + "/" + Constants.EL_ACCOUNT
                + "[@" + Constants.ATTRIB_NUMBER + "]";
        return 0;
    }

    private boolean xmlExist() {
        File xml = new File(XML_PATH);
        return xml.exists();
    }
    
    private void allAccounts() {
        
    }

}
