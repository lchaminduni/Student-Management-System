/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.service;

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
                return null;
        }   
        return null;
    }
    
    public enum ServiceType{
        STUDENTS,ENROLLMENT,CLASS,PAYMENT
    }
    
}
