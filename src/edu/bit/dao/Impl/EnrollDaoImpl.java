/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.dao.Impl;

import edu.bit.dao.CrudUtil;
import edu.bit.dao.Interfaces.EnrollDao;
import edu.bit.db.DBConnection;
import edu.bit.entity.EnrollEntity;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author Administrator
 */
public class EnrollDaoImpl implements EnrollDao{

    @Override
    public boolean save(EnrollEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "INSERT INTO enrollment (Enrollment_ID, Student_ID, Class_ID, Enroll_Date) VALUES (?, ?, ?, ?)",
            t.getEnrollmentId(), t.getStudentId(), t.getClassId(), t.getEnrollDate()
        );
    }

    @Override
    public boolean update(EnrollEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "UPDATE enrollment SET Student_ID=?, Class_ID=?, Enroll_Date=? WHERE Enrollment_ID=?",
            t.getStudentId(), t.getClassId(), t.getEnrollDate(), t.getEnrollmentId()
        );
    }

    @Override
    public boolean delete(int enrollmentId) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM enrollment WHERE Enrollment_ID=?", enrollmentId);
    }

    @Override
    public EnrollEntity get(int enrollmentId) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM enrollment WHERE Enrollment_ID=?", enrollmentId);
        
        if (rst.next()) {
            return new EnrollEntity(
                rst.getInt("Enrollment_ID"),
                rst.getString("Student_ID"),
                rst.getString("Class_ID"),
                rst.getDate("Enroll_Date")
            );
        }
        return null;
    }

    @Override
    public ArrayList<EnrollEntity> getAll() throws Exception {
        ArrayList<EnrollEntity> enrollEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM enrollment");
        
        while (rst.next()) {
            EnrollEntity enrollEntity = new EnrollEntity(
                rst.getInt("Enrollment_ID"),
                rst.getString("Student_ID"),
                rst.getString("Class_ID"),
                rst.getDate("Enroll_Date")
            );
            enrollEntities.add(enrollEntity);
        }
        return enrollEntities;
    }

    @Override
    public boolean isStudentExists(String studentId) throws Exception {
        String query = "SELECT COUNT(*) FROM student WHERE Student_ID = ?";
        try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(query)) {
        stmt.setString(1, studentId);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0;  // If count > 0, student exists
        }
        return false;
    }
    }

    @Override
    public boolean isClassExists(String classId) throws Exception {
        String query = "SELECT COUNT(*) FROM class WHERE Class_ID = ?";
        try (PreparedStatement stmt = DBConnection.getInstance().getConnection().prepareStatement(query)) {
        stmt.setString(1, classId);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0;  // If count > 0, class exists
        }
        return false;
    }
    }

    
}
