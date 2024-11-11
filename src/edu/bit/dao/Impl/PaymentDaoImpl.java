/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.dao.Impl;

import edu.bit.dao.CrudUtil;
import edu.bit.dao.Interfaces.PaymentDao;
import edu.bit.db.DBConnection;
import edu.bit.dto.PaymentDto;
import edu.bit.entity.PaymentEntity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Administrator
 */
public class PaymentDaoImpl implements PaymentDao{

    @Override
    public boolean savePayment(PaymentEntity paymentEnntity) throws Exception {
        return CrudUtil.executeUpdate(
            "INSERT INTO payment (Student_ID, Total_Payment, Payment_Date, Month) VALUES (?,?,?,?)",
            paymentEnntity.getStudentId(), paymentEnntity.getTotalPayment(), paymentEnntity.getPaymentDate(), paymentEnntity.getMonth()
        );
    }

    @Override
    public String findStudentNameById(String studentId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT Student_Name FROM student WHERE Student_ID=?", studentId);
        
        if (rst.next()) {
            return rst.getString("Student_Name");
        }
        return null;
    }

    @Override
    public BigDecimal findClassFeeById(String classId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT Class_Fee FROM class WHERE Class_ID=?", classId);
        
        if (rst.next()) {
            return rst.getBigDecimal("Class_Fee");
        }
        return BigDecimal.ZERO;
    }

    @Override
    public String findSubjectByClassId(String classId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT Subject FROM class WHERE Class_ID=?", classId);
        
        if (rst.next()) {
            return rst.getString("Subject");
        }
        return null;
    }

    @Override
    public ArrayList<PaymentDto> getAllPayments() throws Exception {
        ArrayList<PaymentDto> paymentDtos = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM payment");
        
        while (rst.next()) {
            PaymentDto paymentDto = new PaymentDto(
                rst.getInt("Payment_ID"),
                rst.getString("Student_ID"),
                rst.getString("Class_ID"),  // Add this line to fetch the classId
                rst.getString("Month"),
                rst.getBigDecimal("Total_Payment"),
                rst.getDate("Payment_Date")
            );
            paymentDtos.add(paymentDto);
        }
        return paymentDtos;
    }

    @Override
    public boolean isDuplicatePayment(String studentId, String month) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT COUNT(*) FROM payment WHERE Student_ID=? AND Month=?", studentId, month);
        
        if (rst.next()) {
            return rst.getInt(1) > 0; // If count > 0, duplicate exists
        }
        return false;
    }

    @Override
    public PaymentEntity get(int paymentId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM payment WHERE Payment_ID=?", paymentId);
        if (rst.next()) {
            return new PaymentEntity(
                rst.getInt("Payment_ID"),
                rst.getString("Student_ID"),
                rst.getBigDecimal("Total_Payment"),
                rst.getDate("Payment_Date"),
                rst.getString("Month")
            );
        }
        return null;
    }

    @Override
    public boolean isClassExists(String classId) throws Exception {
        String query = "SELECT COUNT(*) FROM class WHERE Class_ID = ?";
    try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(query)) {
        stmt.setString(1, classId); // Set the class ID
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1) > 0;  // If count > 0, class exists
            }
            return false;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        throw new Exception("Error checking class existence", e);
    }
    }

    @Override
    public boolean isStudentExists(String studentId) throws Exception {
        String query = "SELECT COUNT(*) FROM student WHERE Student_ID = ?";
    try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(query)) {
        stmt.setString(1, studentId); // Set the student ID
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1) > 0;  // If count > 0, student exists
            }
            return false;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        throw new Exception("Error checking student existence", e);
    }
    }

    
    
    
}
