/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Naige
 */
public class hotelmenu extends JFrame implements ActionListener {
    private JButton reservebtn,viewbtn,cancelbtn,searchbtn,logoutbtn;
    private JLabel welcometxt;
    private JTextArea hotels;
    
    
    
    hotelmenu(){
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        
        welcometxt=new JLabel ("Welcome to Hotel App",SwingConstants.CENTER);
        welcometxt.setBounds(0,50,600,30);
        add(welcometxt);
        
        reservebtn=new JButton("Reserve");
        reservebtn.setBounds(35,100,100,30);
        add(reservebtn);
        
        viewbtn=new JButton("View");
        viewbtn.setBounds(35,150,100,30);
        add(viewbtn);
        
        cancelbtn=new JButton("Cancel");
        cancelbtn.setBounds(35,200,100,30);
        add(cancelbtn);
        
        searchbtn= new JButton("Search");
        searchbtn.setBounds(35,250,100,30);
        add(searchbtn);
        
        hotels=new JTextArea("HERE ARE SOME DEALS!!\n"+" HOTEL 1: BLAH BLAH\n"+"TANGINA NI Gian");
        hotels.setBounds(200,100,350,350);
        hotels.setEditable(false);
        add(hotels);
        
        logoutbtn=new JButton("Log Out");
        logoutbtn.setBounds(35,450,100,30);
        add(logoutbtn);
        logoutbtn.addActionListener(this);
        
        
        reservebtn.addActionListener(this);
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==logoutbtn){
           dispose();
           loginpage lp=new loginpage();
           lp.setVisible(true);
       }
    }
    
}
