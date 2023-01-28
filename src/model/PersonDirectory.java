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
public class PersonDirectory {
    private ArrayList<Person> personDirectory;
    
    public PersonDirectory() {
        this.personDirectory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person addPerson() {
        Person p = new Person();
        personDirectory.add(p);
        return p;
    }
    
    public void removePerson(Person p){
        personDirectory.remove(p);
    }
    
}
