/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.Controller;

import edu.bit.dao.Interfaces.ClassDao;
import edu.bit.dto.ClassDto;
import edu.bit.service.ServiceFactory;
import edu.bit.service.user.ClassService;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class ClassController {
    private ArrayList<ClassDto> classDtos;
    
    public ClassController(){
        classDtos=new ArrayList<>();
    }
    
    private ClassService classService=(ClassService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.CLASS);
    
    public String addClass(ClassDto classDto) throws Exception {
        return classService.addClass(classDto);
    }

    public String updateClass(ClassDto classDto) throws Exception {
        return classService.updateClass(classDto);
    }

    public String deleteClass(String classId) throws Exception {
        return classService.deleteClass(classId);
    }

    public ClassDto getClass(String classId) throws Exception {
        return classService.getClass(classId);
    }

    public ArrayList<ClassDto> getAllClasses() throws Exception {
        return classService.getAllClasses();
    }
    
    public boolean isDuplicateClass(String class_Id, String subject, String grade, String teacherName) throws Exception {
    // This method should check the database or list of classes to see if a class
    // with the same Class ID, Subject, Grade, or Teacher Name already exists
    // Return true if a duplicate is found, otherwise return false.

    ArrayList<ClassDto> classList = getAllClasses(); // Get all existing classes
    for (ClassDto classDto : classList) {
        if (classDto.getClass_Id().equals(class_Id) || 
            (classDto.getSubject().equalsIgnoreCase(subject) && classDto.getGrade().equalsIgnoreCase(grade) && 
             classDto.getTeacherName().equalsIgnoreCase(teacherName))) {
            return true; // Duplicate found
        }
    }
    return false; // No duplicate
}
  

}
