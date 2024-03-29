/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todo;

/**
 *
 * @author lewandowskikacper
 */
public class Task {
    private String title;
    private String description;
    
    public Task(String title, String description){
        this.title = title;
        this.description = description;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getDescription(){
        return description;
    }
    
    @Override
    public String toString(){
        return title;
    }
}
