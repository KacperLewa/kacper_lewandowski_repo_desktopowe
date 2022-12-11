/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.todo;

import java.time.LocalDate;

/**
 *
 * @author kacpe
 */
public class SaveInfo {
    private int d;
    private int m;
    private int y;
    private LocalDate localdate;
    
    public SaveInfo(int d, int m, int y){
        this.d = d;
        this.m = m;
        this.y = y;
        localdate = LocalDate.of(y,m,d);
    }
    
    public SaveInfo(){
        
    }
    
    public LocalDate getDate(){
        return localdate;
    }
    
    public void setDate(LocalDate localdate){
        this.localdate = localdate;
    }
}
