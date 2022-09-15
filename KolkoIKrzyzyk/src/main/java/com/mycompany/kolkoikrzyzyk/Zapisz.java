/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kolkoikrzyzyk;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lewandowskikacper
 */
public class Zapisz {
   
    File f = new File("historiaGry.csv");
     public void zapisz(String a, String b, String c, String d, String e){
         try {
            FileWriter fw = new FileWriter(f, true);
            fw.write("Gracz1:"+a+" Jego znak:"+b+" Gracz 2: "+c+" Jego znak:"+d+" Wygrał:"+e+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(KolkoIKrzyzyk.class.getName()).log(Level.SEVERE, null, ex);
        }   
     }
     

    
}
