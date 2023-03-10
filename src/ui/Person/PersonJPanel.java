/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Person;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author karthiksonti
 */
public class PersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonJPanel
     */
    JPanel userProcessContainer;
    PersonDirectory personDirectory;
    public PersonJPanel(JPanel userProcessContainer, PersonDirectory personDirectory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.personDirectory=personDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        personAge = new javax.swing.JTextField();
        personHouse = new javax.swing.JTextField();
        personCommunity = new javax.swing.JTextField();
        personCity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        personName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(160, 208, 214));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Person Registration");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 81, 184, 43));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setText("City");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 383, -1, -1));
        add(personAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 198, 150, 35));
        add(personHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 293, 150, 35));
        add(personCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 334, 150, 35));

        personCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personCityActionPerformed(evt);
            }
        });
        add(personCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 375, 150, 35));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 157, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Age");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 206, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 259, -1, -1));
        add(personName, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 149, 150, 35));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setText("House");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 293, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setText("Community");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 334, -1, -1));

        submitButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 431, -1, -1));

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        backButton.setText("<<BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 35, -1, -1));

        buttonGroup1.add(btnMale);
        btnMale.setText("Male");
        add(btnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 256, 70, -1));

        buttonGroup1.add(btnFemale);
        btnFemale.setText("Female");
        add(btnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 256, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        Person p  = personDirectory.addPerson();
        boolean saveFlag = true;
        
        String personNameInput = personName.getText();
        String personAgeInput = personAge.getText();
        //String personGenderInput = personSex.getText();
        String personHouseInput = personHouse.getText();
        String personCommunityInput = personCommunity.getText();
        String personCityInput = personCity.getText();
        
        int age = 0;
        
        if(personNameInput.isEmpty()){
            JOptionPane.showMessageDialog(this, "Person Name can't be empty");
            saveFlag = false;
        }else if(personNameInput.matches("[A-Z a-z]*\\s*?") == false){
            JOptionPane.showMessageDialog(this, "Enter valid person name");
            saveFlag = false;
        }else if(personAgeInput.isEmpty()){
            JOptionPane.showMessageDialog(this, "Person Age can't be empty");
            saveFlag = false;
        }else if(personAgeInput.matches("[0-9]+") == false){
            JOptionPane.showMessageDialog(this, "Person Age is Invalid");
            saveFlag = false;
        }else if(Integer.parseInt(personAgeInput) == 0){
            JOptionPane.showMessageDialog(this, "Person Age can't be zero or null");
            saveFlag = false;
        }else if(Integer.parseInt(personAgeInput)>150){
            JOptionPane.showMessageDialog(this, "Person Age is very high, please provide correct age");
            saveFlag = false;
        }else if (btnMale.isSelected() == false && btnFemale.isSelected()== false){
            JOptionPane.showMessageDialog(this, "Please select Person Gender ");
            saveFlag = false;
        }else if(personHouseInput.isEmpty()){
            JOptionPane.showMessageDialog(this, "Person House can't be empty");
            saveFlag = false;
        }else if(personHouseInput.matches("[A-Z a-z]*\\s*?") == false){
            JOptionPane.showMessageDialog(this, "Enter valid person House");
            saveFlag = false;
        }else if(personCommunityInput.isEmpty()){
            JOptionPane.showMessageDialog(this, "Person Community can't be empty");
            saveFlag = false;
        }else if(personCommunityInput.matches("[A-Z a-z]*\\s*?") == false){
            JOptionPane.showMessageDialog(this, "Enter valid person community");
            saveFlag = false;
        }else if(personCityInput.isEmpty()){
            JOptionPane.showMessageDialog(this, "Person City can't be empty");
            saveFlag = false;
        }else if(personCityInput.matches("[A-Z a-z]*\\s*?") == false){
            JOptionPane.showMessageDialog(this, "Enter valid person city");
            saveFlag = false;
        }
        
        if(saveFlag == true){
            p.setPersonAge(Integer.parseInt(personAge.getText()));
            p.setPersonCity(personCity.getText());
            p.setPersonCommunity(personCommunity.getText());
            p.setPersonHouse(personHouse.getText());
            
                if(btnMale.isSelected()){
                    String genderMale = btnMale.getText();
                    p.setPersonSex(genderMale);
                }else if(btnFemale.isSelected()){
                    String genderFemale = btnFemale.getText();
                    p.setPersonSex(genderFemale);
                }
            p.setPersonName(personName.getText());
            JOptionPane.showMessageDialog(this, "Data Saved Successfully for Person - "+ p.getPersonName()+ " with ID - "+ p.getPersonID(), "Info", JOptionPane.INFORMATION_MESSAGE);
            clearTextFields();
        }else {
            personDirectory.removePerson(p);
            Person.count--;
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void personCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_personCityActionPerformed
private void clearTextFields() {
        personAge.setText("");
        personName.setText("");
        personCity.setText("");
        personCommunity.setText("");
        
        personHouse.setText("");
        btnMale.setSelected(false);
        btnFemale.setSelected(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField personAge;
    private javax.swing.JTextField personCity;
    private javax.swing.JTextField personCommunity;
    private javax.swing.JTextField personHouse;
    private javax.swing.JTextField personName;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
