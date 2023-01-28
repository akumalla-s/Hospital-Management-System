/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Doctor;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Encounter;
import model.EncounterHistory;

/**
 *
 * @author karthiksonti
 */
public class ViewEncounterHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewEncounterHistoryJPanel
     */
    JPanel userProcessContainer;
    EncounterHistory encounterHistory;
    Encounter encounter;
    public ViewEncounterHistoryJPanel(JPanel userProcessContainer, EncounterHistory encounterHistory, Encounter encounter) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.encounterHistory = encounterHistory;
        this.encounter = encounter;
        addEncounterHistoryData();
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
        encounterHistoryData = new javax.swing.JTable();
        backButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(160, 208, 214));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        encounterHistoryData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient ID", "Age", "Doctor Name", "Doctor ID", "Temp", "Pulse", "BP", "Purpose", "Date"
            }
        ));
        jScrollPane1.setViewportView(encounterHistoryData);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 76, 730, 158));

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 29, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addEncounterHistoryData() {
        
        DefaultTableModel model = (DefaultTableModel) encounterHistoryData.getModel();
        model.setRowCount(0);
        for (Encounter e : encounterHistory.getEncounterHistory()){
            if(e.getPatientName().equals(encounter.getPatientName()) && e.getPatientID() == encounter.getPatientID() && e.getStatus().equals("Done")) {
                Object[] row = new Object[10];
                row[0] = e;
                row[1] = e.getPatientID();
                row[2] = e.getPatientAge();
                row[3] = e.getDoctorName();
                row[4] = e.getDoctorID();
                row[5] = e.getTemp();
                row[6] = e.getPulse();
                row[7] = e.getBloodPressure();
                row[8] = e.getPatientPurpose();
                row[9] = e.getEncounterDate();
                model.addRow(row);
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable encounterHistoryData;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}