/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.bit.dao.Interfaces;

import edu.bit.dao.CrudDao;
import edu.bit.dto.StudentDto;
import edu.bit.entity.StudentEntity;

/**
 *
 * @author Administrator
 */
public interface StudentDao extends CrudDao<StudentEntity, String>{

    public StudentDto getStudentDetails(String studentId) throws Exception;
    
}
