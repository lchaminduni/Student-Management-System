/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.bit.dao.Interfaces;

import edu.bit.dao.CrudDao;
import edu.bit.dao.SuperDao;
import edu.bit.entity.EnrollEntity;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface EnrollDao extends SuperDao{
    boolean save(EnrollEntity enrollEntity) throws Exception;
    boolean update(EnrollEntity enrollEntity) throws Exception;
    boolean delete(int enrollmentId) throws Exception;
    EnrollEntity get(int enrollmentId) throws Exception;
    ArrayList<EnrollEntity> getAll() throws Exception;

    public boolean isStudentExists(String studentId)throws Exception;

    public boolean isClassExists(String classId)throws Exception;
}
