/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.Controller;

import edu.bit.dto.StudentDto;
import edu.bit.service.ServiceFactory;
import edu.bit.service.user.StudentService;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class StudentController {
    private ArrayList<StudentDto> studentDtos;

    public StudentController() {
        studentDtos=new ArrayList<>();
    }
    
    private StudentService studentService=(StudentService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.STUDENTS);
    
    public String registerStudent(StudentDto studentDto)throws Exception{
        return studentService.register(studentDto);
    }
    
    public String updateStudent(StudentDto studentDto)throws Exception{
        return studentService.update(studentDto);
    }
    
    public String deleteStudent(String studentId)throws Exception{
        return studentService.delete(studentId);
    }
    
    public ArrayList<StudentDto> getAllStudents()throws Exception{
        return studentService.getAll();
    }
    
    public StudentDto get(String studentId)throws Exception{
        return studentService.get(studentId);
    }
}
