/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Admin;

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
public class ViewDoctorsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDoctorsJPanel
     */
    JPanel userProcessContainer;
    EncounterHistory encounterHistory;
    public ViewDoctorsJPanel(JPanel userProcessContainer, EncounterHistory encounterHistory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.encounterHistory=encounterHistory;
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

        backButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        encounterHistoryData = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();

        setBackground(new java.awt.Color(160, 208, 214));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 29, -1, -1));

        encounterHistoryData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient ID", "Doctor Name", "Doctor ID", "Purpose", "Date", "Status"
            }
        ));
        jScrollPane2.setViewportView(encounterHistoryData);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 76, 640, 158));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setText("Enter Details to Search");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 273, -1, -1));

        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextKeyPressed(evt);
            }
        });
        add(searchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 264, 139, 36));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) encounterHistoryData.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        encounterHistoryData.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchText.getText().trim()));
    }//GEN-LAST:event_searchTextActionPerformed

    private void searchTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) encounterHistoryData.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        encounterHistoryData.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchText.getText().trim()));
    }//GEN-LAST:event_searchTextKeyPressed

    private void addEncounterHistoryData() {
        
        DefaultTableModel model = (DefaultTableModel) encounterHistoryData.getModel();
        model.setRowCount(0);
        for (Encounter e : encounterHistory.getEncounterHistory()){
            Object[] row = new Object[8];
            row[0] = e;
            row[1] = e.getPatientID();
            row[2] = e.getDoctorName();
            row[3] = e.getDoctorID();
            row[4] = e.getPatientPurpose();
            row[5] = e.getEncounterDate();
            row[6] = e.getStatus();
            model.addRow(row);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable encounterHistoryData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField searchText;
    // End of variables declaration//GEN-END:variables
}