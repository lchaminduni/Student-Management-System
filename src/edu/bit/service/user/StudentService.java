/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.bit.service.user;

import edu.bit.dto.StudentDto;
import edu.bit.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface StudentService extends SuperService{
    String register (StudentDto studentDto) throws Exception;
    String update (StudentDto studentDto) throws Exception;
    String delete (String student_Id) throws Exception;
    StudentDto get(String student_Id) throws Exception;
    ArrayList<StudentDto> getAll() throws Exception;
    
    boolean studentExists(String student_Id) throws Exception;
}
