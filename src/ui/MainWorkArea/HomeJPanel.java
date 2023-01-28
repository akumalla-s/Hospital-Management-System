/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.MainWorkArea;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.PersonDirectory;
import ui.AdminArea.CommunityAdminJPanel;
import ui.AdminArea.DoctorAdminJPanel;
import ui.AdminArea.HospitalAdminJPanel;
import ui.Doctor.DoctorJPanel;
import ui.Patient.CreatePatientJPanel;
import ui.Person.PersonJPanel;

/**
 *
 * @author karthiksonti
 */
public class HomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomeJPanel
     */
    JPanel userProcessContainer;
    HospitalDirectory hospitalDirectory;
    DoctorDirectory doctorDirectory;
    PersonDirectory personDirectory;
    EncounterHistory encounterHisory;
    public HomeJPanel(JPanel userProcessContainer, HospitalDirectory hospitalDirectory, DoctorDirectory doctorDirectory, PersonDirectory personDirectory, EncounterHistory encounterHisory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospitalDirectory = hospitalDirectory;
        this.doctorDirectory = doctorDirectory;
        this.personDirectory = personDirectory;
        this.encounterHisory = encounterHisory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminMenu = new javax.swing.JButton();
        hospitalAdminButton = new javax.swing.JButton();
        doctorAdminButton = new javax.swing.JButton();
        communityAdminButton = new javax.swing.JButton();
        personButton = new javax.swing.JButton();
        patientButton = new javax.swing.JButton();
        doctorButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 208, 214));
        setForeground(new java.awt.Color(255, 206, 108));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminMenu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        adminMenu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        adminMenu.setText("Admin Menu");
        adminMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminMenuActionPerformed(evt);
            }
        });
        add(adminMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 55, -1, -1));

        hospitalAdminButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        hospitalAdminButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        hospitalAdminButton.setText("Hospital Admin");
        hospitalAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalAdminButtonActionPerformed(evt);
            }
        });
        add(hospitalAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 130, -1, -1));
        hospitalAdminButton.setVisible(false);

        doctorAdminButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        doctorAdminButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        doctorAdminButton.setText("Doctor Admin");
        doctorAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorAdminButtonActionPerformed(evt);
            }
        });
        add(doctorAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));
        doctorAdminButton.setVisible(false);

        communityAdminButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        communityAdminButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        communityAdminButton.setText("Community Admin");
        communityAdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityAdminButtonActionPerformed(evt);
            }
        });
        add(communityAdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 130, -1, -1));
        communityAdminButton.setVisible(false);

        personButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        personButton.setText("Person");
        personButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personButtonActionPerformed(evt);
            }
        });
        add(personButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        patientButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        patientButton.setText("Patient");
        patientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientButtonActionPerformed(evt);
            }
        });
        add(patientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, -1, -1));

        doctorButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        doctorButton.setText("Doctor");
        doctorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorButtonActionPerformed(evt);
            }
        });
        add(doctorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 255, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void patientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientButtonActionPerformed
        // TODO add your handling code here:
        CreatePatientJPanel pjp = new CreatePatientJPanel(userProcessContainer, personDirectory, doctorDirectory, encounterHisory);
        userProcessContainer.add("AddPatient", pjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_patientButtonActionPerformed

    private void hospitalAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalAdminButtonActionPerformed
        // TODO add your handling code here:
        HospitalAdminJPanel hajp = new HospitalAdminJPanel(userProcessContainer, hospitalDirectory);
        userProcessContainer.add("Hospital", hajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hospitalAdminButtonActionPerformed

    private void doctorAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorAdminButtonActionPerformed
        // TODO add your handling code here:
        if(hospitalDirectory.getHospitalDirectory().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You cannot perform doctor operationsata without entering hospital data!!", "Info",  JOptionPane.INFORMATION_MESSAGE);
        } else {
            DoctorAdminJPanel hajp = new DoctorAdminJPanel(userProcessContainer, doctorDirectory, hospitalDirectory);
            userProcessContainer.add("Doctor", hajp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_doctorAdminButtonActionPerformed

    private void communityAdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityAdminButtonActionPerformed
        // TODO add your handling code here:
        CommunityAdminJPanel hajp = new CommunityAdminJPanel(userProcessContainer, hospitalDirectory, personDirectory);
        userProcessContainer.add("Community", hajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_communityAdminButtonActionPerformed

    private void personButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personButtonActionPerformed
        // TODO add your handling code here:
        PersonJPanel pjp = new PersonJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("AddPerson", pjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_personButtonActionPerformed

    private void doctorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorButtonActionPerformed
        // TODO add your handling code here:
        DoctorJPanel djp = new DoctorJPanel(userProcessContainer, encounterHisory, doctorDirectory);
        userProcessContainer.add("AddPatient", djp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_doctorButtonActionPerformed

    private void adminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminMenuActionPerformed
        // TODO add your handling code here:
        doctorAdminButton.setVisible(true);
        communityAdminButton.setVisible(true);
        hospitalAdminButton.setVisible(true);
    }//GEN-LAST:event_adminMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminMenu;
    private javax.swing.JButton communityAdminButton;
    private javax.swing.JButton doctorAdminButton;
    private javax.swing.JButton doctorButton;
    private javax.swing.JButton hospitalAdminButton;
    private javax.swing.JButton patientButton;
    private javax.swing.JButton personButton;
    // End of variables declaration//GEN-END:variables
}