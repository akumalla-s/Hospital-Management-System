/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author karthiksonti
 */
public class Person {
    
    private String personName;
    private int personID;
    private int personAge;
    private String personCity;
    private String personCommunity;
    private String personSex;
    private String personHouse;

    public static int count = 0;
    
    @Override
    public String toString() {
        return personName; //To change body of generated methods, choose Tools | Templates.
    }
    
    public Person() {
        count++;
        personID = count;
    }
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonCity() {
        return personCity;
    }

    public void setPersonCity(String personCity) {
        this.personCity = personCity;
    }

    public String getPersonCommunity() {
        return personCommunity;
    }

    public void setPersonCommunity(String personCommunity) {
        this.personCommunity = personCommunity;
    }

    public String getPersonSex() {
        return personSex;
    }

    public void setPersonSex(String personSex) {
        this.personSex = personSex;
    }

    public String getPersonHouse() {
        return personHouse;
    }

    public void setPersonHouse(String personHouse) {
        this.personHouse = personHouse;
    }
    
    
    
}
