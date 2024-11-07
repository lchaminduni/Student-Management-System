/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.service;

import edu.bit.service.user.impl.ClassServiceImpl;
import edu.bit.service.user.impl.EnrollServiceImpl;
import edu.bit.service.user.impl.StudentServiceImpl;

/**
 *
 * @author Administrator
 */
public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    public ServiceFactory() {
    }
    
    public static ServiceFactory getInstance(){
        if (serviceFactory==null) {
            serviceFactory=new ServiceFactory();    
        }
        return serviceFactory;
    }
    
    public SuperService getService(ServiceType serviceType){
        switch (serviceType) {
            case STUDENTS:
                return new StudentServiceImpl();
                
            case ENROLLMENT:
                return new EnrollServiceImpl();
            case CLASS:
                return new ClassServiceImpl();
            default:
                return null;
        }   
        
    }
    
    public enum ServiceType{
        STUDENTS,ENROLLMENT,CLASS,PAYMENT
    }
    
}
