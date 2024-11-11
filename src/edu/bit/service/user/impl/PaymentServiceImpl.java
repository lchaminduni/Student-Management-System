/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.service.user.impl;

import edu.bit.dao.CrudUtil;
import edu.bit.dao.DaoFactory;
import edu.bit.dao.Interfaces.ClassDao;
import edu.bit.dao.Interfaces.PaymentDao;
import edu.bit.dao.Interfaces.StudentDao;
import edu.bit.dto.ClassDto;
import edu.bit.dto.PaymentDto;
import edu.bit.dto.StudentDto;
import edu.bit.entity.PaymentEntity;
import edu.bit.service.user.PaymentService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class PaymentServiceImpl implements PaymentService{
    private PaymentDao paymentDao=(PaymentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.PAYMENT);
    private StudentDao studentDao = (StudentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.STUDENT);
    private ClassDao classDao = (ClassDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CLASS);
    private BigDecimal totalPayment = BigDecimal.ZERO;

    @Override
    public String savePayment(PaymentDto paymentDTO) throws Exception {
       PaymentEntity paymentEntity = new PaymentEntity(
            paymentDTO.getPaymentId(),
            paymentDTO.getStudentId(),
            paymentDTO.getTotalPayment(),
            paymentDTO.getPaymentDate(),
            paymentDTO.getMonth()
        );

        // Save payment and return a success message if successful
        if (paymentDao.savePayment(paymentEntity)) {
            return "Payment saved successfully";
        } else {
            throw new Exception("Failed to save payment");
        }
    }

    @Override
    public ArrayList<PaymentDto> getAllPayments() throws Exception {
        ArrayList<PaymentDto> paymentDtos = paymentDao.getAllPayments();
        return paymentDtos;
    }

    @Override
    public ClassDto getClassDetails(String classId) {
        try {
            return classDao.getClassDetails(classId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public PaymentDto get(int paymentId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM payment WHERE Payment_ID=?", paymentId);
    if (rst.next()) {
        // Create and return a PaymentDto instead of PaymentEntity
        return new PaymentDto(
            rst.getInt("Payment_ID"),
            rst.getString("Student_ID"),
            rst.getString("Class_ID"),  // Add this if needed
            rst.getString("Month"),
            rst.getBigDecimal("Total_Payment"),
            rst.getDate("Payment_Date")
        );
    }
    return null;
    }

    @Override
    public StudentDto findStudentNameById(String studentId) {
        try {
            return studentDao.getStudentDetails(studentId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public BigDecimal calculatePayment(String classId) {
        try {
            // Get class details to retrieve class fee
            ClassDto classDetails = classDao.getClassDetails(classId);
            if (classDetails != null) {
                BigDecimal classFee = classDetails.getClassFee();

                // Add the class fee to the total payment
                totalPayment = totalPayment.add(classFee);
            } else {
                throw new Exception("Class not found for ID: " + classId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Return the updated total payment
        return totalPayment;
    }

    @Override
    public void resetTotalPayment() {
        totalPayment = BigDecimal.ZERO;
    }

    @Override
    public boolean isStudentExists(String studentId) {
       try {
            return paymentDao.isStudentExists(studentId);
        } catch (Exception e) {
            e.printStackTrace();
            return false;  // If an error occurs, return false
        }
    }

    @Override
    public boolean isClassExists(String classId) {
        try {
            return paymentDao.isClassExists(classId);
        } catch (Exception e) {
            e.printStackTrace();
            return false;  // If an error occurs, return false
        }
    }
    
}
