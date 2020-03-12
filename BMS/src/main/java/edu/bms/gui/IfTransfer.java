/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bms.gui;

import edu.bms.util.Constants;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.Element;

/**
 *
 * @author Shahab Afridi
 */
public class IfTransfer extends javax.swing.JInternalFrame {
    
    private static final Logger LOG = LogManager.getLogger(Bank.class);

    /**
     * Creates new form IfTransfer
     */
    public IfTransfer() {
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

        PanalTransfer = new javax.swing.JPanel();
        cbTFromAccount = new javax.swing.JComboBox<>();
        cbTToAccount = new javax.swing.JComboBox<>();
        lblTTo = new javax.swing.JLabel();
        lblTFrom = new javax.swing.JLabel();
        lblTAmount = new javax.swing.JLabel();
        tftransferAmount = new javax.swing.JTextField();
        btnTransfer = new javax.swing.JButton();

        setClosable(true);
        setTitle("Transfer Amount");
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

        PanalTransfer.setBackground(new java.awt.Color(153, 204, 255));

        cbTFromAccount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbTFromAccount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Account Number", " " }));
        cbTFromAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTFromAccountActionPerformed(evt);
            }
        });

        cbTToAccount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cbTToAccount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Account Number" }));

        lblTTo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTTo.setText("From :");

        lblTFrom.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTFrom.setText("To :");

        lblTAmount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTAmount.setText("Amount :");

        tftransferAmount.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout PanalTransferLayout = new javax.swing.GroupLayout(PanalTransfer);
        PanalTransfer.setLayout(PanalTransferLayout);
        PanalTransferLayout.setHorizontalGroup(
            PanalTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanalTransferLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(PanalTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTAmount)
                    .addComponent(lblTTo)
                    .addComponent(lblTFrom))
                .addGap(69, 69, 69)
                .addGroup(PanalTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanalTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbTToAccount, 0, 185, Short.MAX_VALUE)
                        .addComponent(cbTFromAccount, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tftransferAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        PanalTransferLayout.setVerticalGroup(
            PanalTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanalTransferLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanalTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTFromAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTTo))
                .addGap(18, 18, 18)
                .addGroup(PanalTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTToAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTFrom))
                .addGap(18, 18, 18)
                .addGroup(PanalTransferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tftransferAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnTransfer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTransfer.setText("Transfer");
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanalTransfer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanalTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        int selection = JOptionPane.showConfirmDialog(null, "Are You Sure ?", 
                "Warning", JOptionPane.YES_NO_OPTION);
        if (selection == JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        // TODO add your handling code here:
        LOG.info(lblTFrom.getText()+" "+cbTFromAccount.getSelectedItem().toString());
        LOG.info(lblTTo.getText()+" "+cbTToAccount.getSelectedItem().toString());
        LOG.info(lblTAmount+" "+tftransferAmount);
    }//GEN-LAST:event_btnTransferActionPerformed

    private void cbTFromAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTFromAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTFromAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanalTransfer;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JComboBox<String> cbTFromAccount;
    private javax.swing.JComboBox<String> cbTToAccount;
    private javax.swing.JLabel lblTAmount;
    private javax.swing.JLabel lblTFrom;
    private javax.swing.JLabel lblTTo;
    private javax.swing.JTextField tftransferAmount;
    // End of variables declaration//GEN-END:variables
}