package project_asm_java.view;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project_asm_java.controller.CatalogImp;
import project_asm_java.controller.ProductImp;
import project_asm_java.model.config.ShopValidation;
import project_asm_java.model.entity.Catalog;
import project_asm_java.model.entity.Product;

public class ProductManagement extends javax.swing.JFrame {

    private boolean isSearch = false;
    private boolean isSearchByPrice = false;
    private boolean isSort = false;
    
    private boolean isClickedProductName = false;
    private boolean isClickedProductPrice = false;
    private boolean isClickedProductCatalog = false;
    private boolean isClickedMinSearch = false;
    private boolean isClickedMaxSearch = false;
   
    private boolean isValidProductName = false;
    private boolean isValidProductPrice = false;
    private boolean isValidMinSearch = false;
    
    public ProductManagement() {
        initComponents();
        updateComboBox();
        autoUpdateProductStatus();
        updateTable();
        
        jLabel1.requestFocusInWindow();
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        currentDateLabel.setText("Date: "+formatter.format(date));
        
        searchText.setForeground(Color.GRAY); // Màu văn bản mặc định là xám
        searchText.setText("Enter product name");
        
    }
    
    private List<Product> listProduct = new ArrayList<>();
         
    ProductImp productImp = new ProductImp();
    CatalogImp catalogImp = new CatalogImp();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        currentDateLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        productNameText = new javax.swing.JTextField();
        productPriceText = new javax.swing.JTextField();
        catalogComboBox = new javax.swing.JComboBox<>();
        inactiveRadio = new javax.swing.JRadioButton();
        activeRadio = new javax.swing.JRadioButton();
        updateBtn = new javax.swing.JButton();
        createBtn1 = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        minSearchPrice = new javax.swing.JTextField();
        maxSearchPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        searchByPrice = new javax.swing.JButton();
        SortByCatalogBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(174, 125, 91));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel1.setText("Product Management");

        currentDateLabel.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        currentDateLabel.setText("Datetime");

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel2.setText("Product Name:");

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel3.setText("Product Price:");

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setText("Product catalog:");

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel5.setText("Status");

        productNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productNameTextFocusLost(evt);
            }
        });
        productNameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productNameTextMouseClicked(evt);
            }
        });

        productPriceText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productPriceTextFocusLost(evt);
            }
        });
        productPriceText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productPriceTextMouseClicked(evt);
            }
        });

        catalogComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                catalogComboBoxFocusLost(evt);
            }
        });
        catalogComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catalogComboBoxMouseClicked(evt);
            }
        });
        catalogComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catalogComboBoxActionPerformed(evt);
            }
        });

        inactiveRadio.setText("Inactive");
        inactiveRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inactiveRadioActionPerformed(evt);
            }
        });

        activeRadio.setText("Active");
        activeRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activeRadioActionPerformed(evt);
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

        createBtn1.setBackground(new java.awt.Color(60, 42, 29));
        createBtn1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        createBtn1.setForeground(new java.awt.Color(255, 255, 255));
        createBtn1.setText("Create");
        createBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtn1ActionPerformed(evt);
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

        searchBtn.setBackground(new java.awt.Color(60, 42, 29));
        searchBtn.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Product Name", "Product Price", "Product Catalog", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(productTable);

        minSearchPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                minSearchPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                minSearchPriceFocusLost(evt);
            }
        });
        minSearchPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minSearchPriceMouseClicked(evt);
            }
        });

        maxSearchPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                maxSearchPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                maxSearchPriceFocusLost(evt);
            }
        });
        maxSearchPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxSearchPriceMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel6.setText("Search by price:");

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel7.setText("-");

        searchByPrice.setBackground(new java.awt.Color(60, 42, 29));
        searchByPrice.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        searchByPrice.setForeground(new java.awt.Color(255, 255, 255));
        searchByPrice.setText("Search");
        searchByPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByPriceActionPerformed(evt);
            }
        });

        SortByCatalogBtn.setBackground(new java.awt.Color(60, 42, 29));
        SortByCatalogBtn.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        SortByCatalogBtn.setForeground(new java.awt.Color(255, 255, 255));
        SortByCatalogBtn.setText("Sort By Catalog");
        SortByCatalogBtn.setActionCommand("Sort By Catalog");
        SortByCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortByCatalogBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("min:");

        jLabel9.setText("max:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(activeRadio)
                                .addGap(18, 18, 18)
                                .addComponent(inactiveRadio))
                            .addComponent(catalogComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(productPriceText)
                            .addComponent(productNameText))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(createBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(minSearchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel8))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(maxSearchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(searchByPrice))
                                                .addComponent(jLabel9))))
                                    .addComponent(SortByCatalogBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(21, 21, 21))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(currentDateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(productPriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(catalogComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(activeRadio)
                    .addComponent(inactiveRadio)
                    .addComponent(jLabel6)
                    .addComponent(minSearchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxSearchPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(searchByPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(SortByCatalogBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void autoUpdateProductStatus(){
        List<Catalog> listCatalog = catalogImp.findAll();
        
        for (Catalog catalog : listCatalog) {
            boolean catalogStatus = catalog.isCatalogStatus();
            System.out.println(catalogStatus);
            List<Product> list = productImp.findAll();
            if(list!=null){
                for (Product product : list) {
                    if(product.getProductCatalog().getCatalogID() == catalog.getCatalogID()){
                        System.out.println(catalogStatus);
                        product.setProductStatus(catalogStatus);
                    }                  
                }
                boolean result = productImp.writeToFile(list);
            }
        }
    }
    
    private void updateComboBox(){
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) catalogComboBox.getModel();
        List<Catalog> listCatalog = catalogImp.findAll();
        comboBoxModel.addElement("...");
        for (Catalog catalog : listCatalog) {
            comboBoxModel.addElement(catalog.getCatalogName());
        }  
    }
            
    
    private void updateTable(){
        if(isSearch){
            listProduct = productImp.findByProductName(searchText.getText());
            if(isSort){
                listProduct = productImp.displayByCatalog(listProduct);
            }           
        }else{
            if(isSearchByPrice){
                double max = Double.parseDouble(maxSearchPrice.getText());
                double min = Double.parseDouble(minSearchPrice.getText());
                                
                listProduct = productImp.findByProductPrice(max, min);
                if(isSort){
                    listProduct = productImp.displayByCatalog(listProduct);
                }
            }else{
                listProduct = productImp.findAll();
                if(isSort){
                    listProduct = productImp.displayByCatalog(listProduct);
                } 
            }          
        }
        
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
            if(listProduct != null){
                for (Product product : listProduct) {
                    boolean isAlreadyInTable = false;
                    for (int i = 0; i < model.getRowCount(); i++) {
                        if ((int) model.getValueAt(i, 0) == product.getProductID()) {
                            isAlreadyInTable = true;
                            break;
                            }
                        }               
                    if(!isAlreadyInTable){
                    model.addRow(new Object[]{product.getProductID(),product.getProductName(),product.getProductPrice()
                            ,product.getProductCatalog().getCatalogName(),product.isProductStatus()?"Active":"Inactive"}); 
                    }
                }
            }
    }
    
    private void updateRow(Product product){
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if ((int) model.getValueAt(i, 0) == product.getProductID()) {
                model.setValueAt(product.getProductName(), i, 1);
                model.setValueAt(product.getProductPrice(), i, 2);
                model.setValueAt(product.getProductCatalog().getCatalogName(), i, 3); 
                model.setValueAt(product.isProductStatus() ? "Active" : "Inactive", i, 4);
                break;
            }
        }
    }
    
    private void clearFrom(){
        productNameText.setText("");
        productPriceText.setText("");
        catalogComboBox.setSelectedIndex(0);
        activeRadio.setSelected(false);
        inactiveRadio.setSelected(false);
    }
    
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        clearFrom();
        int selectedRow = productTable.getSelectedRow();
        if(selectedRow != -1){            
            DefaultTableModel model = (DefaultTableModel) productTable.getModel();

            DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) catalogComboBox.getModel();
            String catalogName = (String) model.getValueAt(selectedRow,3);
            // Tìm chỉ số của catalogName trong catalogComboBox
            int selectedIndex = -1;
            for (int i = 0; i < comboBoxModel.getSize(); i++) {
            if (catalogName.equals(comboBoxModel.getElementAt(i))) {
                    selectedIndex = i;
                    break;
                }
            }
                   
            productNameText.setText((String) model.getValueAt(selectedRow,1));
            productPriceText.setText(model.getValueAt(selectedRow, 2).toString());
            if(selectedIndex != -1){
                catalogComboBox.setSelectedIndex(selectedIndex);
            }      
            String status = (String) model.getValueAt(selectedRow, 4);
            if("Active".equals(status)){
                activeRadio.setSelected(true);
            }else{
                inactiveRadio.setSelected(true);
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,
                "You haven't choose any product in the table",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void createBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtn1ActionPerformed
        List<Product> listProduct = productImp.readFromFile();
        if(listProduct == null){
            listProduct = new ArrayList<>();
        }
        Product proNew = new Product();
        
        //CatalogID automatic set
        int id;
        if(listProduct.isEmpty()){
            id = 1;
        }else {
            int max = 0;
            for (Product product:listProduct) {
                if(product.getProductID()>max){
                    max = product.getProductID();
                }
            }
            id = max+1;
        }
        
        double price = (Double.parseDouble(productPriceText.getText()));
        Catalog chosenCatalog = catalogImp.getCatalogByCatalogName((String) catalogComboBox.getSelectedItem());
        
        proNew.setProductID(id);
        proNew.setProductName(productNameText.getText());
        proNew.setProductPrice(price);
        if(chosenCatalog != null){
            proNew.setProductCatalog(chosenCatalog);
        }      
        proNew.setProductStatus(activeRadio.isSelected());
        
        boolean result = false;

        if(!productNameText.getText().isEmpty() && !productPriceText.getText().isEmpty()
            && catalogComboBox.getSelectedIndex()!=0 && (activeRadio.isSelected() || inactiveRadio.isSelected())){           
            
            result = productImp.create(proNew);
            
        }
        
        if(result){           
            updateTable();
            JOptionPane.showMessageDialog(rootPane,
                "Product has been created successfully",
                "Info",
                JOptionPane.INFORMATION_MESSAGE); 
            clearFrom();
        }else{
            JOptionPane.showMessageDialog(rootPane,
                "Product created failed",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_createBtn1ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        int selectedRow = productTable.getSelectedRow();
        int productID = -1; 
        boolean result = false;
        Product product = null;
        if(selectedRow != -1){
            productID = (Integer) model.getValueAt(selectedRow, 0);
        }
        
        if(productID != -1){            
            double price = (Double.parseDouble(productPriceText.getText()));
            Catalog chosenCatalog = catalogImp.getCatalogByCatalogName((String) catalogComboBox.getSelectedItem());
            
            
            product = productImp.findByID(productID);
            product.setProductName(productNameText.getText());
            product.setProductPrice(price);
            if(chosenCatalog != null){
                product.setProductCatalog(chosenCatalog);
            }
            product.setProductStatus(activeRadio.isSelected());           
            result = productImp.update(product);                    
        }
        
        if(result){
            updateRow(product);
            JOptionPane.showMessageDialog(rootPane,
                "Product has been updated successfully",
                "Info",
                JOptionPane.INFORMATION_MESSAGE); 
            clearFrom();          
        }else{
            JOptionPane.showMessageDialog(rootPane,
                "Product updated failed",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        int selectedRow = productTable.getSelectedRow();
        int productID = -1;
        boolean result = false;
        
        if(selectedRow != -1){
            productID = (Integer) model.getValueAt(selectedRow, 0);
            
            String[] options = {"Yes","No"};
            int opts = JOptionPane.showOptionDialog(null, "Are you sure to delete this product (productID: "+productID+")!",
                "Confirm delete",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            
            if(opts == 0){
                if(productID != -1){
                    result = productImp.delete(productID);
                }               
            }
            
            if(result){
                model.setRowCount(0);
                updateTable();
                JOptionPane.showMessageDialog(rootPane,
                    "Product has been deleted successfully",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
                clearFrom();
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "Product deleted failed",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }            
        }else{
            JOptionPane.showMessageDialog(rootPane,
                "You haven't choose any product in the table",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        MainMenu mainMenu = new MainMenu();
        mainMenu.show();
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String search = searchText.getText();
        
        isSearch = !search.isEmpty() && !search.equals("Enter product name");       
        
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);
        updateTable();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void catalogComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catalogComboBoxActionPerformed
        
    }//GEN-LAST:event_catalogComboBoxActionPerformed

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

    private void searchTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFocusGained
        if (searchText.getText().equals("Enter product name")) {
            searchText.setText("");
            searchText.setForeground(Color.BLACK); // Đổi màu văn bản khi bắt đầu nhập
        }
    }//GEN-LAST:event_searchTextFocusGained

    private void searchTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFocusLost
        if (searchText.getText().isEmpty()) {
            searchText.setForeground(Color.GRAY);
            searchText.setText("Enter product name");
        }
    }//GEN-LAST:event_searchTextFocusLost

    private void productNameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productNameTextFocusLost
        String input = productNameText.getText();
        List<Product> listProduct = productImp.findAll();
        if(isClickedProductName) {
            if(!input.isEmpty()){
                if(ShopValidation.checkStringLength(input, 30, 3)){
                    if(ShopValidation.checkExistProductName(listProduct, input)){
                        isValidProductName = true;
                    }else{
                        JOptionPane.showMessageDialog(rootPane,
                            "Product name already exist!! Please enter again!!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                            productNameText.setText("");                       
                            productNameText.requestFocus();
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "Product name are too long or too short, only 3-30 characters!! Please enter again!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        productNameText.setText("");
                        productNameText.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "Product name can't be empty!! Please enter again!!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                    productNameText.requestFocus();
            }
        }
    }//GEN-LAST:event_productNameTextFocusLost

    private void productNameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productNameTextMouseClicked
        isClickedProductName = true;
    }//GEN-LAST:event_productNameTextMouseClicked

    private void productPriceTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productPriceTextFocusLost
        String input = productPriceText.getText();
        if(isClickedProductPrice || isValidProductName){
            if(!input.isEmpty()){
                if(ShopValidation.checkDouble(input)){
                    isValidProductPrice = true;
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "Price must be a number!! Please enter again!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        productPriceText.setText("");                       
                        productPriceText.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "Product price can't be empty!! Please enter again!!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                    productNameText.requestFocus();
            }
        }
    }//GEN-LAST:event_productPriceTextFocusLost

    private void productPriceTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPriceTextMouseClicked
        isClickedProductPrice = true;
    }//GEN-LAST:event_productPriceTextMouseClicked

    private void catalogComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_catalogComboBoxFocusLost
        int chosenCatalogIndex = catalogComboBox.getSelectedIndex();
        if(isClickedProductCatalog || isValidProductPrice){
            if(chosenCatalogIndex != 0){
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "You must choose a catalog!! Please enter again!!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                    catalogComboBox.requestFocus();
            }
        }
    }//GEN-LAST:event_catalogComboBoxFocusLost

    private void catalogComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catalogComboBoxMouseClicked
        isClickedProductCatalog = true;
    }//GEN-LAST:event_catalogComboBoxMouseClicked

    private void searchByPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByPriceActionPerformed
        String min = minSearchPrice.getText();
        String max = maxSearchPrice.getText();
               
        isSearchByPrice = !min.isEmpty() && !max.isEmpty(); 
            
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);
        updateTable();
    }//GEN-LAST:event_searchByPriceActionPerformed

    private void minSearchPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_minSearchPriceFocusGained

    }//GEN-LAST:event_minSearchPriceFocusGained

    private void minSearchPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_minSearchPriceFocusLost
        String input = minSearchPrice.getText();
        if(isClickedMinSearch){
            if(ShopValidation.checkDouble(input)||input.isEmpty()){
                    isValidMinSearch = true;
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "Price must be a number!! Please enter again!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        minSearchPrice.setText("");                       
                        minSearchPrice.requestFocus();
                }           
        }
    }//GEN-LAST:event_minSearchPriceFocusLost

    private void maxSearchPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_maxSearchPriceFocusGained
        
    }//GEN-LAST:event_maxSearchPriceFocusGained

    private void maxSearchPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_maxSearchPriceFocusLost
        String input = maxSearchPrice.getText();
        if(isClickedMaxSearch || isValidMinSearch){
            if(ShopValidation.checkDouble(input)||input.isEmpty()){
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "Price must be a number!! Please enter again!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        minSearchPrice.setText("");                       
                        minSearchPrice.requestFocus();
                }
        }
    }//GEN-LAST:event_maxSearchPriceFocusLost

    private void SortByCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortByCatalogBtnActionPerformed
        isSort = !isSort;
        
        DefaultTableModel model = (DefaultTableModel) productTable.getModel();
        model.setRowCount(0);
        updateTable();
    }//GEN-LAST:event_SortByCatalogBtnActionPerformed

    private void minSearchPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minSearchPriceMouseClicked
        isClickedMinSearch = true;
    }//GEN-LAST:event_minSearchPriceMouseClicked

    private void maxSearchPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxSearchPriceMouseClicked
        isClickedMaxSearch = true;
    }//GEN-LAST:event_maxSearchPriceMouseClicked

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
            java.util.logging.Logger.getLogger(ProductManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SortByCatalogBtn;
    private javax.swing.JRadioButton activeRadio;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> catalogComboBox;
    private javax.swing.JButton createBtn1;
    private javax.swing.JLabel currentDateLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JRadioButton inactiveRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField maxSearchPrice;
    private javax.swing.JTextField minSearchPrice;
    private javax.swing.JTextField productNameText;
    private javax.swing.JTextField productPriceText;
    private javax.swing.JTable productTable;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton searchByPrice;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
