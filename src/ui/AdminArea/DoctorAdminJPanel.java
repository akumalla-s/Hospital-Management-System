/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdminArea;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.DoctorDirectory;
import model.HospitalDirectory;
import ui.Doctor.CreateDoctorJPanel;
import ui.Doctor.ViewDoctorsJPanel;

/**
 *
 * @author karthiksonti
 */
public class DoctorAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorJPanel
     */
    JPanel userProcessContainer;
    DoctorDirectory doctorDirectory;
    HospitalDirectory hospitalDirectory;
    public DoctorAdminJPanel(JPanel userProcessContainer, DoctorDirectory doctorDirectory, HospitalDirectory hospitalDirectory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
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
        addDoctors = new javax.swing.JButton();
        viewDoctors = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 208, 214));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 40, -1, -1));

        addDoctors.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addDoctors.setText("Create Doctors");
        addDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorsActionPerformed(evt);
            }
        });
        add(addDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 189, -1, -1));

        viewDoctors.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        viewDoctors.setText("View Doctors");
        viewDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDoctorsActionPerformed(evt);
            }
        });
        add(viewDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorsActionPerformed
        // TODO add your handling code here:
        CreateDoctorJPanel cdjp = new CreateDoctorJPanel(userProcessContainer,doctorDirectory,hospitalDirectory);
        userProcessContainer.add("ManageDoctor", cdjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addDoctorsActionPerformed

    private void viewDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDoctorsActionPerformed
        // TODO add your handling code here:
        if(doctorDirectory.getDoctorDirectory().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You cannot view data without entering data!!", "Info",  JOptionPane.INFORMATION_MESSAGE);
        } else {
            ViewDoctorsJPanel vdjp = new ViewDoctorsJPanel(userProcessContainer, doctorDirectory, hospitalDirectory);
            userProcessContainer.add("ManageDoctor", vdjp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewDoctorsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDoctors;
    private javax.swing.JButton backButton;
    private javax.swing.JButton viewDoctors;
    // End of variables declaration//GEN-END:variables
}
