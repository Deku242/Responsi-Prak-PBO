/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import controller.Control;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import koneksi.Koneksi;
import model.Karyawan;
import view.Tampil;

/**
 *
 * @author Machine Game
 */
public class Menu extends JFrame implements ActionListener{

     JLabel ljudul = new JLabel("Main Menu");

   public JButton btambah = new JButton("Tambah Karyawan");
   public JButton blihat = new JButton("Lihat Karyawan");
   private Object ScrollPane;


    public Menu(){
        setSize(170,140);
        setLayout(null);
        add(ljudul);
        add(blihat);
        add(btambah);

        ljudul.setBounds(40,10,205,25);


        btambah.setBounds(0,30,155,25);
        blihat.setBounds(0,50,155,25);
        
        btambah.addActionListener(this);
        blihat.addActionListener(this);


        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == btambah){
           Tampil lihat = new Tampil();
           lihat.dispose();
           dispose();
           Input input = new Input();
           Edit edit = new Edit();
           edit.dispose();
           Karyawan mod = new Karyawan();
           Control ct = new Control(lihat, mod,input,edit);
          
        }
        if(e.getSource() == blihat){
            Tampil lihat = new Tampil();
           Input input = new Input();
           input.dispose();
           Edit edit = new Edit();
           edit.dispose();
           Karyawan mod = new Karyawan();
           Control ct = new Control(lihat, mod,input,edit);
        }

    }

}

