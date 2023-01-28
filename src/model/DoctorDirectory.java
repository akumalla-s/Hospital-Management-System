/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author karthiksonti
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctorDirectory;
    
    public DoctorDirectory() {
        this.doctorDirectory = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public Doctor addDoctor() {
        Doctor d = new Doctor();
        doctorDirectory.add(d);
        return d;
    }
    
    public void removeDoctor(Doctor d){
        doctorDirectory.remove(d);
    }
}
