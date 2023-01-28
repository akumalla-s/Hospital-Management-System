/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.DoctorDirectory;
import model.EncounterHistory;
import model.HospitalDirectory;
import model.PersonDirectory;
import ui.AdminArea.CommunityAdminJPanel;
import ui.AdminArea.DoctorAdminJPanel;
import ui.AdminArea.HospitalAdminJPanel;
import ui.Person.PersonJPanel;

/**
 *
 * @author karthiksonti
 */
public class SystemAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminJPanel
     */
    JPanel userProcessContainer;
    HospitalDirectory hospitalDirectory;
    DoctorDirectory doctorDirectory;
    PersonDirectory personDirectory;
    EncounterHistory encounterHisory;
    public SystemAdminJPanel(JPanel userProcessContainer, HospitalDirectory hospitalDirectory, DoctorDirectory doctorDirectory, PersonDirectory personDirectory, EncounterHistory encounterHisory) {
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

        backButton = new javax.swing.JButton();
        manageHospitals = new javax.swing.JButton();
        manageDoctors = new javax.swing.JButton();
        manageCommunities = new javax.swing.JButton();
        managePerson = new javax.swing.JButton();
        managePatient = new javax.swing.JButton();
        manageDoctor = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 208, 214));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 37, -1, -1));

        manageHospitals.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageHospitals.setText("Manage Hospitals");
        manageHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHospitalsActionPerformed(evt);
            }
        });
        add(manageHospitals, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 129, -1, -1));

        manageDoctors.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageDoctors.setText("Manage Doctors");
        manageDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDoctorsActionPerformed(evt);
            }
        });
        add(manageDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 129, -1, -1));

        manageCommunities.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageCommunities.setText("Manage Communities");
        manageCommunities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCommunitiesActionPerformed(evt);
            }
        });
        add(manageCommunities, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 129, -1, -1));

        managePerson.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        managePerson.setText("Person");
        managePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePersonActionPerformed(evt);
            }
        });
        add(managePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 206, -1, -1));

        managePatient.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        managePatient.setText("Patient");
        managePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePatientActionPerformed(evt);
            }
        });
        add(managePatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 206, -1, -1));

        manageDoctor.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageDoctor.setText("Doctor");
        manageDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDoctorActionPerformed(evt);
            }
        });
        add(manageDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 206, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHospitalsActionPerformed
        // TODO add your handling code here:
        HospitalAdminJPanel hajp = new HospitalAdminJPanel(userProcessContainer, hospitalDirectory);
        userProcessContainer.add("Hospital", hajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageHospitalsActionPerformed

    private void manageCommunitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCommunitiesActionPerformed
        // TODO add your handling code here:
        CommunityAdminJPanel hajp = new CommunityAdminJPanel(userProcessContainer, hospitalDirectory, personDirectory);
        userProcessContainer.add("Community", hajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageCommunitiesActionPerformed

    private void manageDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDoctorsActionPerformed
        // TODO add your handling code here:
        DoctorAdminJPanel hajp = new DoctorAdminJPanel(userProcessContainer, doctorDirectory, hospitalDirectory);
        userProcessContainer.add("Doctor", hajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDoctorsActionPerformed

    private void managePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePersonActionPerformed
        // TODO add your handling code here:
        PersonJPanel pjp = new PersonJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("AddPerson", pjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePersonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void manageDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDoctorActionPerformed
        // TODO add your handling code here:
        ViewDoctorsJPanel vdjp = new ViewDoctorsJPanel(userProcessContainer, encounterHisory);
        userProcessContainer.add("ManageDoctors", vdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDoctorActionPerformed

    private void managePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePatientActionPerformed
        // TODO add your handling code here:
        ViewPatientsJPanel vdjp = new ViewPatientsJPanel(userProcessContainer, encounterHisory);
        userProcessContainer.add("ManageDoctors", vdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton manageCommunities;
    private javax.swing.JButton manageDoctor;
    private javax.swing.JButton manageDoctors;
    private javax.swing.JButton manageHospitals;
    private javax.swing.JButton managePatient;
    private javax.swing.JButton managePerson;
    // End of variables declaration//GEN-END:variables
}
