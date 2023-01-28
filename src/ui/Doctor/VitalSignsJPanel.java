/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Doctor;

import java.awt.CardLayout;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.Encounter;
import model.EncounterHistory;

/**
 *
 * @author karthiksonti
 */
public class VitalSignsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VitalSignsJPanel
     */
    JPanel userProcessContainer;
    EncounterHistory encounterHistory;
    Doctor doctor;
    
    public VitalSignsJPanel(JPanel userProcessContainer, Doctor doctor, EncounterHistory encounterHistory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.doctor = doctor;
        this.encounterHistory = encounterHistory;
        addEncounterData();
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
        encounterData = new javax.swing.JTable();
        backButton = new javax.swing.JButton();
        vitalSignsButton = new javax.swing.JButton();
        encounterHistoryButton = new javax.swing.JButton();
        temperatureData = new javax.swing.JTextField();
        pulse = new javax.swing.JTextField();
        bloodPressure = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 208, 214));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        encounterData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "ID", "Age", "Gender", "Purpose"
            }
        ));
        jScrollPane1.setViewportView(encounterData);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 59, -1, 172));

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 12, -1, -1));

        vitalSignsButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        vitalSignsButton.setText("Add Vital Signs");
        vitalSignsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalSignsButtonActionPerformed(evt);
            }
        });
        add(vitalSignsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 237, -1, -1));

        encounterHistoryButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        encounterHistoryButton.setText("View Encounter History");
        encounterHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounterHistoryButtonActionPerformed(evt);
            }
        });
        add(encounterHistoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 237, -1, -1));
        add(temperatureData, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 294, 150, 35));
        temperatureData.setVisible(false);
        add(pulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 335, 150, 35));
        pulse.setVisible(false);
        add(bloodPressure, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 376, 150, 35));
        bloodPressure.setVisible(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Temperature");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 302, -1, -1));
        jLabel1.setVisible(false);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Pulse");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 343, -1, -1));
        jLabel2.setVisible(false);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setText("Blood Pressure");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 384, -1, -1));
        jLabel3.setVisible(false);

        submitButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 423, -1, -1));
        submitButton.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void vitalSignsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalSignsButtonActionPerformed
        // TODO add your handling code here:
        int rowIndex = encounterData.getSelectedRow();
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to add vital signs data!!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else {
            temperatureData.setVisible(true);
            pulse.setVisible(true);
            bloodPressure.setVisible(true);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            submitButton.setVisible(true);
        }
    }//GEN-LAST:event_vitalSignsButtonActionPerformed

    private void encounterHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterHistoryButtonActionPerformed
        // TODO add your handling code here:
        boolean flag = false;
        int rowIndex = encounterData.getSelectedRow();
        
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "You cannot view history without selecting a row.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
        
                
        DefaultTableModel model = (DefaultTableModel) encounterData.getModel();
        
        Encounter encounter = (Encounter) model.getValueAt(rowIndex, 0);
        
        for (Encounter e : encounterHistory.getEncounterHistory()){
            if(e.getPatientName().equals(encounter.getPatientName()) && e.getPatientID() == encounter.getPatientID() && e.getStatus().equals("Done")) {
               flag = true;
                break;
            }
        }
        
        if(flag) {
            ViewEncounterHistoryJPanel vehjp = new ViewEncounterHistoryJPanel(userProcessContainer, encounterHistory, encounter);
            userProcessContainer.add("VitalSignsHistory", vehjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else{
            JOptionPane.showMessageDialog(this, "Encounter History not found for this Patient", "Info", JOptionPane.INFORMATION_MESSAGE);  
        }
    }//GEN-LAST:event_encounterHistoryButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        int rowIndex = encounterData.getSelectedRow();
        
        if (rowIndex<0){
            JOptionPane.showMessageDialog(this, "You cannot submit data without enternig vital signs.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        } 
            
        DefaultTableModel model = (DefaultTableModel) encounterData.getModel();
        
        Encounter encounter = (Encounter) model.getValueAt(rowIndex, 0);
        
        boolean saveFlag = true;
        String temperatureDataInput = temperatureData.getText();
        String pulseInput = pulse.getText();
        String bloodPressureInput= bloodPressure.getText();
        if(temperatureData.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please input Temperature");
            saveFlag = false;
        }else if(pulse.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please input Pulse");
            saveFlag = false;
        }else if(bloodPressure.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please input Blood Pressure");
            saveFlag = false;
        }
        try{
            double temp = Double.parseDouble(temperatureDataInput);
            int pul = Integer.parseInt(pulseInput);
            double bp = Double.parseDouble(bloodPressureInput);
            
            if(temp >105 || temp <95){
            JOptionPane.showMessageDialog(this, "Please input correct temperature between 95 to 105");
            saveFlag = false;
            }
            if(pul >100 || pul <60){
            JOptionPane.showMessageDialog(this, "Please input correct pulse between 60 to 100");
            saveFlag = false;
            }
            if(bp >180 || bp <120){
            JOptionPane.showMessageDialog(this, "Please input correct blood pressure between 120 to 180");
            saveFlag = false;
            }
            
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please check the values");
            saveFlag = false;
        }
        
        
        
        if(saveFlag == true){
            
            
            encounter.setDoctorID(doctor.getDoctorID());
            encounter.setDoctorName(doctor.getDoctorName());
            encounter.setBloodPressure(Double.valueOf(bloodPressure.getText()));
            encounter.setPulse(Integer.valueOf(pulse.getText()));
            encounter.setTemp(Double.valueOf(temperatureData.getText()));
            //encounter.setEncounterDate(dtf.format(now));
            encounter.setStatus("Done");
            
        
            addEncounterData();
        
            bloodPressure.setText("");
            temperatureData.setText("");
            pulse.setText("");
        
            JOptionPane.showMessageDialog(this, "entered vital signs successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void addEncounterData() {
        
        DefaultTableModel model = (DefaultTableModel) encounterData.getModel();
        model.setRowCount(0);
        
        for (Encounter encounter : encounterHistory.getEncounterHistory()){
            if(encounter.getDoctorName().equals(doctor.getDoctorName()) && encounter.getDoctorID() == doctor.getDoctorID() && encounter.getStatus().equals("Booked")) {
                Object[] row = new Object[5];
                row[0] = encounter;
                row[1] = encounter.getPatientID();
                row[2] = encounter.getPatientAge();
                row[3] = encounter.getPatientSex();
                row[4] = encounter.getPatientPurpose();

                model.addRow(row);
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bloodPressure;
    private javax.swing.JTable encounterData;
    private javax.swing.JButton encounterHistoryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pulse;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField temperatureData;
    private javax.swing.JButton vitalSignsButton;
    // End of variables declaration//GEN-END:variables
}