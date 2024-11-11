/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.bit.dao.Interfaces;

import edu.bit.dao.SuperDao;
import edu.bit.dto.PaymentDto;
import edu.bit.entity.PaymentEntity;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface PaymentDao extends SuperDao{
    // Save a payment to the database
    boolean savePayment(PaymentEntity paymentEntity) throws Exception;
    
    // Find student name by student ID
    String findStudentNameById(String studentId) throws Exception;
    
    // Find class fee by class ID
    BigDecimal findClassFeeById(String classId) throws Exception;
    
    // Find subject by class ID
    String findSubjectByClassId(String classId) throws Exception;
    
    // Retrieve all payments
    ArrayList<PaymentDto> getAllPayments() throws Exception;
    
    // Check if a duplicate payment exists for a student in the same month
    boolean isDuplicatePayment(String studentId, String month) throws Exception;

    PaymentEntity get(int paymentId)throws Exception;

    public boolean isClassExists(String classId)throws Exception;

    public boolean isStudentExists(String studentId) throws Exception;
    
}
