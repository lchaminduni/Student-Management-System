/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class ClassEntity {

    
    private String class_Id;
    private String grade;
    private String subject;
    private String teacherName;
    private BigDecimal classFee;
    private Date date;
    private String time;
    
    public ClassEntity(){
        
    }
    
    public ClassEntity(String class_Id, String grade, String subject, String teacherName, BigDecimal classFee, Date date, String time) {
        this.class_Id = class_Id;
        this.grade = grade;
        this.subject = subject;
        this.teacherName = teacherName;
        this.classFee = classFee;
        this.date = date;
        this.time = time;
    }

    /**
     * @return the class_Id
     */
    public String getClass_Id() {
        return class_Id;
    }

    /**
     * @param class_Id the class_Id to set
     */
    public void setClass_Id(String class_Id) {
        this.class_Id = class_Id;
    }

    /**
     * @return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the teacherName
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * @param teacherName the teacherName to set
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * @return the classFee
     */
    public BigDecimal getClassFee() {
        return classFee;
    }

    /**
     * @param classFee the classFee to set
     */
    public void setClassFee(BigDecimal classFee) {
        this.classFee = classFee;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ClassEntity{" + "class_Id=" + class_Id + ", grade=" + grade + ", subject=" + subject + ", teacherName=" + teacherName + ", classFee=" + classFee + ", date=" + date + ", time=" + time + '}';
    }
    
    

}
