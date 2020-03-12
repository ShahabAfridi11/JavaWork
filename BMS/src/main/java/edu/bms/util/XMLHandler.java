/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.DOMReader;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.xml.sax.SAXException;

/**
 *
 * @author Shahab Afridi
 */
public class XMLHandler {

    private static Logger log = LogManager.getLogger(XMLHandler.class);
    private static final String XML_PATH = "G:\\workspace\\netbeans\\accounts.xml";
    private static final String XML_OUT1 = "G:\\workspace\\netbeans\\account1.xml";
    private static final String XML_OUT2 = "G:\\workspace\\netbeans\\account2.xml";


    public XMLHandler() {
    }

    /*public Account findAccountByNumber(String accountNumber) {
        Account account = null;
        return account;
    }*/
    public void testReadOp() {
        try {
            DOMReader reader = new DOMReader();
            InputStream streamToXml = new FileInputStream(XML_PATH);

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = reader.read(builder.parse(streamToXml));

            /*List<Node> nodes = document.selectNodes("/accounts/account");
            for(Node node : nodes) {
                Element element = (Element)node;
                Iterator<Element> iterator = element.elementIterator();
                while(iterator.hasNext()) {
                    Element next = iterator.next();
                    log.info(next.getName() + " = " + next.getText());
                }
            }*/
            //log.info("total nodes are " + nodes.size());
            //log.info(document);
            //XMLWriter writer = new XMLWriter(System.out);
            //XMLWriter writer = new XMLWriter(new FileOutputStream(XML_OUT2),
            //        OutputFormat.createPrettyPrint());
            //writer.write(document);
        } catch (ParserConfigurationException | SAXException ex) {
            log.error("error while parsing xml", ex);
        } catch (FileNotFoundException fnfe) {
            log.error("file not found", fnfe);
        } catch (IOException ioe) {
            log.error("unable to read file", ioe);
        }
    }

    public void testWriteOp() {
        Document document = DocumentHelper.createDocument();
        Element root = document.addElement("universty").
                addAttribute("name", "agriculture universty");
        Element departments = root.addElement("departments");
        
        Element dep = departments.addElement("department");
        dep.addAttribute("code", "C0987");
        dep.addElement("name").setText("CS");
        dep.addElement("shehzadaStudent").setText("Shahid");

        try {
            XMLWriter writer = new XMLWriter(new FileOutputStream(XML_OUT1),
                    OutputFormat.createPrettyPrint());
            writer.write(document);
        } catch (IOException ex) {
            log.error("error while Writting xml ",ex);
        }
    }

    public static void main(String[] args) {
        XMLHandler xml = new XMLHandler();
        xml.testReadOp();
        xml.testWriteOp();
    }

}
