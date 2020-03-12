/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.gui;

import edu.bms.ex.AccountNumberNotFountException;
import edu.bms.ex.InvalidNumberException;
import edu.bms.gui.validators.IValidator;
import edu.bms.gui.validators.NumberValidator;
import edu.bms.service.IAccountService;
import edu.bms.service.impl.AccountService;
import edu.bms.util.Constants;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Element;

/**
 *
 * @author Shahab Afridi
 */
public class IfUpdateAccount extends javax.swing.JInternalFrame {

    private static final Logger LOG;
    private static IValidator numberValidator;
    private static IAccountService accountService;

    /**
     * Creates new form UpdateAccount
     */
    static {
        LOG = LogManager.getLogger(Bank.class);
        numberValidator = new NumberValidator();
        accountService = new AccountService();
    }

    public IfUpdateAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpAccountType = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblUAccountNo = new javax.swing.JLabel();
        tfUAccountNo = new javax.swing.JTextField();
        btnUAccountSearch = new javax.swing.JButton();
        lblUInvalidResult = new javax.swing.JLabel();
        lblUAccountHolderName = new javax.swing.JLabel();
        tfUAccountHolderName = new javax.swing.JTextField();
        lblUContactNumber = new javax.swing.JLabel();
        tfUContactNumber = new javax.swing.JTextField();
        lblUAccountType = new javax.swing.JLabel();
        rbUAccountTypeCurrent = new javax.swing.JRadioButton();
        rbUAccountTypeSaving = new javax.swing.JRadioButton();
        btnUAccountUpdate = new javax.swing.JButton();

        setClosable(true);
        setTitle("Update Account");
        setMinimumSize(new java.awt.Dimension(106, 25));
        setNormalBounds(new java.awt.Rectangle(0, 0, 106, 0));
        setPreferredSize(new java.awt.Dimension(541, 420));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        lblUAccountNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUAccountNo.setText("Account Number :");

