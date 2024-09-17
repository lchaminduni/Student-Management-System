/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.bit.dto;

/**
 *
 * @author Administrator
 */
public class UserDto {
    private String username;
    private int password;

    public UserDto() {
    }

    public UserDto(String username, int password) {
        this.username = username;
        this.password = password;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" + "username=" + username + ", password=" + password + '}';
    }

    
    
    
}
