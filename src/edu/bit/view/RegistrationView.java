/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.bit.view;

import edu.bit.Controller.StudentController;
import edu.bit.dto.StudentDto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class RegistrationView extends javax.swing.JFrame {
    
    private StudentController studentController;
    private MainDashboardView mainDashboard;

    /**
     * Creates new form RegistrationView
     */
    public RegistrationView() {
        initComponents();
        this.studentController = new StudentController(); // Initialize the studentController 
        loadTable();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close only this form
        setLocationRelativeTo(mainDashboard);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtstudentName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        txtfmName = new javax.swing.JTextField();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        txtbirthDate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtstudentId = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblregistration = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("STUDENT REGISTRATION");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Student Name:");

        txtstudentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Address:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Date of Birth:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Father/Mother Name:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Gender:");

        txtaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtfmName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        rbtnMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnMale.setForeground(new java.awt.Color(204, 51, 0));
        rbtnMale.setText("Male");
        rbtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaleActionPerformed(evt);
            }
        });

        rbtnFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbtnFemale.setForeground(new java.awt.Color(204, 51, 0));
        rbtnFemale.setText("Female");

        btnadd.setBackground(new java.awt.Color(0, 204, 0));
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(51, 153, 255));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(255, 51, 51));
        btndelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Student ID:");

        txtstudentId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tblregistration.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Address", "Date of Birth", "Father/Mother", "Contact Number", "Gender"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblregistration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblregistrationMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblregistration);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Contact Number:");

        txtcontact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtbirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtstudentName)
                                    .addComponent(txtstudentId)
                                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbtnMale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbtnFemale))
                                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfmName, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(499, 499, 499))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtstudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtstudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtbirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtfmName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rbtnMale)
                            .addComponent(rbtnFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        deleteStudent();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        updateStudent();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        addStudent();
    }//GEN-LAST:event_btnaddActionPerformed

    private void rbtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnMaleActionPerformed

    private void tblregistrationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblregistrationMouseClicked
        // Retrieve the selected row index
        DefaultTableModel dtm = (DefaultTableModel) tblregistration.getModel();
        int selectedRow = tblregistration.getSelectedRow();

        // Ensure that a row is selected
        if (selectedRow != -1) {
            // Retrieve the data from the selected row
            String student_Id = dtm.getValueAt(selectedRow, 0).toString();
            String name = dtm.getValueAt(selectedRow, 1).toString();
            String address = dtm.getValueAt(selectedRow, 2).toString();
            String birth = dtm.getValueAt(selectedRow, 3).toString();
            String fmName = dtm.getValueAt(selectedRow, 4).toString();
            String contact = dtm.getValueAt(selectedRow, 5).toString();
            String gender = dtm.getValueAt(selectedRow, 6).toString();

            // Set the values in the text fields
            txtstudentId.setText(student_Id);
            txtstudentName.setText(name);
            txtaddress.setText(address);
 
            // Parse and set the birth date
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Match the format in the table
                Date birthDate = sdf.parse(birth); // Parse birth date from the table string
                txtbirthDate.setDate(birthDate); // Set the parsed date into the JDateChooser
            } catch (ParseException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error parsing date: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

            txtfmName.setText(fmName);
            txtcontact.setText(contact);

            // Set the gender radio buttons based on the gender value from the table
            if (gender.equalsIgnoreCase("Male")) {
                rbtnMale.setSelected(true);
            } else if (gender.equalsIgnoreCase("Female")) {
                rbtnFemale.setSelected(true);
            } else {
                // Unselect both if gender is unspecified
                rbtnMale.setSelected(false);
                rbtnFemale.setSelected(false);
            }
        }
    }//GEN-LAST:event_tblregistrationMouseClicked

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
            java.util.logging.Logger.getLogger(RegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTable tblregistration;
    private javax.swing.JTextField txtaddress;
    private com.toedter.calendar.JDateChooser txtbirthDate;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtfmName;
    private javax.swing.JTextField txtstudentId;
    private javax.swing.JTextField txtstudentName;
    // End of variables declaration//GEN-END:variables
    
    private void addStudent(){
        try {
            String student_Id=txtstudentId.getText();
            String name=txtstudentName.getText();
            String address=txtaddress.getText();
            Date birth = txtbirthDate.getDate();
            if (birth == null ) {
                JOptionPane.showMessageDialog(this, "Please select a valid birth date.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Validate the birth date format
            SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
            String formattedBirthDate = sdf.format(birth);
            try {
                // This will check if the birth date is in the correct format
                sdf.parse(formattedBirthDate);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Please enter the date of birth in a valid format (MMM d, yyyy).", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            String fmName=txtfmName.getText();
            String contact=txtcontact.getText();
            
            //Check for gender selection
            String gender;
            if (rbtnMale.isSelected()) {
                gender = "Male";
            } else if (rbtnFemale.isSelected()) {
                gender = "Female";
            } else {
                JOptionPane.showMessageDialog(this, "Please select gender status.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Validate required fields
            if (student_Id==null || name==null || contact==null) {
                JOptionPane.showMessageDialog(this, "Student ID, Name, and Contact are required.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Check for duplicate student
            if (studentController.isDuplicateStudent(student_Id, name, contact)) {
                JOptionPane.showMessageDialog(this, "Duplicate student details found. Please check the Student ID, Name, and Contact.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Create the StudentDto object
            StudentDto studentDto = new StudentDto(student_Id, name, address, birth, fmName, contact, gender);
            String resp = studentController.registerStudent(studentDto);
            JOptionPane.showMessageDialog(this, resp);
            
            loadTable();
            clearForm();

            
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error at add Student: " + e.getMessage());
        }
    }
    
    private void updateStudent(){
        try {
            String student_Id = txtstudentId.getText().trim();
            String name = txtstudentName.getText().trim();
            String address = txtaddress.getText().trim();
            Date birth = txtbirthDate.getDate();
        
            // Validate birth date
            if (birth == null) {
                JOptionPane.showMessageDialog(this, "Please select a valid birth date.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
            // Validate birth date format
            SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
            String formattedBirthDate = sdf.format(birth);
            try {
                sdf.parse(formattedBirthDate);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(this, "Please enter the date of birth in a valid format (MMM d, yyyy).", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String fmName = txtfmName.getText().trim();
            String contact = txtcontact.getText().trim();
            String gender;

            // Check for gender selection
            if (rbtnMale.isSelected()) {
                gender = "Male";
            } else if (rbtnFemale.isSelected()) {
                gender = "Female";
            } else {
                JOptionPane.showMessageDialog(this, "Please select gender status.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validate required fields
            if (student_Id.isEmpty() || name.isEmpty() || contact.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Student ID, Name, and Contact are required.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Create the StudentDto object for updating
            StudentDto studentDto = new StudentDto(student_Id, name, address, birth, fmName, contact, gender);
 
            // Call the update method from the controller
            String resp = studentController.updateStudent(studentDto);
            JOptionPane.showMessageDialog(this, resp, "Update Student", JOptionPane.INFORMATION_MESSAGE);

            loadTable();  // Refresh the table with updated data
            clearForm();  // Clear the form after updating

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error at updating Student: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void deleteStudent(){
        try {
            // Retrieve the selected row index from the table
            int selectedRow = tblregistration.getSelectedRow();

            // Ensure that a row is selected
            if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select a student to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Retrieve the Student ID from the selected row
            DefaultTableModel dtm = (DefaultTableModel) tblregistration.getModel();
            String student_Id = dtm.getValueAt(selectedRow, 0).toString();

            // Confirm before deleting the student
            int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this student?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                // Call the delete method from the student controller
                String resp = studentController.deleteStudent(student_Id);

                // Display the response message
                JOptionPane.showMessageDialog(this, resp, "Delete Student", JOptionPane.INFORMATION_MESSAGE);

                // Refresh the table after deletion
                loadTable();

                // Clear the form after deletion
                clearForm();
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error at deleting Student: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void loadTable() {
    try {
        String columns[] = {"Student ID", "Student Name", "Address", "Birth of Date", "Father/Mother Name", "Contact Number", "Gender"};
        DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tblregistration.setModel(dtm);

        ArrayList<StudentDto> studentList = studentController.getAllStudents();
        if (studentList == null) {
            studentList = new ArrayList<>();
        }
        for (StudentDto student : studentList) {
            Object[] rowData = {
                student.getStudent_Id(),
                student.getName(),
                student.getAddress(),
                student.getBirth(),
                student.getFmName(),
                student.getContact(),
                student.getGender()
            };
            dtm.addRow(rowData);
        }

    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading student data: " + e.getMessage());
    }
    
}
    private void clearForm() {
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rbtnMale);
        genderGroup.add(rbtnFemale);
        
        txtstudentId.setText("");
        txtstudentName.setText("");
        txtaddress.setText("");
        txtbirthDate.setDate(null); // Clear date picker
        txtfmName.setText("");
        txtcontact.setText("");
         // Clear the radio button selection
        genderGroup.clearSelection();
    }


}

