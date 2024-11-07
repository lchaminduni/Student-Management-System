/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.dto;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class EnrollDto {
    private int enrollmentId;
    private String studentId;
    private String classId;
    private Date enrollDate;

    public EnrollDto(int enrollmentId, String studentId, String classId, Date enrollDate) {
        this.enrollmentId = enrollmentId;
        this.studentId = studentId;
        this.classId = classId;
        this.enrollDate = enrollDate;
    }
    /**
     * @return the enrollmentId
     */
    public int getEnrollmentId() {
        return enrollmentId;
    }

    /**
     * @param enrollmentId the enrollmentId to set
     */
    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    /**
     * @return the studentId
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the classId
     */
    public String getClassId() {
        return classId;
    }

    /**
     * @param classId the classId to set
     */
    public void setClassId(String classId) {
        this.classId = classId;
    }

    /**
     * @return the enrollDate
     */
    public Date getEnrollDate() {
        return enrollDate;
    }

    /**
     * @param enrollDate the enrollDate to set
     */
    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

    @Override
    public String toString() {
        return "EnrollDto{" + "enrollmentId=" + enrollmentId + ", studentId=" + studentId + ", classId=" + classId + ", enrollDate=" + enrollDate + '}';
    }
    
    

    
}
