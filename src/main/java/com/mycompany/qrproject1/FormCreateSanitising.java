/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qrproject1;

import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Development team
 * 
 * JFrame to display UI for creating sanitising orders
 */
public class FormCreateSanitising extends javax.swing.JFrame {

    /**
     * Creates new form OrderCreationForm
     */
    public FormCreateSanitising() {
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

        btnSanitising = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        cbItemType = new javax.swing.JComboBox<>();
        cbItem = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dcDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(600, 300));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnSanitising.setText("Submit");
        btnSanitising.setToolTipText("Submit Subscription");
        btnSanitising.setActionCommand("");
        btnSanitising.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanitisingActionPerformed(evt);
            }
        });

        lblDate.setText("jLabel");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Sanitising Order");

        lblUser.setText("jLable1");

        cbItemType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbItemTypeItemStateChanged(evt);
            }
        });

        jLabel1.setText("Item Type:");

        jLabel3.setText("Item Name:");

        jLabel4.setText("Desired Date:");

        dcDate.setDateFormatString("dd MM yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dcDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbItemType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbItem, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSanitising)
                                        .addGap(12, 12, 12)))))
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbItemType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(dcDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnSanitising)
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ICreateData iCreateSanitising = new CreateSanitising();
    CreateDataInjector createSanitising = new CreateDataInjector(iCreateSanitising);
    
    ICreateData iCreateLog = new CreateLog();
    CreateDataInjector createLog = new CreateDataInjector(iCreateLog);
    
    //IUpdateData iUpdate = new UpdateItem();
    //UpdateDataInjector updateInjector = new UpdateDataInjector(iUpdate);
       
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    Date startDate;
        
    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    LocalDate today = LocalDate.now();

    private String itemID(){
        
        IReadData iReadData = new ReadItemID();
        ReadDataInjector readInjector = new ReadDataInjector(iReadData);
        
        String name = cbItem.getSelectedItem().toString();
        
        String itemID = readInjector.dataRead(name).getItem(0);
        
        return itemID;
        
    }
    
    private void btnSanitisingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanitisingActionPerformed
        // TODO add your handling code here:
        
        IUpdateData iUpdateData = new UpdateAvailability();
        UpdateDataInjector update = new UpdateDataInjector(iUpdateData);
        
        String availability = "2";

        Date date = dcDate.getDate();
       
        String sanitisingDate = df.format(date);
        String formattedDate = today.format(pattern); 
        
        int dataCheck = JOptionPane.showConfirmDialog(null, "Please ensure that you are inputing the correct data.\n"
                        + "Item Type =  " + cbItemType.getSelectedItem() +"\n"+ "Item Name = " + 
                    cbItem.getSelectedItem() + "\n" + "Sanitising Date = " + formattedDate
                        , "Confirm Data!", JOptionPane.YES_NO_OPTION);
            
            
        if(dataCheck == JOptionPane.YES_OPTION){

            String id = itemID();

            String availabilityData = id + "_" + availability;

            update.dataUpdate(availabilityData);


            String reservation = id + "_" + formattedDate + "_" + sanitisingDate;

            createSanitising.dataCreate(reservation);


            JOptionPane.showMessageDialog(null, "Sanitising request placed!");

            String action = "Sanitising order created";
            createLog.dataCreate(lblDate.getText() + "_" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString() + "_" 
                + action + "_" + lblUser.getText());

        }
        
    }//GEN-LAST:event_btnSanitisingActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        lblUser.setText(LoggedUser.userName);
        lblDate.setText(LocalDate.now().toString());
        
        IReadData iReadData = new ItemTypeList();
        ReadDataInjector readItemType = new ReadDataInjector(iReadData);
        
        List listItemType = readItemType.dataRead("");
        cbItemType.insertItemAt("↓", 0);

        int counter = 0;
        int listItemLength = listItemType.getItemCount();
       
        while(listItemLength > counter){
            
            cbItemType.addItem(listItemType.getItem(counter));
            counter++;
        }
                
        //LocalDate today = LocalDate.now();
        
        //DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(pattern); 
               
        try {
            
            startDate = df.parse(formattedDate);
                        
            dcDate.setDate(startDate);
            dcDate.setMinSelectableDate(startDate);

        } 
        catch (ParseException ex) {
            
            Logger.getLogger(FormCreateSanitising.class.getName()).log(Level.SEVERE, null, ex);
            
        }
               
    }//GEN-LAST:event_formWindowOpened

    private void cbItemTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbItemTypeItemStateChanged
        // TODO add your handling code here:
        
        int id = cbItemType.getSelectedIndex();
        String idData = String.valueOf(id);
        
        IReadData iReadData = new ItemNameList();
        ReadDataInjector readItemList = new ReadDataInjector(iReadData);
        
        cbItem.removeAllItems();
        
        List listItem = readItemList.dataRead(idData);
        
        int counter = 0;
        int listItemLength = listItem.getItemCount();
        
        while(listItemLength > counter){
            
            cbItem.addItem(listItem.getItem(counter));
            counter++;
        }
        
        listItem.removeAll();

    }//GEN-LAST:event_cbItemTypeItemStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
        String action = "Close create sanitising form";
        createLog.dataCreate(lblDate.getText() + "_" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString() + "_" 
                    + action + "_" + lblUser.getText());
        
        FormSanitising fS = new FormSanitising();
        fS.setVisible(true);
        
        this.dispose();
        
    }//GEN-LAST:event_formWindowClosed

        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCreateSanitising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCreateSanitising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCreateSanitising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCreateSanitising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCreateSanitising().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSanitising;
    private javax.swing.JComboBox<String> cbItem;
    private javax.swing.JComboBox<String> cbItemType;
    private com.toedter.calendar.JDateChooser dcDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
