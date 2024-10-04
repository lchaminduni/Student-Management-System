/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.dao.Impl;

import edu.bit.dao.CrudUtil;
import edu.bit.dao.Interfaces.StudentDao;
import edu.bit.entity.StudentEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class StudentDaoImpl implements StudentDao{

    @Override
    public boolean save(StudentEntity t) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO student VALUES (?,?,?,?,?,?,?)",t.getStudent_Id(),t.getName(),t.getAddress(),t.getBirth(),t.getFmName(),t.getContact(),t.getGender());
    }

    @Override
    public boolean update(StudentEntity t) throws Exception {
        return CrudUtil.executeUpdate("UPDATE student SET Student_Name=?,Address=?, Date_of_Birth=?, Father_Mother_Name=?, Contact_Number=?, Gender=? WHERE Student_ID=?", t.getName(),t.getAddress(),t.getBirth(),t.getFmName(),t.getContact(),t.getGender(),t.getStudent_Id());
    }

    @Override
    public boolean dalete(String Id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM student WHERE Student_ID=?", Id);
    }

    @Override
    public StudentEntity get(String Id) throws Exception {
        ResultSet rst=CrudUtil.executeQuery("SELECT * FROM student WHERE Student_ID=?", Id);
        
        if (rst.next()) {
            StudentEntity studentEntity=new StudentEntity(rst.getString("Student_ID"), rst.getString("Student_Name"), rst.getString("Address"), rst.getDate("Date_of_Birth"), rst.getString("Father_Mother_Name"), rst.getString("Contact_Number"), rst.getString("Gender"));
            return studentEntity;
        }
        return null;
    }

    @Override
    public ArrayList<StudentEntity> getAll() throws Exception {
        ArrayList<StudentEntity> studentEntities=new ArrayList<>();
        ResultSet rst=CrudUtil.executeQuery("SELECT * FROM student");
        while (rst.next()) {
            StudentEntity studentEntity=new StudentEntity(rst.getString("Student_ID"), rst.getString("Student_Name"), rst.getString("Address"), rst.getDate("Date_of_Birth"), rst.getString("Father_Mother_Name"), rst.getString("Contact_Number"), rst.getString("Gender"));
            
            studentEntities.add(studentEntity);
        }
        return studentEntities;
    }
    
}
