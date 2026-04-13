/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservation.system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
/**
 *
 * @author Naige
 */
public class signup extends JFrame implements ActionListener {
    private JTextField userinp,emailinp,numberinp,ageinp;
    private JLabel userlbl,passlbl,emaillbl,numberlbl,agelbl,titlelbl,subTitle,hint,footer;
    private JButton submitbtn;    
    private JPasswordField passinp;
    private ImageIcon originalIcon;
    signup(){
        setSize(400,550);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        
        
        titlelbl = new JLabel("Sign Up",SwingConstants.CENTER);
        titlelbl.setFont(new Font("SansSerif", Font.BOLD, 30));
        titlelbl.setBounds(30, 30, 300, 40);
        add(titlelbl);
        
        subTitle = new JLabel("Start your truly luxury experience.");
        subTitle.setFont(new Font("SansSerif", Font.PLAIN, 14));
        subTitle.setForeground(new Color(100, 100, 100));
        subTitle.setBounds(30, 70, 300, 20);
        add(subTitle);
        
        userlbl=new JLabel("Username");
        userlbl.setFont(new Font("SansSerif", Font.BOLD, 12));
        userlbl.setBounds(30, 115, 100, 20);
        add(userlbl);
        
        userinp = new JTextField();
        userinp.setFont(new Font("SansSerif", Font.PLAIN, 13));
        userinp.setBounds(30, 140, 320, 38);
        userinp.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        add(userinp);
        
        emaillbl = new JLabel("Email");
        emaillbl.setFont(new Font("SansSerif", Font.BOLD, 12));
        emaillbl.setBounds(30, 195, 100, 20);
        add(emaillbl);

        emailinp = new JTextField();
        emailinp.setFont(new Font("SansSerif", Font.PLAIN, 13));
        emailinp.setBounds(30, 220, 320, 38);
        emailinp.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        add(emailinp);

        
        passlbl = new JLabel("Password");
        passlbl.setFont(new Font("SansSerif", Font.BOLD, 12));
        passlbl.setBounds(30, 275, 100, 20);
        add(passlbl);

        passinp = new JPasswordField();
        passinp.setBounds(30, 300, 320, 38);
        passinp.setBorder(new LineBorder(new Color(225, 225, 225), 1));
        add(passinp);

        hint = new JLabel("Must be at least 8 characters.");
        hint.setFont(new Font("SansSerif", Font.PLAIN, 11));
        hint.setForeground(new Color(160, 160, 160));
        hint.setBounds(30, 340, 250, 20);
        add(hint);

        
        submitbtn = new JButton("Create account");
        submitbtn.setBackground(new Color(69,104,130));
        submitbtn.setForeground(Color.WHITE);
        submitbtn.setFocusPainted(false);
        submitbtn.setBounds(30, 360, 320, 40);
        add(submitbtn);

        
//        footer = new JLabel("Already have an account? Log in", SwingConstants.CENTER);
//        footer.setBounds(30, 430, 320, 20);
//        add(footer);
        

        

        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
