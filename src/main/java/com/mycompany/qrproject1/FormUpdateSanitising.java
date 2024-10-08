/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.mycompany.qrproject1;

//import com.jcalendar.pane.calendar.CalendarSelectionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Development team
 * 
 * JFrame to display UI for updating sanitising orders
 */
public class FormUpdateSanitising extends javax.swing.JFrame {

    /** Creates new form UserUpdateForm */
    public FormUpdateSanitising() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdateSanitising = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        dcDateIn = new com.toedter.calendar.JDateChooser();
        dcDateOut = new com.toedter.calendar.JDateChooser();
        lblDateIn = new javax.swing.JLabel();
        lblDateOut = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        btnUpdateSanitising.setText("Update");
        btnUpdateSanitising.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSanitisingActionPerformed(evt);
            }
        });

        lblDate.setText("jLabel1");

        lblUser.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Update Sanitising Order");

        jLabel1.setText("Order ID:");

        jLabel2.setText("Date In:");

        jLabel4.setText("Date Out:");

        lblID.setText("jLabel5");

        dcDateIn.setDateFormatString("dd MM yyyy");

        dcDateOut.setDateFormatString("dd MM yyyy");

        lblDateIn.setText("jLabel5");

        lblDateOut.setText("jLabel5");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Current Dates");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcDateOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcDateIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdateSanitising, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblID)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDateOut)
                                    .addComponent(lblDateIn))))
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(lblUser))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblID, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcDateIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(dcDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDateIn)
                        .addGap(24, 24, 24)
                        .addComponent(lblDateOut)))
                .addGap(45, 45, 45)
                .addComponent(btnUpdateSanitising)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ICreateData iCreateLog = new CreateLog();
    CreateDataInjector createLog = new CreateDataInjector(iCreateLog);
    
    IUpdateData iUpdateData = new UpdateSanitising();
    UpdateDataInjector updateData = new UpdateDataInjector(iUpdateData);
    
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    Date startDate;
    Date endDate;
        
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
              
        lblDate.setText(LocalDate.now().toString());
        lblUser.setText(LoggedUser.userName);
        
        lblID.setText(StaticData.id);
               
        dcDateIn.getDate();
        lblDateIn.setText(StaticData.reservedDate);
        lblDateOut.setText(StaticData.desiredDate);
               
        String dateIn = lblDateIn.getText();
        String dateOut = lblDateOut.getText();
        
        try {
            
            startDate = df.parse(dateIn);
            endDate = df.parse(dateOut);
            
            dcDateIn.setDate(startDate);
            dcDateOut.setDate(endDate);
            dcDateOut.setMinSelectableDate(startDate);

        } 
        catch (ParseException ex) {
            
            Logger.getLogger(FormUpdateSanitising.class.getName()).log(Level.SEVERE, null, ex);
            
        }
       
    }//GEN-LAST:event_formWindowOpened

    private void btnUpdateSanitisingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSanitisingActionPerformed
        // TODO add your handling code here:
                       
        Date date = dcDateIn.getDate();
        Date date2 = dcDateOut.getDate();
              
        if(date != null && date2 != null){
             
            String dateOne = df.format(date);
            String dateTwo = df.format(date2);
            
            String data = lblID.getText() + "_" + dateOne + "_" + dateTwo;
            updateData.dataUpdate(data);
            
            String action = "Sanitising order update";
            createLog.dataCreate(lblDate.getText() + "_" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString() + "_" 
                    + action + "_" + lblUser.getText());

            JOptionPane.showMessageDialog(null, "Item updated!");
            
        }   
        else{
             
            JOptionPane.showMessageDialog(null, "Please input valid values into date fields!");
            
        }
               
    }//GEN-LAST:event_btnUpdateSanitisingActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
        String action = "Close sanitising update";
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
            java.util.logging.Logger.getLogger(FormUpdateSanitising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUpdateSanitising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUpdateSanitising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUpdateSanitising.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUpdateSanitising().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateSanitising;
    private com.toedter.calendar.JDateChooser dcDateIn;
    private com.toedter.calendar.JDateChooser dcDateOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateIn;
    private javax.swing.JLabel lblDateOut;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables

}
