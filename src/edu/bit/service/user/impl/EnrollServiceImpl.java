/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.service.user.impl;

import edu.bit.dao.DaoFactory;
import edu.bit.dao.Interfaces.ClassDao;
import edu.bit.dao.Interfaces.EnrollDao;
import edu.bit.dao.Interfaces.StudentDao;
import edu.bit.db.DBConnection;
import edu.bit.dto.ClassDto;
import edu.bit.dto.EnrollDto;
import edu.bit.dto.StudentDto;
import edu.bit.entity.EnrollEntity;
import edu.bit.service.SuperService;
import edu.bit.service.user.EnrollService;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EnrollServiceImpl implements EnrollService,SuperService{
    private EnrollDao enrollDao=(EnrollDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ENROLLMENT);
    private StudentDao studentDao = (StudentDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.STUDENT);
    private ClassDao classDao = (ClassDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CLASS);

    @Override
    public String enroll(EnrollDto enrollDto) throws Exception {
        EnrollEntity enrollEntity=getEnrollEntity(enrollDto);
        return enrollDao.save(enrollEntity) ? "Success" : "Fail";
    }

    @Override
    public String update(EnrollDto enrollDto) throws Exception {
        EnrollEntity enrollEntity=getEnrollEntity(enrollDto);
        return enrollDao.update(enrollEntity) ? "Success" : "Fail";
    }


    @Override
    public EnrollDto get(int enrollmentId) throws Exception {
        EnrollEntity enrollEntity=enrollDao.get(Integer.valueOf(enrollmentId));
        if(enrollEntity !=null){
            return getEnrollDto(enrollEntity);
        }
        return null;
    }

    @Override
    public ArrayList<EnrollDto> getAll() throws Exception {
        ArrayList<EnrollEntity> enrollEntities = enrollDao.getAll();
        if (enrollEntities != null && !enrollEntities.isEmpty()) {
            ArrayList<EnrollDto> enrollDtos = new ArrayList<>();

            for (EnrollEntity enrollEntity : enrollEntities) {
                enrollDtos.add(getEnrollDto(enrollEntity));
            }
            return enrollDtos;
        }
        return null;
    }

    @Override
    public boolean enrollExists(int enrollmentId) throws Exception {
        String query="SELECT COUNT (*) FROM enrollment WHERE Enrollment_ID=?";
        try (Connection connection=DBConnection.getInstance().getConnection();
                PreparedStatement prepare=connection.prepareStatement(query)){
            prepare.setInt(1, enrollmentId);
            ResultSet resultSet=prepare.executeQuery();
            
            if (resultSet.next()) {
                int count=resultSet.getInt(1);
                return count>0;
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("An error occurred while checking if the enrollment exists", e);
        }
        return true;
    }
    
    private EnrollEntity getEnrollEntity(EnrollDto enrollDto){
        return new EnrollEntity(enrollDto.getEnrollmentId(), enrollDto.getStudentId(), enrollDto.getClassId(), enrollDto.getEnrollDate());
    }
    
    private EnrollDto getEnrollDto(EnrollEntity enrollEntity){
        return new EnrollDto(enrollEntity.getEnrollmentId(), enrollEntity.getStudentId(), enrollEntity.getClassId(), enrollEntity.getEnrollDate());
    }

    @Override
    public String delete(int enrollment_Id) throws Exception {
        return enrollDao.delete(enrollment_Id) ? "Success" : "Fail";
    }

    @Override
    public boolean isStudentExists(String studentId) {
        try {
            return enrollDao.isStudentExists(studentId);
        } catch (Exception e) {
            e.printStackTrace();
            return false;  // If an error occurs, return false
        }
    }

    @Override
    public boolean isClassExists(String classId) {
        try {
            return enrollDao.isClassExists(classId);
        } catch (Exception e) {
            e.printStackTrace();
            return false;  // If an error occurs, return false
        }
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
    public StudentDto getStudentDetails(String studentId) {
        try {
            return studentDao.getStudentDetails(studentId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    
}
  