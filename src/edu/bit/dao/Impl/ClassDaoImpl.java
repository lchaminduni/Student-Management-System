/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.dao.Impl;

import edu.bit.dao.CrudUtil;
import edu.bit.dao.Interfaces.ClassDao;
import edu.bit.dto.ClassDto;
import edu.bit.entity.ClassEntity;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClassDaoImpl implements ClassDao{
    @Override
    public boolean save(ClassEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "INSERT INTO class (Class_ID, Grade, Subject, Teacher_Name, Class_Fee, Date, Time) VALUES (?,?,?,?,?,?,?)",
            t.getClass_Id(), t.getGrade(), t.getSubject(), t.getTeacherName(), t.getClassFee(), t.getDate(), t.getTime()
        );
    }

    @Override
    public boolean update(ClassEntity t) throws Exception {
        return CrudUtil.executeUpdate(
            "UPDATE class SET Grade=?, Subject=?, Teacher_Name=?, Class_Fee=?, Date=?, Time=? WHERE Class_ID=?",
            t.getGrade(), t.getSubject(), t.getTeacherName(), t.getClassFee(), t.getDate(), t.getTime(), t.getClass_Id()
        );
    }

    @Override
    public boolean delete(String class_Id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM class WHERE Class_ID=?", class_Id);
    }

    @Override
    public ClassEntity get(String class_Id) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM class WHERE Class_ID=?", class_Id);
        
        if (rst.next()) {
            return new ClassEntity(
                rst.getString("Class_ID"),
                rst.getString("Grade"),
                rst.getString("Subject"),
                rst.getString("Teacher_Name"),
                rst.getBigDecimal("Class_Fee"),
                rst.getDate("Date"),
                rst.getString("Time")
            );
        }
        return null;
    }

    @Override
    public ArrayList<ClassEntity> getAll() throws Exception {
        ArrayList<ClassEntity> classEntities = new ArrayList<>();
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM class");
        
        while (rst.next()) {
            ClassEntity classEntity = new ClassEntity(
                rst.getString("Class_ID"),
                rst.getString("Grade"),
                rst.getString("Subject"),
                rst.getString("Teacher_Name"),
                rst.getBigDecimal("Class_Fee"),
                rst.getDate("Date"),
                rst.getString("Time")
            );
            classEntities.add(classEntity);
        }
        return classEntities;
    }

    @Override
    public ClassDto getClassDetails(String classId) throws Exception{
        ClassEntity classEntity = get(classId);
        if (classEntity != null) {
            return new ClassDto(
                    classEntity.getClass_Id(),
                    classEntity.getGrade(),
                    classEntity.getSubject(),
                    classEntity.getTeacherName(),
                    classEntity.getClassFee(),
                    classEntity.getDate(),
                    classEntity.getTime());
        }
        return null;
    }
 }
