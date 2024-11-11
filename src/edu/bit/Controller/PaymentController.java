/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.Controller;

import edu.bit.dao.Interfaces.ClassDao;
import edu.bit.dto.ClassDto;
import edu.bit.dto.PaymentDto;
import edu.bit.dto.StudentDto;
import edu.bit.service.ServiceFactory;
import edu.bit.service.user.PaymentService;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class PaymentController {
    private ArrayList<PaymentDto> paymentDtos;
    
    public PaymentController() {
        paymentDtos = new ArrayList<>();
    }
    
    private PaymentService paymentService = (PaymentService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.PAYMENT);
    
    // Method to save a payment
    public String savePayment(PaymentDto paymentDTO) throws Exception {
        return paymentService.savePayment(paymentDTO);
    }
    
    // Method to find student name by student ID
    public StudentDto findStudentNameById(String studentId){
        return paymentService.findStudentNameById(studentId);
    }
    
    // Method to find class fee by class ID
    
    // Method to check if a payment already exists for a given student and month
    public boolean isDuplicatePayment(String studentId, String month) throws Exception {
        ArrayList<PaymentDto> paymentList = getAllPayments(); // Get all existing payments
        for (PaymentDto paymentDto : paymentList) {
            if (paymentDto.getStudentId().equals(studentId) && paymentDto.getMonth().equalsIgnoreCase(month)) {
                return true; // Duplicate payment found
            }
        }
        return false; // No duplicate found
    }
    
    // Method to get all payments (this can be expanded as needed)
    public ArrayList<PaymentDto> getAllPayments() throws Exception {
        // Implement logic to fetch all payment data from database or service
        return paymentService.getAllPayments(); // Example method, replace with actual implementation
    }

    public ClassDto getClassDetails(String classId) {
        return paymentService.getClassDetails(classId);
    }

    public double getClassFeeById(String classId) throws Exception{
        ClassDto classDetails = paymentService.getClassDetails(classId);
        if (classDetails != null) {
            return classDetails.getClassFee().doubleValue();
        } else {
            throw new Exception("Class not found.");
        }
    }

    public boolean isStudentExists(String studentId) {
        try {
        return paymentService.isStudentExists(studentId);  // Call the service method to check if the student exists
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
    }

    public boolean isClassExists(String classId) {
        try {
        return paymentService.isClassExists(classId);  // Call the service method to check if the class exists
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
    }
}
