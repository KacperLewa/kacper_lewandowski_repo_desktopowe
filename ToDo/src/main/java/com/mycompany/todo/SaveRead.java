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
import java.io.PrintWriter;
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
    
    public void zapisz(LocalDate date, String dw1, String dw2){
        String a = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String b = "~".concat(a);
        try {
            FileWriter fw = new FileWriter(f, true);
            fw.write(b+"\n");
            fw.write("#"+dw1+"\n");
            fw.write("`"+dw2+"\n");
            fw.write("~"+"\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ToDo.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    public DefaultListModel odczyt(LocalDate date){
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
                        if(linia2.contains("#")){
                            linia2 = linia2.replaceAll("#", "");
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
    
    public void usun(LocalDate date, String del1, String del2){
        String a = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String tempFile = "temp.txt";
        File newFile = new File(tempFile);
        String dane = "";
        try{
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                dane = sc.nextLine();
                if(!dane.contains(del1) && !dane.contains(del2) && !dane.contains(a)){
                    pw.println(dane);
                }
            }
            sc.close();
            pw.flush();
            pw.close();
            f.delete();
            f = new File("dane.txt");
            newFile.renameTo(f);
        } catch(IOException ex){
            Logger.getLogger(ToDo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void edytuj(String ed1, String ed2, String new1, String new2){
        String tempFile = "temp.txt";
        File newFile = new File(tempFile);
        String dane = "";
        try{
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                dane = sc.nextLine();
                if(dane.contains(ed1)){
                    pw.println("^"+new1);
                } else if(dane.contains(ed2)){
                    pw.println("`"+new2);
                } else{
                    pw.println(dane);
                }
            }
            sc.close();
            pw.flush();
            pw.close();
            f.delete();
            f = new File("dane.txt");
            newFile.renameTo(f);
        } catch(IOException ex){
            Logger.getLogger(ToDo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

