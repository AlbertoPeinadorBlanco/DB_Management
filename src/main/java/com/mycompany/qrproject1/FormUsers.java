/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.qrproject1;

import java.awt.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Development team
 * 
 * JFrame to display UI for reading and manipulating users
 */
public class FormUsers extends javax.swing.JFrame {

    /**
     * Creates new form Practise
     */
    public FormUsers() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbUser = new javax.swing.JTable();
        btnDeleteUser = new javax.swing.JButton();
        btnUpdateUser = new javax.swing.JButton();
        btnCreateUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 200));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Password", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbUser);

        btnDeleteUser.setText("Delete");
        btnDeleteUser.setToolTipText("Delete User");
        btnDeleteUser.setPreferredSize(new java.awt.Dimension(69, 22));
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnUpdateUser.setText("Update");
        btnUpdateUser.setToolTipText("Update User");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        btnCreateUser.setText("Create");
        btnCreateUser.setToolTipText("Create User");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Users");

        lblDate.setText("jLabel2");

        lblUser.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdateUser, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(btnCreateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1)))
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDate)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(lblUser))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54)
                        .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnUpdateUser)
                        .addGap(58, 58, 58)
                        .addComponent(btnCreateUser))
                    .addComponent(jScrollPane1))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    IReadData iReadData =  new ReadData();
    ReadDataInjector dataInjector = new ReadDataInjector(iReadData);
     
    ICreateData iCreateLog = new CreateLog();
    CreateDataInjector createLog = new CreateDataInjector(iCreateLog);
    
    IDeleteData iDeleteUser = new DeleteData();
    DeleteDataInjector deleteUser = new DeleteDataInjector(iDeleteUser);

    //this function loops through the users in the DB and displays them into a table control, each piece of data in its corresponding cell
    private void readUser(){
              
        List listUser = dataInjector.dataRead(lblUser.getText());
        
        int listCounter = listUser.getItemCount();
        int row = 0;
        int column = 0;
        
        for(int i = 0; i <= listCounter; i++){
              
            String item = listUser.getItem(row);

            String[] cutList = item.split("_");
            
            for (int j = 0; j < cutList.length; j++) {
                
                tbUser.setValueAt(cutList[j], row, j);
                
                column++;
                
                if(column ==4){
                    
                    row++;
                    column = 0;
                    
                }
            }
                           
        }  
        
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        lblDate.setText(LocalDate.now().toString());
        lblUser.setText(LoggedUser.userName);
        
        readUser();
               
    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tableModel = (DefaultTableModel) tbUser.getModel();

        int selectedRow = tbUser.getSelectedRow();
                            
        if(selectedRow == -1){
            
            JOptionPane.showMessageDialog(null, "Please select a value to delete!");

        }
        else{
                       
            if(StaticData.isAdmin == true){
            
                JOptionPane.showMessageDialog(null, "You cannot delete an admin!");
            
            }
            else{
            
                                      
                int dataCheck = JOptionPane.showConfirmDialog(null, "Please ensure that you are deleting the correct data.\n",
                       "Please confirm!"  ,JOptionPane.YES_NO_OPTION);

                if(dataCheck == JOptionPane.YES_OPTION){

                    String selectedValue = tbUser.getValueAt(selectedRow, 0).toString();

                    deleteUser.dataDelete(selectedValue);


                    String action = "User deleted";
                    createLog.dataCreate(lblDate.getText() + "_" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString() + "_" 
                            + action + "_" + lblUser.getText());

                    tableModel.removeRow(selectedRow);

                    JOptionPane.showMessageDialog(null, "User deleted!");

                }          
         
            }
            
        }

    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        // TODO add your handling code here:
              
        int selectedRow = tbUser.getSelectedRow();

        if(selectedRow == -1){
            
            JOptionPane.showMessageDialog(null, "Please select a value to update from the table!");
            
        }
        else{
            
            StaticData.id = tbUser.getValueAt(selectedRow, 0).toString();
            StaticData.name = tbUser.getValueAt(selectedRow, 1).toString();
                        
            String action = "Open user update form";
            createLog.dataCreate(lblDate.getText() + "_" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString() + "_" 
                        + action + "_" + lblUser.getText());
            
            FormUpdateUser fUU = new FormUpdateUser();
            fUU.setVisible(true);
            
            this.dispose();
     
        }
                
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        
        DefaultTableModel tableModel = (DefaultTableModel) tbUser.getModel();

        tableModel.fireTableDataChanged();
        
    }//GEN-LAST:event_formFocusGained

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        // TODO add your handling code here:
        
        String action = "Open create user form";
        createLog.dataCreate(lblDate.getText() + "_" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString() + "_" 
                    + action + "_" + lblUser.getText());
        
        FormCreateUser fCU = new FormCreateUser();
               
        fCU.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
        String action = "Close users form";
        createLog.dataCreate(lblDate.getText() + "_" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString() + "_" 
                    + action + "_" + lblUser.getText());
        
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
            java.util.logging.Logger.getLogger(FormUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tbUser;
    // End of variables declaration//GEN-END:variables
}
