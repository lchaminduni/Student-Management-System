/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.entity;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class StudentEntity {
    private String student_Id;
    private String name;
    private String address;
    private Date birth;
    private String fmName;
    private String contact;
    private String gender;

    public StudentEntity() {
    }

    public StudentEntity(String student_Id, String name, String address, Date birth, String fmName, String contact, String gender) {
        this.student_Id = student_Id;
        this.name = name;
        this.address = address;
        this.birth = birth;
        this.fmName = fmName;
        this.contact = contact;
        this.gender = gender;
    }

    /**
     * @return the student_Id
     */
    public String getStudent_Id() {
        return student_Id;
    }

    /**
     * @param student_Id the student_Id to set
     */
    public void setStudent_Id(String student_Id) {
        this.student_Id = student_Id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the birth
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * @param birth the birth to set
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * @return the fmName
     */
    public String getFmName() {
        return fmName;
    }

    /**
     * @param fmName the fmName to set
     */
    public void setFmName(String fmName) {
        this.fmName = fmName;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "StudentEntity{" + "student_Id=" + student_Id + ", name=" + name + ", address=" + address + ", birth=" + birth + ", fmName=" + fmName + ", contact=" + contact + ", gender=" + gender + '}';
    }
    
    
    
}
