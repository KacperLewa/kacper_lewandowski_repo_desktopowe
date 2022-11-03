/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trzylisty;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import java.io.File;

/**
 *
 * @author lewandowskikacper
 */
public class ReadDataForJList {
    public DefaultListModel readData(File f){
        DefaultListModel defaultListModel = new DefaultListModel();
        try{
            Scanner sc = new Scanner(f);
            String data = "";
            while(sc.hasNext()){
                data = sc.nextLine();
                defaultListModel.addElement(data);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TrzyListy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return defaultListModel;
    }
}
