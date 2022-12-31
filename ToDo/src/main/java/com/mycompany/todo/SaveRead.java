/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.todo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author kacpe
 */
public class SaveRead {
    
    File f = new File("dane.txt");
    
    public void zapisz(LocalDate date, DefaultListModel dlm, DefaultListModel dlm2){
        String a = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String b = "~".concat(a);
        try {
            FileWriter fw = new FileWriter(f, true);
            fw.write(b+"\n");
            int i = 0;
            while(dlm.size()>i){
                fw.write("^"+dlm.get(i)+"\n");
                i++;
            }
            i = 0;
            while(dlm2.size()>i){
                fw.write("`"+dlm2.get(i)+"\n");
                i++;
            }
            fw.write("~"+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ToDo.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    public DefaultListModel odczyt(LocalDate date){
//        String data = "";
//        String x = "^";
//        String a = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        String b = "~".concat(a);
//        DefaultListModel dlm = new DefaultListModel<>();
//        try{
//            Scanner sc = new Scanner(f);
//            while(sc.hasNextLine()){
//                data = sc.nextLine()+System.lineSeparator(); 
//                if(data.equals(b)){
//                    while(x.contains("^") && sc.hasNextLine()){
//                        x = sc.nextLine()+System.lineSeparator();
//                        String x2 = x.replaceFirst("^", "");
//                        dlm.addElement(x2);
//                    }
//                }
//                data = "";
//            }
//            dlm.addElement("gh");
//            
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ToDo.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return dlm;
        String a = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String b = "~".concat(a);
        DefaultListModel dlm = new DefaultListModel<>();
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String linia = sc.nextLine();
                if(linia.equals(b)){
                    while(true){
                        String linia2 = sc.nextLine();
                        if(linia2.contains("^")){
                            linia2 = linia2.replaceFirst("^", "");
                            dlm.addElement(linia2);
                        } else if(linia2.contains("~")){
                            break;
                        }
                        linia2 = "";
                    }
                }
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ToDo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dlm;
    }
    
    public DefaultListModel odczyt2(LocalDate date){
//        String a = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        String b = "~".concat(a);
//        String data = "";
//        String x = "`";
//        DefaultListModel dlm = new DefaultListModel<>();
//        try{
//            Scanner sc = new Scanner(f);
//            while(sc.hasNextLine()){
//                data = sc.nextLine()+System.lineSeparator();
//                if(data.equals(b)){
//                    data = sc.nextLine()+System.lineSeparator();
//                    if(data.contains(x)){
//                        dlm.addElement(data.replaceFirst("`", ""));
//                        while(x.contains("`") && sc.hasNextLine()){
//                            x = sc.nextLine()+System.lineSeparator();
//                            String x2 = x.replaceFirst("`", "");
//                            dlm.addElement(x2);
//                        }
//                    }
//                }
//                data = "";
//            }
//            dlm.addElement("gh");
//            
        String a = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String b = "~".concat(a);
        String data = "";
        String x = "`";
        DefaultListModel dlm = new DefaultListModel<>();
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                String linia = sc.nextLine();
                if(linia.equals(b)){
                    while(true){
                        String linia2 = sc.nextLine();
                        if(linia2.contains("`")){
                            linia2 = linia2.replaceFirst("`", "");
                            dlm.addElement(linia2);
                        } else if(linia2.contains("~")){
                            break;
                        }
                        linia2 = "";
                    }
                }
            }
            
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ToDo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dlm;
    }
    
    public void usun(LocalDate date){
}

