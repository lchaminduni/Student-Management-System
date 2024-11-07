/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.bit.dao.Interfaces;

import edu.bit.dao.SuperDao;
import edu.bit.dto.ClassDto;
import edu.bit.entity.ClassEntity;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface ClassDao extends SuperDao{
    boolean save(ClassEntity classEntity) throws Exception;
    boolean update(ClassEntity classEntity) throws Exception;
    boolean delete(String classId) throws Exception;
    ClassEntity get(String classId) throws Exception;
    ArrayList<ClassEntity> getAll() throws Exception;

    public ClassDto getClassDetails(String classId) throws Exception;
}
