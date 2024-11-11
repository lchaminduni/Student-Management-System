/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class PaymentDto {
    private int paymentId;
    private String studentId;
    private String classId;
    private String month;
    private BigDecimal totalPayment;
    private Date paymentDate;

    public PaymentDto(int paymentId, String studentId, String classId, String month, BigDecimal totalPayment, Date paymentDate) {
        this.paymentId = paymentId;
        this.studentId = studentId;
        this.classId = classId;
        this.month = month;
        this.totalPayment = totalPayment;
        this.paymentDate = paymentDate;
    }

    /**
     * @return the paymentId
     */
    public int getPaymentId() {
        return paymentId;
    }

    /**
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
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
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return the totalPayment
     */
    public BigDecimal getTotalPayment() {
        return totalPayment;
    }

    /**
     * @param totalPayment the totalPayment to set
     */
    public void setTotalPayment(BigDecimal totalPayment) {
        this.totalPayment = totalPayment;
    }

    /**
     * @return the paymentDate
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate the paymentDate to set
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    @Override
    public String toString() {
        return "PaymentDto{" + "paymentId=" + paymentId + ", studentId=" + studentId + ", classId=" + classId + ", month=" + month + ", totalPayment=" + totalPayment + ", paymentDate=" + paymentDate + '}';
    }
    
}
