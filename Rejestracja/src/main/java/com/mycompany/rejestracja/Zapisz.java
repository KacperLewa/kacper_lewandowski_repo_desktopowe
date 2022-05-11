/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rejestracja;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lewandowskikacper
 */
class Zapisz {
    File f = new File("sekretnehasla.csv");
     public void zapisz(String a, String b, String c){
         try {
            FileWriter fw = new FileWriter(f, true);
            fw.write(a+":"+b+":"+c+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Rejestracja.class.getName()).log(Level.SEVERE, null, ex);
        }   
     }
     public void odczyt(){
         try{
            Scanner sc = new Scanner(f);
            String data = "";
            while(sc.hasNext()){
                data += sc.nextLine()+System.lineSeparator();  
            }
            if(data.contains(e2+":"+p2)){
                jLError5.setText("");
                JOptionPane.showMessageDialog(this, "Witaj: "+u);
            } else {
                jLError5.setText("*Podałeś złe dane! ");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Rejestracja.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
