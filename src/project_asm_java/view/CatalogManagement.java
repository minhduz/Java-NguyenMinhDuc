package project_asm_java.view;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project_asm_java.controller.CatalogImp;
import project_asm_java.model.config.ShopValidation;
import project_asm_java.model.entity.Catalog;

public class CatalogManagement extends javax.swing.JFrame {

    private boolean isSearch = false;
    private boolean isSort = false;
    
    private boolean isClickedCatalogName = false;
    private boolean isClickedPriority = false;
    
    private boolean isVaildCatalogName = false;
    
    public CatalogManagement() {
        initComponents();
        updateTable();
        jLabel1.requestFocusInWindow();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        currentDateLabel.setText("Date: "+formatter.format(date));
        searchText.setForeground(Color.GRAY); // Màu văn bản mặc định là xám
        searchText.setText("Enter catalog name");
    }
    
    private List<Catalog> listCatalog = new ArrayList<>();
         
    CatalogImp catalogImp = new CatalogImp();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        currentDateLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        catalogNameText = new javax.swing.JTextField();
        priorityText = new javax.swing.JTextField();
        activeRadio = new javax.swing.JRadioButton();
        inactiveRadio = new javax.swing.JRadioButton();
        createBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        catalogTable = new javax.swing.JTable();
        SortByPriorityBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(174, 125, 91));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel1.setText("Catalog Management");

        currentDateLabel.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        currentDateLabel.setText("Datetime");

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setText("Catalog Name:");

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setText("Priority:");

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setText("Status:");

        catalogNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                catalogNameTextFocusLost(evt);
            }
        });
        catalogNameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catalogNameTextMouseClicked(evt);
            }
        });
        catalogNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogNameTextActionPerformed(evt);
            }
        });

        priorityText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                priorityTextFocusLost(evt);
            }
        });
        priorityText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priorityTextMouseClicked(evt);
            }
        });
        priorityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityTextActionPerformed(evt);
            }
        });

        activeRadio.setText("Active");
        activeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeRadioActionPerformed(evt);
            }
        });

        inactiveRadio.setText("Inactive");
        inactiveRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactiveRadioActionPerformed(evt);
            }
        });

        createBtn.setBackground(new java.awt.Color(60, 42, 29));
        createBtn.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        createBtn.setForeground(new java.awt.Color(255, 255, 255));
        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(60, 42, 29));
        updateBtn.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(60, 42, 29));
        saveBtn.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(60, 42, 29));
        deleteBtn.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(60, 42, 29));
        backBtn.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        searchText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFocusLost(evt);
            }
        });
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(60, 42, 29));
        searchBtn.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        catalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CalalogID", "CatalogName", "Priority", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(catalogTable);

        SortByPriorityBtn.setBackground(new java.awt.Color(60, 42, 29));
        SortByPriorityBtn.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        SortByPriorityBtn.setForeground(new java.awt.Color(255, 255, 255));
        SortByPriorityBtn.setText("Sort By Priority");
        SortByPriorityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortByPriorityBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(catalogNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(priorityText, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(activeRadio)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inactiveRadio))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(searchBtn)
                                        .addGap(91, 91, 91)
                                        .addComponent(SortByPriorityBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(currentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(currentDateLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(catalogNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(priorityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(activeRadio)
                            .addComponent(inactiveRadio)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(SortByPriorityBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateTable(){
        if(isSearch){
            listCatalog = catalogImp.findByCatalogName(searchText.getText());
            if(isSort){
                listCatalog = catalogImp.displayByPriority(listCatalog);
            }
        }else{           
            listCatalog = catalogImp.findAll();
            if(isSort){
                listCatalog = catalogImp.displayByPriority(listCatalog);
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) catalogTable.getModel();
            if(listCatalog != null){
                for (Catalog catalog: listCatalog) {
                    boolean isAlreadyInTable = false;
                    for (int i = 0; i < model.getRowCount(); i++) {
                        if ((int) model.getValueAt(i, 0) == catalog.getCatalogID()) {
                            isAlreadyInTable = true;
                            break;
                            }
                        }               
                    if(!isAlreadyInTable){
                    model.addRow(new Object[]{catalog.getCatalogID(),catalog.getCatalogName()
                            ,catalog.getCatalogPriority(),catalog.isCatalogStatus()?"Active":"Inactive"}); 
                    }
                }
            }
    }
    
    private void updateRow(Catalog catalog){
        DefaultTableModel model = (DefaultTableModel) catalogTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if ((int) model.getValueAt(i, 0) == catalog.getCatalogID()) {
                model.setValueAt(catalog.getCatalogName(), i, 1);
                model.setValueAt(catalog.getCatalogPriority(), i, 2);               
                model.setValueAt(catalog.isCatalogStatus() ? "Active" : "Inactive", i, 3);
                break;
            }
        }
    }
    
    private void clearFrom(){
        catalogNameText.setText("");
        priorityText.setText("");
        activeRadio.setSelected(false);
        inactiveRadio.setSelected(false);
    }
    
    private void catalogNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catalogNameTextActionPerformed

    private void priorityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priorityTextActionPerformed

    private void activeRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activeRadioActionPerformed
        if(activeRadio.isSelected()){
            inactiveRadio.setSelected(false);
        }
    }//GEN-LAST:event_activeRadioActionPerformed

    private void inactiveRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inactiveRadioActionPerformed
        if(inactiveRadio.isSelected()){
            activeRadio.setSelected(false);
        }
    }//GEN-LAST:event_inactiveRadioActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        List<Catalog> listCatalog = catalogImp.readFromFile();
        if(listCatalog == null){
            listCatalog = new ArrayList<>();
        }
        Catalog catalogNew = new Catalog();
        
        //CatalogID automatic set
        int id;
        if(listCatalog.isEmpty()){
            id = 1;
        }else {
            int max = 0;
            for (Catalog catalog:listCatalog) {
                if(catalog.getCatalogID()>max){
                    max = catalog.getCatalogID();
                }
            }
            id = max+1;
        }
        
        int priority = (Integer.parseInt(priorityText.getText()));
        
        catalogNew.setCatalogID(id);
        catalogNew.setCatalogName(catalogNameText.getText());
        catalogNew.setCatalogPriority(priority);
        catalogNew.setCatalogStatus(activeRadio.isSelected());
        
        boolean result = false;

        if(!catalogNameText.getText().isEmpty() && !priorityText.getText().isEmpty()
            && (activeRadio.isSelected() || inactiveRadio.isSelected())){           
            
            result = catalogImp.create(catalogNew);
            
        }
        
        if(result){           
            updateTable();
            JOptionPane.showMessageDialog(rootPane,
                "Catalog has been created successfully",
                "Info",
                JOptionPane.INFORMATION_MESSAGE); 
            clearFrom();
        }else{
            JOptionPane.showMessageDialog(rootPane,
                "Catalog created failed",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_createBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        clearFrom();
        int selectedRow = catalogTable.getSelectedRow();
        if(selectedRow != -1){            
           DefaultTableModel model = (DefaultTableModel) catalogTable.getModel();
           // lấy dữ liệu từ hàng được chọn và gán vào cái ô text
           catalogNameText.setText((String) model.getValueAt(selectedRow,1));
           priorityText.setText(model.getValueAt(selectedRow, 2).toString());           
           String status = (String) model.getValueAt(selectedRow, 3);
           if("Active".equals(status)){
               activeRadio.setSelected(true);
           }else{
               inactiveRadio.setSelected(true);
           }
        }else{
            JOptionPane.showMessageDialog(rootPane,
                "You haven't choose any catalog in the table",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) catalogTable.getModel();
        int selectedRow = catalogTable.getSelectedRow();
        int catalogID = -1; 
        boolean result = false;
        Catalog catalog = null;
        if(selectedRow != -1){
            catalogID = (Integer) model.getValueAt(selectedRow, 0);
        }
        
        if(catalogID != -1){            
            int priority = (Integer.parseInt(priorityText.getText()));
            
            catalog = catalogImp.findByID(catalogID);
            catalog.setCatalogName(catalogNameText.getText());
            catalog.setCatalogPriority(priority);
            catalog.setCatalogStatus(activeRadio.isSelected());           
            result = catalogImp.update(catalog);                    
        }
        
        if(result){
            updateRow(catalog);
            JOptionPane.showMessageDialog(rootPane,
                "Catalog has been updated successfully",
                "Info",
                JOptionPane.INFORMATION_MESSAGE); 
            clearFrom();          
        }else{
            JOptionPane.showMessageDialog(rootPane,
                "Catalog updated failed",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) catalogTable.getModel();
        int selectedRow = catalogTable.getSelectedRow();
        int catalogID = -1;
        boolean result = false;
        
        if(selectedRow != -1){
            catalogID = (Integer) model.getValueAt(selectedRow, 0);
            
            String[] options = {"Yes","No"};
            int opts = JOptionPane.showOptionDialog(null, "Are you sure to delete this catalog (catalogID: "+catalogID+")!",
                "Confirm delete",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            
            if(opts == 0){
                if(catalogID != -1){
                    result = catalogImp.delete(catalogID);
                }               
            }
            
            if(result){
                model.setRowCount(0);
                updateTable();
                JOptionPane.showMessageDialog(rootPane,
                    "Catalog has been deleted successfully",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
                clearFrom();
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "Catalog deleted failed",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }            
        }else{
            JOptionPane.showMessageDialog(rootPane,
                "You haven't choose any catalog in the table",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        MainMenu mainMenu = new MainMenu();
        mainMenu.show();
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void catalogNameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_catalogNameTextFocusLost
        String input = catalogNameText.getText();
        List<Catalog> listCatalog = catalogImp.readFromFile();
        if(isClickedCatalogName) {
            if(!input.isEmpty()){
                if(ShopValidation.checkStringLength(input, 20, 3)){
                    if(ShopValidation.checkExistCatalogName(listCatalog, input)){
                        isVaildCatalogName = true;
                    }else{
                        JOptionPane.showMessageDialog(rootPane,
                            "Catalog name already exist!! Please enter again!!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                            catalogNameText.setText("");                       
                            catalogNameText.requestFocus();
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "Catalog name are too long or too short, only 3-20 characters!! Please enter again!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        catalogNameText.setText("");
                        catalogNameText.requestFocus();
                }               
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "Catalog name can't be empty!! Please enter again!!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                    catalogNameText.requestFocus();
            }
        }      
    }//GEN-LAST:event_catalogNameTextFocusLost

    private void priorityTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priorityTextFocusLost
        String input = priorityText.getText();
        if(isClickedPriority || isVaildCatalogName){
            if(!input.isEmpty()){
                if(ShopValidation.checkInteger(input)){                   
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "Priority must be a number!! Please enter again!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        priorityText.setText("");                       
                        priorityText.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "Priority can't be empty!! Please enter again!!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                    catalogNameText.requestFocus();
            }
        }
    }//GEN-LAST:event_priorityTextFocusLost

    private void catalogNameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogNameTextMouseClicked
        isClickedCatalogName = true;
    }//GEN-LAST:event_catalogNameTextMouseClicked

    private void priorityTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priorityTextMouseClicked
        isClickedPriority = true;
    }//GEN-LAST:event_priorityTextMouseClicked

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String search = searchText.getText();
        
        isSearch = !search.isEmpty() && !search.equals("Enter catalog name");       
        
        DefaultTableModel model = (DefaultTableModel) catalogTable.getModel();
        model.setRowCount(0);
        updateTable();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFocusGained
        if (searchText.getText().equals("Enter catalog name")) {
            searchText.setText("");
            searchText.setForeground(Color.BLACK); // Đổi màu văn bản khi bắt đầu nhập
        }
    }//GEN-LAST:event_searchTextFocusGained

    private void searchTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFocusLost
        if (searchText.getText().isEmpty()) {
            searchText.setForeground(Color.GRAY);
            searchText.setText("Enter catalog name");
        }
    }//GEN-LAST:event_searchTextFocusLost

    private void SortByPriorityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortByPriorityBtnActionPerformed
        isSort = !isSort;
        
        DefaultTableModel model = (DefaultTableModel) catalogTable.getModel();
        model.setRowCount(0);
        updateTable(); 
    }//GEN-LAST:event_SortByPriorityBtnActionPerformed

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
            java.util.logging.Logger.getLogger(CatalogManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CatalogManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CatalogManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CatalogManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CatalogManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SortByPriorityBtn;
    private javax.swing.JRadioButton activeRadio;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField catalogNameText;
    private javax.swing.JTable catalogTable;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel currentDateLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JRadioButton inactiveRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priorityText;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
