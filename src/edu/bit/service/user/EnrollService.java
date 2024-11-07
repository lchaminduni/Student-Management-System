/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.bit.service.user;

import edu.bit.dto.ClassDto;
import edu.bit.dto.EnrollDto;
import edu.bit.dto.StudentDto;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface EnrollService {
    String enroll (EnrollDto enrollDto) throws Exception;
    String update (EnrollDto enrollDto) throws Exception;
    String delete (int enrollment_Id) throws Exception;
    EnrollDto get(int enrollment_Id) throws Exception;
    ArrayList<EnrollDto> getAll() throws Exception;
    
    boolean enrollExists(int enrollment_Id) throws Exception;

    public boolean isStudentExists(String studentId);

    public boolean isClassExists(String classId);

    public ClassDto getClassDetails(String classId);

    public StudentDto getStudentDetails(String studentId);

}
