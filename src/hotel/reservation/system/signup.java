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
public class signup extends JFrame implements ActionListener {
    private JTextField userinp,emailinp,numberinp,ageinp;
    private JLabel userlbl,passlbl,emaillbl,numberlbl,agelbl,titlelbl;
    private JButton submitbtn;    
    private JPasswordField passinp; 
    signup(){
        setSize(374,550);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        titlelbl = new JLabel("Sign Up",SwingConstants.CENTER);
        titlelbl.setBounds(0,20,400,50);
        add(titlelbl);
        
        userlbl=new JLabel("Username:");
        userlbl.setBounds(30,55,90,60);
        add(userlbl);
        
        userinp=new JTextField();
        userinp.setBounds(110,70,200,30);
        add(userinp);
        
        
        

        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
