package project_asm_java.view;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project_asm_java.controller.UserImp;
import project_asm_java.data.UserDao;
import project_asm_java.model.config.ShopValidation;
import project_asm_java.model.entity.User;

public class UserManagement extends javax.swing.JFrame {    
    private boolean isValidUsername = false;
    private boolean isValidPassword = false;
    private boolean isValidConfirm = false;
    private boolean isValidFullname = false;
    private boolean isValidEmail = false;
        
    private boolean isClickedUsername = false;
    private boolean isClickedPassword = false;
    private boolean isClickedConfirm = false;
    private boolean isClickedFullname = false;
    private boolean isClickedEmail = false;
    private boolean isClickedPhone = false;
    
    private boolean isSearch = false;
    private boolean isSort = false;
    
    public UserManagement() {
        initComponents();
        updateTable(); 
        jLabel1.requestFocusInWindow();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        currentDateLabel.setText("Date: "+formatter.format(date));
        searchText.setForeground(Color.GRAY); // Màu văn bản mặc định là xám
        searchText.setText("Enter username or full name");
    }
    private List<User> listUser = new ArrayList<>();
      
    
    UserImp userImp = new UserImp();
    UserDao userDao = new UserDao();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fullnameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        activeRadio = new javax.swing.JRadioButton();
        inactiveRadio = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        createUser = new javax.swing.JButton();
        updateUser = new javax.swing.JButton();
        saveUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        backToMainMenuBtn = new javax.swing.JButton();
        currentDateLabel = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        confirmText = new javax.swing.JPasswordField();
        searchText = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        sortByDateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(174, 125, 91));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel1.setText("User Management");

        jLabel3.setText("Username:");

        jLabel4.setText("Password");

        jLabel6.setText("Confirmpassword:");

        usernameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTextFocusLost(evt);
            }
        });
        usernameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextMouseClicked(evt);
            }
        });
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        jLabel5.setText("Email:");

        jLabel7.setText("Full name:");

        jLabel8.setText("Phone:");

        jLabel9.setText("Status:");

        fullnameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fullnameTextFocusLost(evt);
            }
        });
        fullnameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fullnameTextMouseClicked(evt);
            }
        });
        fullnameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameTextActionPerformed(evt);
            }
        });

        emailText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFocusLost(evt);
            }
        });
        emailText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailTextMouseClicked(evt);
            }
        });
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        phoneText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneTextFocusLost(evt);
            }
        });
        phoneText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneTextMouseClicked(evt);
            }
        });
        phoneText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextActionPerformed(evt);
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

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserID", "Username", "Password", "Full Name", "Email", "Phone", "Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        createUser.setBackground(new java.awt.Color(60, 42, 29));
        createUser.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        createUser.setForeground(new java.awt.Color(255, 255, 255));
        createUser.setText("Create");
        createUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserActionPerformed(evt);
            }
        });

        updateUser.setBackground(new java.awt.Color(60, 42, 29));
        updateUser.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        updateUser.setForeground(new java.awt.Color(255, 255, 255));
        updateUser.setText("Update");
        updateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserActionPerformed(evt);
            }
        });

        saveUser.setBackground(new java.awt.Color(60, 42, 29));
        saveUser.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        saveUser.setForeground(new java.awt.Color(255, 255, 255));
        saveUser.setText("Save");
        saveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUserActionPerformed(evt);
            }
        });

        deleteUser.setBackground(new java.awt.Color(60, 42, 29));
        deleteUser.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        deleteUser.setForeground(new java.awt.Color(255, 255, 255));
        deleteUser.setText("Delete");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        backToMainMenuBtn.setBackground(new java.awt.Color(60, 42, 29));
        backToMainMenuBtn.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        backToMainMenuBtn.setForeground(new java.awt.Color(255, 255, 255));
        backToMainMenuBtn.setText("Back");
        backToMainMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMainMenuBtnActionPerformed(evt);
            }
        });

        currentDateLabel.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        currentDateLabel.setText("Datetime");

        passwordText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTextFocusLost(evt);
            }
        });
        passwordText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTextMouseClicked(evt);
            }
        });

        confirmText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmTextFocusLost(evt);
            }
        });
        confirmText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmTextMouseClicked(evt);
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

        sortByDateBtn.setBackground(new java.awt.Color(60, 42, 29));
        sortByDateBtn.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        sortByDateBtn.setForeground(new java.awt.Color(255, 255, 255));
        sortByDateBtn.setText("Sort By Date");
        sortByDateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByDateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currentDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(createUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameText)
                                    .addComponent(passwordText)
                                    .addComponent(confirmText))
                                .addGap(62, 62, 62))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(updateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(saveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(emailText)
                                    .addComponent(fullnameText)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(activeRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inactiveRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backToMainMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sortByDateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentDateLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(fullnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(confirmText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(activeRadio)
                                    .addComponent(inactiveRadio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(createUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saveUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backToMainMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchBtn)))
                    .addComponent(sortByDateBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateTable(){
        if(isSearch){
            listUser = userImp.findByUserNameOrFullName(searchText.getText());
            if(isSort){
                listUser = userImp.displayByDate(listUser);
            }
        }else{
            listUser = userImp.findAll();
            if(isSort){
                listUser = userImp.displayByDate(listUser);
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
            if(listUser != null){
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
                for (User user : listUser) {
                    boolean isAlreadyInTable = false;
                    for (int i = 0; i < model.getRowCount(); i++) {
                        if ((int) model.getValueAt(i, 0) == user.getUserID()) {
                            isAlreadyInTable = true;
                            break;
                            }
                        }               
                    if(!isAlreadyInTable){
                    model.addRow(new Object[]{user.getUserID(),user.getUserName(),user.getUserPassword()
                    ,user.getUserFullName(),user.getUserEmail(),user.getUserPhone(),formatter.format(user.getUserDate())
                    ,user.isUserStatus()?"Active":"Inactive"}); 
                    }
                }
            }
    }
    
    private void updateRow(User user){
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
        Date date = new Date();
        for (int i = 0; i < model.getRowCount(); i++) {
            if ((int) model.getValueAt(i, 0) == user.getUserID()) {
                model.setValueAt(user.getUserName(), i, 1);
                model.setValueAt(user.getUserPassword(), i, 2);
                model.setValueAt(user.getUserFullName(), i, 3);
                model.setValueAt(user.getUserEmail(), i, 4);
                model.setValueAt(user.getUserPhone(), i, 5);
                model.setValueAt(formatter.format(date), i, 6);
                model.setValueAt(user.isUserStatus() ? "Active" : "Inactive", i, 7);
                break;
            }
        }
    }
    
    private void clearFrom(){
        usernameText.setText("");
        passwordText.setText("");
        confirmText.setText("");
        fullnameText.setText("");
        emailText.setText("");
        phoneText.setText("");
        activeRadio.setSelected(false);
        inactiveRadio.setSelected(false);
    }
    
    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
           
    }//GEN-LAST:event_usernameTextActionPerformed

    private void fullnameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameTextActionPerformed

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void phoneTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextActionPerformed

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

    private void createUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserActionPerformed
        List<User> listUser = userImp.readFromFile();
        if(listUser == null){
            listUser = new ArrayList<>();
        }
        User userNew = new User();
        
        //UserID automatic set
        int id;
        if(listUser.isEmpty()){
            id = 1;
        }else {
            int max = 0;
            for (User user :listUser) {
                if(user.getUserID()>max){
                    max = user.getUserID();
                }
            }
            id = max+1;
        }
        
        Date currentDate = new Date();
        String pass = new String(passwordText.getPassword());
        String confirm = new String(confirmText.getPassword());
         
        userNew.setUserID(id);
        userNew.setUserName(usernameText.getText());
        userNew.setUserPassword(pass);
        userNew.setUserConfirmPassword(confirm);
        userNew.setUserFullName(fullnameText.getText());
        userNew.setUserDate(currentDate);
        userNew.setUserStatus(activeRadio.isSelected());
        userNew.setUserEmail(emailText.getText());
        userNew.setUserPhone(phoneText.getText());
                
        boolean resultFile = false;
        boolean resultSQL = false;

        if(!usernameText.getText().isEmpty()&&!pass.isEmpty()&&!confirm.isEmpty()
            &&!fullnameText.getText().isEmpty()&&!emailText.getText().isEmpty()&&!phoneText.getText().isEmpty()
            &&(activeRadio.isSelected() || inactiveRadio.isSelected())){           
            
            resultFile = userImp.create(userNew);  
            resultSQL = userDao.save(userNew);
        }        
        
        if(resultFile&&resultSQL){           
            updateTable();
            JOptionPane.showMessageDialog(rootPane,
                "User has been created successfully",
                "Info",
                JOptionPane.INFORMATION_MESSAGE); 
            clearFrom();
        }else{
            JOptionPane.showMessageDialog(rootPane,
                "User created failed",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_createUserActionPerformed

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
        clearFrom();
        int selectedRow = userTable.getSelectedRow();
        if(selectedRow != -1){            
           DefaultTableModel model = (DefaultTableModel) userTable.getModel();
           // lấy dữ liệu từ hàng được chọn và gán vào cái ô text
           usernameText.setText((String) model.getValueAt(selectedRow,1));
           passwordText.setText((String) model.getValueAt(selectedRow, 2));
           confirmText.setText((String) model.getValueAt(selectedRow, 2));
           fullnameText.setText((String) model.getValueAt(selectedRow, 3));
           emailText.setText((String) model.getValueAt(selectedRow, 4));
           phoneText.setText((String) model.getValueAt(selectedRow, 5));
           String status = (String) model.getValueAt(selectedRow, 7);
           if("Active".equals(status)){
               activeRadio.setSelected(true);
           }else{
               inactiveRadio.setSelected(true);
           }
        }else{
            JOptionPane.showMessageDialog(rootPane,
                "You haven't choose any user in the table",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateUserActionPerformed

    private void saveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUserActionPerformed
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        int selectedRow = userTable.getSelectedRow();
        int userID = -1; 
        boolean resultFile = false;
        boolean resultSQL = false;
        User user = null;
        if(selectedRow != -1){
            userID = (Integer) model.getValueAt(selectedRow, 0);
        }
        
        if(userID != -1){
            String pass = new String(passwordText.getPassword());
            String confirm = new String(confirmText.getPassword());
            
            user = userImp.findByID(userID);
            user.setUserName(usernameText.getText());
            user.setUserPassword(pass);
            user.setUserConfirmPassword(confirm);
            user.setUserFullName(fullnameText.getText());
            user.setUserEmail(emailText.getText());
            user.setUserPhone(phoneText.getText());
            user.setUserStatus(activeRadio.isSelected());           
            resultFile = userImp.update(user);  
            resultSQL = userDao.update(user);
        }
        
        if(resultFile && resultSQL){
            updateRow(user);
            JOptionPane.showMessageDialog(rootPane,
                "User has been updated successfully",
                "Info",
                JOptionPane.INFORMATION_MESSAGE); 
            clearFrom();          
        }else{
            JOptionPane.showMessageDialog(rootPane,
                "User updated failed",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveUserActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        int selectedRow = userTable.getSelectedRow();
        int userID = -1;
        boolean resultFile = false;
         boolean resultSQL = false;
        
        if(selectedRow != -1){
            userID = (Integer) model.getValueAt(selectedRow, 0);
            
            String[] options = {"Yes","No"};
            int opts = JOptionPane.showOptionDialog(null, "Are you sure to delete this user (userID: "+userID+")!",
                "Confirm delete",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            
            if(opts == 0){
                if(userID != -1){
                    resultFile = userImp.delete(userID);
                    resultSQL = userDao.delete(userID);
                }               
            }
            
            if(resultFile && resultSQL){
                model.setRowCount(0);
                updateTable();
                JOptionPane.showMessageDialog(rootPane,
                    "User has been deleted successfully",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
                clearFrom();
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "User deleted failed",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            }            
        }else{
            JOptionPane.showMessageDialog(rootPane,
                "You haven't choose any user in the table",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }       
    }//GEN-LAST:event_deleteUserActionPerformed

    private void backToMainMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMainMenuBtnActionPerformed
        MainMenu mainMenu = new MainMenu();
        mainMenu.show();
        dispose();
    }//GEN-LAST:event_backToMainMenuBtnActionPerformed

    private void usernameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTextFocusLost
        String input = usernameText.getText();
        List<User> listUser = userImp.readFromFile();
        if(isClickedUsername){
            if(!input.isEmpty()){
                if(ShopValidation.checkValidateUserName(input)){
                    if(ShopValidation.checkStringLength(input, 20, 6)){
                        if(ShopValidation.checkExistUserName(listUser, input)){
                            isValidUsername = true;
                        }else{                        
                            JOptionPane.showMessageDialog(rootPane,
                            "Username already exist!! Please enter again!!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                            usernameText.setText("");                       
                            usernameText.requestFocus();
                        }
                    }else{
                        JOptionPane.showMessageDialog(rootPane,
                            "Username are too long or too short, only 6-20 characters!! Please enter again!!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                            usernameText.setText("");
                            usernameText.requestFocus();
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "Incorrect username form!! Please enter again!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        usernameText.setText("");
                        usernameText.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "Username can't be empty!! Please enter again!!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                    usernameText.requestFocus();
            }
        }
        
    }//GEN-LAST:event_usernameTextFocusLost

    private void passwordTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFocusLost
        if(isClickedPassword || isValidUsername){
            String input = new String(passwordText.getPassword());
            if(!input.isEmpty()){
                if(ShopValidation.checkStringLength(input, 20, 6)){
                    isValidPassword = true;
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "Password is too long or too short!! Please enter again!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        passwordText.setText("");
                        passwordText.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "Password can't be empty!! Please enter again!!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);                
                    passwordText.requestFocus();
            } 
        }      
    }//GEN-LAST:event_passwordTextFocusLost

    private void confirmTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmTextFocusLost
        if(isClickedConfirm || isValidPassword){
            String input = new String(confirmText.getPassword());
            String pass = new String(passwordText.getPassword());
            if(!input.isEmpty()){
                if(input.equals(pass)){
                    isValidConfirm = true;
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "Password and confirm password do not match!! Please enter again!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        confirmText.setText("");
                        confirmText.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "Confirm password can't be empty!! Please enter again!!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);                
                    confirmText.requestFocus();
            }
        }       
    }//GEN-LAST:event_confirmTextFocusLost

    private void passwordTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextMouseClicked
        isClickedPassword = true;
    }//GEN-LAST:event_passwordTextMouseClicked

    private void usernameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextMouseClicked
        isClickedUsername = true;
    }//GEN-LAST:event_usernameTextMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String search = searchText.getText();
        
        isSearch = !search.isEmpty() && !search.equals("Enter username or full name");       
        
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);
        updateTable();        
    }//GEN-LAST:event_searchBtnActionPerformed

    private void confirmTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmTextMouseClicked
        isClickedConfirm = true;
    }//GEN-LAST:event_confirmTextMouseClicked

    private void emailTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFocusLost
        if(isClickedEmail || isValidFullname){
            String input = emailText.getText();
            if(!input.isEmpty()){
                if(ShopValidation.checkEmail(input)){
                    isValidEmail = true;
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "Email's format is incorrect!! Please enter again!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        emailText.setText("");
                        emailText.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "Email can't be empty!! Please enter again!!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);                
                    emailText.requestFocus();
            }
        }       
    }//GEN-LAST:event_emailTextFocusLost

    private void phoneTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTextFocusLost
        if(isClickedPhone || isValidEmail){
            String input = phoneText.getText();
            if(!input.isEmpty()){
                if(ShopValidation.checkPhone(input)){
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "Phone's format is incorrect!! Please enter again!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        phoneText.setText("");
                        phoneText.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "Phone can't be empty!! Please enter again!!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);                
                    phoneText.requestFocus();
            }
        }       
    }//GEN-LAST:event_phoneTextFocusLost

    private void emailTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailTextMouseClicked
        isClickedEmail = true;
    }//GEN-LAST:event_emailTextMouseClicked

    private void phoneTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneTextMouseClicked
        isClickedPhone = true;
    }//GEN-LAST:event_phoneTextMouseClicked

    private void fullnameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameTextFocusLost
        if(isClickedFullname || isValidConfirm){
            String input = fullnameText.getText();
            if(!input.isEmpty()){
                if(ShopValidation.checkStringLength(input, 30, 6)){
                    isValidFullname = true;
                }else{
                    JOptionPane.showMessageDialog(rootPane,
                        "Full name is too long or short (6 - 50 characters)!! Please enter again!!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                        fullnameText.setText("");
                        fullnameText.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane,
                    "Full name can't be empty!! Please enter again!!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);                
                    fullnameText.requestFocus();
            }
        }  
    }//GEN-LAST:event_fullnameTextFocusLost

    private void fullnameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fullnameTextMouseClicked
        isClickedFullname = true;
    }//GEN-LAST:event_fullnameTextMouseClicked

    private void searchTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFocusLost
        if (searchText.getText().isEmpty()) {
            searchText.setForeground(Color.GRAY);
            searchText.setText("Enter username or full name");
        }
    }//GEN-LAST:event_searchTextFocusLost

    private void searchTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFocusGained
        if (searchText.getText().equals("Enter username or full name")) {
            searchText.setText("");
            searchText.setForeground(Color.BLACK); // Đổi màu văn bản khi bắt đầu nhập
        }
    }//GEN-LAST:event_searchTextFocusGained

    private void sortByDateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByDateBtnActionPerformed
        isSort = !isSort;
        
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);
        updateTable(); 
    }//GEN-LAST:event_sortByDateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton activeRadio;
    private javax.swing.JButton backToMainMenuBtn;
    private javax.swing.JPasswordField confirmText;
    private javax.swing.JButton createUser;
    private javax.swing.JLabel currentDateLabel;
    private javax.swing.JButton deleteUser;
    private javax.swing.JTextField emailText;
    private javax.swing.JTextField fullnameText;
    private javax.swing.JRadioButton inactiveRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton saveUser;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchText;
    private javax.swing.JButton sortByDateBtn;
    private javax.swing.JButton updateUser;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
