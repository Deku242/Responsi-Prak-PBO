/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
/**
 *
 * @author Machine Game
 */
public class Edit extends JFrame{
    JLabel ljudul = new JLabel("Update Karyawan");
    
    JLabel lnama = new JLabel("Nama");
    public final JTextField fnama = new JTextField(10);
    
    public final JTextField fcek = new JTextField(10);
    
    JLabel lusia = new JLabel("Usia");
    public final JTextField fusia= new JTextField(10);
    
    JLabel lgaji = new JLabel("Gaji");
    public final JTextField fgaji = new JTextField(10);
    
    JLabel llembur = new JLabel ("Lembur");
     public final JTextField flembur = new JTextField(10);
    
    public JButton bupdate = new JButton("Update");
    public JButton bhapus = new JButton("Hapus");
    
    public JButton bkembali = new JButton("Kembali");
    
     public Edit(){
        setTitle("Update Karyawan");
        setSize(305,250);
        setLayout(null);
        add(ljudul);
        add(lnama);
        add(fnama);
        add(lusia);
        add(fusia);
        add(lgaji);
        add(fgaji);  
        add(bupdate);
        add(bhapus); 
        add(bkembali);
        add(llembur);
        ljudul.setBounds(20,10,205,25);
        
        lnama.setBounds(20,25,125,25);
        fnama.setBounds(60,25,205,25);
        
        lusia.setBounds(20,65,125,25);
        fusia.setBounds(55,65,205,25);
        
        lgaji.setBounds(20,95,125,25);
        fgaji.setBounds(60,95,205,25);
        
        llembur.setBounds(20,125,125,25);
        flembur.setBounds(60,125,205,25);
        
        bupdate.setBounds(60,145,95,25);
        bhapus.setBounds(160,145,95,25);
        bkembali.setBounds(20,180,255,25);

        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
    public String getNama(){
        return fnama.getText();
    }
    public String getCek(){
        return fcek.getText();
    }
    
    public String getUsia(){
        return fusia.getText();
    }
    
    public String getGaji(){
        return fgaji.getText();
    }
}
