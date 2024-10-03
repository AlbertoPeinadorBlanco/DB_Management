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
 * JFrame to display UI for reading and manipulating items
 */
public class FormItems extends javax.swing.JFrame {

    /**
     * Creates new form Practise
     */
    public FormItems() {
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
        tbItems = new javax.swing.JTable();
        btnDeleteItem = new javax.swing.JButton();
        btnUpdateItem = new javax.swing.JButton();
        btnCreateItem = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        cbItems = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnDisplay = new javax.swing.JButton();

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

        tbItems.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "name", "type_id", "availability_id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbItems);

        btnDeleteItem.setText("Delete");
        btnDeleteItem.setToolTipText("Delete Item");
        btnDeleteItem.setPreferredSize(new java.awt.Dimension(69, 22));
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        btnUpdateItem.setText("Update");
        btnUpdateItem.setToolTipText("Update Item");
        btnUpdateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateItemActionPerformed(evt);
            }
        });

        btnCreateItem.setText("Create");
        btnCreateItem.setToolTipText("Create Item");
        btnCreateItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateItemActionPerformed(evt);
            }
        });

        lblDate.setText("jLabel1");

        lblUser.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Items");

        jLabel1.setText("Write the Item Name:");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        cbItems.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));
        cbItems.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbItemsItemStateChanged(evt);
            }
        });

        jLabel2.setText("Filter by Category:");

        btnDisplay.setText("Display All Items");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

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
                                    .addComponent(btnUpdateItem, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(btnCreateItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDeleteItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel3)))
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDate)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(94, Short.MAX_VALUE))
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
                        .addComponent(jLabel3)
                        .addGap(54, 54, 54)
                        .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnUpdateItem)
                        .addGap(58, 58, 58)
                        .addComponent(btnCreateItem))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnDisplay))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    IReadData iReadItems = new ReadItems();
    ReadDataInjector readItems = new ReadDataInjector(iReadItems);

    ICreateData iCreateLog = new CreateLog();
    CreateDataInjector createLog = new CreateDataInjector(iCreateLog);
    
    List listItems = readItems.dataRead("");
    
    /*this function loops through the items in the DB and displays them into a table control, 
    each piece of data in its corresponding cell*/ 
    private void readItemsAdmin(){      

        //List listItems = readItems.dataRead("");           
        int listCounter = listItems.getItemCount();
        
        int row = 0;
        int column = 0;
        
        for(int i = 0; i <= listCounter; i++){
              
            String item = listItems.getItem(row);
            
            String[] cutList = item.split("_");

            for (int j = 0; j < cutList.length; j++) {
                
                tbItems.setValueAt(cutList[j], row, j);
                
                column++;
                
                if(column ==4){
                    row++;
                    column = 0;
                }
            }
                
        }  

    }
    
    private int countItems(){
        
        //List listItems = readItems.dataRead("");
                
        int listCounter = listItems.getItemCount();
        
        return listCounter;
        
    }
        
    
  
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        lblDate.setText(LocalDate.now().toString());
        lblUser.setText(LoggedUser.userName);
          
        
        IReadData iItemType = new ItemList();
        ReadDataInjector readItemTypes = new ReadDataInjector(iItemType);

       
        List listItems = readItemTypes.dataRead("");
        int counter = 0;
        int listItemsLength = listItems.getItemCount();
               
        while(listItemsLength > counter){
            
            cbItems.addItem(listItems.getItem(counter));
            counter++;
            
        }
        
        cbItems.addItem("All Items");
        readItemsAdmin();
               
    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tableModel = (DefaultTableModel) tbItems.getModel();
       
        int selectedRow = tbItems.getSelectedRow();
                        
        if(selectedRow == -1){
            
            JOptionPane.showMessageDialog(null, "Please select a value to delete!");

        }  
        else{

            int dataCheck = JOptionPane.showConfirmDialog(null, "Please ensure that you are deleting the correct data.\n",
                "Please confirm!"  ,JOptionPane.YES_NO_OPTION);
              
            if(dataCheck == JOptionPane.YES_OPTION){

                IDeleteData iDeleteItem = new DeleteItem();
                DeleteDataInjector deleteItem = new DeleteDataInjector(iDeleteItem);
                
                String selectedValue = tbItems.getValueAt(selectedRow, 0).toString();
                deleteItem.dataDelete(selectedValue);

                String action = "Item deleted";
                createLog.dataCreate(lblDate.getText() + "_" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString() + "_" 
                        + action + "_" + lblUser.getText());

                tableModel.removeRow(selectedRow);

            }

        }

    }//GEN-LAST:event_btnDeleteItemActionPerformed

    private void btnUpdateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateItemActionPerformed
        // TODO add your handling code here:
               
       int selectedRow = tbItems.getSelectedRow();
        
       if(selectedRow != -1){
                     
           String id = tbItems.getValueAt(tbItems.getSelectedRow(), 0).toString();
           String name = tbItems.getValueAt(tbItems.getSelectedRow(), 1).toString();
           
           StaticData.id = id;
           StaticData.name = name;
           
           String action = "Access update item form";
           createLog.dataCreate(lblDate.getText() + "_" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString() + "_" 
                    + action + "_" + lblUser.getText());
            
           FormUpdateItem fUI = new FormUpdateItem();
           
           fUI.setVisible(true);
       
           this.dispose();
           
       }
       else{
            
           JOptionPane.showMessageDialog(null, "Please select an item to update!");

       }
                  
    }//GEN-LAST:event_btnUpdateItemActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
        
        DefaultTableModel tableModel = (DefaultTableModel) tbItems.getModel();

        tableModel.fireTableDataChanged();
        
    }//GEN-LAST:event_formFocusGained

    private void btnCreateItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateItemActionPerformed
        // TODO add your handling code here:
             
        String action = "access create item form";
        createLog.dataCreate(lblDate.getText() + "_" + LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString() + "_" 
                    + action + "_" + lblUser.getText());
        
        FormCreateItem fCI = new FormCreateItem();
             
        fCI.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnCreateItemActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        //cbItems.setSelectedIndex(11);
        
        DefaultTableModel tableModel = (DefaultTableModel) tbItems.getModel();

        String item = txtSearch.getText().toLowerCase();
        
        IReadData iRead = new SearchItems();
        ReadDataInjector readInjector = new ReadDataInjector(iRead);
        int counter = readInjector.dataRead(item).getItemCount();
        
        if(counter != 0){
        
            tableModel.setNumRows(0);
            
            List listItems2 = readInjector.dataRead(item);
                
            //int listCounter2 = listItems2.getItemCount();
            tableModel.setNumRows(counter);

            int row = 0;
            int column = 0;

            for(int i = 0; i <= counter; i++){

                String items = listItems2.getItem(row);

                String[] cutList = items.split("_");

                for (int j = 0; j < cutList.length; j++) {

                    tbItems.setValueAt(cutList[j], row, j);

                    column++;

                    if(column == 4){
                        row++;
                        column = 0;
                    }
                    
                }
                          
            }  
                    
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbItemsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbItemsItemStateChanged
        // TODO add your handling code here:
        
        String item = cbItems.getSelectedItem().toString();
        
        DefaultTableModel tableModel = (DefaultTableModel) tbItems.getModel();
        tableModel.setNumRows(0);

        IReadData iRead = new SearchByType();
        ReadDataInjector readInjector = new ReadDataInjector(iRead);
        
        List listItems;
        int listCounter;

        if("All Items".equals(item)){
            
            tableModel.setNumRows(countItems());
        
            readItemsAdmin();
            
        }       
        if("laptop".equals(item)){

            listItems = readInjector.dataRead("1");
            listCounter = listItems.getItemCount();
            tableModel.setNumRows(listCounter);

            int row = 0;
            int column = 0;

            for(int i = 0; i <= listCounter; i++){

                String items = listItems.getItem(row);

                String[] cutList = items.split("_");

                for (int j = 0; j < cutList.length; j++) {

                    tbItems.setValueAt(cutList[j], row, j);

                    column++;

                    if(column == 4){
                        row++;
                        column = 0;
                    }

                }

            }  

        }
        if("tablet".equals(item)){

            listItems = readInjector.dataRead("2");
            listCounter = listItems.getItemCount();
            tableModel.setNumRows(listCounter);

            int row = 0;
            int column = 0;

            for(int i = 0; i <= listCounter; i++){

                String items = listItems.getItem(row);

                String[] cutList = items.split("_");

                for (int j = 0; j < cutList.length; j++) {

                    tbItems.setValueAt(cutList[j], row, j);

                    column++;

                    if(column == 4){
                        row++;
                        column = 0;
                    }

                }

            } 

        }
        if("mouse".equals(item)){

            listItems = readInjector.dataRead("3");
            
            listCounter = listItems.getItemCount();
            tableModel.setNumRows(listCounter);

            int row = 0;
            int column = 0;

            for(int i = 0; i <= listCounter; i++){

                String items = listItems.getItem(row);

                String[] cutList = items.split("_");

                for (int j = 0; j < cutList.length; j++) {

                    tbItems.setValueAt(cutList[j], row, j);

                    column++;

                    if(column == 4){
                        row++;
                        column = 0;
                    }

                }

            } 

        }
        if("keyboard".equals(item)){

            listItems = readInjector.dataRead("4");
            
            listCounter = listItems.getItemCount();
            tableModel.setNumRows(listCounter);

            int row = 0;
            int column = 0;

            for(int i = 0; i <= listCounter; i++){

                String items = listItems.getItem(row);

                String[] cutList = items.split("_");

                for (int j = 0; j < cutList.length; j++) {

                    tbItems.setValueAt(cutList[j], row, j);

                    column++;

                    if(column == 4){
                        row++;
                        column = 0;
                    }

                }

            } 

        }
        if("screen".equals(item)){

            listItems = readInjector.dataRead("5");
            
            listCounter = listItems.getItemCount();
            tableModel.setNumRows(listCounter);

            int row = 0;
            int column = 0;

            for(int i = 0; i <= listCounter; i++){

                String items = listItems.getItem(row);

                String[] cutList = items.split("_");

                for (int j = 0; j < cutList.length; j++) {

                    tbItems.setValueAt(cutList[j], row, j);

                    column++;

                    if(column == 4){
                        row++;
                        column = 0;
                    }

                }

            } 

        }
        if("gamepad".equals(item)){

            listItems = readInjector.dataRead("6");
            
            listCounter = listItems.getItemCount();
            tableModel.setNumRows(listCounter);

            int row = 0;
            int column = 0;

            for(int i = 0; i <= listCounter; i++){

                String items = listItems.getItem(row);

                String[] cutList = items.split("_");

                for (int j = 0; j < cutList.length; j++) {

                    tbItems.setValueAt(cutList[j], row, j);

                    column++;

                    if(column == 4){
                        row++;
                        column = 0;
                    }

                }

            } 

        }
        if("headset".equals(item)){

            listItems = readInjector.dataRead("7");
            
            listCounter = listItems.getItemCount();
            tableModel.setNumRows(listCounter);

            int row = 0;
            int column = 0;

            for(int i = 0; i <= listCounter; i++){

                String items = listItems.getItem(row);

                String[] cutList = items.split("_");

                for (int j = 0; j < cutList.length; j++) {

                    tbItems.setValueAt(cutList[j], row, j);

                    column++;

                    if(column == 4){
                        row++;
                        column = 0;
                    }

                }

            } 

        }
        if("vrdevice".equals(item)){

            listItems = readInjector.dataRead("8");
            
            listCounter = listItems.getItemCount();
            tableModel.setNumRows(listCounter);

            int row = 0;
            int column = 0;

            for(int i = 0; i <= listCounter; i++){

                String items = listItems.getItem(row);

                String[] cutList = items.split("_");

                for (int j = 0; j < cutList.length; j++) {

                    tbItems.setValueAt(cutList[j], row, j);

                    column++;

                    if(column == 4){
                        row++;
                        column = 0;
                    }

                }

            } 

        }
        if("speakers".equals(item)){

            listItems = readInjector.dataRead("9");
            
            listCounter = listItems.getItemCount();
            tableModel.setNumRows(listCounter);

            int row = 0;
            int column = 0;

            for(int i = 0; i <= listCounter; i++){

                String items = listItems.getItem(row);

                String[] cutList = items.split("_");

                for (int j = 0; j < cutList.length; j++) {

                    tbItems.setValueAt(cutList[j], row, j);

                    column++;

                    if(column == 4){
                        row++;
                        column = 0;
                    }

                }

            } 

        }
        if("microphone".equals(item)){

            listItems = readInjector.dataRead("10");
            
            listCounter = listItems.getItemCount();
            tableModel.setNumRows(listCounter);

            int row = 0;
            int column = 0;

            for(int i = 0; i <= listCounter; i++){

                String items = listItems.getItem(row);

                String[] cutList = items.split("_");

                for (int j = 0; j < cutList.length; j++) {

                    tbItems.setValueAt(cutList[j], row, j);

                    column++;

                    if(column == 4){
                        row++;
                        column = 0;
                    }

                }

            } 

        }            
                
    }//GEN-LAST:event_cbItemsItemStateChanged

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
        cbItems.setSelectedIndex(11);
        
        DefaultTableModel tableModel = (DefaultTableModel) tbItems.getModel();
        tableModel.setNumRows(countItems());
        
        readItemsAdmin();
        
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
        String action = "Close items form";
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
            java.util.logging.Logger.getLogger(FormItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FormItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateItem;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdateItem;
    private javax.swing.JComboBox<String> cbItems;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tbItems;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
