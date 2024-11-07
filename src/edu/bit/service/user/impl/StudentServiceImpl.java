/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.service.user.impl;

import edu.bit.dao.DaoFactory;
import edu.bit.dao.Interfaces.StudentDao;
import edu.bit.db.DBConnection;
import edu.bit.dto.StudentDto;
import edu.bit.entity.StudentEntity;
import edu.bit.service.user.StudentService;
import java.util.ArrayList;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.PreparedStatement;
/**
 *
 * @author Administrator
 */
public class StudentServiceImpl implements StudentService{
    private StudentDao studentDao=(StudentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.STUDENT);

    @Override
    public String register(StudentDto studentDto) throws Exception {
        StudentEntity studentEntity=getStudentEntity(studentDto);
        return studentDao.save(studentEntity) ? "Success" : "Fail";
    }

    @Override
    public String update(StudentDto studentDto) throws Exception {
        StudentEntity studentEntity=getStudentEntity(studentDto);
        return studentDao.update(studentEntity) ? "Success" : "Fail";
    }

    @Override
    public String delete(String student_Id) throws Exception {
        return studentDao.dalete(student_Id) ? "Success" : "Fail";
    }

    @Override
    public StudentDto get(String student_Id) throws Exception {
        StudentEntity studentEntity=studentDao.get(String.valueOf(student_Id));
        if (studentEntity != null) {
           return getStudentDto(studentEntity);
        }
        return null;
    }

    @Override
    public ArrayList<StudentDto> getAll() throws Exception {
        ArrayList<StudentEntity> studentEntities=studentDao.getAll();
        if (studentEntities !=null && !studentEntities.isEmpty()) {
            ArrayList<StudentDto> studentDtos=new ArrayList<>();
            
            for (StudentEntity studentEntity:studentEntities) {
                studentDtos.add(getStudentDto(studentEntity));
            }
            return studentDtos;
        }
        return null;
    }

    @Override
    public boolean studentExists(String student_Id) throws Exception {
        String query="SELECT COUNT(*) FROM student WHERE Student_ID=?";
        try (Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement prepare=connection.prepareStatement(query))
        {
            prepare.setString(1, student_Id);
            ResultSet result=prepare.executeQuery();
            if (result.next()) {
                int count=result.getInt(1);
                return count>0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("An error occurred while checking if the student exists", e);
        }
        return true;
    }
    
    private StudentEntity getStudentEntity(StudentDto studentDto){
        return new StudentEntity(studentDto.getStudent_Id(), studentDto.getName(),studentDto.getAddress(), studentDto.getBirth(), studentDto.getFmName(), studentDto.getContact(), studentDto.getGender());
    }
    
    private StudentDto getStudentDto(StudentEntity studentEntity){
        return new StudentDto(studentEntity.getStudent_Id(), studentEntity.getName(), studentEntity.getAddress(), studentEntity.getBirth(), studentEntity.getFmName(), studentEntity.getContact(), studentEntity.getGender());
    }
    
}
