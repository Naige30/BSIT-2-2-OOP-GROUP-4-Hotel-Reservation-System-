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
    private JTextField userinp,emailinp,numberinp;
    private JLabel userlbl,passlbl,emaillbl,numberlbl,titlelbl;
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
        userlbl.setBounds(30,70,90,30);
        add(userlbl);
        
        userinp=new JTextField();
        userinp.setBounds(110,70,200,30);
        add(userinp);
        
        passlbl=new JLabel("Password:");
        passlbl.setBounds(30,117,90,30);
        add(passlbl);
        
        
        passinp=new JPasswordField();
        passinp.setBounds(110,120,200,30);
        add(passinp);
        
        emaillbl=new JLabel("Email:");
        emaillbl.setBounds(30,170,200,30);
        add(emaillbl);
        
        emailinp=new JTextField();
        emailinp.setBounds(110,170,200,30);
        add(emailinp);
        
        numberlbl=new JLabel("Contact No.");
        numberlbl.setBounds(30,220,200,30);
        add(numberlbl);
        
        numberinp=new JTextField();
        numberinp.setBounds(110,220,200,30);
        add(numberinp);
        
        submitbtn=new JButton("Submit");
        submitbtn.setBounds(170,270,90,30);
        add(submitbtn);
       
                
        

       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
