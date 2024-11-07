/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.Controller;

import edu.bit.dto.ClassDto;
import edu.bit.dto.EnrollDto;
import edu.bit.dto.StudentDto;
import edu.bit.service.ServiceFactory;
import edu.bit.service.user.EnrollService;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class EnrollController {
    private ArrayList<EnrollDto> enrollDtos;
    
    public EnrollController(){
        enrollDtos =new ArrayList<>();
    }
    
    private EnrollService enrollService=(EnrollService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ENROLLMENT);
    
    public String enrollStudent(EnrollDto enrollDto) throws Exception{
        return enrollService.enroll(enrollDto);
    }
    
    public String updateEnroll (EnrollDto enrollDto) throws Exception{
        return enrollService.update(enrollDto);
    }
    
    public String deleteEnroll (int enrollment_Id) throws Exception{
        return enrollService.delete(enrollment_Id);
    }
    
    public ArrayList<EnrollDto> getAllEnrollments() throws Exception{
        return enrollService.getAll();
    }
    
    public EnrollDto get(int enrollment_Id) throws Exception{
        return enrollService.get(enrollment_Id);
    }

    public boolean isStudentExists(String studentId) {
        return enrollService.isStudentExists(studentId);
    }

    public boolean isClassExists(String classId) {
        return enrollService.isClassExists(classId);
    }
    
    public boolean isDuplicateEnrollment(String studentId, String classId) throws Exception {
        // This method checks if a student is already enrolled in the specified class
        ArrayList<EnrollDto> enrollmentList = getAllEnrollments();
        for (EnrollDto enrollDto : enrollmentList) {
            if (enrollDto.getStudentId().equals(studentId) && enrollDto.getClassId().equals(classId)) {
                return true; // Duplicate enrollment found
            }
        }
        return false; // No duplicate enrollment
    }

    public ClassDto getClassDetails(String classId) {
        return enrollService.getClassDetails(classId);
    }

    public StudentDto getStudentDetails(String studentId) {
        return enrollService.getStudentDetails(studentId);
    }

}
