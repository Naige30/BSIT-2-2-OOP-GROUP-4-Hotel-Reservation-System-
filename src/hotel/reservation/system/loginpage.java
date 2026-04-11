/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Naige
 */
public class loginpage extends JFrame implements ActionListener {
    private JTextField user;
    private JButton Login,signup;
    private JLabel header,username,password;
    private JPasswordField pass;
    
    
    loginpage(){
        
       
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(245,245,245));
        
        
        header = new JLabel("Login Page",SwingConstants.CENTER);
        header.setBounds(0,25,400,50);
        header.setForeground(new Color(15,32,64));
        add(header);
        
        username=new JLabel("Username:");
        username.setBounds(30,70,90,30);
        add(username);
        
        user=new JTextField();
        user.setBounds(100,70,200,30);
        add(user);
        
        pass=new JPasswordField();
        pass.setBounds(100,120,200,30);
        add(pass);
        
        password=new JLabel("Password:");
        password.setBounds(30,120,100,30);
        add(password);
        
        Login=new JButton("Login");
        Login.setBounds(80,180,100,30);
        Login.setBackground(new Color(15,32,64));
        Login.setForeground(Color.white);
        Login.setFocusPainted(false);
        add(Login);
        Login.addActionListener(this);
        
        signup=new JButton("Sign Up");
        signup.setBounds(220,180,100,30);
        signup.setBackground(new Color(64,181,173));
        signup.setForeground(Color.white);
        signup.setFocusPainted(false);
        add(signup);
        signup.addActionListener(this);
        
        
        
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Login){
            dispose();
            hotelmenu hm=new hotelmenu();
            hm.setVisible(true);
        }
        else if(e.getSource()==signup){
            dispose();
            signup su=new signup();
            su.setVisible(true);
        }
    }
    
}
