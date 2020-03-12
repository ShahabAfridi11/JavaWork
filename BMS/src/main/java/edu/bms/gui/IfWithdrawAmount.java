/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.gui;

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
public class IfWithdrawAmount extends javax.swing.JInternalFrame {

    private static final Logger LOG = LogManager.getLogger(Bank.class);
    private static IValidator numberValidator;
    private static IAccountService accService;

    /**
     * Creates new form WithDraw
     */

    static {
        numberValidator = new NumberValidator();
        accService = new AccountService();
    }

    public IfWithdrawAmount() {
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

        jPanel1 = new javax.swing.JPanel();
        tfWTotalAmount = new javax.swing.JTextField();
        tfWWithdrawAmount = new javax.swing.JTextField();
        lblWTotalAmount = new javax.swing.JLabel();
        lblWWithdrawAmount = new javax.swing.JLabel();
        lblWAccNumber = new javax.swing.JLabel();
        tfWAccNumber = new javax.swing.JTextField();
        btnWWithdrawaSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnWWithdrawaAmount = new javax.swing.JButton();

        setClosable(true);
        setTitle("WithDraw Amount");
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

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Withdraw Amount"));

        tfWTotalAmount.setEditable(false);
        tfWTotalAmount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lblWTotalAmount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblWTotalAmount.setText("Total Amount :");

        lblWWithdrawAmount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblWWithdrawAmount.setText("Withdraw Amount :");

        lblWAccNumber.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblWAccNumber.setText("Acc Number :");

        tfWAccNumber.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tfWAccNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWAccNumberActionPerformed(evt);
            }
        });
        tfWAccNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfWAccNumberKeyTyped(evt);
            }
        });

        btnWWithdrawaSearch.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnWWithdrawaSearch.setText("Search");
        btnWWithdrawaSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWWithdrawaSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblWWithdrawAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfWWithdrawAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(tfWTotalAmount))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblWAccNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfWAccNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18)
                .addComponent(btnWWithdrawaSearch)
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWAccNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWWithdrawaSearch)
                    .addComponent(tfWAccNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfWTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfWWithdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWWithdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        btnWWithdrawaAmount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnWWithdrawaAmount.setText("Withdraw");
        btnWWithdrawaAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWWithdrawaAmountActionPerformed(evt);
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
                .addGap(214, 214, 214)
                .addComponent(btnWWithdrawaAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWWithdrawaAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
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

    private void btnWWithdrawaAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWWithdrawaAmountActionPerformed
        // TODO add your handling code here:
        boolean validatedSuccessfully = true;

        LOG.info(this.lblWTotalAmount.getText() + " " + this.tfWTotalAmount.getText());
        LOG.info(this.lblWWithdrawAmount.getText() + " " + this.tfWWithdrawAmount.getText());

        try {
            this.numberValidator.validateInitialDeposit(
                    this.tfWWithdrawAmount.getText());
        } catch (Throwable t) {
            validatedSuccessfully = false;
            JOptionPane.showMessageDialog(null, "Withdraw Amount must be a valid number ",
                    "Wrong Entry", JOptionPane.OK_OPTION);
        }

        try {
            if (validatedSuccessfully) {
                double amount = this.accService.withdraw(
                        Long.parseLong(this.tfWAccNumber.getText()),
                        Double.parseDouble(this.tfWWithdrawAmount.getText()));
                this.tfWTotalAmount.setText("" + amount);
                JOptionPane.showMessageDialog(null, "Withdraw SUCCESSFULLY ",
                        "Successfull", JOptionPane.OK_OPTION);
                this.tfWAccNumber.setText("");
                this.tfWTotalAmount.setText("");
                this.tfWWithdrawAmount.setText("");
            }
        }catch (Throwable t) {
            
        }

    }//GEN-LAST:event_btnWWithdrawaAmountActionPerformed

    private void tfWAccNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWAccNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWAccNumberActionPerformed

    private void tfWAccNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWAccNumberKeyTyped
        // TODO add your handling code here:
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_tfWAccNumberKeyTyped

    private void btnWWithdrawaSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWWithdrawaSearchActionPerformed
        // TODO add your handling code here:
        try {
            this.numberValidator.validateAccountNumber(this.tfWAccNumber.getText());
        } catch (InvalidNumberException ine) {
            this.jLabel1.setText("Input is Invalid");
            this.jLabel1.setForeground(Color.red);
        }

        try {
            Element account = this.accService.findAccountElement(
                    Long.parseLong(this.tfWAccNumber.getText()));
            this.tfWTotalAmount.setText(((Element) account.selectNodes(
                    Constants.EL_BALANCE).get(0)).getText());
        } catch (Throwable t) {

        }

    }//GEN-LAST:event_btnWWithdrawaSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnWWithdrawaAmount;
    private javax.swing.JButton btnWWithdrawaSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblWAccNumber;
    private javax.swing.JLabel lblWTotalAmount;
    private javax.swing.JLabel lblWWithdrawAmount;
    private javax.swing.JTextField tfWAccNumber;
    private javax.swing.JTextField tfWTotalAmount;
    private javax.swing.JTextField tfWWithdrawAmount;
    // End of variables declaration//GEN-END:variables
}
