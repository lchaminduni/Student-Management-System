/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.bit.service.user;

import edu.bit.dto.ClassDto;
import edu.bit.dto.PaymentDto;
import edu.bit.dto.StudentDto;
import edu.bit.service.SuperService;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface PaymentService extends SuperService{
    String savePayment(PaymentDto paymentDTO) throws Exception;
    ArrayList<PaymentDto> getAllPayments() throws Exception;
    public ClassDto getClassDetails(String classId);
    PaymentDto get(int paymentId) throws Exception;
    public StudentDto findStudentNameById(String studentId);
    
    BigDecimal calculatePayment(String classId);
    void resetTotalPayment();

    public boolean isStudentExists(String studentId);

    public boolean isClassExists(String classId);
}
