/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.service.user.impl;

import edu.bit.dao.DaoFactory;
import edu.bit.dao.Interfaces.ClassDao;
import edu.bit.dto.ClassDto;
import edu.bit.entity.ClassEntity;

import edu.bit.service.user.ClassService;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ClassServiceImpl implements ClassService{
    private ClassDao classDao=(ClassDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.CLASS);

    @Override
    public String addClass(ClassDto classDto) throws Exception {
        ClassEntity classEntity = new ClassEntity(classDto.getClass_Id(), classDto.getGrade(), classDto.getSubject(),
                classDto.getTeacherName(), classDto.getClassFee(), classDto.getDate(), classDto.getTime());
        return classDao.save(classEntity) ? "Success" : "Fail";
    }

    @Override
    public String updateClass(ClassDto classDto) throws Exception {
        ClassEntity classEntity = new ClassEntity(classDto.getClass_Id(), classDto.getGrade(), classDto.getSubject(),
                classDto.getTeacherName(), classDto.getClassFee(), classDto.getDate(), classDto.getTime());
        return classDao.update(classEntity) ? "Success" : "Fail";
    }

    @Override
    public String deleteClass(String classId) throws Exception {
        return classDao.delete(classId) ? "Success" : "Fail";
    }

    @Override
    public ClassDto getClass(String class_Id) throws Exception {
        ClassEntity classEntity = classDao.get(class_Id);
        if (classEntity != null) {
            return new ClassDto(classEntity.getClass_Id(), classEntity.getGrade(), classEntity.getSubject(),
                    classEntity.getTeacherName(), classEntity.getClassFee(), classEntity.getDate(), classEntity.getTime());
        }
        return null;
    }

    @Override
    public ArrayList<ClassDto> getAllClasses() throws Exception {
        ArrayList<ClassEntity> classEntities = classDao.getAll();
        ArrayList<ClassDto> classDtos = new ArrayList<>();
        for (ClassEntity entity : classEntities) {
            classDtos.add(new ClassDto(entity.getClass_Id(), entity.getGrade(), entity.getSubject(),
                    entity.getTeacherName(), entity.getClassFee(), entity.getDate(), entity.getTime()));
        }
        return classDtos;
    }
    
    
    
}
