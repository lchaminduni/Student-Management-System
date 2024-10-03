/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.bit.dao;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public interface CrudDao<T, ID> extends SuperDao{
    boolean save(T t) throws Exception;
    boolean update(T t) throws Exception;
    boolean dalete(ID Id) throws Exception;
    T get(ID Id) throws Exception;
    ArrayList<T> getAll() throws Exception;
}
