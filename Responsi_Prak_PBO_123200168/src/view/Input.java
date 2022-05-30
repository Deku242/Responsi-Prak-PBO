/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Control;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import karyawan.Main;
import java.awt.*;
import model.Karyawan;
/**
 *
 * @author Machine Game
 */
public class Input extends JFrame {
    JLabel lJudul = new JLabel("INPUT KARYAWAN");
    
    JLabel lNama = new JLabel("Nama");
   public JTextField tNama = new JTextField(50);
    
    JLabel lUsia = new JLabel("Usia");
   public JTextField tUsia = new JTextField(50);
    
    JLabel lGaji = new JLabel("Gaji");
   public JTextField tGaji = new JTextField(50);
    
    public JButton bSubmit = new JButton("Submit");
    public JButton bReset = new JButton("Reset");
    public JButton bKembali = new JButton("Kembali");
    
    public Input(){
        setTitle("Input Karyawan");
        setSize(305, 235);
        setLayout(null);
        
        add(lJudul);
        add(lNama);
        add(tNama);
        add(lUsia);
        add(tUsia);
        add(lGaji);
        add(tGaji);
        add(bSubmit);
        add(bReset);
        add(bKembali);
        
        lJudul.setBounds(20, 10, 250, 25);
        
        lNama.setBounds(20, 35, 125, 25);
        tNama.setBounds(60, 35, 205, 25);
        
        lUsia.setBounds(20, 65, 125, 25);
        tUsia.setBounds(60, 65, 205, 25);
        
        lGaji.setBounds(20, 95, 205, 25);
        tGaji.setBounds(60, 95, 205, 25);
        
        bSubmit.setBounds(60, 135, 95, 25);
        bReset.setBounds(160, 135, 95, 25);
        bKembali.setBounds(30, 165, 255, 25);

        
        
        
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public String getNama(){
        return tNama.getText();
    }
    
    public String getUsia(){
        return tUsia.getText();
    }
    
    public String getGaji(){
        return tGaji.getText();
    }
    

}
