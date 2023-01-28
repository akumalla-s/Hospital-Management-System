/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Patient;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author karthiksonti
 */
public class CreatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePatientJPanel
     */
    JPanel userProcessContainer;
    PersonDirectory personDirectory;
    DoctorDirectory doctorDirectory;
    EncounterHistory encounterHistory;
    public CreatePatientJPanel(JPanel userProcessContainer, PersonDirectory personDirectory, DoctorDirectory doctorDirectory, EncounterHistory encounterHistory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.personDirectory = personDirectory;
        this.doctorDirectory = doctorDirectory;
        this.encounterHistory = encounterHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        patientName = new javax.swing.JTextField();
        patientID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 208, 214));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));
        add(patientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 122, 150, 35));
        add(patientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 175, 150, 35));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("ID");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 183, -1, -1));

        submitButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 245, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        boolean flag = false;

        for (Person p : personDirectory.getPersonDirectory()) {
            if(patientName.getText().trim().toString().equals(p.getPersonName()) && patientID.getText().trim().toString().equals(String.valueOf(p.getPersonID()))){
                PatientAppointmentJPanel pajp = new PatientAppointmentJPanel(userProcessContainer, doctorDirectory, p, encounterHistory);
                userProcessContainer.add("PatientAppointment", pajp);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                flag = true;
            }
        }

        if(!flag) {
            JOptionPane.showMessageDialog(this, "Data not found for  "+ patientName.getText()+"Please Register First!!!", "Info", JOptionPane.INFORMATION_MESSAGE);
        }

        patientName.setText("");
        patientID.setText("");
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField patientID;
    private javax.swing.JTextField patientName;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}