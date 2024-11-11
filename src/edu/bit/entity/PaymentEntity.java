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
public class PaymentEntity {
    private int paymentId;
    private String studentId;
    private String month;
    private BigDecimal totalPayment;
    private Date paymentDate;

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

    @Override
    public String toString() {
        return "PaymentEntity{" + "paymentId=" + paymentId + ", studentId=" + studentId + ", totalPayment=" + totalPayment + ", paymentDate=" + paymentDate + ", month=" + month + '}';
    }

    public PaymentEntity(int paymentId, String studentId, BigDecimal totalPayment, Date paymentDate, String month) {
        this.paymentId = paymentId;
        this.studentId = studentId;
        this.totalPayment = totalPayment;
        this.paymentDate = paymentDate;
        this.month = month;
    }

    /**
     * @return the paymentId
     */
    
    
}