        tfUAccountNo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tfUAccountNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUAccountNoKeyTyped(evt);
            }
        });

        btnUAccountSearch.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUAccountSearch.setText("Search");
        btnUAccountSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUAccountSearchActionPerformed(evt);
            }
        });

        lblUInvalidResult.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lblUAccountHolderName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUAccountHolderName.setText("Account Holder Name :");

        tfUAccountHolderName.setEditable(false);
        tfUAccountHolderName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lblUContactNumber.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUContactNumber.setText("Contact Number  :");

        tfUContactNumber.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lblUAccountType.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblUAccountType.setText("Account Type :");

        btnGrpAccountType.add(rbUAccountTypeCurrent);
        rbUAccountTypeCurrent.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbUAccountTypeCurrent.setText("Current");

        btnGrpAccountType.add(rbUAccountTypeSaving);
        rbUAccountTypeSaving.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbUAccountTypeSaving.setText("Saving");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUInvalidResult, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUAccountHolderName)
                                    .addComponent(lblUContactNumber)
                                    .addComponent(lblUAccountType))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfUContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfUAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbUAccountTypeCurrent)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbUAccountTypeSaving)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUAccountNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfUAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUAccountSearch)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUAccountSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUInvalidResult, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfUContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbUAccountTypeSaving)
                    .addComponent(rbUAccountTypeCurrent))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        btnUAccountUpdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnUAccountUpdate.setText("Update");
        btnUAccountUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUAccountUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(btnUAccountUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUAccountUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        int selection = JOptionPane.showConfirmDialog(null, "Are You Sure ?", "Warning", JOptionPane.YES_NO_OPTION);
        if (selection == JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnUAccountUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUAccountUpdateActionPerformed
        // TODO add your handling code here:
        LOG.info(lblUAccountNo.getText() + " " + tfUAccountNo.getText());
        LOG.info(lblUInvalidResult.getText());
        LOG.info(lblUAccountHolderName.getText() + " " + tfUAccountHolderName.getText());
        LOG.info(lblUContactNumber.getText() + " " + tfUContactNumber.getText());

//        LOG.info(this.rbUAccountTypeCurrent.isSelected());
//        LOG.info(this.rbUAccountTypeCurrent.getText());
//        LOG.info(lblUContactNumber.getText() + " " + tfUContactNumber.getText());
//        LOG.info(lblUContactNumber.getText() + " " + tfUContactNumber.getText());
//        LOG.info("action command {}", this.btnGrpAccountType.getSelection().getActionCommand());
//        LOG.info(this.btnGrpAccountType.getSelection().getSelectedObjects()[0].getClass());
//        if (rbUAccountTypeCurrent.isSelected() == true) {
//            LOG.info(lblUAccountType.getText() + " " + rbUAccountTypeCurrent.getText());
//        } else {
//            LOG.info(lblUAccountType.getText() + " " + rbUAccountTypeSaving.getText());
//        }
        /**
         * the below block of code is used to call the update phone number of
         * account Service class the update the phone number of the already
         * registered client
         */
        this.accountService.updatePhoneNumber(Long.parseLong(
                this.tfUAccountNo.getText()),
                this.tfUContactNumber.getText());

        JOptionPane.showMessageDialog(null, "Record is updated successfully", "SuccessFull", JOptionPane.OK_OPTION);
        this.tfUAccountNo.setText("");
        this.tfUAccountHolderName.setText("");
        this.tfUContactNumber.setText("");

        LOG.info(this.rbUAccountTypeCurrent.isSelected());

        if (this.rbUAccountTypeCurrent.isSelected()) {
            this.rbUAccountTypeCurrent.setSelected(false);
        } else {
            this.rbUAccountTypeSaving.setSelected(false);
        }


    }//GEN-LAST:event_btnUAccountUpdateActionPerformed

    private void btnUAccountSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUAccountSearchActionPerformed
        // TODO add your handling code here:

        /**
         * the below try and Catch try to apply Validation on Account Number
         * Text Field that Account Number text field Must have a Numeric value
         * if it have not the catch block will throw an Exception which is
         * Invalid Number Exception
         */
        try {
            this.numberValidator.validateAccountNumber(this.tfUAccountNo.getText());
        } catch (InvalidNumberException ine) {
            this.lblUInvalidResult.setText("Input is Invalid");
            this.lblUInvalidResult.setForeground(Color.red);
        }

        /**
         * the below block of code is to find an account number that is entered
         * in the account number text field that wether the number exist in the
         * XML file or not
         */
        try {
            Element account = this.accountService.findAccountElement(Long.parseLong(
                    this.tfUAccountNo.getText()));
            this.tfUAccountHolderName.setText(((Element) account.selectNodes(
                    Constants.EL_ACCOUNT_HOLDER).get(0)).getText());
            this.tfUContactNumber.setText(((Element) account.selectNodes(
                    Constants.EL_PHONE_NUMBER).get(0)).getText());
            String accountType = (((Element) account.selectNodes(Constants.EL_TYPE).
                    get(0)).getText());

            if (this.rbUAccountTypeCurrent.getText().equals(accountType)) {
                this.rbUAccountTypeCurrent.setSelected(true);
            } else {
                this.rbUAccountTypeSaving.setSelected(true);

            }
        } catch (AccountNumberNotFountException annfe) {

        }

//        if (this.tfUAccountNo.getText().trim().equals("")) {
//            this.lblUInvalidResult.setText("Invalid Account Number");
//            LOG.info(this.lblUInvalidResult.getText());
//            this.lblUInvalidResult.setForeground(Color.RED);
//        } else {
//            this.lblUInvalidResult.setText("Correct Account number");
//            LOG.info(this.lblUInvalidResult.getText());
//            this.lblUInvalidResult.setForeground(Color.BLUE);
//        }

    }//GEN-LAST:event_btnUAccountSearchActionPerformed

    private void tfUAccountNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUAccountNoKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_tfUAccountNoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpAccountType;
    private javax.swing.JButton btnUAccountSearch;
    private javax.swing.JButton btnUAccountUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUAccountHolderName;
    private javax.swing.JLabel lblUAccountNo;
    private javax.swing.JLabel lblUAccountType;
    private javax.swing.JLabel lblUContactNumber;
    private javax.swing.JLabel lblUInvalidResult;
    private javax.swing.JRadioButton rbUAccountTypeCurrent;
    private javax.swing.JRadioButton rbUAccountTypeSaving;
    private javax.swing.JTextField tfUAccountHolderName;
    private javax.swing.JTextField tfUAccountNo;
    private javax.swing.JTextField tfUContactNumber;
    // End of variables declaration//GEN-END:variables
}