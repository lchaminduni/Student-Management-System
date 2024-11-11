/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.dao;

import edu.bit.dao.Impl.ClassDaoImpl;
import edu.bit.dao.Impl.EnrollDaoImpl;
import edu.bit.dao.Impl.PaymentDaoImpl;
import edu.bit.dao.Impl.StudentDaoImpl;

/**
 *
 * @author Administrator
 */
public class DaoFactory {
    private static DaoFactory daoFactory;
    
    private DaoFactory(){
        
    }
    
    public static DaoFactory getInstance(){
        if (daoFactory==null) {
            daoFactory=new DaoFactory();
        }
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes daoTypes){
        switch (daoTypes) {
            case STUDENT:
                return new StudentDaoImpl();  // Ensure this is correct
                
            case ENROLLMENT:
                return new EnrollDaoImpl();
                
            case CLASS:
                return new ClassDaoImpl();
                
            case PAYMENT:
                return new PaymentDaoImpl();
            default:
                return null;
        }
        
    }
    
    public enum DaoTypes{
        STUDENT,ENROLLMENT,CLASS,PAYMENT
    }
}
