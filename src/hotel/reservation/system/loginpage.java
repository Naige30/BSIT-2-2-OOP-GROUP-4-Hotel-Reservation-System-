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
    private JLabel header,subheader,username,password;
    private JPasswordField pass;
    private JSeparator line;
    
    
    loginpage(){
        
       
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(new Color(245,245,245));
        setResizable(false);
        setLocationRelativeTo(null);
        
        
        header = new JLabel("Welcome to __",SwingConstants.LEFT);
        header.setFont(new Font("SansSerif",Font.BOLD, 32));
        header.setBounds(430, 60, 300, 45);
        header.setForeground(new Color(28, 28, 28));
        add(header);
        
        subheader = new JLabel("Let us begin your journey into timeless luxury.");
        subheader.setFont(new Font("SansSerif", Font.PLAIN, 13));
        subheader.setBounds(430, 105, 350, 20);
        subheader.setForeground(new Color(120, 120, 120));
        add(subheader);
        
        line = new JSeparator();
        line.setBounds(430, 145, 300, 1);
        line.setForeground(new Color(230, 230, 230));
        add(line);
        
        username=new JLabel("Username:");
        username.setBounds(430, 180, 200, 20);
        add(username);
        
        user=new JTextField();
        user.setBounds(430, 205, 300, 40);
        add(user);
        
        pass=new JPasswordField();
        pass.setBounds(430, 285, 300, 40);
        add(pass);
        
        password=new JLabel("Password:");
        password.setBounds(430, 260, 200, 20);
        add(password);
        
        Login=new JButton("Login");
        Login.setBounds(430, 350, 300, 45);
        Login.setBackground(new Color(15,32,64));
        Login.setForeground(Color.white);
        Login.setFocusPainted(false);
        add(Login);
        Login.addActionListener(this);
        
        signup=new JButton("Sign Up");
        signup.setBounds(430, 410, 300, 45);
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
