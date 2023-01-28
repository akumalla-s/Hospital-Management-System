/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdminArea;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.HospitalDirectory;
import model.PersonDirectory;
import ui.Community.ManageHospitalJPanel;
import ui.Community.ManagePeopleJPanel;

/**
 *
 * @author karthiksonti
 */
public class CommunityAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityAdminJPanel
     */
    JPanel userProcessContainer;
    HospitalDirectory hospitalDirectory;
    PersonDirectory personDirectory;
    public CommunityAdminJPanel(JPanel userProcessContainer, HospitalDirectory hospitalDirectory, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.hospitalDirectory = hospitalDirectory;
        this.personDirectory = personDirectory;
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
        hospitalButton = new javax.swing.JButton();
        peopleButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 208, 214));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        hospitalButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        hospitalButton.setText("Manage Hospitals");
        hospitalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalButtonActionPerformed(evt);
            }
        });
        add(hospitalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        peopleButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        peopleButton.setText("Manage People");
        peopleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peopleButtonActionPerformed(evt);
            }
        });
        add(peopleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backButtonActionPerformed

    private void hospitalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalButtonActionPerformed
        // TODO add your handling code here:
        ManageHospitalJPanel mhjp = new ManageHospitalJPanel(userProcessContainer, hospitalDirectory);
        userProcessContainer.add("ManageHospital", mhjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_hospitalButtonActionPerformed

    private void peopleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peopleButtonActionPerformed
        // TODO add your handling code here:
        ManagePeopleJPanel mpjp = new ManagePeopleJPanel(userProcessContainer, personDirectory);
        userProcessContainer.add("ManagePeople", mpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_peopleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton hospitalButton;
    private javax.swing.JButton peopleButton;
    // End of variables declaration//GEN-END:variables
}