/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.bit.service.user;

import edu.bit.dto.ClassDto;
import edu.bit.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface ClassService extends SuperService{
    String addClass(ClassDto classDto)throws Exception;
    String updateClass(ClassDto classDto) throws Exception;
    String deleteClass(String classId) throws Exception;
    ClassDto getClass(String classId) throws Exception;
    ArrayList<ClassDto> getAllClasses() throws Exception;
}
