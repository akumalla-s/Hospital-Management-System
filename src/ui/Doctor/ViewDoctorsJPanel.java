/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Doctor;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.DoctorDirectory;
import model.Hospital;
import model.HospitalDirectory;

/**
 *
 * @author karthiksonti
 */
public class ViewDoctorsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDoctorsJPanel
     */
    JPanel userProcessContainer;
    DoctorDirectory doctorDirectory;

    public ViewDoctorsJPanel(JPanel userProcessContainer, DoctorDirectory doctorDirectory,  HospitalDirectory hospitalDirectory) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.doctorDirectory = doctorDirectory;
        addDoctorData();
        
        doctorHospital.removeAllItems();
        
        for (Hospital h : hospitalDirectory.getHospitalDirectory()) {
            doctorHospital.addItem(h.getHospitalName()+","+ h.getHospitalCommunity()+","+ h.getHospitalCity());
        }
        
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
        doctorData = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        viewDoctorButton = new javax.swing.JButton();
        deleteDoctorButton = new javax.swing.JButton();
        updateDoctorButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        doctorName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        doctorSex = new javax.swing.JTextField();
        doctorID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        doctorHospital = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(160, 208, 214));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctorData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "ID", "Gender", "Hospital"
            }
        ));
        jScrollPane1.setViewportView(doctorData);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 53, 543, 127));

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 18, -1, -1));

        viewDoctorButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        viewDoctorButton.setText("View");
        viewDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDoctorButtonActionPerformed(evt);
            }
        });
        add(viewDoctorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 192, -1, -1));

        deleteDoctorButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        deleteDoctorButton.setText("Delete");
        deleteDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDoctorButtonActionPerformed(evt);
            }
        });
        add(deleteDoctorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 192, -1, -1));

        updateDoctorButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        updateDoctorButton.setText("Update");
        updateDoctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDoctorButtonActionPerformed(evt);
            }
        });
        add(updateDoctorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 192, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Doctor Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 269, -1, -1));
        jLabel1.setVisible(false);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Gender");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 320, -1, 26));
        jLabel2.setVisible(false);
        add(doctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 261, 150, 35));
        doctorName.setVisible(false);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 367, -1, 26));
        jLabel3.setVisible(false);
        add(doctorSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 317, 150, 35));
        doctorSex.setVisible(false);

        doctorID.setEnabled(false);
        add(doctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 364, 150, 35));
        doctorID.setVisible(false);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Hospital");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 420, -1, -1));
        jLabel4.setVisible(false);

        doctorHospital.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        doctorHospital.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        doctorHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorHospitalActionPerformed(evt);
            }
        });
        add(doctorHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 417, -1, -1));
        doctorHospital.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void viewDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDoctorButtonActionPerformed
        // TODO add your handling code here:
        int rowIndex = doctorData.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view doctor data!!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) doctorData.getModel();
        
        Doctor doctor = (Doctor) model.getValueAt(rowIndex, 0);
        
        jLabel1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        doctorName.setVisible(true);
        doctorID.setVisible(true);
        doctorSex.setVisible(true);
        doctorHospital.setVisible(true);
        doctorName.setText(doctor.getDoctorName());
        doctorID.setText(String.valueOf(doctor.getDoctorID()));
        doctorSex.setText(String.valueOf(doctor.getDoctorSex()));
        doctorHospital.setSelectedItem(doctor.getDoctorHospital());
    }//GEN-LAST:event_viewDoctorButtonActionPerformed

    private void deleteDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDoctorButtonActionPerformed
        // TODO add your handling code here:
        int rowIndex = doctorData.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete doctor data!!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) doctorData.getModel();
        
        Doctor doctor = (Doctor) model.getValueAt(rowIndex, 0);
        doctorDirectory.removeDoctor(doctor);
        JOptionPane.showMessageDialog(this,"Doctor Data deleted successfully - "+ doctor.getDoctorName(), "Info", JOptionPane.INFORMATION_MESSAGE);
        addDoctorData();
        
        doctorName.setText("");
        doctorID.setText("");
        doctorSex.setText("");
    }//GEN-LAST:event_deleteDoctorButtonActionPerformed

    private void updateDoctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDoctorButtonActionPerformed
        // TODO add your handling code here:
        int rowIndex = doctorData.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to update doctor data!!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) doctorData.getModel();
        
        Doctor doctor = (Doctor) model.getValueAt(rowIndex, 0);
        boolean saveFlag = true;
        if(doctorID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please click on view button before you update!");
            saveFlag = false;
        }
        else if(doctorName.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Docotr Name can't be empty");
            saveFlag = false;
        }else if(doctorName.getText().matches("[A-Z a-z]*\\s*?") == false){
            JOptionPane.showMessageDialog(this, "Enter valid doctor name");
            saveFlag = false;
        }else if(doctorSex.getText().isEmpty()){
             JOptionPane.showMessageDialog(this, "Please type Male or Female");
             saveFlag = false;
        }else if(doctorSex.getText().equals("Male") == false && doctorSex.getText().equals("Female") == false){
             JOptionPane.showMessageDialog(this, "Please type Male or Female");
             saveFlag = false;
        }
        
        if(saveFlag == true){
        doctor.setDoctorName(doctorName.getText());
        doctor.setDoctorHospital(doctorHospital.getSelectedItem().toString());
        doctor.setDoctorSex(doctorSex.getText());
        JOptionPane.showMessageDialog(this,"Dcotor Data updated successfully - "+ doctor.getDoctorName(), "Info", JOptionPane.INFORMATION_MESSAGE);
        addDoctorData();
        doctorName.setText("");
        doctorID.setText("");
        //doctorHospital.setText("");
        doctorSex.setText("");
        }
    }//GEN-LAST:event_updateDoctorButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void doctorHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorHospitalActionPerformed

    private void addDoctorData() {
        
        DefaultTableModel model = (DefaultTableModel) doctorData.getModel();
        model.setRowCount(0);
        
        for (Doctor doctor : doctorDirectory.getDoctorDirectory()){
            Object[] row = new Object[4];
            row[0] = doctor;
            row[1] = doctor.getDoctorID();
            row[2] = doctor.getDoctorSex();
            row[3] = doctor.getDoctorHospital();
 
            model.addRow(row);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteDoctorButton;
    private javax.swing.JTable doctorData;
    private javax.swing.JComboBox<String> doctorHospital;
    private javax.swing.JTextField doctorID;
    private javax.swing.JTextField doctorName;
    private javax.swing.JTextField doctorSex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateDoctorButton;
    private javax.swing.JButton viewDoctorButton;
    // End of variables declaration//GEN-END:variables
}